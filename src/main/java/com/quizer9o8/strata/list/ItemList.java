package com.quizer9o8.strata.list;

import com.quizer9o8.strata.Main;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Main.MOD_ID);

/*
    //Debug

    public static final RegistryObject<Item> DEBUG_ITEM = ITEMS.register("debug_item", () -> new Item(new Item.Properties().group(Main.DEBUG_TAB)));
    public static final RegistryObject<Item> DEBUG_BLOCK = ITEMS.register("debug_block", () -> new BlockItem(BlockList.DEBUG_BLOCK.get(), new Item.Properties().group(Main.DEBUG_TAB)));
    public static final RegistryObject<Item> DEBUG_SLAB = ITEMS.register("debug_slab", () -> new Item(new Item.Properties().group(Main.DEBUG_TAB)));
    public static final RegistryObject<Item> DEBUG_STAIRS = ITEMS.register("debug_stairs", () -> new Item(new Item.Properties().group(Main.DEBUG_TAB)));
    public static final RegistryObject<Item> DEBUG_WALL = ITEMS.register("debug_wall", () -> new Item(new Item.Properties().group(Main.DEBUG_TAB)));
    //public static final RegistryObject<Item> DEBUG_ORE = ITEMS.register("debug_ore", () -> new BlockItem(BlockList.DEBUG_ORE.get(), new Item.Properties().group(Main.DEBUG_TAB)));
*/

    //Igneous Rocks
    public static final RegistryObject<Item> GABBRO = ITEMS.register("gabbro", () -> new BlockItem(BlockList.GABBRO.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_SLAB = ITEMS.register("gabbro_slab", () -> new BlockItem(BlockList.GABBRO_SLAB.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_STAIRS = ITEMS.register("gabbro_stairs", () -> new BlockItem(BlockList.GABBRO_STAIRS.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_WALL = ITEMS.register("gabbro_wall", () -> new BlockItem(BlockList.GABBRO_WALL.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));

    public static final RegistryObject<Item> POLISHED_GABBRO = ITEMS.register("polished_gabbro", () -> new BlockItem(BlockList.POLISHED_GABBRO.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_GABBRO_SLAB = ITEMS.register("polished_gabbro_slab", () -> new BlockItem(BlockList.POLISHED_GABBRO_SLAB.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_GABBRO_STAIRS = ITEMS.register("polished_gabbro_stairs", () -> new BlockItem(BlockList.POLISHED_GABBRO_STAIRS.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));

    public static final RegistryObject<Item> BASALT = ITEMS.register("basalt", () -> new BlockItem(BlockList.BASALT.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));
    public static final RegistryObject<Item> BASALT_SLAB = ITEMS.register("basalt_slab", () -> new BlockItem(BlockList.BASALT_SLAB.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));
    public static final RegistryObject<Item> BASALT_STAIRS = ITEMS.register("basalt_stairs", () -> new BlockItem(BlockList.BASALT_STAIRS.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));
    public static final RegistryObject<Item> BASALT_WALL = ITEMS.register("basalt_wall", () -> new BlockItem(BlockList.BASALT_WALL.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));

    public static final RegistryObject<Item> POLISHED_BASALT = ITEMS.register("polished_basalt", () -> new BlockItem(BlockList.POLISHED_BASALT.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_BASALT_SLAB = ITEMS.register("polished_basalt_slab", () -> new BlockItem(BlockList.POLISHED_BASALT_SLAB.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_BASALT_STAIRS = ITEMS.register("polished_basalt_stairs", () -> new BlockItem(BlockList.POLISHED_BASALT_STAIRS.get(), new Item.Properties().group(Main.IGNEOUS_TAB)));

    //Metamorphic Rocks
    public static final RegistryObject<Item> GNEISS = ITEMS.register("gneiss", () -> new BlockItem(BlockList.GNEISS.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_SLAB = ITEMS.register("gneiss_slab", () -> new BlockItem(BlockList.GNEISS_SLAB.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_STAIRS = ITEMS.register("gneiss_stairs", () -> new BlockItem(BlockList.GNEISS_STAIRS.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_WALL = ITEMS.register("gneiss_wall", () -> new BlockItem(BlockList.GNEISS_WALL.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));

    public static final RegistryObject<Item> POLISHED_GNEISS = ITEMS.register("polished_gneiss", () -> new BlockItem(BlockList.POLISHED_GNEISS.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_GNEISS_SLAB = ITEMS.register("polished_gneiss_slab", () -> new BlockItem(BlockList.POLISHED_GNEISS_SLAB.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_GNEISS_STAIRS = ITEMS.register("polished_gneiss_stairs", () -> new BlockItem(BlockList.POLISHED_GNEISS_STAIRS.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));

    public static final RegistryObject<Item> SCHIST = ITEMS.register("schist", () -> new BlockItem(BlockList.SCHIST.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_SLAB = ITEMS.register("schist_slab", () -> new BlockItem(BlockList.SCHIST_SLAB.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_STAIRS = ITEMS.register("schist_stairs", () -> new BlockItem(BlockList.SCHIST_STAIRS.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_WALL = ITEMS.register("schist_wall", () -> new BlockItem(BlockList.SCHIST_WALL.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));

    public static final RegistryObject<Item> POLISHED_SCHIST = ITEMS.register("polished_schist", () -> new BlockItem(BlockList.POLISHED_SCHIST.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_SCHIST_SLAB = ITEMS.register("polished_schist_slab", () -> new BlockItem(BlockList.POLISHED_SCHIST_SLAB.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_SCHIST_STAIRS = ITEMS.register("polished_schist_stairs", () -> new BlockItem(BlockList.POLISHED_SCHIST_STAIRS.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));

    public static final RegistryObject<Item> AMPHIBOLITE = ITEMS.register("amphibolite", () -> new BlockItem(BlockList.AMPHIBOLITE.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_SLAB = ITEMS.register("amphibolite_slab", () -> new BlockItem(BlockList.AMPHIBOLITE_SLAB.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_STAIRS = ITEMS.register("amphibolite_stairs", () -> new BlockItem(BlockList.AMPHIBOLITE_STAIRS.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_WALL = ITEMS.register("amphibolite_wall", () -> new BlockItem(BlockList.AMPHIBOLITE_WALL.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));

    public static final RegistryObject<Item> POLISHED_AMPHIBOLITE = ITEMS.register("polished_amphibolite", () -> new BlockItem(BlockList.POLISHED_AMPHIBOLITE.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_AMPHIBOLITE_SLAB = ITEMS.register("polished_amphibolite_slab", () -> new BlockItem(BlockList.POLISHED_AMPHIBOLITE_SLAB.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_AMPHIBOLITE_STAIRS = ITEMS.register("polished_amphibolite_stairs", () -> new BlockItem(BlockList.POLISHED_AMPHIBOLITE_STAIRS.get(), new Item.Properties().group(Main.METAMORPHIC_TAB)));

    //Sedimentary Rocks
    public static final RegistryObject<Item> LIMESTONE = ITEMS.register("limestone", () -> new BlockItem(BlockList.LIMESTONE.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_SLAB = ITEMS.register("limestone_slab", () -> new BlockItem(BlockList.LIMESTONE_SLAB.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_STAIRS = ITEMS.register("limestone_stairs", () -> new BlockItem(BlockList.LIMESTONE_STAIRS.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_WALL = ITEMS.register("limestone_wall", () -> new BlockItem(BlockList.LIMESTONE_WALL.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));

    public static final RegistryObject<Item> POLISHED_LIMESTONE = ITEMS.register("polished_limestone", () -> new BlockItem(BlockList.POLISHED_LIMESTONE.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_LIMESTONE_SLAB = ITEMS.register("polished_limestone_slab", () -> new BlockItem(BlockList.POLISHED_LIMESTONE_SLAB.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_LIMESTONE_STAIRS = ITEMS.register("polished_limestone_stairs", () -> new BlockItem(BlockList.POLISHED_LIMESTONE_STAIRS.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));

    public static final RegistryObject<Item> SHALE = ITEMS.register("shale", () -> new BlockItem(BlockList.SHALE.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_SLAB = ITEMS.register("shale_slab", () -> new BlockItem(BlockList.SHALE_SLAB.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_STAIRS = ITEMS.register("shale_stairs", () -> new BlockItem(BlockList.SHALE_STAIRS.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_WALL = ITEMS.register("shale_wall", () -> new BlockItem(BlockList.SHALE_WALL.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));

    public static final RegistryObject<Item> POLISHED_SHALE = ITEMS.register("polished_shale", () -> new BlockItem(BlockList.POLISHED_SHALE.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_SHALE_SLAB = ITEMS.register("polished_shale_slab", () -> new BlockItem(BlockList.POLISHED_SHALE_SLAB.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_SHALE_STAIRS = ITEMS.register("polished_shale_stairs", () -> new BlockItem(BlockList.POLISHED_SHALE_STAIRS.get(), new Item.Properties().group(Main.SEDIMENTARY_TAB)));
}
