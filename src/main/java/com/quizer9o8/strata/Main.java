package com.quizer9o8.strata;

import com.quizer9o8.strata.list.BlockList;
import com.quizer9o8.strata.list.ItemList;
import com.quizer9o8.strata.world.gen.StrataGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartedEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// @Mod tells everything this is the main class.
@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Main
{
    //This line below makes it possible to call upon this class from other places.
    public static Main instance;

    //Universal variables.
    public static final String MOD_ID = "strata";

    //Creative Tab
    //public static final ItemGroup DEBUG_TAB = new Main.DebugItemGroup("debug");
    public static final ItemGroup IGNEOUS_TAB = new Main.IgneousRocksItemGroup("igneous");
    public static final ItemGroup METAMORPHIC_TAB = new Main.MetamorphicRocksItemGroup("metamorphic");
    public static final ItemGroup SEDIMENTARY_TAB = new Main.SedimentaryRocksItemGroup("sedimentary");
    //public static final ItemGroup MISCELLANEOUS_TAB = new Main.MiscellaneousRocksItemGroup("miscellaneous");

    //Logger
    public static final Logger LOGGER = LogManager.getLogger();

    public Main()
    {
        instance = this;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);

        BlockList.BLOCKS.register(modEventBus);
        ItemList.ITEMS.register(modEventBus);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        StrataGeneration.generate();
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {

    }

    public void onServerStarting(FMLServerStartingEvent event)
    {

    }

    //Should tell in the logs if the blocks are correctly being read into the tag or not for TerraForged
    @SubscribeEvent
    public static void started(FMLServerStartedEvent event) {
        new BlockTags.Wrapper(new ResourceLocation("forge:wg_stone")).getAllElements().forEach(System.out::println);
    }

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
    public static class IgneousRocksItemGroup extends ItemGroup
    {
        public IgneousRocksItemGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack createIcon(){
            return new ItemStack(ItemList.GABBRO.get());
        }
    }

    //Sedimentary Rocks Creative Tab
    public static class SedimentaryRocksItemGroup extends ItemGroup
    {
        public SedimentaryRocksItemGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack createIcon(){
            return new ItemStack(ItemList.LIMESTONE.get());
        }
    }

    //Metamorphic Rocks Creative Tab
    public static class MetamorphicRocksItemGroup extends ItemGroup
    {
        public MetamorphicRocksItemGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack createIcon(){
            return new ItemStack(ItemList.GNEISS.get());
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
