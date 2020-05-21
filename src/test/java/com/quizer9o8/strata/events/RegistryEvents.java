package com.quizer9o8.strata.events;

import com.quizer9o8.strata.Main;
import com.quizer9o8.strata.list.BlockList;
import com.quizer9o8.strata.list.ItemList;
import com.quizer9o8.strata.objects.blocks.StrataStairsBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

//This tells the game to run this class before anything else.
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents
{
    public static final Logger LOGGER = Main.LOGGER;
    public static final String MOD_ID = Main.MOD_ID;

    //ItemGroups
    //public static final ItemGroup DEBUG = Main.DEBUG_TAB;
    public static final ItemGroup IGNEOUS = Main.IGNEOUS_TAB;
    public static final ItemGroup SEDIMENTARY = Main.SEDIMENTARY_TAB;
    public static final ItemGroup METAMORPHIC = Main.METAMORPHIC_TAB;
    //public static final ItemGroup MISCELLANEOUS = Main.MISCELLANEOUS_TAB;

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(MOD_ID, name);
    }
}
