package com.quizer9o8.strata;

import com.quizer9o8.strata.list.BlockList;
import com.quizer9o8.strata.list.ItemList;
//import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.world.item.CreativeModeTab;
//import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
//import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
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

    //Creative Tab
    //public static final ItemGroup DEBUG_TAB = new Strata.DebugItemGroup("debug");
    public static final CreativeModeTab IGNEOUS_TAB = new Strata.IgneousRocksItemGroup("igneous");
    public static final CreativeModeTab METAMORPHIC_TAB = new Strata.MetamorphicRocksItemGroup("metamorphic");
    public static final CreativeModeTab SEDIMENTARY_TAB = new Strata.SedimentaryRocksItemGroup("sedimentary");
    //public static final ItemGroup MISCELLANEOUS_TAB = new Strata.MiscellaneousRocksItemGroup("miscellaneous");

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

    //Creative Tab Objects

    /*
    //Debug Creative Tab
    public static class DebugItemGroup extends ItemGroup
    {
        public DebugItemGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack createIcon(){
            return new ItemStack(ItemList.DEBUG_BLOCK.get());
        }
    }*/


    //Igneous Rocks Creative Tab
    public static class IgneousRocksItemGroup extends CreativeModeTab
    {
        public IgneousRocksItemGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemList.DACITE.get());
        }
    }

    //Sedimentary Rocks Creative Tab
    public static class SedimentaryRocksItemGroup extends CreativeModeTab
    {
        public SedimentaryRocksItemGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ItemList.LIMESTONE.get());
        }
    }

    //Metamorphic Rocks Creative Tab
    public static class MetamorphicRocksItemGroup extends CreativeModeTab
    {
        public MetamorphicRocksItemGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ItemList.AMPHIBOLITE.get());
        }
    }
/*
    //Miscellaneous Rocks Creative Tab
    public static class MiscellaneousRocksItemGroup extends ItemGroup
    {
        public MiscellaneousRocksItemGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack createIcon(){
            return new ItemStack(ItemList.[BLOCK_NAME].get());
        }
    }
*/
}
