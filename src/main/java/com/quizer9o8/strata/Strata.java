package com.quizer9o8.strata;

import com.quizer9o8.strata.list.BlockList;
import com.quizer9o8.strata.list.ItemList;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// @Mod tells everything this is the main class.
@Mod(Strata.MOD_ID)
@Mod.EventBusSubscriber(modid = Strata.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Strata
{
    //This line below makes it possible to call upon this class from other places.
    public static Strata instance;

    //Universal variables.
    public static final String MOD_ID = "strata";

    //Logger
    public static final Logger LOGGER = LogManager.getLogger();

    public Strata()
    {
        instance = this;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::clientSetup);

        BlockList.BLOCKS.register(modEventBus);
        ItemList.ITEMS.register(modEventBus);
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {

    }

    public void onServerStarting(FMLDedicatedServerSetupEvent event)
    {

    }

    //Should tell in the logs if the blocks are correctly being read into the tag or not for TerraForged
    //@SubscribeEvent
    //public static void started(FMLServerStartedEvent event) {
    //    new BlockTags.Wrapper(new ResourceLocation("reterraforged:rock")).getAllElements().forEach(System.out::println);
    //}
}

