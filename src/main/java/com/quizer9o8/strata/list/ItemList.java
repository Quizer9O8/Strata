package com.quizer9o8.strata.list;

import com.quizer9o8.strata.Strata;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Strata.MOD_ID);

/*
    //Debug

    public static final RegistryObject<Item> DEBUG_ITEM = ITEMS.register("debug_item", () -> new Item(new Item.Properties().group(Strata.DEBUG_TAB)));
    public static final RegistryObject<Item> DEBUG_BLOCK = ITEMS.register("debug_block", () -> new BlockItem(BlockList.DEBUG_BLOCK.get(), new Item.Properties().group(Strata.DEBUG_TAB)));
    public static final RegistryObject<Item> DEBUG_SLAB = ITEMS.register("debug_slab", () -> new Item(new Item.Properties().group(Strata.DEBUG_TAB)));
    public static final RegistryObject<Item> DEBUG_STAIRS = ITEMS.register("debug_stairs", () -> new Item(new Item.Properties().group(Strata.DEBUG_TAB)));
    public static final RegistryObject<Item> DEBUG_WALL = ITEMS.register("debug_wall", () -> new Item(new Item.Properties().group(Strata.DEBUG_TAB)));
    //public static final RegistryObject<Item> DEBUG_ORE = ITEMS.register("debug_ore", () -> new BlockItem(BlockList.DEBUG_ORE.get(), new Item.Properties().group(Strata.DEBUG_TAB)));
*/

    /*Igneous Rocks*/

    /*-Basalt-*/
    public static final RegistryObject<Item> BASALT = ITEMS.register("basalt", () -> new BlockItem(BlockList.BASALT.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> BASALT_SLAB = ITEMS.register("basalt_slab", () -> new BlockItem(BlockList.BASALT_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> BASALT_STAIRS = ITEMS.register("basalt_stairs", () -> new BlockItem(BlockList.BASALT_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> BASALT_WALL = ITEMS.register("basalt_wall", () -> new BlockItem(BlockList.BASALT_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> BASALT_COBBLESTONE = ITEMS.register("basalt_cobblestone", () -> new BlockItem(BlockList.BASALT_COBBLESTONE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> BASALT_COBBLESTONE_SLAB = ITEMS.register("basalt_cobblestone_slab", () -> new BlockItem(BlockList.BASALT_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> BASALT_COBBLESTONE_STAIRS = ITEMS.register("basalt_cobblestone_stairs", () -> new BlockItem(BlockList.BASALT_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> BASALT_COBBLESTONE_WALL = ITEMS.register("basalt_cobblestone_wall", () -> new BlockItem(BlockList.BASALT_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_BASALT_COBBLESTONE = ITEMS.register("mossy_basalt_cobblestone", () -> new BlockItem(BlockList.MOSSY_BASALT_COBBLESTONE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_BASALT_COBBLESTONE_SLAB = ITEMS.register("mossy_basalt_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_BASALT_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_BASALT_COBBLESTONE_STAIRS = ITEMS.register("mossy_basalt_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_BASALT_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_BASALT_COBBLESTONE_WALL = ITEMS.register("mossy_basalt_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_BASALT_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    
    //Buttons
    public static final RegistryObject<Item> BASALT_BUTTON = ITEMS.register("basalt_button", () -> new BlockItem(BlockList.BASALT_BUTTON.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> BASALT_PRESSURE_PLATE = ITEMS.register("basalt_pressure_plate", () -> new BlockItem(BlockList.BASALT_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> BASALT_BRICKS = ITEMS.register("basalt_bricks", () -> new BlockItem(BlockList.BASALT_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> BASALT_BRICK_SLAB = ITEMS.register("basalt_brick_slab", () -> new BlockItem(BlockList.BASALT_BRICK_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> BASALT_BRICK_STAIRS = ITEMS.register("basalt_brick_stairs", () -> new BlockItem(BlockList.BASALT_BRICK_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> BASALT_BRICK_WALL = ITEMS.register("basalt_brick_wall", () -> new BlockItem(BlockList.BASALT_BRICK_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_BASALT_BRICKS = ITEMS.register("chiseled_basalt_bricks", () -> new BlockItem(BlockList.CHISELED_BASALT_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_BASALT_BRICKS = ITEMS.register("cracked_basalt_bricks", () -> new BlockItem(BlockList.CRACKED_BASALT_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_BASALT_BRICKS = ITEMS.register("mossy_basalt_bricks", () -> new BlockItem(BlockList.MOSSY_BASALT_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_BASALT_BRICK_SLAB = ITEMS.register("mossy_basalt_brick_slab", () -> new BlockItem(BlockList.MOSSY_BASALT_BRICK_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_BASALT_BRICK_STAIRS = ITEMS.register("mossy_basalt_brick_stairs", () -> new BlockItem(BlockList.MOSSY_BASALT_BRICK_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_BASALT_BRICK_WALL = ITEMS.register("mossy_basalt_brick_wall", () -> new BlockItem(BlockList.MOSSY_BASALT_BRICK_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_BASALT = ITEMS.register("polished_basalt", () -> new BlockItem(BlockList.POLISHED_BASALT.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_BASALT_SLAB = ITEMS.register("polished_basalt_slab", () -> new BlockItem(BlockList.POLISHED_BASALT_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_BASALT_STAIRS = ITEMS.register("polished_basalt_stairs", () -> new BlockItem(BlockList.POLISHED_BASALT_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    /*-Gabbro-*/
    public static final RegistryObject<Item> GABBRO = ITEMS.register("gabbro", () -> new BlockItem(BlockList.GABBRO.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_SLAB = ITEMS.register("gabbro_slab", () -> new BlockItem(BlockList.GABBRO_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_STAIRS = ITEMS.register("gabbro_stairs", () -> new BlockItem(BlockList.GABBRO_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_WALL = ITEMS.register("gabbro_wall", () -> new BlockItem(BlockList.GABBRO_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> GABBRO_COBBLESTONE = ITEMS.register("gabbro_cobblestone", () -> new BlockItem(BlockList.GABBRO_COBBLESTONE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_COBBLESTONE_SLAB = ITEMS.register("gabbro_cobblestone_slab", () -> new BlockItem(BlockList.GABBRO_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_COBBLESTONE_STAIRS = ITEMS.register("gabbro_cobblestone_stairs", () -> new BlockItem(BlockList.GABBRO_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_COBBLESTONE_WALL = ITEMS.register("gabbro_cobblestone_wall", () -> new BlockItem(BlockList.GABBRO_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_GABBRO_COBBLESTONE = ITEMS.register("mossy_gabbro_cobblestone", () -> new BlockItem(BlockList.MOSSY_GABBRO_COBBLESTONE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_COBBLESTONE_SLAB = ITEMS.register("mossy_gabbro_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_GABBRO_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_COBBLESTONE_STAIRS = ITEMS.register("mossy_gabbro_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_GABBRO_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_COBBLESTONE_WALL = ITEMS.register("mossy_gabbro_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_GABBRO_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));


    //Buttons
    public static final RegistryObject<Item> GABBRO_BUTTON = ITEMS.register("gabbro_button", () -> new BlockItem(BlockList.GABBRO_BUTTON.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> GABBRO_PRESSURE_PLATE = ITEMS.register("gabbro_pressure_plate", () -> new BlockItem(BlockList.GABBRO_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> GABBRO_BRICKS = ITEMS.register("gabbro_bricks", () -> new BlockItem(BlockList.GABBRO_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_BRICK_SLAB = ITEMS.register("gabbro_brick_slab", () -> new BlockItem(BlockList.GABBRO_BRICK_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_BRICK_STAIRS = ITEMS.register("gabbro_brick_stairs", () -> new BlockItem(BlockList.GABBRO_BRICK_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_BRICK_WALL = ITEMS.register("gabbro_brick_wall", () -> new BlockItem(BlockList.GABBRO_BRICK_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_GABBRO_BRICKS = ITEMS.register("chiseled_gabbro_bricks", () -> new BlockItem(BlockList.CHISELED_GABBRO_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_GABBRO_BRICKS = ITEMS.register("cracked_gabbro_bricks", () -> new BlockItem(BlockList.CRACKED_GABBRO_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_BRICKS = ITEMS.register("mossy_gabbro_bricks", () -> new BlockItem(BlockList.MOSSY_GABBRO_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_BRICK_SLAB = ITEMS.register("mossy_gabbro_brick_slab", () -> new BlockItem(BlockList.MOSSY_GABBRO_BRICK_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_BRICK_STAIRS = ITEMS.register("mossy_gabbro_brick_stairs", () -> new BlockItem(BlockList.MOSSY_GABBRO_BRICK_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_BRICK_WALL = ITEMS.register("mossy_gabbro_brick_wall", () -> new BlockItem(BlockList.MOSSY_GABBRO_BRICK_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_GABBRO = ITEMS.register("polished_gabbro", () -> new BlockItem(BlockList.POLISHED_GABBRO.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_GABBRO_SLAB = ITEMS.register("polished_gabbro_slab", () -> new BlockItem(BlockList.POLISHED_GABBRO_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_GABBRO_STAIRS = ITEMS.register("polished_gabbro_stairs", () -> new BlockItem(BlockList.POLISHED_GABBRO_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    /*Metamorphic Rocks*/

    /*-Amphibolite-*/
    public static final RegistryObject<Item> AMPHIBOLITE = ITEMS.register("amphibolite", () -> new BlockItem(BlockList.AMPHIBOLITE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_SLAB = ITEMS.register("amphibolite_slab", () -> new BlockItem(BlockList.AMPHIBOLITE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_STAIRS = ITEMS.register("amphibolite_stairs", () -> new BlockItem(BlockList.AMPHIBOLITE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_WALL = ITEMS.register("amphibolite_wall", () -> new BlockItem(BlockList.AMPHIBOLITE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> AMPHIBOLITE_COBBLESTONE = ITEMS.register("amphibolite_cobblestone", () -> new BlockItem(BlockList.AMPHIBOLITE_COBBLESTONE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_COBBLESTONE_SLAB = ITEMS.register("amphibolite_cobblestone_slab", () -> new BlockItem(BlockList.AMPHIBOLITE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_COBBLESTONE_STAIRS = ITEMS.register("amphibolite_cobblestone_stairs", () -> new BlockItem(BlockList.AMPHIBOLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_COBBLESTONE_WALL = ITEMS.register("amphibolite_cobblestone_wall", () -> new BlockItem(BlockList.AMPHIBOLITE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_COBBLESTONE = ITEMS.register("mossy_amphibolite_cobblestone", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_COBBLESTONE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_COBBLESTONE_SLAB = ITEMS.register("mossy_amphibolite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_amphibolite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_COBBLESTONE_WALL = ITEMS.register("mossy_amphibolite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> AMPHIBOLITE_BUTTON = ITEMS.register("amphibolite_button", () -> new BlockItem(BlockList.AMPHIBOLITE_BUTTON.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> AMPHIBOLITE_PRESSURE_PLATE = ITEMS.register("amphibolite_pressure_plate", () -> new BlockItem(BlockList.AMPHIBOLITE_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> AMPHIBOLITE_BRICKS = ITEMS.register("amphibolite_bricks", () -> new BlockItem(BlockList.AMPHIBOLITE_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_BRICK_SLAB = ITEMS.register("amphibolite_brick_slab", () -> new BlockItem(BlockList.AMPHIBOLITE_BRICK_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_BRICK_STAIRS = ITEMS.register("amphibolite_brick_stairs", () -> new BlockItem(BlockList.AMPHIBOLITE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_BRICK_WALL = ITEMS.register("amphibolite_brick_wall", () -> new BlockItem(BlockList.AMPHIBOLITE_BRICK_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_AMPHIBOLITE_BRICKS = ITEMS.register("chiseled_amphibolite_bricks", () -> new BlockItem(BlockList.CHISELED_AMPHIBOLITE_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_AMPHIBOLITE_BRICKS = ITEMS.register("cracked_amphibolite_bricks", () -> new BlockItem(BlockList.CRACKED_AMPHIBOLITE_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_BRICKS = ITEMS.register("mossy_amphibolite_bricks", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_BRICK_SLAB = ITEMS.register("mossy_amphibolite_brick_slab", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_BRICK_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_BRICK_STAIRS = ITEMS.register("mossy_amphibolite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_BRICK_WALL = ITEMS.register("mossy_amphibolite_brick_wall", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_BRICK_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_AMPHIBOLITE = ITEMS.register("polished_amphibolite", () -> new BlockItem(BlockList.POLISHED_AMPHIBOLITE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_AMPHIBOLITE_SLAB = ITEMS.register("polished_amphibolite_slab", () -> new BlockItem(BlockList.POLISHED_AMPHIBOLITE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_AMPHIBOLITE_STAIRS = ITEMS.register("polished_amphibolite_stairs", () -> new BlockItem(BlockList.POLISHED_AMPHIBOLITE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    /*-Gneiss-*/
    public static final RegistryObject<Item> GNEISS = ITEMS.register("gneiss", () -> new BlockItem(BlockList.GNEISS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_SLAB = ITEMS.register("gneiss_slab", () -> new BlockItem(BlockList.GNEISS_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_STAIRS = ITEMS.register("gneiss_stairs", () -> new BlockItem(BlockList.GNEISS_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_WALL = ITEMS.register("gneiss_wall", () -> new BlockItem(BlockList.GNEISS_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> GNEISS_COBBLESTONE = ITEMS.register("gneiss_cobblestone", () -> new BlockItem(BlockList.GNEISS_COBBLESTONE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_COBBLESTONE_SLAB = ITEMS.register("gneiss_cobblestone_slab", () -> new BlockItem(BlockList.GNEISS_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_COBBLESTONE_STAIRS = ITEMS.register("gneiss_cobblestone_stairs", () -> new BlockItem(BlockList.GNEISS_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_COBBLESTONE_WALL = ITEMS.register("gneiss_cobblestone_wall", () -> new BlockItem(BlockList.GNEISS_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_GNEISS_COBBLESTONE = ITEMS.register("mossy_gneiss_cobblestone", () -> new BlockItem(BlockList.MOSSY_GNEISS_COBBLESTONE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_COBBLESTONE_SLAB = ITEMS.register("mossy_gneiss_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_GNEISS_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_COBBLESTONE_STAIRS = ITEMS.register("mossy_gneiss_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_GNEISS_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_COBBLESTONE_WALL = ITEMS.register("mossy_gneiss_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_GNEISS_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> GNEISS_BUTTON = ITEMS.register("gneiss_button", () -> new BlockItem(BlockList.GNEISS_BUTTON.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> GNEISS_PRESSURE_PLATE = ITEMS.register("gneiss_pressure_plate", () -> new BlockItem(BlockList.GNEISS_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> GNEISS_BRICKS = ITEMS.register("gneiss_bricks", () -> new BlockItem(BlockList.GNEISS_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_BRICK_SLAB = ITEMS.register("gneiss_brick_slab", () -> new BlockItem(BlockList.GNEISS_BRICK_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_BRICK_STAIRS = ITEMS.register("gneiss_brick_stairs", () -> new BlockItem(BlockList.GNEISS_BRICK_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_BRICK_WALL = ITEMS.register("gneiss_brick_wall", () -> new BlockItem(BlockList.GNEISS_BRICK_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_GNEISS_BRICKS = ITEMS.register("chiseled_gneiss_bricks", () -> new BlockItem(BlockList.CHISELED_GNEISS_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_GNEISS_BRICKS = ITEMS.register("cracked_gneiss_bricks", () -> new BlockItem(BlockList.CRACKED_GNEISS_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_BRICKS = ITEMS.register("mossy_gneiss_bricks", () -> new BlockItem(BlockList.MOSSY_GNEISS_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_BRICK_SLAB = ITEMS.register("mossy_gneiss_brick_slab", () -> new BlockItem(BlockList.MOSSY_GNEISS_BRICK_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_BRICK_STAIRS = ITEMS.register("mossy_gneiss_brick_stairs", () -> new BlockItem(BlockList.MOSSY_GNEISS_BRICK_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_BRICK_WALL = ITEMS.register("mossy_gneiss_brick_wall", () -> new BlockItem(BlockList.MOSSY_GNEISS_BRICK_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_GNEISS = ITEMS.register("polished_gneiss", () -> new BlockItem(BlockList.POLISHED_GNEISS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_GNEISS_SLAB = ITEMS.register("polished_gneiss_slab", () -> new BlockItem(BlockList.POLISHED_GNEISS_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_GNEISS_STAIRS = ITEMS.register("polished_gneiss_stairs", () -> new BlockItem(BlockList.POLISHED_GNEISS_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    /*-Schist-*/
    public static final RegistryObject<Item> SCHIST = ITEMS.register("schist", () -> new BlockItem(BlockList.SCHIST.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_SLAB = ITEMS.register("schist_slab", () -> new BlockItem(BlockList.SCHIST_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_STAIRS = ITEMS.register("schist_stairs", () -> new BlockItem(BlockList.SCHIST_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_WALL = ITEMS.register("schist_wall", () -> new BlockItem(BlockList.SCHIST_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> SCHIST_COBBLESTONE = ITEMS.register("schist_cobblestone", () -> new BlockItem(BlockList.SCHIST_COBBLESTONE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_COBBLESTONE_SLAB = ITEMS.register("schist_cobblestone_slab", () -> new BlockItem(BlockList.SCHIST_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_COBBLESTONE_STAIRS = ITEMS.register("schist_cobblestone_stairs", () -> new BlockItem(BlockList.SCHIST_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_COBBLESTONE_WALL = ITEMS.register("schist_cobblestone_wall", () -> new BlockItem(BlockList.SCHIST_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_SCHIST_COBBLESTONE = ITEMS.register("mossy_schist_cobblestone", () -> new BlockItem(BlockList.MOSSY_SCHIST_COBBLESTONE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_COBBLESTONE_SLAB = ITEMS.register("mossy_schist_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_SCHIST_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_COBBLESTONE_STAIRS = ITEMS.register("mossy_schist_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_SCHIST_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_COBBLESTONE_WALL = ITEMS.register("mossy_schist_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_SCHIST_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> SCHIST_BUTTON = ITEMS.register("schist_button", () -> new BlockItem(BlockList.SCHIST_BUTTON.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> SCHIST_PRESSURE_PLATE = ITEMS.register("schist_pressure_plate", () -> new BlockItem(BlockList.SCHIST_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> SCHIST_BRICKS = ITEMS.register("schist_bricks", () -> new BlockItem(BlockList.SCHIST_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_BRICK_SLAB = ITEMS.register("schist_brick_slab", () -> new BlockItem(BlockList.SCHIST_BRICK_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_BRICK_STAIRS = ITEMS.register("schist_brick_stairs", () -> new BlockItem(BlockList.SCHIST_BRICK_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_BRICK_WALL = ITEMS.register("schist_brick_wall", () -> new BlockItem(BlockList.SCHIST_BRICK_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_SCHIST_BRICKS = ITEMS.register("chiseled_schist_bricks", () -> new BlockItem(BlockList.CHISELED_SCHIST_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_SCHIST_BRICKS = ITEMS.register("cracked_schist_bricks", () -> new BlockItem(BlockList.CRACKED_SCHIST_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_BRICKS = ITEMS.register("mossy_schist_bricks", () -> new BlockItem(BlockList.MOSSY_SCHIST_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_BRICK_SLAB = ITEMS.register("mossy_schist_brick_slab", () -> new BlockItem(BlockList.MOSSY_SCHIST_BRICK_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_BRICK_STAIRS = ITEMS.register("mossy_schist_brick_stairs", () -> new BlockItem(BlockList.MOSSY_SCHIST_BRICK_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_BRICK_WALL = ITEMS.register("mossy_schist_brick_wall", () -> new BlockItem(BlockList.MOSSY_SCHIST_BRICK_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_SCHIST = ITEMS.register("polished_schist", () -> new BlockItem(BlockList.POLISHED_SCHIST.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_SCHIST_SLAB = ITEMS.register("polished_schist_slab", () -> new BlockItem(BlockList.POLISHED_SCHIST_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_SCHIST_STAIRS = ITEMS.register("polished_schist_stairs", () -> new BlockItem(BlockList.POLISHED_SCHIST_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    /*Sedimentary Rocks*/

    /*-Limestone-*/
    public static final RegistryObject<Item> LIMESTONE = ITEMS.register("limestone", () -> new BlockItem(BlockList.LIMESTONE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_SLAB = ITEMS.register("limestone_slab", () -> new BlockItem(BlockList.LIMESTONE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_STAIRS = ITEMS.register("limestone_stairs", () -> new BlockItem(BlockList.LIMESTONE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_WALL = ITEMS.register("limestone_wall", () -> new BlockItem(BlockList.LIMESTONE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> LIMESTONE_COBBLESTONE = ITEMS.register("limestone_cobblestone", () -> new BlockItem(BlockList.LIMESTONE_COBBLESTONE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_COBBLESTONE_SLAB = ITEMS.register("limestone_cobblestone_slab", () -> new BlockItem(BlockList.LIMESTONE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_COBBLESTONE_STAIRS = ITEMS.register("limestone_cobblestone_stairs", () -> new BlockItem(BlockList.LIMESTONE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_COBBLESTONE_WALL = ITEMS.register("limestone_cobblestone_wall", () -> new BlockItem(BlockList.LIMESTONE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_LIMESTONE_COBBLESTONE = ITEMS.register("mossy_limestone_cobblestone", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_COBBLESTONE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_COBBLESTONE_SLAB = ITEMS.register("mossy_limestone_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_COBBLESTONE_STAIRS = ITEMS.register("mossy_limestone_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_COBBLESTONE_WALL = ITEMS.register("mossy_limestone_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));


    //Buttons
    public static final RegistryObject<Item> LIMESTONE_BUTTON = ITEMS.register("limestone_button", () -> new BlockItem(BlockList.LIMESTONE_BUTTON.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> LIMESTONE_PRESSURE_PLATE = ITEMS.register("limestone_pressure_plate", () -> new BlockItem(BlockList.LIMESTONE_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> LIMESTONE_BRICKS = ITEMS.register("limestone_bricks", () -> new BlockItem(BlockList.LIMESTONE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_BRICK_SLAB = ITEMS.register("limestone_brick_slab", () -> new BlockItem(BlockList.LIMESTONE_BRICK_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_BRICK_STAIRS = ITEMS.register("limestone_brick_stairs", () -> new BlockItem(BlockList.LIMESTONE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_BRICK_WALL = ITEMS.register("limestone_brick_wall", () -> new BlockItem(BlockList.LIMESTONE_BRICK_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_LIMESTONE_BRICKS = ITEMS.register("chiseled_limestone_bricks", () -> new BlockItem(BlockList.CHISELED_LIMESTONE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_LIMESTONE_BRICKS = ITEMS.register("cracked_limestone_bricks", () -> new BlockItem(BlockList.CRACKED_LIMESTONE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_BRICKS = ITEMS.register("mossy_limestone_bricks", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_BRICK_SLAB = ITEMS.register("mossy_limestone_brick_slab", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_BRICK_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_BRICK_STAIRS = ITEMS.register("mossy_limestone_brick_stairs", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_BRICK_WALL = ITEMS.register("mossy_limestone_brick_wall", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_BRICK_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_LIMESTONE = ITEMS.register("polished_limestone", () -> new BlockItem(BlockList.POLISHED_LIMESTONE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_LIMESTONE_SLAB = ITEMS.register("polished_limestone_slab", () -> new BlockItem(BlockList.POLISHED_LIMESTONE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_LIMESTONE_STAIRS = ITEMS.register("polished_limestone_stairs", () -> new BlockItem(BlockList.POLISHED_LIMESTONE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    /*-Shale-*/
    public static final RegistryObject<Item> SHALE = ITEMS.register("shale", () -> new BlockItem(BlockList.SHALE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_SLAB = ITEMS.register("shale_slab", () -> new BlockItem(BlockList.SHALE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_STAIRS = ITEMS.register("shale_stairs", () -> new BlockItem(BlockList.SHALE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_WALL = ITEMS.register("shale_wall", () -> new BlockItem(BlockList.SHALE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> SHALE_COBBLESTONE = ITEMS.register("shale_cobblestone", () -> new BlockItem(BlockList.SHALE_COBBLESTONE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_COBBLESTONE_SLAB = ITEMS.register("shale_cobblestone_slab", () -> new BlockItem(BlockList.SHALE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_COBBLESTONE_STAIRS = ITEMS.register("shale_cobblestone_stairs", () -> new BlockItem(BlockList.SHALE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_COBBLESTONE_WALL = ITEMS.register("shale_cobblestone_wall", () -> new BlockItem(BlockList.SHALE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_SHALE_COBBLESTONE = ITEMS.register("mossy_shale_cobblestone", () -> new BlockItem(BlockList.MOSSY_SHALE_COBBLESTONE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_COBBLESTONE_SLAB = ITEMS.register("mossy_shale_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_SHALE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_COBBLESTONE_STAIRS = ITEMS.register("mossy_shale_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_SHALE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_COBBLESTONE_WALL = ITEMS.register("mossy_shale_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_SHALE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> SHALE_BUTTON = ITEMS.register("shale_button", () -> new BlockItem(BlockList.SHALE_BUTTON.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> SHALE_PRESSURE_PLATE = ITEMS.register("shale_pressure_plate", () -> new BlockItem(BlockList.SHALE_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> SHALE_BRICKS = ITEMS.register("shale_bricks", () -> new BlockItem(BlockList.SHALE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_BRICK_SLAB = ITEMS.register("shale_brick_slab", () -> new BlockItem(BlockList.SHALE_BRICK_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_BRICK_STAIRS = ITEMS.register("shale_brick_stairs", () -> new BlockItem(BlockList.SHALE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_BRICK_WALL = ITEMS.register("shale_brick_wall", () -> new BlockItem(BlockList.SHALE_BRICK_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_SHALE_BRICKS = ITEMS.register("chiseled_shale_bricks", () -> new BlockItem(BlockList.CHISELED_SHALE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_SHALE_BRICKS = ITEMS.register("cracked_shale_bricks", () -> new BlockItem(BlockList.CRACKED_SHALE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_BRICKS = ITEMS.register("mossy_shale_bricks", () -> new BlockItem(BlockList.MOSSY_SHALE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_BRICK_SLAB = ITEMS.register("mossy_shale_brick_slab", () -> new BlockItem(BlockList.MOSSY_SHALE_BRICK_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_BRICK_STAIRS = ITEMS.register("mossy_shale_brick_stairs", () -> new BlockItem(BlockList.MOSSY_SHALE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_BRICK_WALL = ITEMS.register("mossy_shale_brick_wall", () -> new BlockItem(BlockList.MOSSY_SHALE_BRICK_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_SHALE = ITEMS.register("polished_shale", () -> new BlockItem(BlockList.POLISHED_SHALE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_SHALE_SLAB = ITEMS.register("polished_shale_slab", () -> new BlockItem(BlockList.POLISHED_SHALE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_SHALE_STAIRS = ITEMS.register("polished_shale_stairs", () -> new BlockItem(BlockList.POLISHED_SHALE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
}
