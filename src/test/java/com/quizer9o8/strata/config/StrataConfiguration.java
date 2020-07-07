  package com.quizer9o8.strata.config;

  import com.quizer9o8.strata.Strata;
  import net.minecraftforge.common.MinecraftForge;
  import net.minecraftforge.common.config.Configuration;
  import net.minecraftforge.common.config.Property;
  import net.minecraftforge.fml.client.event.ConfigChangedEvent;
  import net.minecraftforge.fml.common.Loader;
  import net.minecraftforge.fml.common.eventhandler.EventPriority;
  import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

  import java.io.File;
  import java.util.ArrayList;
  import java.util.List;

public class StrataConfiguration {

	// Declare all configuration fields used by the mod here
	public static int myInteger;
	public static boolean myBoolean;
	public static double myDouble;
	public static int[] myIntList;
	public static String myString;
	public static String myColour;

	public static final String CATEGORY_NAME_GENERAL = "category_general";
	public static final String CATEGORY_NAME_OTHER = "category_other";

	public static void preInit()
	{

		File configFile = new File(Loader.instance().getConfigDir(), "MinecraftByExample.cfg");

		// initialize your configuration object with your configuration file values.
		config = new Configuration(configFile);

		// load config from file (see mbe70 package for more info)
		syncFromFile();
	}

	public static void clientPreInit() {

		MinecraftForge.EVENT_BUS.register(new ConfigEventHandler());
	}

	public static Configuration getConfig() {
		return config;
	}

	public static void syncFromFile() {
		syncConfig(true, true);
	}

	public static void syncFromGUI() {
		syncConfig(false, true);
	}

	public static void syncFromFields() {
		syncConfig(false, false);
	}

	private static void syncConfig(boolean loadConfigFromFile, boolean readFieldsFromConfig)
	{

		if (loadConfigFromFile) {
			config.load();
		}

	// integer

		final int MY_INT_MIN_VALUE = 3;
		final int MY_INT_MAX_VALUE = 12;
		final int MY_INT_DEFAULT_VALUE = 10;
		Property propMyInt = config.get(CATEGORY_NAME_GENERAL, "myInteger", MY_INT_DEFAULT_VALUE,
				"Configuration integer (myInteger)", MY_INT_MIN_VALUE, MY_INT_MAX_VALUE);
		propMyInt.setLanguageKey("gui.mbe70_configuration.myInteger");

		// boolean
		final boolean MY_BOOL_DEFAULT_VALUE = true;
		Property propMyBool = config.get(CATEGORY_NAME_GENERAL, "myBoolean", MY_BOOL_DEFAULT_VALUE);
		propMyBool.setComment("Configuration boolean (myBoolean)");
		propMyBool.setLanguageKey("gui.mbe70_configuration.myBoolean").setRequiresMcRestart(true);

		// double
		final double MY_DOUBLE_MIN_VALUE = 0.0;
		final double MY_DOUBLE_MAX_VALUE = 1.0;
		final double MY_DOUBLE_DEFAULT_VALUE = 0.80;
		Property propMyDouble = config.get(CATEGORY_NAME_GENERAL, "myDouble", MY_DOUBLE_DEFAULT_VALUE,
				"Configuration double (myDouble)", MY_DOUBLE_MIN_VALUE, MY_DOUBLE_MAX_VALUE);
		propMyDouble.setLanguageKey("gui.mbe70_configuration.myDouble");

		// string
		final String MY_STRING_DEFAULT_VALUE = "default";
		Property propMyString = config.get(CATEGORY_NAME_GENERAL, "myString", MY_STRING_DEFAULT_VALUE);
		propMyString.setComment("Configuration string (myString)");
		propMyString.setLanguageKey("gui.mbe70_configuration.myString").setRequiresWorldRestart(true);

		// list of integer values
		final int[] MY_INT_LIST_DEFAULT_VALUE = new int[] { 1, 2, 3, 4, 5 };
		Property propMyIntList = config.get(CATEGORY_NAME_GENERAL, "myIntList", MY_INT_LIST_DEFAULT_VALUE,
				"Configuration integer list (myIntList)");
		propMyIntList.setLanguageKey("gui.mbe70_configuration.myIntList");

		// a string restricted to several choices - located on a separate category tab in the GUI
		final String COLOUR_DEFAULT_VALUE = "red";
		final String[] COLOUR_CHOICES = { "blue", "red", "yellow" };
		Property propColour = config.get(CATEGORY_NAME_OTHER, "myColour", COLOUR_DEFAULT_VALUE);
		propColour.setComment("Configuration string (myColour): blue, red, yellow");
		propColour.setLanguageKey("gui.mbe70_configuration.myColour").setRequiresWorldRestart(true);
		propColour.setValidValues(COLOUR_CHOICES);

		// By defining a property order we can control the order of the
		// properties in the config file and GUI. This is defined on a per config-category basis.

		List<String> propOrderGeneral = new ArrayList<String>();
		propOrderGeneral.add(propMyInt.getName()); // push the config value's name into the ordered list
		propOrderGeneral.add(propMyBool.getName());
		propOrderGeneral.add(propMyDouble.getName());
		propOrderGeneral.add(propMyString.getName());
		propOrderGeneral.add(propMyIntList.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_GENERAL, propOrderGeneral);

		List<String> propOrderOther = new ArrayList<String>();
		propOrderOther.add(propColour.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_OTHER, propOrderOther);

		if (readFieldsFromConfig)
		{
			// If getInt() cannot get an integer value from the config file
			// value of myInteger (e.g. corrupted file).
			// It will set it to the default value passed to the function.

			myInteger = propMyInt.getInt(MY_INT_DEFAULT_VALUE);
			if (myInteger > MY_INT_MAX_VALUE || myInteger < MY_INT_MIN_VALUE) {
				myInteger = MY_INT_DEFAULT_VALUE;
			}

			myBoolean = propMyBool.getBoolean(MY_BOOL_DEFAULT_VALUE); // can also use a literal (see integer example) if desired

			myDouble = propMyDouble.getDouble(MY_DOUBLE_DEFAULT_VALUE);
			if (myDouble > MY_DOUBLE_MAX_VALUE || myDouble < MY_DOUBLE_MIN_VALUE) {
				myDouble = MY_DOUBLE_DEFAULT_VALUE;
			}

			myString = propMyString.getString();
			myIntList = propMyIntList.getIntList();

			myColour = propColour.getString();
			boolean matched = false;
			for (String entry : COLOUR_CHOICES) {
				if (entry.equals(myColour)) {
					matched = true;
					break;
				}
			}
			if (!matched) {
				myColour = COLOUR_DEFAULT_VALUE;
			}
		}

		propMyInt.set(myInteger);
		propMyBool.set(myBoolean);
		propMyDouble.set(myDouble);
		propMyString.set(myString);
		propMyIntList.set(myIntList);
		propColour.set(myColour);

		if (config.hasChanged()) {
			config.save();
		}
	}

	// Define your configuration object
	private static Configuration config = null;

	public static class ConfigEventHandler
	{

		@SubscribeEvent(priority = EventPriority.NORMAL)
		public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event)
		{
			if (MinecraftByExample.MODID.equals(event.getModID()) && !event.isWorldRunning())
			{
				if (event.getConfigID().equals(CATEGORY_NAME_GENERAL) || event.getConfigID().equals(CATEGORY_NAME_OTHER))
				{
					syncFromGUI();
				}
			}
		}
	}
}