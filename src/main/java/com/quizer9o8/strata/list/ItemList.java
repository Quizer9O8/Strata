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

    /*-Aa-*/
    public static final RegistryObject<Item> AA = ITEMS.register("aa", () -> new BlockItem(BlockList.AA.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_SLAB = ITEMS.register("aa_slab", () -> new BlockItem(BlockList.AA_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_STAIRS = ITEMS.register("aa_stairs", () -> new BlockItem(BlockList.AA_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_WALL = ITEMS.register("aa_wall", () -> new BlockItem(BlockList.AA_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> AA_COBBLESTONE = ITEMS.register("aa_cobblestone", () -> new BlockItem(BlockList.AA_COBBLESTONE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_COBBLESTONE_SLAB = ITEMS.register("aa_cobblestone_slab", () -> new BlockItem(BlockList.AA_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_COBBLESTONE_STAIRS = ITEMS.register("aa_cobblestone_stairs", () -> new BlockItem(BlockList.AA_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_COBBLESTONE_WALL = ITEMS.register("aa_cobblestone_wall", () -> new BlockItem(BlockList.AA_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_AA_COBBLESTONE = ITEMS.register("mossy_aa_cobblestone", () -> new BlockItem(BlockList.MOSSY_AA_COBBLESTONE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_COBBLESTONE_SLAB = ITEMS.register("mossy_aa_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_AA_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_COBBLESTONE_STAIRS = ITEMS.register("mossy_aa_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_AA_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_COBBLESTONE_WALL = ITEMS.register("mossy_aa_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_AA_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Buttons
    public static final RegistryObject<Item> AA_BUTTON = ITEMS.register("aa_button", () -> new BlockItem(BlockList.AA_BUTTON.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> AA_PRESSURE_PLATE = ITEMS.register("aa_pressure_plate", () -> new BlockItem(BlockList.AA_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> AA_BRICKS = ITEMS.register("aa_bricks", () -> new BlockItem(BlockList.AA_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_BRICK_SLAB = ITEMS.register("aa_brick_slab", () -> new BlockItem(BlockList.AA_BRICK_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_BRICK_STAIRS = ITEMS.register("aa_brick_stairs", () -> new BlockItem(BlockList.AA_BRICK_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_BRICK_WALL = ITEMS.register("aa_brick_wall", () -> new BlockItem(BlockList.AA_BRICK_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_AA_BRICKS = ITEMS.register("chiseled_aa_bricks", () -> new BlockItem(BlockList.CHISELED_AA_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_AA_BRICKS = ITEMS.register("cracked_aa_bricks", () -> new BlockItem(BlockList.CRACKED_AA_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_BRICKS = ITEMS.register("mossy_aa_bricks", () -> new BlockItem(BlockList.MOSSY_AA_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_BRICK_SLAB = ITEMS.register("mossy_aa_brick_slab", () -> new BlockItem(BlockList.MOSSY_AA_BRICK_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_BRICK_STAIRS = ITEMS.register("mossy_aa_brick_stairs", () -> new BlockItem(BlockList.MOSSY_AA_BRICK_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_BRICK_WALL = ITEMS.register("mossy_aa_brick_wall", () -> new BlockItem(BlockList.MOSSY_AA_BRICK_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_AA = ITEMS.register("polished_aa", () -> new BlockItem(BlockList.POLISHED_AA.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_AA_SLAB = ITEMS.register("polished_aa_slab", () -> new BlockItem(BlockList.POLISHED_AA_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_AA_STAIRS = ITEMS.register("polished_aa_stairs", () -> new BlockItem(BlockList.POLISHED_AA_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    /*-Adakite-*/
    public static final RegistryObject<Item> ADAKITE = ITEMS.register("adakite", () -> new BlockItem(BlockList.ADAKITE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_SLAB = ITEMS.register("adakite_slab", () -> new BlockItem(BlockList.ADAKITE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_STAIRS = ITEMS.register("adakite_stairs", () -> new BlockItem(BlockList.ADAKITE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_WALL = ITEMS.register("adakite_wall", () -> new BlockItem(BlockList.ADAKITE_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> ADAKITE_COBBLESTONE = ITEMS.register("adakite_cobblestone", () -> new BlockItem(BlockList.ADAKITE_COBBLESTONE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_COBBLESTONE_SLAB = ITEMS.register("adakite_cobblestone_slab", () -> new BlockItem(BlockList.ADAKITE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_COBBLESTONE_STAIRS = ITEMS.register("adakite_cobblestone_stairs", () -> new BlockItem(BlockList.ADAKITE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_COBBLESTONE_WALL = ITEMS.register("adakite_cobblestone_wall", () -> new BlockItem(BlockList.ADAKITE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_ADAKITE_COBBLESTONE = ITEMS.register("mossy_adakite_cobblestone", () -> new BlockItem(BlockList.MOSSY_ADAKITE_COBBLESTONE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_COBBLESTONE_SLAB = ITEMS.register("mossy_adakite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_ADAKITE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_adakite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_ADAKITE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_COBBLESTONE_WALL = ITEMS.register("mossy_adakite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_ADAKITE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Buttons
    public static final RegistryObject<Item> ADAKITE_BUTTON = ITEMS.register("adakite_button", () -> new BlockItem(BlockList.ADAKITE_BUTTON.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> ADAKITE_PRESSURE_PLATE = ITEMS.register("adakite_pressure_plate", () -> new BlockItem(BlockList.ADAKITE_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> ADAKITE_BRICKS = ITEMS.register("adakite_bricks", () -> new BlockItem(BlockList.ADAKITE_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_BRICK_SLAB = ITEMS.register("adakite_brick_slab", () -> new BlockItem(BlockList.ADAKITE_BRICK_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_BRICK_STAIRS = ITEMS.register("adakite_brick_stairs", () -> new BlockItem(BlockList.ADAKITE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_BRICK_WALL = ITEMS.register("adakite_brick_wall", () -> new BlockItem(BlockList.ADAKITE_BRICK_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_ADAKITE_BRICKS = ITEMS.register("chiseled_adakite_bricks", () -> new BlockItem(BlockList.CHISELED_ADAKITE_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_ADAKITE_BRICKS = ITEMS.register("cracked_adakite_bricks", () -> new BlockItem(BlockList.CRACKED_ADAKITE_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_BRICKS = ITEMS.register("mossy_adakite_bricks", () -> new BlockItem(BlockList.MOSSY_ADAKITE_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_BRICK_SLAB = ITEMS.register("mossy_adakite_brick_slab", () -> new BlockItem(BlockList.MOSSY_ADAKITE_BRICK_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_BRICK_STAIRS = ITEMS.register("mossy_adakite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_ADAKITE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_BRICK_WALL = ITEMS.register("mossy_adakite_brick_wall", () -> new BlockItem(BlockList.MOSSY_ADAKITE_BRICK_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_ADAKITE = ITEMS.register("polished_adakite", () -> new BlockItem(BlockList.POLISHED_ADAKITE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_ADAKITE_SLAB = ITEMS.register("polished_adakite_slab", () -> new BlockItem(BlockList.POLISHED_ADAKITE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_ADAKITE_STAIRS = ITEMS.register("polished_adakite_stairs", () -> new BlockItem(BlockList.POLISHED_ADAKITE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

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

    /*-Pahoehoe-*/
    public static final RegistryObject<Item> PAHOEHOE = ITEMS.register("pahoehoe", () -> new BlockItem(BlockList.PAHOEHOE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_SLAB = ITEMS.register("pahoehoe_slab", () -> new BlockItem(BlockList.PAHOEHOE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_STAIRS = ITEMS.register("pahoehoe_stairs", () -> new BlockItem(BlockList.PAHOEHOE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_WALL = ITEMS.register("pahoehoe_wall", () -> new BlockItem(BlockList.PAHOEHOE_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> PAHOEHOE_COBBLESTONE = ITEMS.register("pahoehoe_cobblestone", () -> new BlockItem(BlockList.PAHOEHOE_COBBLESTONE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_COBBLESTONE_SLAB = ITEMS.register("pahoehoe_cobblestone_slab", () -> new BlockItem(BlockList.PAHOEHOE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_COBBLESTONE_STAIRS = ITEMS.register("pahoehoe_cobblestone_stairs", () -> new BlockItem(BlockList.PAHOEHOE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_COBBLESTONE_WALL = ITEMS.register("pahoehoe_cobblestone_wall", () -> new BlockItem(BlockList.PAHOEHOE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_COBBLESTONE = ITEMS.register("mossy_pahoehoe_cobblestone", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_COBBLESTONE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_COBBLESTONE_SLAB = ITEMS.register("mossy_pahoehoe_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_COBBLESTONE_STAIRS = ITEMS.register("mossy_pahoehoe_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_COBBLESTONE_WALL = ITEMS.register("mossy_pahoehoe_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Buttons
    public static final RegistryObject<Item> PAHOEHOE_BUTTON = ITEMS.register("pahoehoe_button", () -> new BlockItem(BlockList.PAHOEHOE_BUTTON.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> PAHOEHOE_PRESSURE_PLATE = ITEMS.register("pahoehoe_pressure_plate", () -> new BlockItem(BlockList.PAHOEHOE_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> PAHOEHOE_BRICKS = ITEMS.register("pahoehoe_bricks", () -> new BlockItem(BlockList.PAHOEHOE_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_BRICK_SLAB = ITEMS.register("pahoehoe_brick_slab", () -> new BlockItem(BlockList.PAHOEHOE_BRICK_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_BRICK_STAIRS = ITEMS.register("pahoehoe_brick_stairs", () -> new BlockItem(BlockList.PAHOEHOE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_BRICK_WALL = ITEMS.register("pahoehoe_brick_wall", () -> new BlockItem(BlockList.PAHOEHOE_BRICK_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_PAHOEHOE_BRICKS = ITEMS.register("chiseled_pahoehoe_bricks", () -> new BlockItem(BlockList.CHISELED_PAHOEHOE_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_PAHOEHOE_BRICKS = ITEMS.register("cracked_pahoehoe_bricks", () -> new BlockItem(BlockList.CRACKED_PAHOEHOE_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_BRICKS = ITEMS.register("mossy_pahoehoe_bricks", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_BRICKS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_BRICK_SLAB = ITEMS.register("mossy_pahoehoe_brick_slab", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_BRICK_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_BRICK_STAIRS = ITEMS.register("mossy_pahoehoe_brick_stairs", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_BRICK_WALL = ITEMS.register("mossy_pahoehoe_brick_wall", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_BRICK_WALL.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_PAHOEHOE = ITEMS.register("polished_pahoehoe", () -> new BlockItem(BlockList.POLISHED_PAHOEHOE.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_PAHOEHOE_SLAB = ITEMS.register("polished_pahoehoe_slab", () -> new BlockItem(BlockList.POLISHED_PAHOEHOE_SLAB.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_PAHOEHOE_STAIRS = ITEMS.register("polished_pahoehoe_stairs", () -> new BlockItem(BlockList.POLISHED_PAHOEHOE_STAIRS.get(), new Item.Properties().group(Strata.IGNEOUS_TAB)));

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
    
    /*-Eclogite-*/
    public static final RegistryObject<Item> ECLOGITE = ITEMS.register("eclogite", () -> new BlockItem(BlockList.ECLOGITE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_SLAB = ITEMS.register("eclogite_slab", () -> new BlockItem(BlockList.ECLOGITE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_STAIRS = ITEMS.register("eclogite_stairs", () -> new BlockItem(BlockList.ECLOGITE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_WALL = ITEMS.register("eclogite_wall", () -> new BlockItem(BlockList.ECLOGITE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> ECLOGITE_COBBLESTONE = ITEMS.register("eclogite_cobblestone", () -> new BlockItem(BlockList.ECLOGITE_COBBLESTONE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_COBBLESTONE_SLAB = ITEMS.register("eclogite_cobblestone_slab", () -> new BlockItem(BlockList.ECLOGITE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_COBBLESTONE_STAIRS = ITEMS.register("eclogite_cobblestone_stairs", () -> new BlockItem(BlockList.ECLOGITE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_COBBLESTONE_WALL = ITEMS.register("eclogite_cobblestone_wall", () -> new BlockItem(BlockList.ECLOGITE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_ECLOGITE_COBBLESTONE = ITEMS.register("mossy_eclogite_cobblestone", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_COBBLESTONE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_COBBLESTONE_SLAB = ITEMS.register("mossy_eclogite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_eclogite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_COBBLESTONE_WALL = ITEMS.register("mossy_eclogite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> ECLOGITE_BUTTON = ITEMS.register("eclogite_button", () -> new BlockItem(BlockList.ECLOGITE_BUTTON.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> ECLOGITE_PRESSURE_PLATE = ITEMS.register("eclogite_pressure_plate", () -> new BlockItem(BlockList.ECLOGITE_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> ECLOGITE_BRICKS = ITEMS.register("eclogite_bricks", () -> new BlockItem(BlockList.ECLOGITE_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_BRICK_SLAB = ITEMS.register("eclogite_brick_slab", () -> new BlockItem(BlockList.ECLOGITE_BRICK_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_BRICK_STAIRS = ITEMS.register("eclogite_brick_stairs", () -> new BlockItem(BlockList.ECLOGITE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_BRICK_WALL = ITEMS.register("eclogite_brick_wall", () -> new BlockItem(BlockList.ECLOGITE_BRICK_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_ECLOGITE_BRICKS = ITEMS.register("chiseled_eclogite_bricks", () -> new BlockItem(BlockList.CHISELED_ECLOGITE_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_ECLOGITE_BRICKS = ITEMS.register("cracked_eclogite_bricks", () -> new BlockItem(BlockList.CRACKED_ECLOGITE_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_BRICKS = ITEMS.register("mossy_eclogite_bricks", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_BRICK_SLAB = ITEMS.register("mossy_eclogite_brick_slab", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_BRICK_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_BRICK_STAIRS = ITEMS.register("mossy_eclogite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_BRICK_WALL = ITEMS.register("mossy_eclogite_brick_wall", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_BRICK_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_ECLOGITE = ITEMS.register("polished_eclogite", () -> new BlockItem(BlockList.POLISHED_ECLOGITE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_ECLOGITE_SLAB = ITEMS.register("polished_eclogite_slab", () -> new BlockItem(BlockList.POLISHED_ECLOGITE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_ECLOGITE_STAIRS = ITEMS.register("polished_eclogite_stairs", () -> new BlockItem(BlockList.POLISHED_ECLOGITE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

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

    /*-Marble-*/
    public static final RegistryObject<Item> MARBLE = ITEMS.register("marble", () -> new BlockItem(BlockList.MARBLE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_SLAB = ITEMS.register("marble_slab", () -> new BlockItem(BlockList.MARBLE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_STAIRS = ITEMS.register("marble_stairs", () -> new BlockItem(BlockList.MARBLE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_WALL = ITEMS.register("marble_wall", () -> new BlockItem(BlockList.MARBLE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> MARBLE_COBBLESTONE = ITEMS.register("marble_cobblestone", () -> new BlockItem(BlockList.MARBLE_COBBLESTONE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_COBBLESTONE_SLAB = ITEMS.register("marble_cobblestone_slab", () -> new BlockItem(BlockList.MARBLE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_COBBLESTONE_STAIRS = ITEMS.register("marble_cobblestone_stairs", () -> new BlockItem(BlockList.MARBLE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_COBBLESTONE_WALL = ITEMS.register("marble_cobblestone_wall", () -> new BlockItem(BlockList.MARBLE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_MARBLE_COBBLESTONE = ITEMS.register("mossy_marble_cobblestone", () -> new BlockItem(BlockList.MOSSY_MARBLE_COBBLESTONE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_COBBLESTONE_SLAB = ITEMS.register("mossy_marble_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_MARBLE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_COBBLESTONE_STAIRS = ITEMS.register("mossy_marble_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_MARBLE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_COBBLESTONE_WALL = ITEMS.register("mossy_marble_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_MARBLE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> MARBLE_BUTTON = ITEMS.register("marble_button", () -> new BlockItem(BlockList.MARBLE_BUTTON.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> MARBLE_PRESSURE_PLATE = ITEMS.register("marble_pressure_plate", () -> new BlockItem(BlockList.MARBLE_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> MARBLE_BRICKS = ITEMS.register("marble_bricks", () -> new BlockItem(BlockList.MARBLE_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_BRICK_SLAB = ITEMS.register("marble_brick_slab", () -> new BlockItem(BlockList.MARBLE_BRICK_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_BRICK_STAIRS = ITEMS.register("marble_brick_stairs", () -> new BlockItem(BlockList.MARBLE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_BRICK_WALL = ITEMS.register("marble_brick_wall", () -> new BlockItem(BlockList.MARBLE_BRICK_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_MARBLE_BRICKS = ITEMS.register("chiseled_marble_bricks", () -> new BlockItem(BlockList.CHISELED_MARBLE_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_MARBLE_BRICKS = ITEMS.register("cracked_marble_bricks", () -> new BlockItem(BlockList.CRACKED_MARBLE_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_BRICKS = ITEMS.register("mossy_marble_bricks", () -> new BlockItem(BlockList.MOSSY_MARBLE_BRICKS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_BRICK_SLAB = ITEMS.register("mossy_marble_brick_slab", () -> new BlockItem(BlockList.MOSSY_MARBLE_BRICK_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_BRICK_STAIRS = ITEMS.register("mossy_marble_brick_stairs", () -> new BlockItem(BlockList.MOSSY_MARBLE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_BRICK_WALL = ITEMS.register("mossy_marble_brick_wall", () -> new BlockItem(BlockList.MOSSY_MARBLE_BRICK_WALL.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_MARBLE = ITEMS.register("polished_marble", () -> new BlockItem(BlockList.POLISHED_MARBLE.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_MARBLE_SLAB = ITEMS.register("polished_marble_slab", () -> new BlockItem(BlockList.POLISHED_MARBLE_SLAB.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_MARBLE_STAIRS = ITEMS.register("polished_marble_stairs", () -> new BlockItem(BlockList.POLISHED_MARBLE_STAIRS.get(), new Item.Properties().group(Strata.METAMORPHIC_TAB)));

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

    /*-Argillite-*/
    public static final RegistryObject<Item> ARGILLITE = ITEMS.register("argillite", () -> new BlockItem(BlockList.ARGILLITE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_SLAB = ITEMS.register("argillite_slab", () -> new BlockItem(BlockList.ARGILLITE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_STAIRS = ITEMS.register("argillite_stairs", () -> new BlockItem(BlockList.ARGILLITE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_WALL = ITEMS.register("argillite_wall", () -> new BlockItem(BlockList.ARGILLITE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> ARGILLITE_COBBLESTONE = ITEMS.register("argillite_cobblestone", () -> new BlockItem(BlockList.ARGILLITE_COBBLESTONE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_COBBLESTONE_SLAB = ITEMS.register("argillite_cobblestone_slab", () -> new BlockItem(BlockList.ARGILLITE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_COBBLESTONE_STAIRS = ITEMS.register("argillite_cobblestone_stairs", () -> new BlockItem(BlockList.ARGILLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_COBBLESTONE_WALL = ITEMS.register("argillite_cobblestone_wall", () -> new BlockItem(BlockList.ARGILLITE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_ARGILLITE_COBBLESTONE = ITEMS.register("mossy_argillite_cobblestone", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_COBBLESTONE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_COBBLESTONE_SLAB = ITEMS.register("mossy_argillite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_argillite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_COBBLESTONE_WALL = ITEMS.register("mossy_argillite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> ARGILLITE_BUTTON = ITEMS.register("argillite_button", () -> new BlockItem(BlockList.ARGILLITE_BUTTON.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> ARGILLITE_PRESSURE_PLATE = ITEMS.register("argillite_pressure_plate", () -> new BlockItem(BlockList.ARGILLITE_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> ARGILLITE_BRICKS = ITEMS.register("argillite_bricks", () -> new BlockItem(BlockList.ARGILLITE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_BRICK_SLAB = ITEMS.register("argillite_brick_slab", () -> new BlockItem(BlockList.ARGILLITE_BRICK_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_BRICK_STAIRS = ITEMS.register("argillite_brick_stairs", () -> new BlockItem(BlockList.ARGILLITE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_BRICK_WALL = ITEMS.register("argillite_brick_wall", () -> new BlockItem(BlockList.ARGILLITE_BRICK_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_ARGILLITE_BRICKS = ITEMS.register("chiseled_argillite_bricks", () -> new BlockItem(BlockList.CHISELED_ARGILLITE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_ARGILLITE_BRICKS = ITEMS.register("cracked_argillite_bricks", () -> new BlockItem(BlockList.CRACKED_ARGILLITE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_BRICKS = ITEMS.register("mossy_argillite_bricks", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_BRICK_SLAB = ITEMS.register("mossy_argillite_brick_slab", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_BRICK_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_BRICK_STAIRS = ITEMS.register("mossy_argillite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_BRICK_WALL = ITEMS.register("mossy_argillite_brick_wall", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_BRICK_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_ARGILLITE = ITEMS.register("polished_argillite", () -> new BlockItem(BlockList.POLISHED_ARGILLITE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_ARGILLITE_SLAB = ITEMS.register("polished_argillite_slab", () -> new BlockItem(BlockList.POLISHED_ARGILLITE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_ARGILLITE_STAIRS = ITEMS.register("polished_argillite_stairs", () -> new BlockItem(BlockList.POLISHED_ARGILLITE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    /*-Chalk-*/
    public static final RegistryObject<Item> CHALK = ITEMS.register("chalk", () -> new BlockItem(BlockList.CHALK.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_SLAB = ITEMS.register("chalk_slab", () -> new BlockItem(BlockList.CHALK_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_STAIRS = ITEMS.register("chalk_stairs", () -> new BlockItem(BlockList.CHALK_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_WALL = ITEMS.register("chalk_wall", () -> new BlockItem(BlockList.CHALK_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> CHALK_COBBLESTONE = ITEMS.register("chalk_cobblestone", () -> new BlockItem(BlockList.CHALK_COBBLESTONE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_COBBLESTONE_SLAB = ITEMS.register("chalk_cobblestone_slab", () -> new BlockItem(BlockList.CHALK_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_COBBLESTONE_STAIRS = ITEMS.register("chalk_cobblestone_stairs", () -> new BlockItem(BlockList.CHALK_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_COBBLESTONE_WALL = ITEMS.register("chalk_cobblestone_wall", () -> new BlockItem(BlockList.CHALK_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_CHALK_COBBLESTONE = ITEMS.register("mossy_chalk_cobblestone", () -> new BlockItem(BlockList.MOSSY_CHALK_COBBLESTONE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_COBBLESTONE_SLAB = ITEMS.register("mossy_chalk_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_CHALK_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_COBBLESTONE_STAIRS = ITEMS.register("mossy_chalk_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_CHALK_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_COBBLESTONE_WALL = ITEMS.register("mossy_chalk_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_CHALK_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> CHALK_BUTTON = ITEMS.register("chalk_button", () -> new BlockItem(BlockList.CHALK_BUTTON.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> CHALK_PRESSURE_PLATE = ITEMS.register("chalk_pressure_plate", () -> new BlockItem(BlockList.CHALK_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> CHALK_BRICKS = ITEMS.register("chalk_bricks", () -> new BlockItem(BlockList.CHALK_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_BRICK_SLAB = ITEMS.register("chalk_brick_slab", () -> new BlockItem(BlockList.CHALK_BRICK_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_BRICK_STAIRS = ITEMS.register("chalk_brick_stairs", () -> new BlockItem(BlockList.CHALK_BRICK_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_BRICK_WALL = ITEMS.register("chalk_brick_wall", () -> new BlockItem(BlockList.CHALK_BRICK_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_CHALK_BRICKS = ITEMS.register("chiseled_chalk_bricks", () -> new BlockItem(BlockList.CHISELED_CHALK_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_CHALK_BRICKS = ITEMS.register("cracked_chalk_bricks", () -> new BlockItem(BlockList.CRACKED_CHALK_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_BRICKS = ITEMS.register("mossy_chalk_bricks", () -> new BlockItem(BlockList.MOSSY_CHALK_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_BRICK_SLAB = ITEMS.register("mossy_chalk_brick_slab", () -> new BlockItem(BlockList.MOSSY_CHALK_BRICK_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_BRICK_STAIRS = ITEMS.register("mossy_chalk_brick_stairs", () -> new BlockItem(BlockList.MOSSY_CHALK_BRICK_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_BRICK_WALL = ITEMS.register("mossy_chalk_brick_wall", () -> new BlockItem(BlockList.MOSSY_CHALK_BRICK_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_CHALK = ITEMS.register("polished_chalk", () -> new BlockItem(BlockList.POLISHED_CHALK.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_CHALK_SLAB = ITEMS.register("polished_chalk_slab", () -> new BlockItem(BlockList.POLISHED_CHALK_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_CHALK_STAIRS = ITEMS.register("polished_chalk_stairs", () -> new BlockItem(BlockList.POLISHED_CHALK_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    /*-Jaspillite-*/
    public static final RegistryObject<Item> JASPILLITE = ITEMS.register("jaspillite", () -> new BlockItem(BlockList.JASPILLITE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_SLAB = ITEMS.register("jaspillite_slab", () -> new BlockItem(BlockList.JASPILLITE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_STAIRS = ITEMS.register("jaspillite_stairs", () -> new BlockItem(BlockList.JASPILLITE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_WALL = ITEMS.register("jaspillite_wall", () -> new BlockItem(BlockList.JASPILLITE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> JASPILLITE_COBBLESTONE = ITEMS.register("jaspillite_cobblestone", () -> new BlockItem(BlockList.JASPILLITE_COBBLESTONE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_COBBLESTONE_SLAB = ITEMS.register("jaspillite_cobblestone_slab", () -> new BlockItem(BlockList.JASPILLITE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_COBBLESTONE_STAIRS = ITEMS.register("jaspillite_cobblestone_stairs", () -> new BlockItem(BlockList.JASPILLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_COBBLESTONE_WALL = ITEMS.register("jaspillite_cobblestone_wall", () -> new BlockItem(BlockList.JASPILLITE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_JASPILLITE_COBBLESTONE = ITEMS.register("mossy_jaspillite_cobblestone", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_COBBLESTONE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_COBBLESTONE_SLAB = ITEMS.register("mossy_jaspillite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_COBBLESTONE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_jaspillite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_COBBLESTONE_WALL = ITEMS.register("mossy_jaspillite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_COBBLESTONE_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> JASPILLITE_BUTTON = ITEMS.register("jaspillite_button", () -> new BlockItem(BlockList.JASPILLITE_BUTTON.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> JASPILLITE_PRESSURE_PLATE = ITEMS.register("jaspillite_pressure_plate", () -> new BlockItem(BlockList.JASPILLITE_PRESSURE_PLATE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> JASPILLITE_BRICKS = ITEMS.register("jaspillite_bricks", () -> new BlockItem(BlockList.JASPILLITE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_BRICK_SLAB = ITEMS.register("jaspillite_brick_slab", () -> new BlockItem(BlockList.JASPILLITE_BRICK_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_BRICK_STAIRS = ITEMS.register("jaspillite_brick_stairs", () -> new BlockItem(BlockList.JASPILLITE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_BRICK_WALL = ITEMS.register("jaspillite_brick_wall", () -> new BlockItem(BlockList.JASPILLITE_BRICK_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_JASPILLITE_BRICKS = ITEMS.register("chiseled_jaspillite_bricks", () -> new BlockItem(BlockList.CHISELED_JASPILLITE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_JASPILLITE_BRICKS = ITEMS.register("cracked_jaspillite_bricks", () -> new BlockItem(BlockList.CRACKED_JASPILLITE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_BRICKS = ITEMS.register("mossy_jaspillite_bricks", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_BRICKS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_BRICK_SLAB = ITEMS.register("mossy_jaspillite_brick_slab", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_BRICK_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_BRICK_STAIRS = ITEMS.register("mossy_jaspillite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_BRICK_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_BRICK_WALL = ITEMS.register("mossy_jaspillite_brick_wall", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_BRICK_WALL.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_JASPILLITE = ITEMS.register("polished_jaspillite", () -> new BlockItem(BlockList.POLISHED_JASPILLITE.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_JASPILLITE_SLAB = ITEMS.register("polished_jaspillite_slab", () -> new BlockItem(BlockList.POLISHED_JASPILLITE_SLAB.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_JASPILLITE_STAIRS = ITEMS.register("polished_jaspillite_stairs", () -> new BlockItem(BlockList.POLISHED_JASPILLITE_STAIRS.get(), new Item.Properties().group(Strata.SEDIMENTARY_TAB)));

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
