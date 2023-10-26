package com.quizer9o8.strata.list;

import com.quizer9o8.strata.Strata;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Strata.MOD_ID);

/*
    //Debug

    public static final RegistryObject<Item> DEBUG_ITEM = ITEMS.register("debug_item", () -> new Item(new Item.Properties().tab(Strata.DEBUG_TAB)));
    public static final RegistryObject<Item> DEBUG_BLOCK = ITEMS.register("debug_block", () -> new BlockItem(BlockList.DEBUG_BLOCK.get(), new Item.Properties().tab(Strata.DEBUG_TAB)));
    public static final RegistryObject<Item> DEBUG_SLAB = ITEMS.register("debug_slab", () -> new Item(new Item.Properties().tab(Strata.DEBUG_TAB)));
    public static final RegistryObject<Item> DEBUG_STAIRS = ITEMS.register("debug_stairs", () -> new Item(new Item.Properties().tab(Strata.DEBUG_TAB)));
    public static final RegistryObject<Item> DEBUG_WALL = ITEMS.register("debug_wall", () -> new Item(new Item.Properties().tab(Strata.DEBUG_TAB)));
    //public static final RegistryObject<Item> DEBUG_ORE = ITEMS.register("debug_ore", () -> new BlockItem(BlockList.DEBUG_ORE.get(), new Item.Properties().tab(Strata.DEBUG_TAB)));
*/

    /*Igneous Rocks*/

    /*-Aa-*/
    public static final RegistryObject<Item> AA = ITEMS.register("aa", () -> new BlockItem(BlockList.AA.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB))); //));
    public static final RegistryObject<Item> AA_SLAB = ITEMS.register("aa_slab", () -> new BlockItem(BlockList.AA_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_STAIRS = ITEMS.register("aa_stairs", () -> new BlockItem(BlockList.AA_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_WALL = ITEMS.register("aa_wall", () -> new BlockItem(BlockList.AA_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> AA_COBBLESTONE = ITEMS.register("aa_cobblestone", () -> new BlockItem(BlockList.AA_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_COBBLESTONE_SLAB = ITEMS.register("aa_cobblestone_slab", () -> new BlockItem(BlockList.AA_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_COBBLESTONE_STAIRS = ITEMS.register("aa_cobblestone_stairs", () -> new BlockItem(BlockList.AA_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_COBBLESTONE_WALL = ITEMS.register("aa_cobblestone_wall", () -> new BlockItem(BlockList.AA_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_AA_COBBLESTONE = ITEMS.register("mossy_aa_cobblestone", () -> new BlockItem(BlockList.MOSSY_AA_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_COBBLESTONE_SLAB = ITEMS.register("mossy_aa_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_AA_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_COBBLESTONE_STAIRS = ITEMS.register("mossy_aa_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_AA_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_COBBLESTONE_WALL = ITEMS.register("mossy_aa_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_AA_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Buttons
    public static final RegistryObject<Item> AA_BUTTON = ITEMS.register("aa_button", () -> new BlockItem(BlockList.AA_BUTTON.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> AA_PRESSURE_PLATE = ITEMS.register("aa_pressure_plate", () -> new BlockItem(BlockList.AA_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> AA_BRICKS = ITEMS.register("aa_bricks", () -> new BlockItem(BlockList.AA_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_BRICK_SLAB = ITEMS.register("aa_brick_slab", () -> new BlockItem(BlockList.AA_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_BRICK_STAIRS = ITEMS.register("aa_brick_stairs", () -> new BlockItem(BlockList.AA_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> AA_BRICK_WALL = ITEMS.register("aa_brick_wall", () -> new BlockItem(BlockList.AA_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_AA_BRICKS = ITEMS.register("chiseled_aa_bricks", () -> new BlockItem(BlockList.CHISELED_AA_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_AA_BRICKS = ITEMS.register("cracked_aa_bricks", () -> new BlockItem(BlockList.CRACKED_AA_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_BRICKS = ITEMS.register("mossy_aa_bricks", () -> new BlockItem(BlockList.MOSSY_AA_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_BRICK_SLAB = ITEMS.register("mossy_aa_brick_slab", () -> new BlockItem(BlockList.MOSSY_AA_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_BRICK_STAIRS = ITEMS.register("mossy_aa_brick_stairs", () -> new BlockItem(BlockList.MOSSY_AA_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_AA_BRICK_WALL = ITEMS.register("mossy_aa_brick_wall", () -> new BlockItem(BlockList.MOSSY_AA_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_AA = ITEMS.register("polished_aa", () -> new BlockItem(BlockList.POLISHED_AA.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_AA_SLAB = ITEMS.register("polished_aa_slab", () -> new BlockItem(BlockList.POLISHED_AA_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_AA_STAIRS = ITEMS.register("polished_aa_stairs", () -> new BlockItem(BlockList.POLISHED_AA_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    /*-Adakite-*/
    public static final RegistryObject<Item> ADAKITE = ITEMS.register("adakite", () -> new BlockItem(BlockList.ADAKITE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_SLAB = ITEMS.register("adakite_slab", () -> new BlockItem(BlockList.ADAKITE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_STAIRS = ITEMS.register("adakite_stairs", () -> new BlockItem(BlockList.ADAKITE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_WALL = ITEMS.register("adakite_wall", () -> new BlockItem(BlockList.ADAKITE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> ADAKITE_COBBLESTONE = ITEMS.register("adakite_cobblestone", () -> new BlockItem(BlockList.ADAKITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_COBBLESTONE_SLAB = ITEMS.register("adakite_cobblestone_slab", () -> new BlockItem(BlockList.ADAKITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_COBBLESTONE_STAIRS = ITEMS.register("adakite_cobblestone_stairs", () -> new BlockItem(BlockList.ADAKITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_COBBLESTONE_WALL = ITEMS.register("adakite_cobblestone_wall", () -> new BlockItem(BlockList.ADAKITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_ADAKITE_COBBLESTONE = ITEMS.register("mossy_adakite_cobblestone", () -> new BlockItem(BlockList.MOSSY_ADAKITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_COBBLESTONE_SLAB = ITEMS.register("mossy_adakite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_ADAKITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_adakite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_ADAKITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_COBBLESTONE_WALL = ITEMS.register("mossy_adakite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_ADAKITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Buttons
    public static final RegistryObject<Item> ADAKITE_BUTTON = ITEMS.register("adakite_button", () -> new BlockItem(BlockList.ADAKITE_BUTTON.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> ADAKITE_PRESSURE_PLATE = ITEMS.register("adakite_pressure_plate", () -> new BlockItem(BlockList.ADAKITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> ADAKITE_BRICKS = ITEMS.register("adakite_bricks", () -> new BlockItem(BlockList.ADAKITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_BRICK_SLAB = ITEMS.register("adakite_brick_slab", () -> new BlockItem(BlockList.ADAKITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_BRICK_STAIRS = ITEMS.register("adakite_brick_stairs", () -> new BlockItem(BlockList.ADAKITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> ADAKITE_BRICK_WALL = ITEMS.register("adakite_brick_wall", () -> new BlockItem(BlockList.ADAKITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_ADAKITE_BRICKS = ITEMS.register("chiseled_adakite_bricks", () -> new BlockItem(BlockList.CHISELED_ADAKITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_ADAKITE_BRICKS = ITEMS.register("cracked_adakite_bricks", () -> new BlockItem(BlockList.CRACKED_ADAKITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_BRICKS = ITEMS.register("mossy_adakite_bricks", () -> new BlockItem(BlockList.MOSSY_ADAKITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_BRICK_SLAB = ITEMS.register("mossy_adakite_brick_slab", () -> new BlockItem(BlockList.MOSSY_ADAKITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_BRICK_STAIRS = ITEMS.register("mossy_adakite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_ADAKITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_ADAKITE_BRICK_WALL = ITEMS.register("mossy_adakite_brick_wall", () -> new BlockItem(BlockList.MOSSY_ADAKITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_ADAKITE = ITEMS.register("polished_adakite", () -> new BlockItem(BlockList.POLISHED_ADAKITE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_ADAKITE_SLAB = ITEMS.register("polished_adakite_slab", () -> new BlockItem(BlockList.POLISHED_ADAKITE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_ADAKITE_STAIRS = ITEMS.register("polished_adakite_stairs", () -> new BlockItem(BlockList.POLISHED_ADAKITE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    /*-Basalt-*/
    //public static final RegistryObject<Item> BASALT = ITEMS.register("basalt", () -> new BlockItem(BlockList.BASALT.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> BASALT_SLAB = ITEMS.register("basalt_slab", () -> new BlockItem(BlockList.BASALT_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> BASALT_STAIRS = ITEMS.register("basalt_stairs", () -> new BlockItem(BlockList.BASALT_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> BASALT_WALL = ITEMS.register("basalt_wall", () -> new BlockItem(BlockList.BASALT_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Cobblestone
    //public static final RegistryObject<Item> BASALT_COBBLESTONE = ITEMS.register("basalt_cobblestone", () -> new BlockItem(BlockList.BASALT_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> BASALT_COBBLESTONE_SLAB = ITEMS.register("basalt_cobblestone_slab", () -> new BlockItem(BlockList.BASALT_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> BASALT_COBBLESTONE_STAIRS = ITEMS.register("basalt_cobblestone_stairs", () -> new BlockItem(BlockList.BASALT_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> BASALT_COBBLESTONE_WALL = ITEMS.register("basalt_cobblestone_wall", () -> new BlockItem(BlockList.BASALT_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    //public static final RegistryObject<Item> MOSSY_BASALT_COBBLESTONE = ITEMS.register("mossy_basalt_cobblestone", () -> new BlockItem(BlockList.MOSSY_BASALT_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> MOSSY_BASALT_COBBLESTONE_SLAB = ITEMS.register("mossy_basalt_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_BASALT_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> MOSSY_BASALT_COBBLESTONE_STAIRS = ITEMS.register("mossy_basalt_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_BASALT_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> MOSSY_BASALT_COBBLESTONE_WALL = ITEMS.register("mossy_basalt_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_BASALT_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    
    //Buttons
    //public static final RegistryObject<Item> BASALT_BUTTON = ITEMS.register("basalt_button", () -> new BlockItem(BlockList.BASALT_BUTTON.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    //public static final RegistryObject<Item> BASALT_PRESSURE_PLATE = ITEMS.register("basalt_pressure_plate", () -> new BlockItem(BlockList.BASALT_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Bricks
    //public static final RegistryObject<Item> BASALT_BRICKS = ITEMS.register("basalt_bricks", () -> new BlockItem(BlockList.BASALT_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> BASALT_BRICK_SLAB = ITEMS.register("basalt_brick_slab", () -> new BlockItem(BlockList.BASALT_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> BASALT_BRICK_STAIRS = ITEMS.register("basalt_brick_stairs", () -> new BlockItem(BlockList.BASALT_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> BASALT_BRICK_WALL = ITEMS.register("basalt_brick_wall", () -> new BlockItem(BlockList.BASALT_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> CHISELED_BASALT_BRICKS = ITEMS.register("chiseled_basalt_bricks", () -> new BlockItem(BlockList.CHISELED_BASALT_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> CRACKED_BASALT_BRICKS = ITEMS.register("cracked_basalt_bricks", () -> new BlockItem(BlockList.CRACKED_BASALT_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> MOSSY_BASALT_BRICKS = ITEMS.register("mossy_basalt_bricks", () -> new BlockItem(BlockList.MOSSY_BASALT_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> MOSSY_BASALT_BRICK_SLAB = ITEMS.register("mossy_basalt_brick_slab", () -> new BlockItem(BlockList.MOSSY_BASALT_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> MOSSY_BASALT_BRICK_STAIRS = ITEMS.register("mossy_basalt_brick_stairs", () -> new BlockItem(BlockList.MOSSY_BASALT_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> MOSSY_BASALT_BRICK_WALL = ITEMS.register("mossy_basalt_brick_wall", () -> new BlockItem(BlockList.MOSSY_BASALT_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Polished
    //public static final RegistryObject<Item> POLISHED_BASALT = ITEMS.register("polished_basalt", () -> new BlockItem(BlockList.POLISHED_BASALT.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> POLISHED_BASALT_SLAB = ITEMS.register("polished_basalt_slab", () -> new BlockItem(BlockList.POLISHED_BASALT_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    //public static final RegistryObject<Item> POLISHED_BASALT_STAIRS = ITEMS.register("polished_basalt_stairs", () -> new BlockItem(BlockList.POLISHED_BASALT_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    /*-Dacite-*/
    public static final RegistryObject<Item> DACITE = ITEMS.register("dacite", () -> new BlockItem(BlockList.DACITE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DACITE_SLAB = ITEMS.register("dacite_slab", () -> new BlockItem(BlockList.DACITE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DACITE_STAIRS = ITEMS.register("dacite_stairs", () -> new BlockItem(BlockList.DACITE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DACITE_WALL = ITEMS.register("dacite_wall", () -> new BlockItem(BlockList.DACITE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> DACITE_COBBLESTONE = ITEMS.register("dacite_cobblestone", () -> new BlockItem(BlockList.DACITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DACITE_COBBLESTONE_SLAB = ITEMS.register("dacite_cobblestone_slab", () -> new BlockItem(BlockList.DACITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DACITE_COBBLESTONE_STAIRS = ITEMS.register("dacite_cobblestone_stairs", () -> new BlockItem(BlockList.DACITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DACITE_COBBLESTONE_WALL = ITEMS.register("dacite_cobblestone_wall", () -> new BlockItem(BlockList.DACITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_DACITE_COBBLESTONE = ITEMS.register("mossy_dacite_cobblestone", () -> new BlockItem(BlockList.MOSSY_DACITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DACITE_COBBLESTONE_SLAB = ITEMS.register("mossy_dacite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_DACITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DACITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_dacite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_DACITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DACITE_COBBLESTONE_WALL = ITEMS.register("mossy_dacite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_DACITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Buttons
    public static final RegistryObject<Item> DACITE_BUTTON = ITEMS.register("dacite_button", () -> new BlockItem(BlockList.DACITE_BUTTON.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> DACITE_PRESSURE_PLATE = ITEMS.register("dacite_pressure_plate", () -> new BlockItem(BlockList.DACITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> DACITE_BRICKS = ITEMS.register("dacite_bricks", () -> new BlockItem(BlockList.DACITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DACITE_BRICK_SLAB = ITEMS.register("dacite_brick_slab", () -> new BlockItem(BlockList.DACITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DACITE_BRICK_STAIRS = ITEMS.register("dacite_brick_stairs", () -> new BlockItem(BlockList.DACITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DACITE_BRICK_WALL = ITEMS.register("dacite_brick_wall", () -> new BlockItem(BlockList.DACITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_DACITE_BRICKS = ITEMS.register("chiseled_dacite_bricks", () -> new BlockItem(BlockList.CHISELED_DACITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_DACITE_BRICKS = ITEMS.register("cracked_dacite_bricks", () -> new BlockItem(BlockList.CRACKED_DACITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DACITE_BRICKS = ITEMS.register("mossy_dacite_bricks", () -> new BlockItem(BlockList.MOSSY_DACITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DACITE_BRICK_SLAB = ITEMS.register("mossy_dacite_brick_slab", () -> new BlockItem(BlockList.MOSSY_DACITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DACITE_BRICK_STAIRS = ITEMS.register("mossy_dacite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_DACITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DACITE_BRICK_WALL = ITEMS.register("mossy_dacite_brick_wall", () -> new BlockItem(BlockList.MOSSY_DACITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_DACITE = ITEMS.register("polished_dacite", () -> new BlockItem(BlockList.POLISHED_DACITE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_DACITE_SLAB = ITEMS.register("polished_dacite_slab", () -> new BlockItem(BlockList.POLISHED_DACITE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_DACITE_STAIRS = ITEMS.register("polished_dacite_stairs", () -> new BlockItem(BlockList.POLISHED_DACITE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    /*-Dunite-*/
    public static final RegistryObject<Item> DUNITE = ITEMS.register("dunite", () -> new BlockItem(BlockList.DUNITE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DUNITE_SLAB = ITEMS.register("dunite_slab", () -> new BlockItem(BlockList.DUNITE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DUNITE_STAIRS = ITEMS.register("dunite_stairs", () -> new BlockItem(BlockList.DUNITE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DUNITE_WALL = ITEMS.register("dunite_wall", () -> new BlockItem(BlockList.DUNITE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> DUNITE_COBBLESTONE = ITEMS.register("dunite_cobblestone", () -> new BlockItem(BlockList.DUNITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DUNITE_COBBLESTONE_SLAB = ITEMS.register("dunite_cobblestone_slab", () -> new BlockItem(BlockList.DUNITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DUNITE_COBBLESTONE_STAIRS = ITEMS.register("dunite_cobblestone_stairs", () -> new BlockItem(BlockList.DUNITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DUNITE_COBBLESTONE_WALL = ITEMS.register("dunite_cobblestone_wall", () -> new BlockItem(BlockList.DUNITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_DUNITE_COBBLESTONE = ITEMS.register("mossy_dunite_cobblestone", () -> new BlockItem(BlockList.MOSSY_DUNITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DUNITE_COBBLESTONE_SLAB = ITEMS.register("mossy_dunite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_DUNITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DUNITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_dunite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_DUNITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DUNITE_COBBLESTONE_WALL = ITEMS.register("mossy_dunite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_DUNITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Buttons
    public static final RegistryObject<Item> DUNITE_BUTTON = ITEMS.register("dunite_button", () -> new BlockItem(BlockList.DUNITE_BUTTON.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> DUNITE_PRESSURE_PLATE = ITEMS.register("dunite_pressure_plate", () -> new BlockItem(BlockList.DUNITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> DUNITE_BRICKS = ITEMS.register("dunite_bricks", () -> new BlockItem(BlockList.DUNITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DUNITE_BRICK_SLAB = ITEMS.register("dunite_brick_slab", () -> new BlockItem(BlockList.DUNITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DUNITE_BRICK_STAIRS = ITEMS.register("dunite_brick_stairs", () -> new BlockItem(BlockList.DUNITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> DUNITE_BRICK_WALL = ITEMS.register("dunite_brick_wall", () -> new BlockItem(BlockList.DUNITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_DUNITE_BRICKS = ITEMS.register("chiseled_dunite_bricks", () -> new BlockItem(BlockList.CHISELED_DUNITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_DUNITE_BRICKS = ITEMS.register("cracked_dunite_bricks", () -> new BlockItem(BlockList.CRACKED_DUNITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DUNITE_BRICKS = ITEMS.register("mossy_dunite_bricks", () -> new BlockItem(BlockList.MOSSY_DUNITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DUNITE_BRICK_SLAB = ITEMS.register("mossy_dunite_brick_slab", () -> new BlockItem(BlockList.MOSSY_DUNITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DUNITE_BRICK_STAIRS = ITEMS.register("mossy_dunite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_DUNITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_DUNITE_BRICK_WALL = ITEMS.register("mossy_dunite_brick_wall", () -> new BlockItem(BlockList.MOSSY_DUNITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_DUNITE = ITEMS.register("polished_dunite", () -> new BlockItem(BlockList.POLISHED_DUNITE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_DUNITE_SLAB = ITEMS.register("polished_dunite_slab", () -> new BlockItem(BlockList.POLISHED_DUNITE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_DUNITE_STAIRS = ITEMS.register("polished_dunite_stairs", () -> new BlockItem(BlockList.POLISHED_DUNITE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    /*-Gabbro-*/
    public static final RegistryObject<Item> GABBRO = ITEMS.register("gabbro", () -> new BlockItem(BlockList.GABBRO.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_SLAB = ITEMS.register("gabbro_slab", () -> new BlockItem(BlockList.GABBRO_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_STAIRS = ITEMS.register("gabbro_stairs", () -> new BlockItem(BlockList.GABBRO_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_WALL = ITEMS.register("gabbro_wall", () -> new BlockItem(BlockList.GABBRO_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> GABBRO_COBBLESTONE = ITEMS.register("gabbro_cobblestone", () -> new BlockItem(BlockList.GABBRO_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_COBBLESTONE_SLAB = ITEMS.register("gabbro_cobblestone_slab", () -> new BlockItem(BlockList.GABBRO_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_COBBLESTONE_STAIRS = ITEMS.register("gabbro_cobblestone_stairs", () -> new BlockItem(BlockList.GABBRO_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_COBBLESTONE_WALL = ITEMS.register("gabbro_cobblestone_wall", () -> new BlockItem(BlockList.GABBRO_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_GABBRO_COBBLESTONE = ITEMS.register("mossy_gabbro_cobblestone", () -> new BlockItem(BlockList.MOSSY_GABBRO_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_COBBLESTONE_SLAB = ITEMS.register("mossy_gabbro_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_GABBRO_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_COBBLESTONE_STAIRS = ITEMS.register("mossy_gabbro_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_GABBRO_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_COBBLESTONE_WALL = ITEMS.register("mossy_gabbro_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_GABBRO_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));


    //Buttons
    public static final RegistryObject<Item> GABBRO_BUTTON = ITEMS.register("gabbro_button", () -> new BlockItem(BlockList.GABBRO_BUTTON.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> GABBRO_PRESSURE_PLATE = ITEMS.register("gabbro_pressure_plate", () -> new BlockItem(BlockList.GABBRO_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> GABBRO_BRICKS = ITEMS.register("gabbro_bricks", () -> new BlockItem(BlockList.GABBRO_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_BRICK_SLAB = ITEMS.register("gabbro_brick_slab", () -> new BlockItem(BlockList.GABBRO_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_BRICK_STAIRS = ITEMS.register("gabbro_brick_stairs", () -> new BlockItem(BlockList.GABBRO_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> GABBRO_BRICK_WALL = ITEMS.register("gabbro_brick_wall", () -> new BlockItem(BlockList.GABBRO_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_GABBRO_BRICKS = ITEMS.register("chiseled_gabbro_bricks", () -> new BlockItem(BlockList.CHISELED_GABBRO_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_GABBRO_BRICKS = ITEMS.register("cracked_gabbro_bricks", () -> new BlockItem(BlockList.CRACKED_GABBRO_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_BRICKS = ITEMS.register("mossy_gabbro_bricks", () -> new BlockItem(BlockList.MOSSY_GABBRO_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_BRICK_SLAB = ITEMS.register("mossy_gabbro_brick_slab", () -> new BlockItem(BlockList.MOSSY_GABBRO_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_BRICK_STAIRS = ITEMS.register("mossy_gabbro_brick_stairs", () -> new BlockItem(BlockList.MOSSY_GABBRO_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_GABBRO_BRICK_WALL = ITEMS.register("mossy_gabbro_brick_wall", () -> new BlockItem(BlockList.MOSSY_GABBRO_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_GABBRO = ITEMS.register("polished_gabbro", () -> new BlockItem(BlockList.POLISHED_GABBRO.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_GABBRO_SLAB = ITEMS.register("polished_gabbro_slab", () -> new BlockItem(BlockList.POLISHED_GABBRO_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_GABBRO_STAIRS = ITEMS.register("polished_gabbro_stairs", () -> new BlockItem(BlockList.POLISHED_GABBRO_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    /*-Komatiite-*/
    public static final RegistryObject<Item> KOMATIITE = ITEMS.register("komatiite", () -> new BlockItem(BlockList.KOMATIITE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> KOMATIITE_SLAB = ITEMS.register("komatiite_slab", () -> new BlockItem(BlockList.KOMATIITE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> KOMATIITE_STAIRS = ITEMS.register("komatiite_stairs", () -> new BlockItem(BlockList.KOMATIITE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> KOMATIITE_WALL = ITEMS.register("komatiite_wall", () -> new BlockItem(BlockList.KOMATIITE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> KOMATIITE_COBBLESTONE = ITEMS.register("komatiite_cobblestone", () -> new BlockItem(BlockList.KOMATIITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> KOMATIITE_COBBLESTONE_SLAB = ITEMS.register("komatiite_cobblestone_slab", () -> new BlockItem(BlockList.KOMATIITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> KOMATIITE_COBBLESTONE_STAIRS = ITEMS.register("komatiite_cobblestone_stairs", () -> new BlockItem(BlockList.KOMATIITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> KOMATIITE_COBBLESTONE_WALL = ITEMS.register("komatiite_cobblestone_wall", () -> new BlockItem(BlockList.KOMATIITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_KOMATIITE_COBBLESTONE = ITEMS.register("mossy_komatiite_cobblestone", () -> new BlockItem(BlockList.MOSSY_KOMATIITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_KOMATIITE_COBBLESTONE_SLAB = ITEMS.register("mossy_komatiite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_KOMATIITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_KOMATIITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_komatiite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_KOMATIITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_KOMATIITE_COBBLESTONE_WALL = ITEMS.register("mossy_komatiite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_KOMATIITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Buttons
    public static final RegistryObject<Item> KOMATIITE_BUTTON = ITEMS.register("komatiite_button", () -> new BlockItem(BlockList.KOMATIITE_BUTTON.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> KOMATIITE_PRESSURE_PLATE = ITEMS.register("komatiite_pressure_plate", () -> new BlockItem(BlockList.KOMATIITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> KOMATIITE_BRICKS = ITEMS.register("komatiite_bricks", () -> new BlockItem(BlockList.KOMATIITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> KOMATIITE_BRICK_SLAB = ITEMS.register("komatiite_brick_slab", () -> new BlockItem(BlockList.KOMATIITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> KOMATIITE_BRICK_STAIRS = ITEMS.register("komatiite_brick_stairs", () -> new BlockItem(BlockList.KOMATIITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> KOMATIITE_BRICK_WALL = ITEMS.register("komatiite_brick_wall", () -> new BlockItem(BlockList.KOMATIITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_KOMATIITE_BRICKS = ITEMS.register("chiseled_komatiite_bricks", () -> new BlockItem(BlockList.CHISELED_KOMATIITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_KOMATIITE_BRICKS = ITEMS.register("cracked_komatiite_bricks", () -> new BlockItem(BlockList.CRACKED_KOMATIITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_KOMATIITE_BRICKS = ITEMS.register("mossy_komatiite_bricks", () -> new BlockItem(BlockList.MOSSY_KOMATIITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_KOMATIITE_BRICK_SLAB = ITEMS.register("mossy_komatiite_brick_slab", () -> new BlockItem(BlockList.MOSSY_KOMATIITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_KOMATIITE_BRICK_STAIRS = ITEMS.register("mossy_komatiite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_KOMATIITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_KOMATIITE_BRICK_WALL = ITEMS.register("mossy_komatiite_brick_wall", () -> new BlockItem(BlockList.MOSSY_KOMATIITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_KOMATIITE = ITEMS.register("polished_komatiite", () -> new BlockItem(BlockList.POLISHED_KOMATIITE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_KOMATIITE_SLAB = ITEMS.register("polished_komatiite_slab", () -> new BlockItem(BlockList.POLISHED_KOMATIITE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_KOMATIITE_STAIRS = ITEMS.register("polished_komatiite_stairs", () -> new BlockItem(BlockList.POLISHED_KOMATIITE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    /*-Pahoehoe-*/
    public static final RegistryObject<Item> PAHOEHOE = ITEMS.register("pahoehoe", () -> new BlockItem(BlockList.PAHOEHOE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_SLAB = ITEMS.register("pahoehoe_slab", () -> new BlockItem(BlockList.PAHOEHOE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_STAIRS = ITEMS.register("pahoehoe_stairs", () -> new BlockItem(BlockList.PAHOEHOE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_WALL = ITEMS.register("pahoehoe_wall", () -> new BlockItem(BlockList.PAHOEHOE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> PAHOEHOE_COBBLESTONE = ITEMS.register("pahoehoe_cobblestone", () -> new BlockItem(BlockList.PAHOEHOE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_COBBLESTONE_SLAB = ITEMS.register("pahoehoe_cobblestone_slab", () -> new BlockItem(BlockList.PAHOEHOE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_COBBLESTONE_STAIRS = ITEMS.register("pahoehoe_cobblestone_stairs", () -> new BlockItem(BlockList.PAHOEHOE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_COBBLESTONE_WALL = ITEMS.register("pahoehoe_cobblestone_wall", () -> new BlockItem(BlockList.PAHOEHOE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_COBBLESTONE = ITEMS.register("mossy_pahoehoe_cobblestone", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_COBBLESTONE_SLAB = ITEMS.register("mossy_pahoehoe_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_COBBLESTONE_STAIRS = ITEMS.register("mossy_pahoehoe_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_COBBLESTONE_WALL = ITEMS.register("mossy_pahoehoe_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Buttons
    public static final RegistryObject<Item> PAHOEHOE_BUTTON = ITEMS.register("pahoehoe_button", () -> new BlockItem(BlockList.PAHOEHOE_BUTTON.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> PAHOEHOE_PRESSURE_PLATE = ITEMS.register("pahoehoe_pressure_plate", () -> new BlockItem(BlockList.PAHOEHOE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> PAHOEHOE_BRICKS = ITEMS.register("pahoehoe_bricks", () -> new BlockItem(BlockList.PAHOEHOE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_BRICK_SLAB = ITEMS.register("pahoehoe_brick_slab", () -> new BlockItem(BlockList.PAHOEHOE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_BRICK_STAIRS = ITEMS.register("pahoehoe_brick_stairs", () -> new BlockItem(BlockList.PAHOEHOE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PAHOEHOE_BRICK_WALL = ITEMS.register("pahoehoe_brick_wall", () -> new BlockItem(BlockList.PAHOEHOE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_PAHOEHOE_BRICKS = ITEMS.register("chiseled_pahoehoe_bricks", () -> new BlockItem(BlockList.CHISELED_PAHOEHOE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_PAHOEHOE_BRICKS = ITEMS.register("cracked_pahoehoe_bricks", () -> new BlockItem(BlockList.CRACKED_PAHOEHOE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_BRICKS = ITEMS.register("mossy_pahoehoe_bricks", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_BRICK_SLAB = ITEMS.register("mossy_pahoehoe_brick_slab", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_BRICK_STAIRS = ITEMS.register("mossy_pahoehoe_brick_stairs", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PAHOEHOE_BRICK_WALL = ITEMS.register("mossy_pahoehoe_brick_wall", () -> new BlockItem(BlockList.MOSSY_PAHOEHOE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_PAHOEHOE = ITEMS.register("polished_pahoehoe", () -> new BlockItem(BlockList.POLISHED_PAHOEHOE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_PAHOEHOE_SLAB = ITEMS.register("polished_pahoehoe_slab", () -> new BlockItem(BlockList.POLISHED_PAHOEHOE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_PAHOEHOE_STAIRS = ITEMS.register("polished_pahoehoe_stairs", () -> new BlockItem(BlockList.POLISHED_PAHOEHOE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    /*-Pegmatite-*/
    public static final RegistryObject<Item> PEGMATITE = ITEMS.register("pegmatite", () -> new BlockItem(BlockList.PEGMATITE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PEGMATITE_SLAB = ITEMS.register("pegmatite_slab", () -> new BlockItem(BlockList.PEGMATITE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PEGMATITE_STAIRS = ITEMS.register("pegmatite_stairs", () -> new BlockItem(BlockList.PEGMATITE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PEGMATITE_WALL = ITEMS.register("pegmatite_wall", () -> new BlockItem(BlockList.PEGMATITE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> PEGMATITE_COBBLESTONE = ITEMS.register("pegmatite_cobblestone", () -> new BlockItem(BlockList.PEGMATITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PEGMATITE_COBBLESTONE_SLAB = ITEMS.register("pegmatite_cobblestone_slab", () -> new BlockItem(BlockList.PEGMATITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PEGMATITE_COBBLESTONE_STAIRS = ITEMS.register("pegmatite_cobblestone_stairs", () -> new BlockItem(BlockList.PEGMATITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PEGMATITE_COBBLESTONE_WALL = ITEMS.register("pegmatite_cobblestone_wall", () -> new BlockItem(BlockList.PEGMATITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_PEGMATITE_COBBLESTONE = ITEMS.register("mossy_pegmatite_cobblestone", () -> new BlockItem(BlockList.MOSSY_PEGMATITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PEGMATITE_COBBLESTONE_SLAB = ITEMS.register("mossy_pegmatite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_PEGMATITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PEGMATITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_pegmatite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_PEGMATITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PEGMATITE_COBBLESTONE_WALL = ITEMS.register("mossy_pegmatite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_PEGMATITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Buttons
    public static final RegistryObject<Item> PEGMATITE_BUTTON = ITEMS.register("pegmatite_button", () -> new BlockItem(BlockList.PEGMATITE_BUTTON.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> PEGMATITE_PRESSURE_PLATE = ITEMS.register("pegmatite_pressure_plate", () -> new BlockItem(BlockList.PEGMATITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> PEGMATITE_BRICKS = ITEMS.register("pegmatite_bricks", () -> new BlockItem(BlockList.PEGMATITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PEGMATITE_BRICK_SLAB = ITEMS.register("pegmatite_brick_slab", () -> new BlockItem(BlockList.PEGMATITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PEGMATITE_BRICK_STAIRS = ITEMS.register("pegmatite_brick_stairs", () -> new BlockItem(BlockList.PEGMATITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PEGMATITE_BRICK_WALL = ITEMS.register("pegmatite_brick_wall", () -> new BlockItem(BlockList.PEGMATITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_PEGMATITE_BRICKS = ITEMS.register("chiseled_pegmatite_bricks", () -> new BlockItem(BlockList.CHISELED_PEGMATITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_PEGMATITE_BRICKS = ITEMS.register("cracked_pegmatite_bricks", () -> new BlockItem(BlockList.CRACKED_PEGMATITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PEGMATITE_BRICKS = ITEMS.register("mossy_pegmatite_bricks", () -> new BlockItem(BlockList.MOSSY_PEGMATITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PEGMATITE_BRICK_SLAB = ITEMS.register("mossy_pegmatite_brick_slab", () -> new BlockItem(BlockList.MOSSY_PEGMATITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PEGMATITE_BRICK_STAIRS = ITEMS.register("mossy_pegmatite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_PEGMATITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PEGMATITE_BRICK_WALL = ITEMS.register("mossy_pegmatite_brick_wall", () -> new BlockItem(BlockList.MOSSY_PEGMATITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_PEGMATITE = ITEMS.register("polished_pegmatite", () -> new BlockItem(BlockList.POLISHED_PEGMATITE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_PEGMATITE_SLAB = ITEMS.register("polished_pegmatite_slab", () -> new BlockItem(BlockList.POLISHED_PEGMATITE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_PEGMATITE_STAIRS = ITEMS.register("polished_pegmatite_stairs", () -> new BlockItem(BlockList.POLISHED_PEGMATITE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    /*-Phonolite-*/
    public static final RegistryObject<Item> PHONOLITE = ITEMS.register("phonolite", () -> new BlockItem(BlockList.PHONOLITE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PHONOLITE_SLAB = ITEMS.register("phonolite_slab", () -> new BlockItem(BlockList.PHONOLITE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PHONOLITE_STAIRS = ITEMS.register("phonolite_stairs", () -> new BlockItem(BlockList.PHONOLITE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PHONOLITE_WALL = ITEMS.register("phonolite_wall", () -> new BlockItem(BlockList.PHONOLITE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> PHONOLITE_COBBLESTONE = ITEMS.register("phonolite_cobblestone", () -> new BlockItem(BlockList.PHONOLITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PHONOLITE_COBBLESTONE_SLAB = ITEMS.register("phonolite_cobblestone_slab", () -> new BlockItem(BlockList.PHONOLITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PHONOLITE_COBBLESTONE_STAIRS = ITEMS.register("phonolite_cobblestone_stairs", () -> new BlockItem(BlockList.PHONOLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PHONOLITE_COBBLESTONE_WALL = ITEMS.register("phonolite_cobblestone_wall", () -> new BlockItem(BlockList.PHONOLITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_PHONOLITE_COBBLESTONE = ITEMS.register("mossy_phonolite_cobblestone", () -> new BlockItem(BlockList.MOSSY_PHONOLITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PHONOLITE_COBBLESTONE_SLAB = ITEMS.register("mossy_phonolite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_PHONOLITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PHONOLITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_phonolite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_PHONOLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PHONOLITE_COBBLESTONE_WALL = ITEMS.register("mossy_phonolite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_PHONOLITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Buttons
    public static final RegistryObject<Item> PHONOLITE_BUTTON = ITEMS.register("phonolite_button", () -> new BlockItem(BlockList.PHONOLITE_BUTTON.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> PHONOLITE_PRESSURE_PLATE = ITEMS.register("phonolite_pressure_plate", () -> new BlockItem(BlockList.PHONOLITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Bricks
    public static final RegistryObject<Item> PHONOLITE_BRICKS = ITEMS.register("phonolite_bricks", () -> new BlockItem(BlockList.PHONOLITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PHONOLITE_BRICK_SLAB = ITEMS.register("phonolite_brick_slab", () -> new BlockItem(BlockList.PHONOLITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PHONOLITE_BRICK_STAIRS = ITEMS.register("phonolite_brick_stairs", () -> new BlockItem(BlockList.PHONOLITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> PHONOLITE_BRICK_WALL = ITEMS.register("phonolite_brick_wall", () -> new BlockItem(BlockList.PHONOLITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CHISELED_PHONOLITE_BRICKS = ITEMS.register("chiseled_phonolite_bricks", () -> new BlockItem(BlockList.CHISELED_PHONOLITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> CRACKED_PHONOLITE_BRICKS = ITEMS.register("cracked_phonolite_bricks", () -> new BlockItem(BlockList.CRACKED_PHONOLITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PHONOLITE_BRICKS = ITEMS.register("mossy_phonolite_bricks", () -> new BlockItem(BlockList.MOSSY_PHONOLITE_BRICKS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PHONOLITE_BRICK_SLAB = ITEMS.register("mossy_phonolite_brick_slab", () -> new BlockItem(BlockList.MOSSY_PHONOLITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PHONOLITE_BRICK_STAIRS = ITEMS.register("mossy_phonolite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_PHONOLITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> MOSSY_PHONOLITE_BRICK_WALL = ITEMS.register("mossy_phonolite_brick_wall", () -> new BlockItem(BlockList.MOSSY_PHONOLITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_PHONOLITE = ITEMS.register("polished_phonolite", () -> new BlockItem(BlockList.POLISHED_PHONOLITE.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_PHONOLITE_SLAB = ITEMS.register("polished_phonolite_slab", () -> new BlockItem(BlockList.POLISHED_PHONOLITE_SLAB.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));
    public static final RegistryObject<Item> POLISHED_PHONOLITE_STAIRS = ITEMS.register("polished_phonolite_stairs", () -> new BlockItem(BlockList.POLISHED_PHONOLITE_STAIRS.get(), new Item.Properties().tab(Strata.IGNEOUS_TAB)));

    /*Metamorphic Rocks*/

    /*-Amphibolite-*/
    public static final RegistryObject<Item> AMPHIBOLITE = ITEMS.register("amphibolite", () -> new BlockItem(BlockList.AMPHIBOLITE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_SLAB = ITEMS.register("amphibolite_slab", () -> new BlockItem(BlockList.AMPHIBOLITE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_STAIRS = ITEMS.register("amphibolite_stairs", () -> new BlockItem(BlockList.AMPHIBOLITE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_WALL = ITEMS.register("amphibolite_wall", () -> new BlockItem(BlockList.AMPHIBOLITE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> AMPHIBOLITE_COBBLESTONE = ITEMS.register("amphibolite_cobblestone", () -> new BlockItem(BlockList.AMPHIBOLITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_COBBLESTONE_SLAB = ITEMS.register("amphibolite_cobblestone_slab", () -> new BlockItem(BlockList.AMPHIBOLITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_COBBLESTONE_STAIRS = ITEMS.register("amphibolite_cobblestone_stairs", () -> new BlockItem(BlockList.AMPHIBOLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_COBBLESTONE_WALL = ITEMS.register("amphibolite_cobblestone_wall", () -> new BlockItem(BlockList.AMPHIBOLITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_COBBLESTONE = ITEMS.register("mossy_amphibolite_cobblestone", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_COBBLESTONE_SLAB = ITEMS.register("mossy_amphibolite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_amphibolite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_COBBLESTONE_WALL = ITEMS.register("mossy_amphibolite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> AMPHIBOLITE_BUTTON = ITEMS.register("amphibolite_button", () -> new BlockItem(BlockList.AMPHIBOLITE_BUTTON.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> AMPHIBOLITE_PRESSURE_PLATE = ITEMS.register("amphibolite_pressure_plate", () -> new BlockItem(BlockList.AMPHIBOLITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> AMPHIBOLITE_BRICKS = ITEMS.register("amphibolite_bricks", () -> new BlockItem(BlockList.AMPHIBOLITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_BRICK_SLAB = ITEMS.register("amphibolite_brick_slab", () -> new BlockItem(BlockList.AMPHIBOLITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_BRICK_STAIRS = ITEMS.register("amphibolite_brick_stairs", () -> new BlockItem(BlockList.AMPHIBOLITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> AMPHIBOLITE_BRICK_WALL = ITEMS.register("amphibolite_brick_wall", () -> new BlockItem(BlockList.AMPHIBOLITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_AMPHIBOLITE_BRICKS = ITEMS.register("chiseled_amphibolite_bricks", () -> new BlockItem(BlockList.CHISELED_AMPHIBOLITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_AMPHIBOLITE_BRICKS = ITEMS.register("cracked_amphibolite_bricks", () -> new BlockItem(BlockList.CRACKED_AMPHIBOLITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_BRICKS = ITEMS.register("mossy_amphibolite_bricks", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_BRICK_SLAB = ITEMS.register("mossy_amphibolite_brick_slab", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_BRICK_STAIRS = ITEMS.register("mossy_amphibolite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_AMPHIBOLITE_BRICK_WALL = ITEMS.register("mossy_amphibolite_brick_wall", () -> new BlockItem(BlockList.MOSSY_AMPHIBOLITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_AMPHIBOLITE = ITEMS.register("polished_amphibolite", () -> new BlockItem(BlockList.POLISHED_AMPHIBOLITE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_AMPHIBOLITE_SLAB = ITEMS.register("polished_amphibolite_slab", () -> new BlockItem(BlockList.POLISHED_AMPHIBOLITE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_AMPHIBOLITE_STAIRS = ITEMS.register("polished_amphibolite_stairs", () -> new BlockItem(BlockList.POLISHED_AMPHIBOLITE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    /*-Cataclasite-*/
    public static final RegistryObject<Item> CATACLASITE = ITEMS.register("cataclasite", () -> new BlockItem(BlockList.CATACLASITE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CATACLASITE_SLAB = ITEMS.register("cataclasite_slab", () -> new BlockItem(BlockList.CATACLASITE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CATACLASITE_STAIRS = ITEMS.register("cataclasite_stairs", () -> new BlockItem(BlockList.CATACLASITE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CATACLASITE_WALL = ITEMS.register("cataclasite_wall", () -> new BlockItem(BlockList.CATACLASITE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> CATACLASITE_COBBLESTONE = ITEMS.register("cataclasite_cobblestone", () -> new BlockItem(BlockList.CATACLASITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CATACLASITE_COBBLESTONE_SLAB = ITEMS.register("cataclasite_cobblestone_slab", () -> new BlockItem(BlockList.CATACLASITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CATACLASITE_COBBLESTONE_STAIRS = ITEMS.register("cataclasite_cobblestone_stairs", () -> new BlockItem(BlockList.CATACLASITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CATACLASITE_COBBLESTONE_WALL = ITEMS.register("cataclasite_cobblestone_wall", () -> new BlockItem(BlockList.CATACLASITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_CATACLASITE_COBBLESTONE = ITEMS.register("mossy_cataclasite_cobblestone", () -> new BlockItem(BlockList.MOSSY_CATACLASITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_CATACLASITE_COBBLESTONE_SLAB = ITEMS.register("mossy_cataclasite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_CATACLASITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_CATACLASITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_cataclasite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_CATACLASITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_CATACLASITE_COBBLESTONE_WALL = ITEMS.register("mossy_cataclasite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_CATACLASITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> CATACLASITE_BUTTON = ITEMS.register("cataclasite_button", () -> new BlockItem(BlockList.CATACLASITE_BUTTON.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> CATACLASITE_PRESSURE_PLATE = ITEMS.register("cataclasite_pressure_plate", () -> new BlockItem(BlockList.CATACLASITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> CATACLASITE_BRICKS = ITEMS.register("cataclasite_bricks", () -> new BlockItem(BlockList.CATACLASITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CATACLASITE_BRICK_SLAB = ITEMS.register("cataclasite_brick_slab", () -> new BlockItem(BlockList.CATACLASITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CATACLASITE_BRICK_STAIRS = ITEMS.register("cataclasite_brick_stairs", () -> new BlockItem(BlockList.CATACLASITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CATACLASITE_BRICK_WALL = ITEMS.register("cataclasite_brick_wall", () -> new BlockItem(BlockList.CATACLASITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_CATACLASITE_BRICKS = ITEMS.register("chiseled_cataclasite_bricks", () -> new BlockItem(BlockList.CHISELED_CATACLASITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_CATACLASITE_BRICKS = ITEMS.register("cracked_cataclasite_bricks", () -> new BlockItem(BlockList.CRACKED_CATACLASITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_CATACLASITE_BRICKS = ITEMS.register("mossy_cataclasite_bricks", () -> new BlockItem(BlockList.MOSSY_CATACLASITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_CATACLASITE_BRICK_SLAB = ITEMS.register("mossy_cataclasite_brick_slab", () -> new BlockItem(BlockList.MOSSY_CATACLASITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_CATACLASITE_BRICK_STAIRS = ITEMS.register("mossy_cataclasite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_CATACLASITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_CATACLASITE_BRICK_WALL = ITEMS.register("mossy_cataclasite_brick_wall", () -> new BlockItem(BlockList.MOSSY_CATACLASITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_CATACLASITE = ITEMS.register("polished_cataclasite", () -> new BlockItem(BlockList.POLISHED_CATACLASITE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_CATACLASITE_SLAB = ITEMS.register("polished_cataclasite_slab", () -> new BlockItem(BlockList.POLISHED_CATACLASITE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_CATACLASITE_STAIRS = ITEMS.register("polished_cataclasite_stairs", () -> new BlockItem(BlockList.POLISHED_CATACLASITE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    /*-Eclogite-*/
    public static final RegistryObject<Item> ECLOGITE = ITEMS.register("eclogite", () -> new BlockItem(BlockList.ECLOGITE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_SLAB = ITEMS.register("eclogite_slab", () -> new BlockItem(BlockList.ECLOGITE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_STAIRS = ITEMS.register("eclogite_stairs", () -> new BlockItem(BlockList.ECLOGITE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_WALL = ITEMS.register("eclogite_wall", () -> new BlockItem(BlockList.ECLOGITE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> ECLOGITE_COBBLESTONE = ITEMS.register("eclogite_cobblestone", () -> new BlockItem(BlockList.ECLOGITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_COBBLESTONE_SLAB = ITEMS.register("eclogite_cobblestone_slab", () -> new BlockItem(BlockList.ECLOGITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_COBBLESTONE_STAIRS = ITEMS.register("eclogite_cobblestone_stairs", () -> new BlockItem(BlockList.ECLOGITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_COBBLESTONE_WALL = ITEMS.register("eclogite_cobblestone_wall", () -> new BlockItem(BlockList.ECLOGITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_ECLOGITE_COBBLESTONE = ITEMS.register("mossy_eclogite_cobblestone", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_COBBLESTONE_SLAB = ITEMS.register("mossy_eclogite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_eclogite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_COBBLESTONE_WALL = ITEMS.register("mossy_eclogite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> ECLOGITE_BUTTON = ITEMS.register("eclogite_button", () -> new BlockItem(BlockList.ECLOGITE_BUTTON.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> ECLOGITE_PRESSURE_PLATE = ITEMS.register("eclogite_pressure_plate", () -> new BlockItem(BlockList.ECLOGITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> ECLOGITE_BRICKS = ITEMS.register("eclogite_bricks", () -> new BlockItem(BlockList.ECLOGITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_BRICK_SLAB = ITEMS.register("eclogite_brick_slab", () -> new BlockItem(BlockList.ECLOGITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_BRICK_STAIRS = ITEMS.register("eclogite_brick_stairs", () -> new BlockItem(BlockList.ECLOGITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> ECLOGITE_BRICK_WALL = ITEMS.register("eclogite_brick_wall", () -> new BlockItem(BlockList.ECLOGITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_ECLOGITE_BRICKS = ITEMS.register("chiseled_eclogite_bricks", () -> new BlockItem(BlockList.CHISELED_ECLOGITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_ECLOGITE_BRICKS = ITEMS.register("cracked_eclogite_bricks", () -> new BlockItem(BlockList.CRACKED_ECLOGITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_BRICKS = ITEMS.register("mossy_eclogite_bricks", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_BRICK_SLAB = ITEMS.register("mossy_eclogite_brick_slab", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_BRICK_STAIRS = ITEMS.register("mossy_eclogite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_ECLOGITE_BRICK_WALL = ITEMS.register("mossy_eclogite_brick_wall", () -> new BlockItem(BlockList.MOSSY_ECLOGITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_ECLOGITE = ITEMS.register("polished_eclogite", () -> new BlockItem(BlockList.POLISHED_ECLOGITE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_ECLOGITE_SLAB = ITEMS.register("polished_eclogite_slab", () -> new BlockItem(BlockList.POLISHED_ECLOGITE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_ECLOGITE_STAIRS = ITEMS.register("polished_eclogite_stairs", () -> new BlockItem(BlockList.POLISHED_ECLOGITE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    /*-Gneiss-*/
    public static final RegistryObject<Item> GNEISS = ITEMS.register("gneiss", () -> new BlockItem(BlockList.GNEISS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_SLAB = ITEMS.register("gneiss_slab", () -> new BlockItem(BlockList.GNEISS_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_STAIRS = ITEMS.register("gneiss_stairs", () -> new BlockItem(BlockList.GNEISS_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_WALL = ITEMS.register("gneiss_wall", () -> new BlockItem(BlockList.GNEISS_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> GNEISS_COBBLESTONE = ITEMS.register("gneiss_cobblestone", () -> new BlockItem(BlockList.GNEISS_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_COBBLESTONE_SLAB = ITEMS.register("gneiss_cobblestone_slab", () -> new BlockItem(BlockList.GNEISS_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_COBBLESTONE_STAIRS = ITEMS.register("gneiss_cobblestone_stairs", () -> new BlockItem(BlockList.GNEISS_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_COBBLESTONE_WALL = ITEMS.register("gneiss_cobblestone_wall", () -> new BlockItem(BlockList.GNEISS_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_GNEISS_COBBLESTONE = ITEMS.register("mossy_gneiss_cobblestone", () -> new BlockItem(BlockList.MOSSY_GNEISS_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_COBBLESTONE_SLAB = ITEMS.register("mossy_gneiss_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_GNEISS_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_COBBLESTONE_STAIRS = ITEMS.register("mossy_gneiss_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_GNEISS_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_COBBLESTONE_WALL = ITEMS.register("mossy_gneiss_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_GNEISS_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> GNEISS_BUTTON = ITEMS.register("gneiss_button", () -> new BlockItem(BlockList.GNEISS_BUTTON.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> GNEISS_PRESSURE_PLATE = ITEMS.register("gneiss_pressure_plate", () -> new BlockItem(BlockList.GNEISS_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> GNEISS_BRICKS = ITEMS.register("gneiss_bricks", () -> new BlockItem(BlockList.GNEISS_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_BRICK_SLAB = ITEMS.register("gneiss_brick_slab", () -> new BlockItem(BlockList.GNEISS_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_BRICK_STAIRS = ITEMS.register("gneiss_brick_stairs", () -> new BlockItem(BlockList.GNEISS_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> GNEISS_BRICK_WALL = ITEMS.register("gneiss_brick_wall", () -> new BlockItem(BlockList.GNEISS_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_GNEISS_BRICKS = ITEMS.register("chiseled_gneiss_bricks", () -> new BlockItem(BlockList.CHISELED_GNEISS_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_GNEISS_BRICKS = ITEMS.register("cracked_gneiss_bricks", () -> new BlockItem(BlockList.CRACKED_GNEISS_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_BRICKS = ITEMS.register("mossy_gneiss_bricks", () -> new BlockItem(BlockList.MOSSY_GNEISS_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_BRICK_SLAB = ITEMS.register("mossy_gneiss_brick_slab", () -> new BlockItem(BlockList.MOSSY_GNEISS_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_BRICK_STAIRS = ITEMS.register("mossy_gneiss_brick_stairs", () -> new BlockItem(BlockList.MOSSY_GNEISS_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_GNEISS_BRICK_WALL = ITEMS.register("mossy_gneiss_brick_wall", () -> new BlockItem(BlockList.MOSSY_GNEISS_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_GNEISS = ITEMS.register("polished_gneiss", () -> new BlockItem(BlockList.POLISHED_GNEISS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_GNEISS_SLAB = ITEMS.register("polished_gneiss_slab", () -> new BlockItem(BlockList.POLISHED_GNEISS_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_GNEISS_STAIRS = ITEMS.register("polished_gneiss_stairs", () -> new BlockItem(BlockList.POLISHED_GNEISS_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    /*-Marble-*/
    public static final RegistryObject<Item> MARBLE = ITEMS.register("marble", () -> new BlockItem(BlockList.MARBLE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_SLAB = ITEMS.register("marble_slab", () -> new BlockItem(BlockList.MARBLE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_STAIRS = ITEMS.register("marble_stairs", () -> new BlockItem(BlockList.MARBLE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_WALL = ITEMS.register("marble_wall", () -> new BlockItem(BlockList.MARBLE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> MARBLE_COBBLESTONE = ITEMS.register("marble_cobblestone", () -> new BlockItem(BlockList.MARBLE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_COBBLESTONE_SLAB = ITEMS.register("marble_cobblestone_slab", () -> new BlockItem(BlockList.MARBLE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_COBBLESTONE_STAIRS = ITEMS.register("marble_cobblestone_stairs", () -> new BlockItem(BlockList.MARBLE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_COBBLESTONE_WALL = ITEMS.register("marble_cobblestone_wall", () -> new BlockItem(BlockList.MARBLE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_MARBLE_COBBLESTONE = ITEMS.register("mossy_marble_cobblestone", () -> new BlockItem(BlockList.MOSSY_MARBLE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_COBBLESTONE_SLAB = ITEMS.register("mossy_marble_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_MARBLE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_COBBLESTONE_STAIRS = ITEMS.register("mossy_marble_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_MARBLE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_COBBLESTONE_WALL = ITEMS.register("mossy_marble_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_MARBLE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> MARBLE_BUTTON = ITEMS.register("marble_button", () -> new BlockItem(BlockList.MARBLE_BUTTON.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> MARBLE_PRESSURE_PLATE = ITEMS.register("marble_pressure_plate", () -> new BlockItem(BlockList.MARBLE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> MARBLE_BRICKS = ITEMS.register("marble_bricks", () -> new BlockItem(BlockList.MARBLE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_BRICK_SLAB = ITEMS.register("marble_brick_slab", () -> new BlockItem(BlockList.MARBLE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_BRICK_STAIRS = ITEMS.register("marble_brick_stairs", () -> new BlockItem(BlockList.MARBLE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MARBLE_BRICK_WALL = ITEMS.register("marble_brick_wall", () -> new BlockItem(BlockList.MARBLE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_MARBLE_BRICKS = ITEMS.register("chiseled_marble_bricks", () -> new BlockItem(BlockList.CHISELED_MARBLE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_MARBLE_BRICKS = ITEMS.register("cracked_marble_bricks", () -> new BlockItem(BlockList.CRACKED_MARBLE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_BRICKS = ITEMS.register("mossy_marble_bricks", () -> new BlockItem(BlockList.MOSSY_MARBLE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_BRICK_SLAB = ITEMS.register("mossy_marble_brick_slab", () -> new BlockItem(BlockList.MOSSY_MARBLE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_BRICK_STAIRS = ITEMS.register("mossy_marble_brick_stairs", () -> new BlockItem(BlockList.MOSSY_MARBLE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MARBLE_BRICK_WALL = ITEMS.register("mossy_marble_brick_wall", () -> new BlockItem(BlockList.MOSSY_MARBLE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_MARBLE = ITEMS.register("polished_marble", () -> new BlockItem(BlockList.POLISHED_MARBLE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_MARBLE_SLAB = ITEMS.register("polished_marble_slab", () -> new BlockItem(BlockList.POLISHED_MARBLE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_MARBLE_STAIRS = ITEMS.register("polished_marble_stairs", () -> new BlockItem(BlockList.POLISHED_MARBLE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    /*-Migmatite-*/
    public static final RegistryObject<Item> MIGMATITE = ITEMS.register("migmatite", () -> new BlockItem(BlockList.MIGMATITE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MIGMATITE_SLAB = ITEMS.register("migmatite_slab", () -> new BlockItem(BlockList.MIGMATITE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MIGMATITE_STAIRS = ITEMS.register("migmatite_stairs", () -> new BlockItem(BlockList.MIGMATITE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MIGMATITE_WALL = ITEMS.register("migmatite_wall", () -> new BlockItem(BlockList.MIGMATITE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> MIGMATITE_COBBLESTONE = ITEMS.register("migmatite_cobblestone", () -> new BlockItem(BlockList.MIGMATITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MIGMATITE_COBBLESTONE_SLAB = ITEMS.register("migmatite_cobblestone_slab", () -> new BlockItem(BlockList.MIGMATITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MIGMATITE_COBBLESTONE_STAIRS = ITEMS.register("migmatite_cobblestone_stairs", () -> new BlockItem(BlockList.MIGMATITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MIGMATITE_COBBLESTONE_WALL = ITEMS.register("migmatite_cobblestone_wall", () -> new BlockItem(BlockList.MIGMATITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_MIGMATITE_COBBLESTONE = ITEMS.register("mossy_migmatite_cobblestone", () -> new BlockItem(BlockList.MOSSY_MIGMATITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MIGMATITE_COBBLESTONE_SLAB = ITEMS.register("mossy_migmatite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_MIGMATITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MIGMATITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_migmatite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_MIGMATITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MIGMATITE_COBBLESTONE_WALL = ITEMS.register("mossy_migmatite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_MIGMATITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> MIGMATITE_BUTTON = ITEMS.register("migmatite_button", () -> new BlockItem(BlockList.MIGMATITE_BUTTON.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> MIGMATITE_PRESSURE_PLATE = ITEMS.register("migmatite_pressure_plate", () -> new BlockItem(BlockList.MIGMATITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> MIGMATITE_BRICKS = ITEMS.register("migmatite_bricks", () -> new BlockItem(BlockList.MIGMATITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MIGMATITE_BRICK_SLAB = ITEMS.register("migmatite_brick_slab", () -> new BlockItem(BlockList.MIGMATITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MIGMATITE_BRICK_STAIRS = ITEMS.register("migmatite_brick_stairs", () -> new BlockItem(BlockList.MIGMATITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MIGMATITE_BRICK_WALL = ITEMS.register("migmatite_brick_wall", () -> new BlockItem(BlockList.MIGMATITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_MIGMATITE_BRICKS = ITEMS.register("chiseled_migmatite_bricks", () -> new BlockItem(BlockList.CHISELED_MIGMATITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_MIGMATITE_BRICKS = ITEMS.register("cracked_migmatite_bricks", () -> new BlockItem(BlockList.CRACKED_MIGMATITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MIGMATITE_BRICKS = ITEMS.register("mossy_migmatite_bricks", () -> new BlockItem(BlockList.MOSSY_MIGMATITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MIGMATITE_BRICK_SLAB = ITEMS.register("mossy_migmatite_brick_slab", () -> new BlockItem(BlockList.MOSSY_MIGMATITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MIGMATITE_BRICK_STAIRS = ITEMS.register("mossy_migmatite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_MIGMATITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_MIGMATITE_BRICK_WALL = ITEMS.register("mossy_migmatite_brick_wall", () -> new BlockItem(BlockList.MOSSY_MIGMATITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_MIGMATITE = ITEMS.register("polished_migmatite", () -> new BlockItem(BlockList.POLISHED_MIGMATITE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_MIGMATITE_SLAB = ITEMS.register("polished_migmatite_slab", () -> new BlockItem(BlockList.POLISHED_MIGMATITE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_MIGMATITE_STAIRS = ITEMS.register("polished_migmatite_stairs", () -> new BlockItem(BlockList.POLISHED_MIGMATITE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    /*-Schist-*/
    public static final RegistryObject<Item> SCHIST = ITEMS.register("schist", () -> new BlockItem(BlockList.SCHIST.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_SLAB = ITEMS.register("schist_slab", () -> new BlockItem(BlockList.SCHIST_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_STAIRS = ITEMS.register("schist_stairs", () -> new BlockItem(BlockList.SCHIST_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_WALL = ITEMS.register("schist_wall", () -> new BlockItem(BlockList.SCHIST_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> SCHIST_COBBLESTONE = ITEMS.register("schist_cobblestone", () -> new BlockItem(BlockList.SCHIST_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_COBBLESTONE_SLAB = ITEMS.register("schist_cobblestone_slab", () -> new BlockItem(BlockList.SCHIST_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_COBBLESTONE_STAIRS = ITEMS.register("schist_cobblestone_stairs", () -> new BlockItem(BlockList.SCHIST_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_COBBLESTONE_WALL = ITEMS.register("schist_cobblestone_wall", () -> new BlockItem(BlockList.SCHIST_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_SCHIST_COBBLESTONE = ITEMS.register("mossy_schist_cobblestone", () -> new BlockItem(BlockList.MOSSY_SCHIST_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_COBBLESTONE_SLAB = ITEMS.register("mossy_schist_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_SCHIST_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_COBBLESTONE_STAIRS = ITEMS.register("mossy_schist_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_SCHIST_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_COBBLESTONE_WALL = ITEMS.register("mossy_schist_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_SCHIST_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> SCHIST_BUTTON = ITEMS.register("schist_button", () -> new BlockItem(BlockList.SCHIST_BUTTON.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> SCHIST_PRESSURE_PLATE = ITEMS.register("schist_pressure_plate", () -> new BlockItem(BlockList.SCHIST_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> SCHIST_BRICKS = ITEMS.register("schist_bricks", () -> new BlockItem(BlockList.SCHIST_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_BRICK_SLAB = ITEMS.register("schist_brick_slab", () -> new BlockItem(BlockList.SCHIST_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_BRICK_STAIRS = ITEMS.register("schist_brick_stairs", () -> new BlockItem(BlockList.SCHIST_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SCHIST_BRICK_WALL = ITEMS.register("schist_brick_wall", () -> new BlockItem(BlockList.SCHIST_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_SCHIST_BRICKS = ITEMS.register("chiseled_schist_bricks", () -> new BlockItem(BlockList.CHISELED_SCHIST_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_SCHIST_BRICKS = ITEMS.register("cracked_schist_bricks", () -> new BlockItem(BlockList.CRACKED_SCHIST_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_BRICKS = ITEMS.register("mossy_schist_bricks", () -> new BlockItem(BlockList.MOSSY_SCHIST_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_BRICK_SLAB = ITEMS.register("mossy_schist_brick_slab", () -> new BlockItem(BlockList.MOSSY_SCHIST_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_BRICK_STAIRS = ITEMS.register("mossy_schist_brick_stairs", () -> new BlockItem(BlockList.MOSSY_SCHIST_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SCHIST_BRICK_WALL = ITEMS.register("mossy_schist_brick_wall", () -> new BlockItem(BlockList.MOSSY_SCHIST_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_SCHIST = ITEMS.register("polished_schist", () -> new BlockItem(BlockList.POLISHED_SCHIST.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_SCHIST_SLAB = ITEMS.register("polished_schist_slab", () -> new BlockItem(BlockList.POLISHED_SCHIST_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_SCHIST_STAIRS = ITEMS.register("polished_schist_stairs", () -> new BlockItem(BlockList.POLISHED_SCHIST_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    /*-Slate-*/
    public static final RegistryObject<Item> SLATE = ITEMS.register("slate", () -> new BlockItem(BlockList.SLATE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SLATE_SLAB = ITEMS.register("slate_slab", () -> new BlockItem(BlockList.SLATE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SLATE_STAIRS = ITEMS.register("slate_stairs", () -> new BlockItem(BlockList.SLATE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SLATE_WALL = ITEMS.register("slate_wall", () -> new BlockItem(BlockList.SLATE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> SLATE_COBBLESTONE = ITEMS.register("slate_cobblestone", () -> new BlockItem(BlockList.SLATE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SLATE_COBBLESTONE_SLAB = ITEMS.register("slate_cobblestone_slab", () -> new BlockItem(BlockList.SLATE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SLATE_COBBLESTONE_STAIRS = ITEMS.register("slate_cobblestone_stairs", () -> new BlockItem(BlockList.SLATE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SLATE_COBBLESTONE_WALL = ITEMS.register("slate_cobblestone_wall", () -> new BlockItem(BlockList.SLATE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_SLATE_COBBLESTONE = ITEMS.register("mossy_slate_cobblestone", () -> new BlockItem(BlockList.MOSSY_SLATE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SLATE_COBBLESTONE_SLAB = ITEMS.register("mossy_slate_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_SLATE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SLATE_COBBLESTONE_STAIRS = ITEMS.register("mossy_slate_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_SLATE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SLATE_COBBLESTONE_WALL = ITEMS.register("mossy_slate_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_SLATE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> SLATE_BUTTON = ITEMS.register("slate_button", () -> new BlockItem(BlockList.SLATE_BUTTON.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> SLATE_PRESSURE_PLATE = ITEMS.register("slate_pressure_plate", () -> new BlockItem(BlockList.SLATE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> SLATE_BRICKS = ITEMS.register("slate_bricks", () -> new BlockItem(BlockList.SLATE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SLATE_BRICK_SLAB = ITEMS.register("slate_brick_slab", () -> new BlockItem(BlockList.SLATE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SLATE_BRICK_STAIRS = ITEMS.register("slate_brick_stairs", () -> new BlockItem(BlockList.SLATE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SLATE_BRICK_WALL = ITEMS.register("slate_brick_wall", () -> new BlockItem(BlockList.SLATE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_SLATE_BRICKS = ITEMS.register("chiseled_slate_bricks", () -> new BlockItem(BlockList.CHISELED_SLATE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_SLATE_BRICKS = ITEMS.register("cracked_slate_bricks", () -> new BlockItem(BlockList.CRACKED_SLATE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SLATE_BRICKS = ITEMS.register("mossy_slate_bricks", () -> new BlockItem(BlockList.MOSSY_SLATE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SLATE_BRICK_SLAB = ITEMS.register("mossy_slate_brick_slab", () -> new BlockItem(BlockList.MOSSY_SLATE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SLATE_BRICK_STAIRS = ITEMS.register("mossy_slate_brick_stairs", () -> new BlockItem(BlockList.MOSSY_SLATE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SLATE_BRICK_WALL = ITEMS.register("mossy_slate_brick_wall", () -> new BlockItem(BlockList.MOSSY_SLATE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_SLATE = ITEMS.register("polished_slate", () -> new BlockItem(BlockList.POLISHED_SLATE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_SLATE_SLAB = ITEMS.register("polished_slate_slab", () -> new BlockItem(BlockList.POLISHED_SLATE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_SLATE_STAIRS = ITEMS.register("polished_slate_stairs", () -> new BlockItem(BlockList.POLISHED_SLATE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    /*-Soapstone-*/
    public static final RegistryObject<Item> SOAPSTONE = ITEMS.register("soapstone", () -> new BlockItem(BlockList.SOAPSTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SOAPSTONE_SLAB = ITEMS.register("soapstone_slab", () -> new BlockItem(BlockList.SOAPSTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SOAPSTONE_STAIRS = ITEMS.register("soapstone_stairs", () -> new BlockItem(BlockList.SOAPSTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SOAPSTONE_WALL = ITEMS.register("soapstone_wall", () -> new BlockItem(BlockList.SOAPSTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> SOAPSTONE_COBBLESTONE = ITEMS.register("soapstone_cobblestone", () -> new BlockItem(BlockList.SOAPSTONE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SOAPSTONE_COBBLESTONE_SLAB = ITEMS.register("soapstone_cobblestone_slab", () -> new BlockItem(BlockList.SOAPSTONE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SOAPSTONE_COBBLESTONE_STAIRS = ITEMS.register("soapstone_cobblestone_stairs", () -> new BlockItem(BlockList.SOAPSTONE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SOAPSTONE_COBBLESTONE_WALL = ITEMS.register("soapstone_cobblestone_wall", () -> new BlockItem(BlockList.SOAPSTONE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_SOAPSTONE_COBBLESTONE = ITEMS.register("mossy_soapstone_cobblestone", () -> new BlockItem(BlockList.MOSSY_SOAPSTONE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SOAPSTONE_COBBLESTONE_SLAB = ITEMS.register("mossy_soapstone_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_SOAPSTONE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SOAPSTONE_COBBLESTONE_STAIRS = ITEMS.register("mossy_soapstone_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_SOAPSTONE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SOAPSTONE_COBBLESTONE_WALL = ITEMS.register("mossy_soapstone_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_SOAPSTONE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> SOAPSTONE_BUTTON = ITEMS.register("soapstone_button", () -> new BlockItem(BlockList.SOAPSTONE_BUTTON.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> SOAPSTONE_PRESSURE_PLATE = ITEMS.register("soapstone_pressure_plate", () -> new BlockItem(BlockList.SOAPSTONE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> SOAPSTONE_BRICKS = ITEMS.register("soapstone_bricks", () -> new BlockItem(BlockList.SOAPSTONE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SOAPSTONE_BRICK_SLAB = ITEMS.register("soapstone_brick_slab", () -> new BlockItem(BlockList.SOAPSTONE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SOAPSTONE_BRICK_STAIRS = ITEMS.register("soapstone_brick_stairs", () -> new BlockItem(BlockList.SOAPSTONE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> SOAPSTONE_BRICK_WALL = ITEMS.register("soapstone_brick_wall", () -> new BlockItem(BlockList.SOAPSTONE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_SOAPSTONE_BRICKS = ITEMS.register("chiseled_soapstone_bricks", () -> new BlockItem(BlockList.CHISELED_SOAPSTONE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_SOAPSTONE_BRICKS = ITEMS.register("cracked_soapstone_bricks", () -> new BlockItem(BlockList.CRACKED_SOAPSTONE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SOAPSTONE_BRICKS = ITEMS.register("mossy_soapstone_bricks", () -> new BlockItem(BlockList.MOSSY_SOAPSTONE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SOAPSTONE_BRICK_SLAB = ITEMS.register("mossy_soapstone_brick_slab", () -> new BlockItem(BlockList.MOSSY_SOAPSTONE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SOAPSTONE_BRICK_STAIRS = ITEMS.register("mossy_soapstone_brick_stairs", () -> new BlockItem(BlockList.MOSSY_SOAPSTONE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_SOAPSTONE_BRICK_WALL = ITEMS.register("mossy_soapstone_brick_wall", () -> new BlockItem(BlockList.MOSSY_SOAPSTONE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_SOAPSTONE = ITEMS.register("polished_soapstone", () -> new BlockItem(BlockList.POLISHED_SOAPSTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_SOAPSTONE_SLAB = ITEMS.register("polished_soapstone_slab", () -> new BlockItem(BlockList.POLISHED_SOAPSTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_SOAPSTONE_STAIRS = ITEMS.register("polished_soapstone_stairs", () -> new BlockItem(BlockList.POLISHED_SOAPSTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    /*-Phyllite-*/
    public static final RegistryObject<Item> PHYLLITE = ITEMS.register("phyllite", () -> new BlockItem(BlockList.PHYLLITE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> PHYLLITE_SLAB = ITEMS.register("phyllite_slab", () -> new BlockItem(BlockList.PHYLLITE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> PHYLLITE_STAIRS = ITEMS.register("phyllite_stairs", () -> new BlockItem(BlockList.PHYLLITE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> PHYLLITE_WALL = ITEMS.register("phyllite_wall", () -> new BlockItem(BlockList.PHYLLITE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> PHYLLITE_COBBLESTONE = ITEMS.register("phyllite_cobblestone", () -> new BlockItem(BlockList.PHYLLITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> PHYLLITE_COBBLESTONE_SLAB = ITEMS.register("phyllite_cobblestone_slab", () -> new BlockItem(BlockList.PHYLLITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> PHYLLITE_COBBLESTONE_STAIRS = ITEMS.register("phyllite_cobblestone_stairs", () -> new BlockItem(BlockList.PHYLLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> PHYLLITE_COBBLESTONE_WALL = ITEMS.register("phyllite_cobblestone_wall", () -> new BlockItem(BlockList.PHYLLITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_PHYLLITE_COBBLESTONE = ITEMS.register("mossy_phyllite_cobblestone", () -> new BlockItem(BlockList.MOSSY_PHYLLITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_PHYLLITE_COBBLESTONE_SLAB = ITEMS.register("mossy_phyllite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_PHYLLITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_PHYLLITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_phyllite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_PHYLLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_PHYLLITE_COBBLESTONE_WALL = ITEMS.register("mossy_phyllite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_PHYLLITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Buttons
    public static final RegistryObject<Item> PHYLLITE_BUTTON = ITEMS.register("phyllite_button", () -> new BlockItem(BlockList.PHYLLITE_BUTTON.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> PHYLLITE_PRESSURE_PLATE = ITEMS.register("phyllite_pressure_plate", () -> new BlockItem(BlockList.PHYLLITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Bricks
    public static final RegistryObject<Item> PHYLLITE_BRICKS = ITEMS.register("phyllite_bricks", () -> new BlockItem(BlockList.PHYLLITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> PHYLLITE_BRICK_SLAB = ITEMS.register("phyllite_brick_slab", () -> new BlockItem(BlockList.PHYLLITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> PHYLLITE_BRICK_STAIRS = ITEMS.register("phyllite_brick_stairs", () -> new BlockItem(BlockList.PHYLLITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> PHYLLITE_BRICK_WALL = ITEMS.register("phyllite_brick_wall", () -> new BlockItem(BlockList.PHYLLITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CHISELED_PHYLLITE_BRICKS = ITEMS.register("chiseled_phyllite_bricks", () -> new BlockItem(BlockList.CHISELED_PHYLLITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> CRACKED_PHYLLITE_BRICKS = ITEMS.register("cracked_phyllite_bricks", () -> new BlockItem(BlockList.CRACKED_PHYLLITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_PHYLLITE_BRICKS = ITEMS.register("mossy_phyllite_bricks", () -> new BlockItem(BlockList.MOSSY_PHYLLITE_BRICKS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_PHYLLITE_BRICK_SLAB = ITEMS.register("mossy_phyllite_brick_slab", () -> new BlockItem(BlockList.MOSSY_PHYLLITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_PHYLLITE_BRICK_STAIRS = ITEMS.register("mossy_phyllite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_PHYLLITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> MOSSY_PHYLLITE_BRICK_WALL = ITEMS.register("mossy_phyllite_brick_wall", () -> new BlockItem(BlockList.MOSSY_PHYLLITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_PHYLLITE = ITEMS.register("polished_phyllite", () -> new BlockItem(BlockList.POLISHED_PHYLLITE.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_PHYLLITE_SLAB = ITEMS.register("polished_phyllite_slab", () -> new BlockItem(BlockList.POLISHED_PHYLLITE_SLAB.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));
    public static final RegistryObject<Item> POLISHED_PHYLLITE_STAIRS = ITEMS.register("polished_phyllite_stairs", () -> new BlockItem(BlockList.POLISHED_PHYLLITE_STAIRS.get(), new Item.Properties().tab(Strata.METAMORPHIC_TAB)));

    /*Sedimentary Rocks*/

    /*-Argillite-*/
    public static final RegistryObject<Item> ARGILLITE = ITEMS.register("argillite", () -> new BlockItem(BlockList.ARGILLITE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_SLAB = ITEMS.register("argillite_slab", () -> new BlockItem(BlockList.ARGILLITE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_STAIRS = ITEMS.register("argillite_stairs", () -> new BlockItem(BlockList.ARGILLITE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_WALL = ITEMS.register("argillite_wall", () -> new BlockItem(BlockList.ARGILLITE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> ARGILLITE_COBBLESTONE = ITEMS.register("argillite_cobblestone", () -> new BlockItem(BlockList.ARGILLITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_COBBLESTONE_SLAB = ITEMS.register("argillite_cobblestone_slab", () -> new BlockItem(BlockList.ARGILLITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_COBBLESTONE_STAIRS = ITEMS.register("argillite_cobblestone_stairs", () -> new BlockItem(BlockList.ARGILLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_COBBLESTONE_WALL = ITEMS.register("argillite_cobblestone_wall", () -> new BlockItem(BlockList.ARGILLITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_ARGILLITE_COBBLESTONE = ITEMS.register("mossy_argillite_cobblestone", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_COBBLESTONE_SLAB = ITEMS.register("mossy_argillite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_argillite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_COBBLESTONE_WALL = ITEMS.register("mossy_argillite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> ARGILLITE_BUTTON = ITEMS.register("argillite_button", () -> new BlockItem(BlockList.ARGILLITE_BUTTON.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> ARGILLITE_PRESSURE_PLATE = ITEMS.register("argillite_pressure_plate", () -> new BlockItem(BlockList.ARGILLITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> ARGILLITE_BRICKS = ITEMS.register("argillite_bricks", () -> new BlockItem(BlockList.ARGILLITE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_BRICK_SLAB = ITEMS.register("argillite_brick_slab", () -> new BlockItem(BlockList.ARGILLITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_BRICK_STAIRS = ITEMS.register("argillite_brick_stairs", () -> new BlockItem(BlockList.ARGILLITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARGILLITE_BRICK_WALL = ITEMS.register("argillite_brick_wall", () -> new BlockItem(BlockList.ARGILLITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_ARGILLITE_BRICKS = ITEMS.register("chiseled_argillite_bricks", () -> new BlockItem(BlockList.CHISELED_ARGILLITE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_ARGILLITE_BRICKS = ITEMS.register("cracked_argillite_bricks", () -> new BlockItem(BlockList.CRACKED_ARGILLITE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_BRICKS = ITEMS.register("mossy_argillite_bricks", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_BRICK_SLAB = ITEMS.register("mossy_argillite_brick_slab", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_BRICK_STAIRS = ITEMS.register("mossy_argillite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARGILLITE_BRICK_WALL = ITEMS.register("mossy_argillite_brick_wall", () -> new BlockItem(BlockList.MOSSY_ARGILLITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_ARGILLITE = ITEMS.register("polished_argillite", () -> new BlockItem(BlockList.POLISHED_ARGILLITE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_ARGILLITE_SLAB = ITEMS.register("polished_argillite_slab", () -> new BlockItem(BlockList.POLISHED_ARGILLITE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_ARGILLITE_STAIRS = ITEMS.register("polished_argillite_stairs", () -> new BlockItem(BlockList.POLISHED_ARGILLITE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    /*-Arkose-*/
    public static final RegistryObject<Item> ARKOSE = ITEMS.register("arkose", () -> new BlockItem(BlockList.ARKOSE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARKOSE_SLAB = ITEMS.register("arkose_slab", () -> new BlockItem(BlockList.ARKOSE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARKOSE_STAIRS = ITEMS.register("arkose_stairs", () -> new BlockItem(BlockList.ARKOSE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARKOSE_WALL = ITEMS.register("arkose_wall", () -> new BlockItem(BlockList.ARKOSE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> ARKOSE_COBBLESTONE = ITEMS.register("arkose_cobblestone", () -> new BlockItem(BlockList.ARKOSE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARKOSE_COBBLESTONE_SLAB = ITEMS.register("arkose_cobblestone_slab", () -> new BlockItem(BlockList.ARKOSE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARKOSE_COBBLESTONE_STAIRS = ITEMS.register("arkose_cobblestone_stairs", () -> new BlockItem(BlockList.ARKOSE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARKOSE_COBBLESTONE_WALL = ITEMS.register("arkose_cobblestone_wall", () -> new BlockItem(BlockList.ARKOSE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_ARKOSE_COBBLESTONE = ITEMS.register("mossy_arkose_cobblestone", () -> new BlockItem(BlockList.MOSSY_ARKOSE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARKOSE_COBBLESTONE_SLAB = ITEMS.register("mossy_arkose_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_ARKOSE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARKOSE_COBBLESTONE_STAIRS = ITEMS.register("mossy_arkose_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_ARKOSE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARKOSE_COBBLESTONE_WALL = ITEMS.register("mossy_arkose_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_ARKOSE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> ARKOSE_BUTTON = ITEMS.register("arkose_button", () -> new BlockItem(BlockList.ARKOSE_BUTTON.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> ARKOSE_PRESSURE_PLATE = ITEMS.register("arkose_pressure_plate", () -> new BlockItem(BlockList.ARKOSE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> ARKOSE_BRICKS = ITEMS.register("arkose_bricks", () -> new BlockItem(BlockList.ARKOSE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARKOSE_BRICK_SLAB = ITEMS.register("arkose_brick_slab", () -> new BlockItem(BlockList.ARKOSE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARKOSE_BRICK_STAIRS = ITEMS.register("arkose_brick_stairs", () -> new BlockItem(BlockList.ARKOSE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> ARKOSE_BRICK_WALL = ITEMS.register("arkose_brick_wall", () -> new BlockItem(BlockList.ARKOSE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_ARKOSE_BRICKS = ITEMS.register("chiseled_arkose_bricks", () -> new BlockItem(BlockList.CHISELED_ARKOSE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_ARKOSE_BRICKS = ITEMS.register("cracked_arkose_bricks", () -> new BlockItem(BlockList.CRACKED_ARKOSE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARKOSE_BRICKS = ITEMS.register("mossy_arkose_bricks", () -> new BlockItem(BlockList.MOSSY_ARKOSE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARKOSE_BRICK_SLAB = ITEMS.register("mossy_arkose_brick_slab", () -> new BlockItem(BlockList.MOSSY_ARKOSE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARKOSE_BRICK_STAIRS = ITEMS.register("mossy_arkose_brick_stairs", () -> new BlockItem(BlockList.MOSSY_ARKOSE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_ARKOSE_BRICK_WALL = ITEMS.register("mossy_arkose_brick_wall", () -> new BlockItem(BlockList.MOSSY_ARKOSE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_ARKOSE = ITEMS.register("polished_arkose", () -> new BlockItem(BlockList.POLISHED_ARKOSE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_ARKOSE_SLAB = ITEMS.register("polished_arkose_slab", () -> new BlockItem(BlockList.POLISHED_ARKOSE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_ARKOSE_STAIRS = ITEMS.register("polished_arkose_stairs", () -> new BlockItem(BlockList.POLISHED_ARKOSE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    /*-Breccia-*/
    public static final RegistryObject<Item> BRECCIA = ITEMS.register("breccia", () -> new BlockItem(BlockList.BRECCIA.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> BRECCIA_SLAB = ITEMS.register("breccia_slab", () -> new BlockItem(BlockList.BRECCIA_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> BRECCIA_STAIRS = ITEMS.register("breccia_stairs", () -> new BlockItem(BlockList.BRECCIA_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> BRECCIA_WALL = ITEMS.register("breccia_wall", () -> new BlockItem(BlockList.BRECCIA_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> BRECCIA_COBBLESTONE = ITEMS.register("breccia_cobblestone", () -> new BlockItem(BlockList.BRECCIA_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> BRECCIA_COBBLESTONE_SLAB = ITEMS.register("breccia_cobblestone_slab", () -> new BlockItem(BlockList.BRECCIA_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> BRECCIA_COBBLESTONE_STAIRS = ITEMS.register("breccia_cobblestone_stairs", () -> new BlockItem(BlockList.BRECCIA_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> BRECCIA_COBBLESTONE_WALL = ITEMS.register("breccia_cobblestone_wall", () -> new BlockItem(BlockList.BRECCIA_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_BRECCIA_COBBLESTONE = ITEMS.register("mossy_breccia_cobblestone", () -> new BlockItem(BlockList.MOSSY_BRECCIA_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_BRECCIA_COBBLESTONE_SLAB = ITEMS.register("mossy_breccia_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_BRECCIA_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_BRECCIA_COBBLESTONE_STAIRS = ITEMS.register("mossy_breccia_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_BRECCIA_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_BRECCIA_COBBLESTONE_WALL = ITEMS.register("mossy_breccia_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_BRECCIA_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> BRECCIA_BUTTON = ITEMS.register("breccia_button", () -> new BlockItem(BlockList.BRECCIA_BUTTON.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> BRECCIA_PRESSURE_PLATE = ITEMS.register("breccia_pressure_plate", () -> new BlockItem(BlockList.BRECCIA_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> BRECCIA_BRICKS = ITEMS.register("breccia_bricks", () -> new BlockItem(BlockList.BRECCIA_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> BRECCIA_BRICK_SLAB = ITEMS.register("breccia_brick_slab", () -> new BlockItem(BlockList.BRECCIA_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> BRECCIA_BRICK_STAIRS = ITEMS.register("breccia_brick_stairs", () -> new BlockItem(BlockList.BRECCIA_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> BRECCIA_BRICK_WALL = ITEMS.register("breccia_brick_wall", () -> new BlockItem(BlockList.BRECCIA_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_BRECCIA_BRICKS = ITEMS.register("chiseled_breccia_bricks", () -> new BlockItem(BlockList.CHISELED_BRECCIA_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_BRECCIA_BRICKS = ITEMS.register("cracked_breccia_bricks", () -> new BlockItem(BlockList.CRACKED_BRECCIA_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_BRECCIA_BRICKS = ITEMS.register("mossy_breccia_bricks", () -> new BlockItem(BlockList.MOSSY_BRECCIA_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_BRECCIA_BRICK_SLAB = ITEMS.register("mossy_breccia_brick_slab", () -> new BlockItem(BlockList.MOSSY_BRECCIA_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_BRECCIA_BRICK_STAIRS = ITEMS.register("mossy_breccia_brick_stairs", () -> new BlockItem(BlockList.MOSSY_BRECCIA_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_BRECCIA_BRICK_WALL = ITEMS.register("mossy_breccia_brick_wall", () -> new BlockItem(BlockList.MOSSY_BRECCIA_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_BRECCIA = ITEMS.register("polished_breccia", () -> new BlockItem(BlockList.POLISHED_BRECCIA.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_BRECCIA_SLAB = ITEMS.register("polished_breccia_slab", () -> new BlockItem(BlockList.POLISHED_BRECCIA_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_BRECCIA_STAIRS = ITEMS.register("polished_breccia_stairs", () -> new BlockItem(BlockList.POLISHED_BRECCIA_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    /*-Chalk-*/
    public static final RegistryObject<Item> CHALK = ITEMS.register("chalk", () -> new BlockItem(BlockList.CHALK.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_SLAB = ITEMS.register("chalk_slab", () -> new BlockItem(BlockList.CHALK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_STAIRS = ITEMS.register("chalk_stairs", () -> new BlockItem(BlockList.CHALK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_WALL = ITEMS.register("chalk_wall", () -> new BlockItem(BlockList.CHALK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> CHALK_COBBLESTONE = ITEMS.register("chalk_cobblestone", () -> new BlockItem(BlockList.CHALK_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_COBBLESTONE_SLAB = ITEMS.register("chalk_cobblestone_slab", () -> new BlockItem(BlockList.CHALK_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_COBBLESTONE_STAIRS = ITEMS.register("chalk_cobblestone_stairs", () -> new BlockItem(BlockList.CHALK_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_COBBLESTONE_WALL = ITEMS.register("chalk_cobblestone_wall", () -> new BlockItem(BlockList.CHALK_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_CHALK_COBBLESTONE = ITEMS.register("mossy_chalk_cobblestone", () -> new BlockItem(BlockList.MOSSY_CHALK_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_COBBLESTONE_SLAB = ITEMS.register("mossy_chalk_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_CHALK_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_COBBLESTONE_STAIRS = ITEMS.register("mossy_chalk_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_CHALK_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_COBBLESTONE_WALL = ITEMS.register("mossy_chalk_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_CHALK_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> CHALK_BUTTON = ITEMS.register("chalk_button", () -> new BlockItem(BlockList.CHALK_BUTTON.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> CHALK_PRESSURE_PLATE = ITEMS.register("chalk_pressure_plate", () -> new BlockItem(BlockList.CHALK_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> CHALK_BRICKS = ITEMS.register("chalk_bricks", () -> new BlockItem(BlockList.CHALK_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_BRICK_SLAB = ITEMS.register("chalk_brick_slab", () -> new BlockItem(BlockList.CHALK_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_BRICK_STAIRS = ITEMS.register("chalk_brick_stairs", () -> new BlockItem(BlockList.CHALK_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHALK_BRICK_WALL = ITEMS.register("chalk_brick_wall", () -> new BlockItem(BlockList.CHALK_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_CHALK_BRICKS = ITEMS.register("chiseled_chalk_bricks", () -> new BlockItem(BlockList.CHISELED_CHALK_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_CHALK_BRICKS = ITEMS.register("cracked_chalk_bricks", () -> new BlockItem(BlockList.CRACKED_CHALK_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_BRICKS = ITEMS.register("mossy_chalk_bricks", () -> new BlockItem(BlockList.MOSSY_CHALK_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_BRICK_SLAB = ITEMS.register("mossy_chalk_brick_slab", () -> new BlockItem(BlockList.MOSSY_CHALK_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_BRICK_STAIRS = ITEMS.register("mossy_chalk_brick_stairs", () -> new BlockItem(BlockList.MOSSY_CHALK_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CHALK_BRICK_WALL = ITEMS.register("mossy_chalk_brick_wall", () -> new BlockItem(BlockList.MOSSY_CHALK_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_CHALK = ITEMS.register("polished_chalk", () -> new BlockItem(BlockList.POLISHED_CHALK.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_CHALK_SLAB = ITEMS.register("polished_chalk_slab", () -> new BlockItem(BlockList.POLISHED_CHALK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_CHALK_STAIRS = ITEMS.register("polished_chalk_stairs", () -> new BlockItem(BlockList.POLISHED_CHALK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    /*-Claystone-*/
    public static final RegistryObject<Item> CLAYSTONE = ITEMS.register("claystone", () -> new BlockItem(BlockList.CLAYSTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CLAYSTONE_SLAB = ITEMS.register("claystone_slab", () -> new BlockItem(BlockList.CLAYSTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CLAYSTONE_STAIRS = ITEMS.register("claystone_stairs", () -> new BlockItem(BlockList.CLAYSTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CLAYSTONE_WALL = ITEMS.register("claystone_wall", () -> new BlockItem(BlockList.CLAYSTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> CLAYSTONE_COBBLESTONE = ITEMS.register("claystone_cobblestone", () -> new BlockItem(BlockList.CLAYSTONE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CLAYSTONE_COBBLESTONE_SLAB = ITEMS.register("claystone_cobblestone_slab", () -> new BlockItem(BlockList.CLAYSTONE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CLAYSTONE_COBBLESTONE_STAIRS = ITEMS.register("claystone_cobblestone_stairs", () -> new BlockItem(BlockList.CLAYSTONE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CLAYSTONE_COBBLESTONE_WALL = ITEMS.register("claystone_cobblestone_wall", () -> new BlockItem(BlockList.CLAYSTONE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_CLAYSTONE_COBBLESTONE = ITEMS.register("mossy_claystone_cobblestone", () -> new BlockItem(BlockList.MOSSY_CLAYSTONE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CLAYSTONE_COBBLESTONE_SLAB = ITEMS.register("mossy_claystone_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_CLAYSTONE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CLAYSTONE_COBBLESTONE_STAIRS = ITEMS.register("mossy_claystone_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_CLAYSTONE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CLAYSTONE_COBBLESTONE_WALL = ITEMS.register("mossy_claystone_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_CLAYSTONE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> CLAYSTONE_BUTTON = ITEMS.register("claystone_button", () -> new BlockItem(BlockList.CLAYSTONE_BUTTON.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> CLAYSTONE_PRESSURE_PLATE = ITEMS.register("claystone_pressure_plate", () -> new BlockItem(BlockList.CLAYSTONE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> CLAYSTONE_BRICKS = ITEMS.register("claystone_bricks", () -> new BlockItem(BlockList.CLAYSTONE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CLAYSTONE_BRICK_SLAB = ITEMS.register("claystone_brick_slab", () -> new BlockItem(BlockList.CLAYSTONE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CLAYSTONE_BRICK_STAIRS = ITEMS.register("claystone_brick_stairs", () -> new BlockItem(BlockList.CLAYSTONE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CLAYSTONE_BRICK_WALL = ITEMS.register("claystone_brick_wall", () -> new BlockItem(BlockList.CLAYSTONE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_CLAYSTONE_BRICKS = ITEMS.register("chiseled_claystone_bricks", () -> new BlockItem(BlockList.CHISELED_CLAYSTONE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_CLAYSTONE_BRICKS = ITEMS.register("cracked_claystone_bricks", () -> new BlockItem(BlockList.CRACKED_CLAYSTONE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CLAYSTONE_BRICKS = ITEMS.register("mossy_claystone_bricks", () -> new BlockItem(BlockList.MOSSY_CLAYSTONE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CLAYSTONE_BRICK_SLAB = ITEMS.register("mossy_claystone_brick_slab", () -> new BlockItem(BlockList.MOSSY_CLAYSTONE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CLAYSTONE_BRICK_STAIRS = ITEMS.register("mossy_claystone_brick_stairs", () -> new BlockItem(BlockList.MOSSY_CLAYSTONE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_CLAYSTONE_BRICK_WALL = ITEMS.register("mossy_claystone_brick_wall", () -> new BlockItem(BlockList.MOSSY_CLAYSTONE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_CLAYSTONE = ITEMS.register("polished_claystone", () -> new BlockItem(BlockList.POLISHED_CLAYSTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_CLAYSTONE_SLAB = ITEMS.register("polished_claystone_slab", () -> new BlockItem(BlockList.POLISHED_CLAYSTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_CLAYSTONE_STAIRS = ITEMS.register("polished_claystone_stairs", () -> new BlockItem(BlockList.POLISHED_CLAYSTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    /*-Dolomite-*/
    public static final RegistryObject<Item> DOLOMITE = ITEMS.register("dolomite", () -> new BlockItem(BlockList.DOLOMITE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> DOLOMITE_SLAB = ITEMS.register("dolomite_slab", () -> new BlockItem(BlockList.DOLOMITE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> DOLOMITE_STAIRS = ITEMS.register("dolomite_stairs", () -> new BlockItem(BlockList.DOLOMITE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> DOLOMITE_WALL = ITEMS.register("dolomite_wall", () -> new BlockItem(BlockList.DOLOMITE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> DOLOMITE_COBBLESTONE = ITEMS.register("dolomite_cobblestone", () -> new BlockItem(BlockList.DOLOMITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> DOLOMITE_COBBLESTONE_SLAB = ITEMS.register("dolomite_cobblestone_slab", () -> new BlockItem(BlockList.DOLOMITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> DOLOMITE_COBBLESTONE_STAIRS = ITEMS.register("dolomite_cobblestone_stairs", () -> new BlockItem(BlockList.DOLOMITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> DOLOMITE_COBBLESTONE_WALL = ITEMS.register("dolomite_cobblestone_wall", () -> new BlockItem(BlockList.DOLOMITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_DOLOMITE_COBBLESTONE = ITEMS.register("mossy_dolomite_cobblestone", () -> new BlockItem(BlockList.MOSSY_DOLOMITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_DOLOMITE_COBBLESTONE_SLAB = ITEMS.register("mossy_dolomite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_DOLOMITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_DOLOMITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_dolomite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_DOLOMITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_DOLOMITE_COBBLESTONE_WALL = ITEMS.register("mossy_dolomite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_DOLOMITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> DOLOMITE_BUTTON = ITEMS.register("dolomite_button", () -> new BlockItem(BlockList.DOLOMITE_BUTTON.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> DOLOMITE_PRESSURE_PLATE = ITEMS.register("dolomite_pressure_plate", () -> new BlockItem(BlockList.DOLOMITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> DOLOMITE_BRICKS = ITEMS.register("dolomite_bricks", () -> new BlockItem(BlockList.DOLOMITE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> DOLOMITE_BRICK_SLAB = ITEMS.register("dolomite_brick_slab", () -> new BlockItem(BlockList.DOLOMITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> DOLOMITE_BRICK_STAIRS = ITEMS.register("dolomite_brick_stairs", () -> new BlockItem(BlockList.DOLOMITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> DOLOMITE_BRICK_WALL = ITEMS.register("dolomite_brick_wall", () -> new BlockItem(BlockList.DOLOMITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_DOLOMITE_BRICKS = ITEMS.register("chiseled_dolomite_bricks", () -> new BlockItem(BlockList.CHISELED_DOLOMITE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_DOLOMITE_BRICKS = ITEMS.register("cracked_dolomite_bricks", () -> new BlockItem(BlockList.CRACKED_DOLOMITE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_DOLOMITE_BRICKS = ITEMS.register("mossy_dolomite_bricks", () -> new BlockItem(BlockList.MOSSY_DOLOMITE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_DOLOMITE_BRICK_SLAB = ITEMS.register("mossy_dolomite_brick_slab", () -> new BlockItem(BlockList.MOSSY_DOLOMITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_DOLOMITE_BRICK_STAIRS = ITEMS.register("mossy_dolomite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_DOLOMITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_DOLOMITE_BRICK_WALL = ITEMS.register("mossy_dolomite_brick_wall", () -> new BlockItem(BlockList.MOSSY_DOLOMITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_DOLOMITE = ITEMS.register("polished_dolomite", () -> new BlockItem(BlockList.POLISHED_DOLOMITE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_DOLOMITE_SLAB = ITEMS.register("polished_dolomite_slab", () -> new BlockItem(BlockList.POLISHED_DOLOMITE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_DOLOMITE_STAIRS = ITEMS.register("polished_dolomite_stairs", () -> new BlockItem(BlockList.POLISHED_DOLOMITE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    /*-Jaspillite-*/
    public static final RegistryObject<Item> JASPILLITE = ITEMS.register("jaspillite", () -> new BlockItem(BlockList.JASPILLITE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_SLAB = ITEMS.register("jaspillite_slab", () -> new BlockItem(BlockList.JASPILLITE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_STAIRS = ITEMS.register("jaspillite_stairs", () -> new BlockItem(BlockList.JASPILLITE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_WALL = ITEMS.register("jaspillite_wall", () -> new BlockItem(BlockList.JASPILLITE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> JASPILLITE_COBBLESTONE = ITEMS.register("jaspillite_cobblestone", () -> new BlockItem(BlockList.JASPILLITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_COBBLESTONE_SLAB = ITEMS.register("jaspillite_cobblestone_slab", () -> new BlockItem(BlockList.JASPILLITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_COBBLESTONE_STAIRS = ITEMS.register("jaspillite_cobblestone_stairs", () -> new BlockItem(BlockList.JASPILLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_COBBLESTONE_WALL = ITEMS.register("jaspillite_cobblestone_wall", () -> new BlockItem(BlockList.JASPILLITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_JASPILLITE_COBBLESTONE = ITEMS.register("mossy_jaspillite_cobblestone", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_COBBLESTONE_SLAB = ITEMS.register("mossy_jaspillite_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_COBBLESTONE_STAIRS = ITEMS.register("mossy_jaspillite_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_COBBLESTONE_WALL = ITEMS.register("mossy_jaspillite_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> JASPILLITE_BUTTON = ITEMS.register("jaspillite_button", () -> new BlockItem(BlockList.JASPILLITE_BUTTON.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> JASPILLITE_PRESSURE_PLATE = ITEMS.register("jaspillite_pressure_plate", () -> new BlockItem(BlockList.JASPILLITE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> JASPILLITE_BRICKS = ITEMS.register("jaspillite_bricks", () -> new BlockItem(BlockList.JASPILLITE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_BRICK_SLAB = ITEMS.register("jaspillite_brick_slab", () -> new BlockItem(BlockList.JASPILLITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_BRICK_STAIRS = ITEMS.register("jaspillite_brick_stairs", () -> new BlockItem(BlockList.JASPILLITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> JASPILLITE_BRICK_WALL = ITEMS.register("jaspillite_brick_wall", () -> new BlockItem(BlockList.JASPILLITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_JASPILLITE_BRICKS = ITEMS.register("chiseled_jaspillite_bricks", () -> new BlockItem(BlockList.CHISELED_JASPILLITE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_JASPILLITE_BRICKS = ITEMS.register("cracked_jaspillite_bricks", () -> new BlockItem(BlockList.CRACKED_JASPILLITE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_BRICKS = ITEMS.register("mossy_jaspillite_bricks", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_BRICK_SLAB = ITEMS.register("mossy_jaspillite_brick_slab", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_BRICK_STAIRS = ITEMS.register("mossy_jaspillite_brick_stairs", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_JASPILLITE_BRICK_WALL = ITEMS.register("mossy_jaspillite_brick_wall", () -> new BlockItem(BlockList.MOSSY_JASPILLITE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_JASPILLITE = ITEMS.register("polished_jaspillite", () -> new BlockItem(BlockList.POLISHED_JASPILLITE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_JASPILLITE_SLAB = ITEMS.register("polished_jaspillite_slab", () -> new BlockItem(BlockList.POLISHED_JASPILLITE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_JASPILLITE_STAIRS = ITEMS.register("polished_jaspillite_stairs", () -> new BlockItem(BlockList.POLISHED_JASPILLITE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    /*-Limestone-*/
    public static final RegistryObject<Item> LIMESTONE = ITEMS.register("limestone", () -> new BlockItem(BlockList.LIMESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_SLAB = ITEMS.register("limestone_slab", () -> new BlockItem(BlockList.LIMESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_STAIRS = ITEMS.register("limestone_stairs", () -> new BlockItem(BlockList.LIMESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_WALL = ITEMS.register("limestone_wall", () -> new BlockItem(BlockList.LIMESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> LIMESTONE_COBBLESTONE = ITEMS.register("limestone_cobblestone", () -> new BlockItem(BlockList.LIMESTONE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_COBBLESTONE_SLAB = ITEMS.register("limestone_cobblestone_slab", () -> new BlockItem(BlockList.LIMESTONE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_COBBLESTONE_STAIRS = ITEMS.register("limestone_cobblestone_stairs", () -> new BlockItem(BlockList.LIMESTONE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_COBBLESTONE_WALL = ITEMS.register("limestone_cobblestone_wall", () -> new BlockItem(BlockList.LIMESTONE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_LIMESTONE_COBBLESTONE = ITEMS.register("mossy_limestone_cobblestone", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_COBBLESTONE_SLAB = ITEMS.register("mossy_limestone_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_COBBLESTONE_STAIRS = ITEMS.register("mossy_limestone_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_COBBLESTONE_WALL = ITEMS.register("mossy_limestone_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));


    //Buttons
    public static final RegistryObject<Item> LIMESTONE_BUTTON = ITEMS.register("limestone_button", () -> new BlockItem(BlockList.LIMESTONE_BUTTON.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> LIMESTONE_PRESSURE_PLATE = ITEMS.register("limestone_pressure_plate", () -> new BlockItem(BlockList.LIMESTONE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> LIMESTONE_BRICKS = ITEMS.register("limestone_bricks", () -> new BlockItem(BlockList.LIMESTONE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_BRICK_SLAB = ITEMS.register("limestone_brick_slab", () -> new BlockItem(BlockList.LIMESTONE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_BRICK_STAIRS = ITEMS.register("limestone_brick_stairs", () -> new BlockItem(BlockList.LIMESTONE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> LIMESTONE_BRICK_WALL = ITEMS.register("limestone_brick_wall", () -> new BlockItem(BlockList.LIMESTONE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_LIMESTONE_BRICKS = ITEMS.register("chiseled_limestone_bricks", () -> new BlockItem(BlockList.CHISELED_LIMESTONE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_LIMESTONE_BRICKS = ITEMS.register("cracked_limestone_bricks", () -> new BlockItem(BlockList.CRACKED_LIMESTONE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_BRICKS = ITEMS.register("mossy_limestone_bricks", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_BRICK_SLAB = ITEMS.register("mossy_limestone_brick_slab", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_BRICK_STAIRS = ITEMS.register("mossy_limestone_brick_stairs", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_LIMESTONE_BRICK_WALL = ITEMS.register("mossy_limestone_brick_wall", () -> new BlockItem(BlockList.MOSSY_LIMESTONE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_LIMESTONE = ITEMS.register("polished_limestone", () -> new BlockItem(BlockList.POLISHED_LIMESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_LIMESTONE_SLAB = ITEMS.register("polished_limestone_slab", () -> new BlockItem(BlockList.POLISHED_LIMESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_LIMESTONE_STAIRS = ITEMS.register("polished_limestone_stairs", () -> new BlockItem(BlockList.POLISHED_LIMESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    /*-Mudstone-*/
    public static final RegistryObject<Item> MUDSTONE = ITEMS.register("mudstone", () -> new BlockItem(BlockList.MUDSTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MUDSTONE_SLAB = ITEMS.register("mudstone_slab", () -> new BlockItem(BlockList.MUDSTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MUDSTONE_STAIRS = ITEMS.register("mudstone_stairs", () -> new BlockItem(BlockList.MUDSTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MUDSTONE_WALL = ITEMS.register("mudstone_wall", () -> new BlockItem(BlockList.MUDSTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> MUDSTONE_COBBLESTONE = ITEMS.register("mudstone_cobblestone", () -> new BlockItem(BlockList.MUDSTONE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MUDSTONE_COBBLESTONE_SLAB = ITEMS.register("mudstone_cobblestone_slab", () -> new BlockItem(BlockList.MUDSTONE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MUDSTONE_COBBLESTONE_STAIRS = ITEMS.register("mudstone_cobblestone_stairs", () -> new BlockItem(BlockList.MUDSTONE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MUDSTONE_COBBLESTONE_WALL = ITEMS.register("mudstone_cobblestone_wall", () -> new BlockItem(BlockList.MUDSTONE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_MUDSTONE_COBBLESTONE = ITEMS.register("mossy_mudstone_cobblestone", () -> new BlockItem(BlockList.MOSSY_MUDSTONE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_MUDSTONE_COBBLESTONE_SLAB = ITEMS.register("mossy_mudstone_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_MUDSTONE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_MUDSTONE_COBBLESTONE_STAIRS = ITEMS.register("mossy_mudstone_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_MUDSTONE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_MUDSTONE_COBBLESTONE_WALL = ITEMS.register("mossy_mudstone_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_MUDSTONE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> MUDSTONE_BUTTON = ITEMS.register("mudstone_button", () -> new BlockItem(BlockList.MUDSTONE_BUTTON.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> MUDSTONE_PRESSURE_PLATE = ITEMS.register("mudstone_pressure_plate", () -> new BlockItem(BlockList.MUDSTONE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> MUDSTONE_BRICKS = ITEMS.register("mudstone_bricks", () -> new BlockItem(BlockList.MUDSTONE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MUDSTONE_BRICK_SLAB = ITEMS.register("mudstone_brick_slab", () -> new BlockItem(BlockList.MUDSTONE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MUDSTONE_BRICK_STAIRS = ITEMS.register("mudstone_brick_stairs", () -> new BlockItem(BlockList.MUDSTONE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MUDSTONE_BRICK_WALL = ITEMS.register("mudstone_brick_wall", () -> new BlockItem(BlockList.MUDSTONE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_MUDSTONE_BRICKS = ITEMS.register("chiseled_mudstone_bricks", () -> new BlockItem(BlockList.CHISELED_MUDSTONE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_MUDSTONE_BRICKS = ITEMS.register("cracked_mudstone_bricks", () -> new BlockItem(BlockList.CRACKED_MUDSTONE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_MUDSTONE_BRICKS = ITEMS.register("mossy_mudstone_bricks", () -> new BlockItem(BlockList.MOSSY_MUDSTONE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_MUDSTONE_BRICK_SLAB = ITEMS.register("mossy_mudstone_brick_slab", () -> new BlockItem(BlockList.MOSSY_MUDSTONE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_MUDSTONE_BRICK_STAIRS = ITEMS.register("mossy_mudstone_brick_stairs", () -> new BlockItem(BlockList.MOSSY_MUDSTONE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_MUDSTONE_BRICK_WALL = ITEMS.register("mossy_mudstone_brick_wall", () -> new BlockItem(BlockList.MOSSY_MUDSTONE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_MUDSTONE = ITEMS.register("polished_mudstone", () -> new BlockItem(BlockList.POLISHED_MUDSTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_MUDSTONE_SLAB = ITEMS.register("polished_mudstone_slab", () -> new BlockItem(BlockList.POLISHED_MUDSTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_MUDSTONE_STAIRS = ITEMS.register("polished_mudstone_stairs", () -> new BlockItem(BlockList.POLISHED_MUDSTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    /*-Shale-*/
    public static final RegistryObject<Item> SHALE = ITEMS.register("shale", () -> new BlockItem(BlockList.SHALE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_SLAB = ITEMS.register("shale_slab", () -> new BlockItem(BlockList.SHALE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_STAIRS = ITEMS.register("shale_stairs", () -> new BlockItem(BlockList.SHALE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_WALL = ITEMS.register("shale_wall", () -> new BlockItem(BlockList.SHALE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Cobblestone
    public static final RegistryObject<Item> SHALE_COBBLESTONE = ITEMS.register("shale_cobblestone", () -> new BlockItem(BlockList.SHALE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_COBBLESTONE_SLAB = ITEMS.register("shale_cobblestone_slab", () -> new BlockItem(BlockList.SHALE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_COBBLESTONE_STAIRS = ITEMS.register("shale_cobblestone_stairs", () -> new BlockItem(BlockList.SHALE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_COBBLESTONE_WALL = ITEMS.register("shale_cobblestone_wall", () -> new BlockItem(BlockList.SHALE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Mossy Cobblestone
    public static final RegistryObject<Item> MOSSY_SHALE_COBBLESTONE = ITEMS.register("mossy_shale_cobblestone", () -> new BlockItem(BlockList.MOSSY_SHALE_COBBLESTONE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_COBBLESTONE_SLAB = ITEMS.register("mossy_shale_cobblestone_slab", () -> new BlockItem(BlockList.MOSSY_SHALE_COBBLESTONE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_COBBLESTONE_STAIRS = ITEMS.register("mossy_shale_cobblestone_stairs", () -> new BlockItem(BlockList.MOSSY_SHALE_COBBLESTONE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_COBBLESTONE_WALL = ITEMS.register("mossy_shale_cobblestone_wall", () -> new BlockItem(BlockList.MOSSY_SHALE_COBBLESTONE_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Buttons
    public static final RegistryObject<Item> SHALE_BUTTON = ITEMS.register("shale_button", () -> new BlockItem(BlockList.SHALE_BUTTON.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Pressure Plates
    public static final RegistryObject<Item> SHALE_PRESSURE_PLATE = ITEMS.register("shale_pressure_plate", () -> new BlockItem(BlockList.SHALE_PRESSURE_PLATE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Bricks
    public static final RegistryObject<Item> SHALE_BRICKS = ITEMS.register("shale_bricks", () -> new BlockItem(BlockList.SHALE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_BRICK_SLAB = ITEMS.register("shale_brick_slab", () -> new BlockItem(BlockList.SHALE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_BRICK_STAIRS = ITEMS.register("shale_brick_stairs", () -> new BlockItem(BlockList.SHALE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> SHALE_BRICK_WALL = ITEMS.register("shale_brick_wall", () -> new BlockItem(BlockList.SHALE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CHISELED_SHALE_BRICKS = ITEMS.register("chiseled_shale_bricks", () -> new BlockItem(BlockList.CHISELED_SHALE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> CRACKED_SHALE_BRICKS = ITEMS.register("cracked_shale_bricks", () -> new BlockItem(BlockList.CRACKED_SHALE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_BRICKS = ITEMS.register("mossy_shale_bricks", () -> new BlockItem(BlockList.MOSSY_SHALE_BRICKS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_BRICK_SLAB = ITEMS.register("mossy_shale_brick_slab", () -> new BlockItem(BlockList.MOSSY_SHALE_BRICK_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_BRICK_STAIRS = ITEMS.register("mossy_shale_brick_stairs", () -> new BlockItem(BlockList.MOSSY_SHALE_BRICK_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> MOSSY_SHALE_BRICK_WALL = ITEMS.register("mossy_shale_brick_wall", () -> new BlockItem(BlockList.MOSSY_SHALE_BRICK_WALL.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));

    //Polished
    public static final RegistryObject<Item> POLISHED_SHALE = ITEMS.register("polished_shale", () -> new BlockItem(BlockList.POLISHED_SHALE.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_SHALE_SLAB = ITEMS.register("polished_shale_slab", () -> new BlockItem(BlockList.POLISHED_SHALE_SLAB.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
    public static final RegistryObject<Item> POLISHED_SHALE_STAIRS = ITEMS.register("polished_shale_stairs", () -> new BlockItem(BlockList.POLISHED_SHALE_STAIRS.get(), new Item.Properties().tab(Strata.SEDIMENTARY_TAB)));
}
