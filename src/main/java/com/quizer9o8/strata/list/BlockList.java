package com.quizer9o8.strata.list;

import com.quizer9o8.strata.Strata;
import com.quizer9o8.strata.objects.blocks.StrataButtonBlock;
import com.quizer9o8.strata.objects.blocks.StrataPressurePlateBlock;
import com.quizer9o8.strata.objects.blocks.StrataStairsBlock;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockList
{
        //Deferred Registries Method
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Strata.MOD_ID);

/*
        //Debug Blocks
        public static final RegistryObject<Block> DEBUG_BLOCK = BLOCKS.register("debug_block", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).hardnessAndResistance(0.0f, 0.0f).harvestLevel(0)));
        public static final RegistryObject<Block> DEBUG_SLAB = BLOCKS.register("debug_slab", () -> new SlabBlock(Block.Properties.copy(DEBUG_BLOCK.get())));
        public static final RegistryObject<Block> DEBUG_STAIRS = BLOCKS.register("debug_stairs", () -> new StrataStairsBlock(DEBUG_BLOCK.get().defaultBlockState(), Block.Properties.copy(DEBUG_BLOCK.get())));
        public static final RegistryObject<Block> DEBUG_WALL = BLOCKS.register("debug_wall", () -> new WallBlock(Block.Properties.copy(DEBUG_BLOCK.get())));
        //public static final RegistryObject<Block> DEBUG_ORE = BLOCKS.register("debug_ore", () -> new StrataOreBlock(Block.Properties.copy(Blocks.IRON_ORE)));
*/

        /*Igneous Rocks*/

        //Aa
        public static final RegistryObject<Block> AA = BLOCKS.register("aa", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> AA_SLAB = BLOCKS.register("aa_slab", () -> new SlabBlock(Block.Properties.copy(AA.get())));
        public static final RegistryObject<Block> AA_STAIRS = BLOCKS.register("aa_stairs", () -> new StrataStairsBlock(AA.get().defaultBlockState(), Block.Properties.copy(AA.get())));
        public static final RegistryObject<Block> AA_WALL = BLOCKS.register("aa_wall", () -> new WallBlock(Block.Properties.copy(AA.get())));

        //Cobblestone
        public static final RegistryObject<Block> AA_COBBLESTONE = BLOCKS.register("aa_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> AA_COBBLESTONE_SLAB = BLOCKS.register("aa_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(AA_COBBLESTONE.get())));
        public static final RegistryObject<Block> AA_COBBLESTONE_STAIRS = BLOCKS.register("aa_cobblestone_stairs", () -> new StrataStairsBlock(AA_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(AA_COBBLESTONE.get())));
        public static final RegistryObject<Block> AA_COBBLESTONE_WALL = BLOCKS.register("aa_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(AA_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_AA_COBBLESTONE = BLOCKS.register("mossy_aa_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_AA_COBBLESTONE_SLAB = BLOCKS.register("mossy_aa_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_AA_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_AA_COBBLESTONE_STAIRS = BLOCKS.register("mossy_aa_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_AA_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_AA_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_AA_COBBLESTONE_WALL = BLOCKS.register("mossy_aa_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_AA_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> AA_BUTTON = BLOCKS.register("aa_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> AA_PRESSURE_PLATE = BLOCKS.register("aa_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> AA_BRICKS = BLOCKS.register("aa_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> AA_BRICK_SLAB = BLOCKS.register("aa_brick_slab", () -> new SlabBlock(Block.Properties.copy(AA_BRICKS.get())));
        public static final RegistryObject<Block> AA_BRICK_STAIRS = BLOCKS.register("aa_brick_stairs", () -> new StrataStairsBlock(AA_BRICKS.get().defaultBlockState(), Block.Properties.copy(AA_BRICKS.get())));
        public static final RegistryObject<Block> AA_BRICK_WALL = BLOCKS.register("aa_brick_wall", () -> new WallBlock(Block.Properties.copy(AA_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_AA_BRICKS = BLOCKS.register("chiseled_aa_bricks", () -> new Block(Block.Properties.copy(AA_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_AA_BRICKS = BLOCKS.register("cracked_aa_bricks", () -> new Block(Block.Properties.copy(AA_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_AA_BRICKS = BLOCKS.register("mossy_aa_bricks", () -> new Block(Block.Properties.copy(AA_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_AA_BRICK_SLAB = BLOCKS.register("mossy_aa_brick_slab", () -> new SlabBlock(Block.Properties.copy(AA_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_AA_BRICK_STAIRS = BLOCKS.register("mossy_aa_brick_stairs", () -> new StrataStairsBlock(AA_BRICKS.get().defaultBlockState(), Block.Properties.copy(AA.get())));
        public static final RegistryObject<Block> MOSSY_AA_BRICK_WALL = BLOCKS.register("mossy_aa_brick_wall", () -> new WallBlock(Block.Properties.copy(AA_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_AA = BLOCKS.register("polished_aa", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_AA_SLAB = BLOCKS.register("polished_aa_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_AA.get())));
        public static final RegistryObject<Block> POLISHED_AA_STAIRS = BLOCKS.register("polished_aa_stairs", () -> new StrataStairsBlock(POLISHED_AA.get().defaultBlockState(), Block.Properties.copy(POLISHED_AA.get())));

        //Adakite
        public static final RegistryObject<Block> ADAKITE = BLOCKS.register("adakite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> ADAKITE_SLAB = BLOCKS.register("adakite_slab", () -> new SlabBlock(Block.Properties.copy(ADAKITE.get())));
        public static final RegistryObject<Block> ADAKITE_STAIRS = BLOCKS.register("adakite_stairs", () -> new StrataStairsBlock(ADAKITE.get().defaultBlockState(), Block.Properties.copy(ADAKITE.get())));
        public static final RegistryObject<Block> ADAKITE_WALL = BLOCKS.register("adakite_wall", () -> new WallBlock(Block.Properties.copy(ADAKITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> ADAKITE_COBBLESTONE = BLOCKS.register("adakite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> ADAKITE_COBBLESTONE_SLAB = BLOCKS.register("adakite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(ADAKITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ADAKITE_COBBLESTONE_STAIRS = BLOCKS.register("adakite_cobblestone_stairs", () -> new StrataStairsBlock(ADAKITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(ADAKITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ADAKITE_COBBLESTONE_WALL = BLOCKS.register("adakite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(ADAKITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_ADAKITE_COBBLESTONE = BLOCKS.register("mossy_adakite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_ADAKITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_adakite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_ADAKITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ADAKITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_adakite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_ADAKITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_ADAKITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ADAKITE_COBBLESTONE_WALL = BLOCKS.register("mossy_adakite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_ADAKITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> ADAKITE_BUTTON = BLOCKS.register("adakite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> ADAKITE_PRESSURE_PLATE = BLOCKS.register("adakite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> ADAKITE_BRICKS = BLOCKS.register("adakite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> ADAKITE_BRICK_SLAB = BLOCKS.register("adakite_brick_slab", () -> new SlabBlock(Block.Properties.copy(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> ADAKITE_BRICK_STAIRS = BLOCKS.register("adakite_brick_stairs", () -> new StrataStairsBlock(ADAKITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> ADAKITE_BRICK_WALL = BLOCKS.register("adakite_brick_wall", () -> new WallBlock(Block.Properties.copy(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_ADAKITE_BRICKS = BLOCKS.register("chiseled_adakite_bricks", () -> new Block(Block.Properties.copy(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_ADAKITE_BRICKS = BLOCKS.register("cracked_adakite_bricks", () -> new Block(Block.Properties.copy(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ADAKITE_BRICKS = BLOCKS.register("mossy_adakite_bricks", () -> new Block(Block.Properties.copy(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ADAKITE_BRICK_SLAB = BLOCKS.register("mossy_adakite_brick_slab", () -> new SlabBlock(Block.Properties.copy(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ADAKITE_BRICK_STAIRS = BLOCKS.register("mossy_adakite_brick_stairs", () -> new StrataStairsBlock(ADAKITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(ADAKITE.get())));
        public static final RegistryObject<Block> MOSSY_ADAKITE_BRICK_WALL = BLOCKS.register("mossy_adakite_brick_wall", () -> new WallBlock(Block.Properties.copy(ADAKITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_ADAKITE = BLOCKS.register("polished_adakite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_ADAKITE_SLAB = BLOCKS.register("polished_adakite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_ADAKITE.get())));
        public static final RegistryObject<Block> POLISHED_ADAKITE_STAIRS = BLOCKS.register("polished_adakite_stairs", () -> new StrataStairsBlock(POLISHED_ADAKITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_ADAKITE.get())));

        //Basalt
        //public static final RegistryObject<Block> BASALT = BLOCKS.register("basalt", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        //public static final RegistryObject<Block> BASALT_SLAB = BLOCKS.register("basalt_slab", () -> new SlabBlock(Block.Properties.copy(BASALT.get())));
        //public static final RegistryObject<Block> BASALT_STAIRS = BLOCKS.register("basalt_stairs", () -> new StrataStairsBlock(BASALT.get().defaultBlockState(), Block.Properties.copy(BASALT.get())));
        //public static final RegistryObject<Block> BASALT_WALL = BLOCKS.register("basalt_wall", () -> new WallBlock(Block.Properties.copy(BASALT.get())));

        //Cobblestone
        //public static final RegistryObject<Block> BASALT_COBBLESTONE = BLOCKS.register("basalt_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        //public static final RegistryObject<Block> BASALT_COBBLESTONE_SLAB = BLOCKS.register("basalt_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(BASALT_COBBLESTONE.get())));
        //public static final RegistryObject<Block> BASALT_COBBLESTONE_STAIRS = BLOCKS.register("basalt_cobblestone_stairs", () -> new StrataStairsBlock(BASALT_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(BASALT_COBBLESTONE.get())));
        //public static final RegistryObject<Block> BASALT_COBBLESTONE_WALL = BLOCKS.register("basalt_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(BASALT_COBBLESTONE.get())));

        //Mossy Cobblestone
        //public static final RegistryObject<Block> MOSSY_BASALT_COBBLESTONE = BLOCKS.register("mossy_basalt_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        //public static final RegistryObject<Block> MOSSY_BASALT_COBBLESTONE_SLAB = BLOCKS.register("mossy_basalt_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_BASALT_COBBLESTONE.get())));
        //public static final RegistryObject<Block> MOSSY_BASALT_COBBLESTONE_STAIRS = BLOCKS.register("mossy_basalt_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_BASALT_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_BASALT_COBBLESTONE.get())));
        //public static final RegistryObject<Block> MOSSY_BASALT_COBBLESTONE_WALL = BLOCKS.register("mossy_basalt_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_BASALT_COBBLESTONE.get())));
        
        //Buttons
        //public static final RegistryObject<Block> BASALT_BUTTON = BLOCKS.register("basalt_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));
        
        //Pressure Plates
        //public static final RegistryObject<Block> BASALT_PRESSURE_PLATE = BLOCKS.register("basalt_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));
        
        //Bricks
        //public static final RegistryObject<Block> BASALT_BRICKS = BLOCKS.register("basalt_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        //public static final RegistryObject<Block> BASALT_BRICK_SLAB = BLOCKS.register("basalt_brick_slab", () -> new SlabBlock(Block.Properties.copy(BASALT_BRICKS.get())));
        //public static final RegistryObject<Block> BASALT_BRICK_STAIRS = BLOCKS.register("basalt_brick_stairs", () -> new StrataStairsBlock(BASALT_BRICKS.get().defaultBlockState(), Block.Properties.copy(BASALT_BRICKS.get())));
        //public static final RegistryObject<Block> BASALT_BRICK_WALL = BLOCKS.register("basalt_brick_wall", () -> new WallBlock(Block.Properties.copy(BASALT_BRICKS.get())));
        //public static final RegistryObject<Block> CHISELED_BASALT_BRICKS = BLOCKS.register("chiseled_basalt_bricks", () -> new Block(Block.Properties.copy(BASALT_BRICKS.get())));
        //public static final RegistryObject<Block> CRACKED_BASALT_BRICKS = BLOCKS.register("cracked_basalt_bricks", () -> new Block(Block.Properties.copy(BASALT_BRICKS.get())));
        //public static final RegistryObject<Block> MOSSY_BASALT_BRICKS = BLOCKS.register("mossy_basalt_bricks", () -> new Block(Block.Properties.copy(BASALT_BRICKS.get())));
        //public static final RegistryObject<Block> MOSSY_BASALT_BRICK_SLAB = BLOCKS.register("mossy_basalt_brick_slab", () -> new SlabBlock(Block.Properties.copy(BASALT_BRICKS.get())));
        //public static final RegistryObject<Block> MOSSY_BASALT_BRICK_STAIRS = BLOCKS.register("mossy_basalt_brick_stairs", () -> new StrataStairsBlock(BASALT_BRICKS.get().defaultBlockState(), Block.Properties.copy(BASALT.get())));
        //public static final RegistryObject<Block> MOSSY_BASALT_BRICK_WALL = BLOCKS.register("mossy_basalt_brick_wall", () -> new WallBlock(Block.Properties.copy(BASALT_BRICKS.get())));

        //Polished
        //public static final RegistryObject<Block> POLISHED_BASALT = BLOCKS.register("polished_basalt", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        //public static final RegistryObject<Block> POLISHED_BASALT_SLAB = BLOCKS.register("polished_basalt_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_BASALT.get())));
        //public static final RegistryObject<Block> POLISHED_BASALT_STAIRS = BLOCKS.register("polished_basalt_stairs", () -> new StrataStairsBlock(POLISHED_BASALT.get().defaultBlockState(), Block.Properties.copy(POLISHED_BASALT.get())));

        //Dacite
        public static final RegistryObject<Block> DACITE = BLOCKS.register("dacite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> DACITE_SLAB = BLOCKS.register("dacite_slab", () -> new SlabBlock(Block.Properties.copy(DACITE.get())));
        public static final RegistryObject<Block> DACITE_STAIRS = BLOCKS.register("dacite_stairs", () -> new StrataStairsBlock(DACITE.get().defaultBlockState(), Block.Properties.copy(DACITE.get())));
        public static final RegistryObject<Block> DACITE_WALL = BLOCKS.register("dacite_wall", () -> new WallBlock(Block.Properties.copy(DACITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> DACITE_COBBLESTONE = BLOCKS.register("dacite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> DACITE_COBBLESTONE_SLAB = BLOCKS.register("dacite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(DACITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> DACITE_COBBLESTONE_STAIRS = BLOCKS.register("dacite_cobblestone_stairs", () -> new StrataStairsBlock(DACITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(DACITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> DACITE_COBBLESTONE_WALL = BLOCKS.register("dacite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(DACITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_DACITE_COBBLESTONE = BLOCKS.register("mossy_dacite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_DACITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_dacite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_DACITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_DACITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_dacite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_DACITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_DACITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_DACITE_COBBLESTONE_WALL = BLOCKS.register("mossy_dacite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_DACITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> DACITE_BUTTON = BLOCKS.register("dacite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> DACITE_PRESSURE_PLATE = BLOCKS.register("dacite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> DACITE_BRICKS = BLOCKS.register("dacite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> DACITE_BRICK_SLAB = BLOCKS.register("dacite_brick_slab", () -> new SlabBlock(Block.Properties.copy(DACITE_BRICKS.get())));
        public static final RegistryObject<Block> DACITE_BRICK_STAIRS = BLOCKS.register("dacite_brick_stairs", () -> new StrataStairsBlock(DACITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(DACITE_BRICKS.get())));
        public static final RegistryObject<Block> DACITE_BRICK_WALL = BLOCKS.register("dacite_brick_wall", () -> new WallBlock(Block.Properties.copy(DACITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_DACITE_BRICKS = BLOCKS.register("chiseled_dacite_bricks", () -> new Block(Block.Properties.copy(DACITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_DACITE_BRICKS = BLOCKS.register("cracked_dacite_bricks", () -> new Block(Block.Properties.copy(DACITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_DACITE_BRICKS = BLOCKS.register("mossy_dacite_bricks", () -> new Block(Block.Properties.copy(DACITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_DACITE_BRICK_SLAB = BLOCKS.register("mossy_dacite_brick_slab", () -> new SlabBlock(Block.Properties.copy(DACITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_DACITE_BRICK_STAIRS = BLOCKS.register("mossy_dacite_brick_stairs", () -> new StrataStairsBlock(DACITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(DACITE.get())));
        public static final RegistryObject<Block> MOSSY_DACITE_BRICK_WALL = BLOCKS.register("mossy_dacite_brick_wall", () -> new WallBlock(Block.Properties.copy(DACITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_DACITE = BLOCKS.register("polished_dacite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_DACITE_SLAB = BLOCKS.register("polished_dacite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_DACITE.get())));
        public static final RegistryObject<Block> POLISHED_DACITE_STAIRS = BLOCKS.register("polished_dacite_stairs", () -> new StrataStairsBlock(POLISHED_DACITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_DACITE.get())));

        //Dunite
        public static final RegistryObject<Block> DUNITE = BLOCKS.register("dunite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> DUNITE_SLAB = BLOCKS.register("dunite_slab", () -> new SlabBlock(Block.Properties.copy(DUNITE.get())));
        public static final RegistryObject<Block> DUNITE_STAIRS = BLOCKS.register("dunite_stairs", () -> new StrataStairsBlock(DUNITE.get().defaultBlockState(), Block.Properties.copy(DUNITE.get())));
        public static final RegistryObject<Block> DUNITE_WALL = BLOCKS.register("dunite_wall", () -> new WallBlock(Block.Properties.copy(DUNITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> DUNITE_COBBLESTONE = BLOCKS.register("dunite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> DUNITE_COBBLESTONE_SLAB = BLOCKS.register("dunite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(DUNITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> DUNITE_COBBLESTONE_STAIRS = BLOCKS.register("dunite_cobblestone_stairs", () -> new StrataStairsBlock(DUNITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(DUNITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> DUNITE_COBBLESTONE_WALL = BLOCKS.register("dunite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(DUNITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_DUNITE_COBBLESTONE = BLOCKS.register("mossy_dunite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_DUNITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_dunite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_DUNITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_DUNITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_dunite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_DUNITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_DUNITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_DUNITE_COBBLESTONE_WALL = BLOCKS.register("mossy_dunite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_DUNITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> DUNITE_BUTTON = BLOCKS.register("dunite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> DUNITE_PRESSURE_PLATE = BLOCKS.register("dunite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> DUNITE_BRICKS = BLOCKS.register("dunite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> DUNITE_BRICK_SLAB = BLOCKS.register("dunite_brick_slab", () -> new SlabBlock(Block.Properties.copy(DUNITE_BRICKS.get())));
        public static final RegistryObject<Block> DUNITE_BRICK_STAIRS = BLOCKS.register("dunite_brick_stairs", () -> new StrataStairsBlock(DUNITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(DUNITE_BRICKS.get())));
        public static final RegistryObject<Block> DUNITE_BRICK_WALL = BLOCKS.register("dunite_brick_wall", () -> new WallBlock(Block.Properties.copy(DUNITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_DUNITE_BRICKS = BLOCKS.register("chiseled_dunite_bricks", () -> new Block(Block.Properties.copy(DUNITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_DUNITE_BRICKS = BLOCKS.register("cracked_dunite_bricks", () -> new Block(Block.Properties.copy(DUNITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_DUNITE_BRICKS = BLOCKS.register("mossy_dunite_bricks", () -> new Block(Block.Properties.copy(DUNITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_DUNITE_BRICK_SLAB = BLOCKS.register("mossy_dunite_brick_slab", () -> new SlabBlock(Block.Properties.copy(DUNITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_DUNITE_BRICK_STAIRS = BLOCKS.register("mossy_dunite_brick_stairs", () -> new StrataStairsBlock(DUNITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(DUNITE.get())));
        public static final RegistryObject<Block> MOSSY_DUNITE_BRICK_WALL = BLOCKS.register("mossy_dunite_brick_wall", () -> new WallBlock(Block.Properties.copy(DUNITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_DUNITE = BLOCKS.register("polished_dunite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_DUNITE_SLAB = BLOCKS.register("polished_dunite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_DUNITE.get())));
        public static final RegistryObject<Block> POLISHED_DUNITE_STAIRS = BLOCKS.register("polished_dunite_stairs", () -> new StrataStairsBlock(POLISHED_DUNITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_DUNITE.get())));

        //Gabbro
        public static final RegistryObject<Block> GABBRO = BLOCKS.register("gabbro", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> GABBRO_SLAB = BLOCKS.register("gabbro_slab", () -> new SlabBlock(Block.Properties.copy(GABBRO.get())));
        public static final RegistryObject<Block> GABBRO_STAIRS = BLOCKS.register("gabbro_stairs", () -> new StrataStairsBlock(GABBRO.get().defaultBlockState(), Block.Properties.copy(GABBRO.get())));
        public static final RegistryObject<Block> GABBRO_WALL = BLOCKS.register("gabbro_wall", () -> new WallBlock(Block.Properties.copy(GABBRO.get())));

        //Cobblestone
        public static final RegistryObject<Block> GABBRO_COBBLESTONE = BLOCKS.register("gabbro_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> GABBRO_COBBLESTONE_SLAB = BLOCKS.register("gabbro_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(GABBRO_COBBLESTONE.get())));
        public static final RegistryObject<Block> GABBRO_COBBLESTONE_STAIRS = BLOCKS.register("gabbro_cobblestone_stairs", () -> new StrataStairsBlock(GABBRO_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(GABBRO_COBBLESTONE.get())));
        public static final RegistryObject<Block> GABBRO_COBBLESTONE_WALL = BLOCKS.register("gabbro_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(GABBRO_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_GABBRO_COBBLESTONE = BLOCKS.register("mossy_gabbro_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_GABBRO_COBBLESTONE_SLAB = BLOCKS.register("mossy_gabbro_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_GABBRO_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_GABBRO_COBBLESTONE_STAIRS = BLOCKS.register("mossy_gabbro_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_GABBRO_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_GABBRO_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_GABBRO_COBBLESTONE_WALL = BLOCKS.register("mossy_gabbro_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_GABBRO_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> GABBRO_BUTTON = BLOCKS.register("gabbro_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> GABBRO_PRESSURE_PLATE = BLOCKS.register("gabbro_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> GABBRO_BRICKS = BLOCKS.register("gabbro_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> GABBRO_BRICK_SLAB = BLOCKS.register("gabbro_brick_slab", () -> new SlabBlock(Block.Properties.copy(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> GABBRO_BRICK_STAIRS = BLOCKS.register("gabbro_brick_stairs", () -> new StrataStairsBlock(GABBRO_BRICKS.get().defaultBlockState(), Block.Properties.copy(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> GABBRO_BRICK_WALL = BLOCKS.register("gabbro_brick_wall", () -> new WallBlock(Block.Properties.copy(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_GABBRO_BRICKS = BLOCKS.register("chiseled_gabbro_bricks", () -> new Block(Block.Properties.copy(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_GABBRO_BRICKS = BLOCKS.register("cracked_gabbro_bricks", () -> new Block(Block.Properties.copy(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_GABBRO_BRICKS = BLOCKS.register("mossy_gabbro_bricks", () -> new Block(Block.Properties.copy(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_GABBRO_BRICK_SLAB = BLOCKS.register("mossy_gabbro_brick_slab", () -> new SlabBlock(Block.Properties.copy(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_GABBRO_BRICK_STAIRS = BLOCKS.register("mossy_gabbro_brick_stairs", () -> new StrataStairsBlock(GABBRO_BRICKS.get().defaultBlockState(), Block.Properties.copy(GABBRO.get())));
        public static final RegistryObject<Block> MOSSY_GABBRO_BRICK_WALL = BLOCKS.register("mossy_gabbro_brick_wall", () -> new WallBlock(Block.Properties.copy(GABBRO_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_GABBRO = BLOCKS.register("polished_gabbro", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_GABBRO_SLAB = BLOCKS.register("polished_gabbro_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_GABBRO.get())));
        public static final RegistryObject<Block> POLISHED_GABBRO_STAIRS = BLOCKS.register("polished_gabbro_stairs", () -> new StrataStairsBlock(POLISHED_GABBRO.get().defaultBlockState(), Block.Properties.copy(POLISHED_GABBRO.get())));

        //Komatiite
        public static final RegistryObject<Block> KOMATIITE = BLOCKS.register("komatiite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> KOMATIITE_SLAB = BLOCKS.register("komatiite_slab", () -> new SlabBlock(Block.Properties.copy(KOMATIITE.get())));
        public static final RegistryObject<Block> KOMATIITE_STAIRS = BLOCKS.register("komatiite_stairs", () -> new StrataStairsBlock(KOMATIITE.get().defaultBlockState(), Block.Properties.copy(KOMATIITE.get())));
        public static final RegistryObject<Block> KOMATIITE_WALL = BLOCKS.register("komatiite_wall", () -> new WallBlock(Block.Properties.copy(KOMATIITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> KOMATIITE_COBBLESTONE = BLOCKS.register("komatiite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> KOMATIITE_COBBLESTONE_SLAB = BLOCKS.register("komatiite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(KOMATIITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> KOMATIITE_COBBLESTONE_STAIRS = BLOCKS.register("komatiite_cobblestone_stairs", () -> new StrataStairsBlock(KOMATIITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(KOMATIITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> KOMATIITE_COBBLESTONE_WALL = BLOCKS.register("komatiite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(KOMATIITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_KOMATIITE_COBBLESTONE = BLOCKS.register("mossy_komatiite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_KOMATIITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_komatiite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_KOMATIITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_KOMATIITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_komatiite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_KOMATIITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_KOMATIITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_KOMATIITE_COBBLESTONE_WALL = BLOCKS.register("mossy_komatiite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_KOMATIITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> KOMATIITE_BUTTON = BLOCKS.register("komatiite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> KOMATIITE_PRESSURE_PLATE = BLOCKS.register("komatiite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> KOMATIITE_BRICKS = BLOCKS.register("komatiite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> KOMATIITE_BRICK_SLAB = BLOCKS.register("komatiite_brick_slab", () -> new SlabBlock(Block.Properties.copy(KOMATIITE_BRICKS.get())));
        public static final RegistryObject<Block> KOMATIITE_BRICK_STAIRS = BLOCKS.register("komatiite_brick_stairs", () -> new StrataStairsBlock(KOMATIITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(KOMATIITE_BRICKS.get())));
        public static final RegistryObject<Block> KOMATIITE_BRICK_WALL = BLOCKS.register("komatiite_brick_wall", () -> new WallBlock(Block.Properties.copy(KOMATIITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_KOMATIITE_BRICKS = BLOCKS.register("chiseled_komatiite_bricks", () -> new Block(Block.Properties.copy(KOMATIITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_KOMATIITE_BRICKS = BLOCKS.register("cracked_komatiite_bricks", () -> new Block(Block.Properties.copy(KOMATIITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_KOMATIITE_BRICKS = BLOCKS.register("mossy_komatiite_bricks", () -> new Block(Block.Properties.copy(KOMATIITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_KOMATIITE_BRICK_SLAB = BLOCKS.register("mossy_komatiite_brick_slab", () -> new SlabBlock(Block.Properties.copy(KOMATIITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_KOMATIITE_BRICK_STAIRS = BLOCKS.register("mossy_komatiite_brick_stairs", () -> new StrataStairsBlock(KOMATIITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(KOMATIITE.get())));
        public static final RegistryObject<Block> MOSSY_KOMATIITE_BRICK_WALL = BLOCKS.register("mossy_komatiite_brick_wall", () -> new WallBlock(Block.Properties.copy(KOMATIITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_KOMATIITE = BLOCKS.register("polished_komatiite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_KOMATIITE_SLAB = BLOCKS.register("polished_komatiite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_KOMATIITE.get())));
        public static final RegistryObject<Block> POLISHED_KOMATIITE_STAIRS = BLOCKS.register("polished_komatiite_stairs", () -> new StrataStairsBlock(POLISHED_KOMATIITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_KOMATIITE.get())));

        //Pahoehoe
        public static final RegistryObject<Block> PAHOEHOE = BLOCKS.register("pahoehoe", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> PAHOEHOE_SLAB = BLOCKS.register("pahoehoe_slab", () -> new SlabBlock(Block.Properties.copy(PAHOEHOE.get())));
        public static final RegistryObject<Block> PAHOEHOE_STAIRS = BLOCKS.register("pahoehoe_stairs", () -> new StrataStairsBlock(PAHOEHOE.get().defaultBlockState(), Block.Properties.copy(PAHOEHOE.get())));
        public static final RegistryObject<Block> PAHOEHOE_WALL = BLOCKS.register("pahoehoe_wall", () -> new WallBlock(Block.Properties.copy(PAHOEHOE.get())));

        //Cobblestone
        public static final RegistryObject<Block> PAHOEHOE_COBBLESTONE = BLOCKS.register("pahoehoe_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> PAHOEHOE_COBBLESTONE_SLAB = BLOCKS.register("pahoehoe_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(PAHOEHOE_COBBLESTONE.get())));
        public static final RegistryObject<Block> PAHOEHOE_COBBLESTONE_STAIRS = BLOCKS.register("pahoehoe_cobblestone_stairs", () -> new StrataStairsBlock(PAHOEHOE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(PAHOEHOE_COBBLESTONE.get())));
        public static final RegistryObject<Block> PAHOEHOE_COBBLESTONE_WALL = BLOCKS.register("pahoehoe_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(PAHOEHOE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_COBBLESTONE = BLOCKS.register("mossy_pahoehoe_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_COBBLESTONE_SLAB = BLOCKS.register("mossy_pahoehoe_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_PAHOEHOE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_pahoehoe_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_PAHOEHOE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_PAHOEHOE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_COBBLESTONE_WALL = BLOCKS.register("mossy_pahoehoe_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_PAHOEHOE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> PAHOEHOE_BUTTON = BLOCKS.register("pahoehoe_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> PAHOEHOE_PRESSURE_PLATE = BLOCKS.register("pahoehoe_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> PAHOEHOE_BRICKS = BLOCKS.register("pahoehoe_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> PAHOEHOE_BRICK_SLAB = BLOCKS.register("pahoehoe_brick_slab", () -> new SlabBlock(Block.Properties.copy(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> PAHOEHOE_BRICK_STAIRS = BLOCKS.register("pahoehoe_brick_stairs", () -> new StrataStairsBlock(PAHOEHOE_BRICKS.get().defaultBlockState(), Block.Properties.copy(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> PAHOEHOE_BRICK_WALL = BLOCKS.register("pahoehoe_brick_wall", () -> new WallBlock(Block.Properties.copy(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_PAHOEHOE_BRICKS = BLOCKS.register("chiseled_pahoehoe_bricks", () -> new Block(Block.Properties.copy(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_PAHOEHOE_BRICKS = BLOCKS.register("cracked_pahoehoe_bricks", () -> new Block(Block.Properties.copy(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_BRICKS = BLOCKS.register("mossy_pahoehoe_bricks", () -> new Block(Block.Properties.copy(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_BRICK_SLAB = BLOCKS.register("mossy_pahoehoe_brick_slab", () -> new SlabBlock(Block.Properties.copy(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_BRICK_STAIRS = BLOCKS.register("mossy_pahoehoe_brick_stairs", () -> new StrataStairsBlock(PAHOEHOE_BRICKS.get().defaultBlockState(), Block.Properties.copy(PAHOEHOE.get())));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_BRICK_WALL = BLOCKS.register("mossy_pahoehoe_brick_wall", () -> new WallBlock(Block.Properties.copy(PAHOEHOE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_PAHOEHOE = BLOCKS.register("polished_pahoehoe", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_PAHOEHOE_SLAB = BLOCKS.register("polished_pahoehoe_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_PAHOEHOE.get())));
        public static final RegistryObject<Block> POLISHED_PAHOEHOE_STAIRS = BLOCKS.register("polished_pahoehoe_stairs", () -> new StrataStairsBlock(POLISHED_PAHOEHOE.get().defaultBlockState(), Block.Properties.copy(POLISHED_PAHOEHOE.get())));

        //Pegmatiite
        public static final RegistryObject<Block> PEGMATITE = BLOCKS.register("pegmatite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> PEGMATITE_SLAB = BLOCKS.register("pegmatite_slab", () -> new SlabBlock(Block.Properties.copy(PEGMATITE.get())));
        public static final RegistryObject<Block> PEGMATITE_STAIRS = BLOCKS.register("pegmatite_stairs", () -> new StrataStairsBlock(PEGMATITE.get().defaultBlockState(), Block.Properties.copy(PEGMATITE.get())));
        public static final RegistryObject<Block> PEGMATITE_WALL = BLOCKS.register("pegmatite_wall", () -> new WallBlock(Block.Properties.copy(PEGMATITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> PEGMATITE_COBBLESTONE = BLOCKS.register("pegmatite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> PEGMATITE_COBBLESTONE_SLAB = BLOCKS.register("pegmatite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(PEGMATITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> PEGMATITE_COBBLESTONE_STAIRS = BLOCKS.register("pegmatite_cobblestone_stairs", () -> new StrataStairsBlock(PEGMATITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(PEGMATITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> PEGMATITE_COBBLESTONE_WALL = BLOCKS.register("pegmatite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(PEGMATITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_PEGMATITE_COBBLESTONE = BLOCKS.register("mossy_pegmatite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_PEGMATITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_pegmatite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_PEGMATITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_PEGMATITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_pegmatite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_PEGMATITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_PEGMATITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_PEGMATITE_COBBLESTONE_WALL = BLOCKS.register("mossy_pegmatite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_PEGMATITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> PEGMATITE_BUTTON = BLOCKS.register("pegmatite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> PEGMATITE_PRESSURE_PLATE = BLOCKS.register("pegmatite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> PEGMATITE_BRICKS = BLOCKS.register("pegmatite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> PEGMATITE_BRICK_SLAB = BLOCKS.register("pegmatite_brick_slab", () -> new SlabBlock(Block.Properties.copy(PEGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> PEGMATITE_BRICK_STAIRS = BLOCKS.register("pegmatite_brick_stairs", () -> new StrataStairsBlock(PEGMATITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(PEGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> PEGMATITE_BRICK_WALL = BLOCKS.register("pegmatite_brick_wall", () -> new WallBlock(Block.Properties.copy(PEGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_PEGMATITE_BRICKS = BLOCKS.register("chiseled_pegmatite_bricks", () -> new Block(Block.Properties.copy(PEGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_PEGMATITE_BRICKS = BLOCKS.register("cracked_pegmatite_bricks", () -> new Block(Block.Properties.copy(PEGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PEGMATITE_BRICKS = BLOCKS.register("mossy_pegmatite_bricks", () -> new Block(Block.Properties.copy(PEGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PEGMATITE_BRICK_SLAB = BLOCKS.register("mossy_pegmatite_brick_slab", () -> new SlabBlock(Block.Properties.copy(PEGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PEGMATITE_BRICK_STAIRS = BLOCKS.register("mossy_pegmatite_brick_stairs", () -> new StrataStairsBlock(PEGMATITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(PEGMATITE.get())));
        public static final RegistryObject<Block> MOSSY_PEGMATITE_BRICK_WALL = BLOCKS.register("mossy_pegmatite_brick_wall", () -> new WallBlock(Block.Properties.copy(PEGMATITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_PEGMATITE = BLOCKS.register("polished_pegmatite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_PEGMATITE_SLAB = BLOCKS.register("polished_pegmatite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_PEGMATITE.get())));
        public static final RegistryObject<Block> POLISHED_PEGMATITE_STAIRS = BLOCKS.register("polished_pegmatite_stairs", () -> new StrataStairsBlock(POLISHED_PEGMATITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_PEGMATITE.get())));

        //Phonolite
        public static final RegistryObject<Block> PHONOLITE = BLOCKS.register("phonolite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> PHONOLITE_SLAB = BLOCKS.register("phonolite_slab", () -> new SlabBlock(Block.Properties.copy(PHONOLITE.get())));
        public static final RegistryObject<Block> PHONOLITE_STAIRS = BLOCKS.register("phonolite_stairs", () -> new StrataStairsBlock(PHONOLITE.get().defaultBlockState(), Block.Properties.copy(PHONOLITE.get())));
        public static final RegistryObject<Block> PHONOLITE_WALL = BLOCKS.register("phonolite_wall", () -> new WallBlock(Block.Properties.copy(PHONOLITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> PHONOLITE_COBBLESTONE = BLOCKS.register("phonolite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> PHONOLITE_COBBLESTONE_SLAB = BLOCKS.register("phonolite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(PHONOLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> PHONOLITE_COBBLESTONE_STAIRS = BLOCKS.register("phonolite_cobblestone_stairs", () -> new StrataStairsBlock(PHONOLITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(PHONOLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> PHONOLITE_COBBLESTONE_WALL = BLOCKS.register("phonolite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(PHONOLITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_PHONOLITE_COBBLESTONE = BLOCKS.register("mossy_phonolite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_PHONOLITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_phonolite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_PHONOLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_PHONOLITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_phonolite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_PHONOLITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_PHONOLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_PHONOLITE_COBBLESTONE_WALL = BLOCKS.register("mossy_phonolite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_PHONOLITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> PHONOLITE_BUTTON = BLOCKS.register("phonolite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> PHONOLITE_PRESSURE_PLATE = BLOCKS.register("phonolite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> PHONOLITE_BRICKS = BLOCKS.register("phonolite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> PHONOLITE_BRICK_SLAB = BLOCKS.register("phonolite_brick_slab", () -> new SlabBlock(Block.Properties.copy(PHONOLITE_BRICKS.get())));
        public static final RegistryObject<Block> PHONOLITE_BRICK_STAIRS = BLOCKS.register("phonolite_brick_stairs", () -> new StrataStairsBlock(PHONOLITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(PHONOLITE_BRICKS.get())));
        public static final RegistryObject<Block> PHONOLITE_BRICK_WALL = BLOCKS.register("phonolite_brick_wall", () -> new WallBlock(Block.Properties.copy(PHONOLITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_PHONOLITE_BRICKS = BLOCKS.register("chiseled_phonolite_bricks", () -> new Block(Block.Properties.copy(PHONOLITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_PHONOLITE_BRICKS = BLOCKS.register("cracked_phonolite_bricks", () -> new Block(Block.Properties.copy(PHONOLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PHONOLITE_BRICKS = BLOCKS.register("mossy_phonolite_bricks", () -> new Block(Block.Properties.copy(PHONOLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PHONOLITE_BRICK_SLAB = BLOCKS.register("mossy_phonolite_brick_slab", () -> new SlabBlock(Block.Properties.copy(PHONOLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PHONOLITE_BRICK_STAIRS = BLOCKS.register("mossy_phonolite_brick_stairs", () -> new StrataStairsBlock(PHONOLITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(PHONOLITE.get())));
        public static final RegistryObject<Block> MOSSY_PHONOLITE_BRICK_WALL = BLOCKS.register("mossy_phonolite_brick_wall", () -> new WallBlock(Block.Properties.copy(PHONOLITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_PHONOLITE = BLOCKS.register("polished_phonolite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_PHONOLITE_SLAB = BLOCKS.register("polished_phonolite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_PHONOLITE.get())));
        public static final RegistryObject<Block> POLISHED_PHONOLITE_STAIRS = BLOCKS.register("polished_phonolite_stairs", () -> new StrataStairsBlock(POLISHED_PHONOLITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_PHONOLITE.get())));

        /*Metamorphic Rocks*/

        //Amphibolite
        public static final RegistryObject<Block> AMPHIBOLITE = BLOCKS.register("amphibolite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> AMPHIBOLITE_SLAB = BLOCKS.register("amphibolite_slab", () -> new SlabBlock(Block.Properties.copy(AMPHIBOLITE.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_STAIRS = BLOCKS.register("amphibolite_stairs", () -> new StrataStairsBlock(AMPHIBOLITE.get().defaultBlockState(), Block.Properties.copy(AMPHIBOLITE.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_WALL = BLOCKS.register("amphibolite_wall", () -> new WallBlock(Block.Properties.copy(AMPHIBOLITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> AMPHIBOLITE_COBBLESTONE = BLOCKS.register("amphibolite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> AMPHIBOLITE_COBBLESTONE_SLAB = BLOCKS.register("amphibolite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(AMPHIBOLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_COBBLESTONE_STAIRS = BLOCKS.register("amphibolite_cobblestone_stairs", () -> new StrataStairsBlock(AMPHIBOLITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(AMPHIBOLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_COBBLESTONE_WALL = BLOCKS.register("amphibolite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(AMPHIBOLITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_COBBLESTONE = BLOCKS.register("mossy_amphibolite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_amphibolite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_AMPHIBOLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_amphibolite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_AMPHIBOLITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_AMPHIBOLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_COBBLESTONE_WALL = BLOCKS.register("mossy_amphibolite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_AMPHIBOLITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> AMPHIBOLITE_BUTTON = BLOCKS.register("amphibolite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> AMPHIBOLITE_PRESSURE_PLATE = BLOCKS.register("amphibolite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> AMPHIBOLITE_BRICKS = BLOCKS.register("amphibolite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> AMPHIBOLITE_BRICK_SLAB = BLOCKS.register("amphibolite_brick_slab", () -> new SlabBlock(Block.Properties.copy(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_BRICK_STAIRS = BLOCKS.register("amphibolite_brick_stairs", () -> new StrataStairsBlock(AMPHIBOLITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_BRICK_WALL = BLOCKS.register("amphibolite_brick_wall", () -> new WallBlock(Block.Properties.copy(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_AMPHIBOLITE_BRICKS = BLOCKS.register("chiseled_amphibolite_bricks", () -> new Block(Block.Properties.copy(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_AMPHIBOLITE_BRICKS = BLOCKS.register("cracked_amphibolite_bricks", () -> new Block(Block.Properties.copy(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_BRICKS = BLOCKS.register("mossy_amphibolite_bricks", () -> new Block(Block.Properties.copy(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_BRICK_SLAB = BLOCKS.register("mossy_amphibolite_brick_slab", () -> new SlabBlock(Block.Properties.copy(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_BRICK_STAIRS = BLOCKS.register("mossy_amphibolite_brick_stairs", () -> new StrataStairsBlock(AMPHIBOLITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(AMPHIBOLITE.get())));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_BRICK_WALL = BLOCKS.register("mossy_amphibolite_brick_wall", () -> new WallBlock(Block.Properties.copy(AMPHIBOLITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_AMPHIBOLITE = BLOCKS.register("polished_amphibolite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_AMPHIBOLITE_SLAB = BLOCKS.register("polished_amphibolite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_AMPHIBOLITE.get())));
        public static final RegistryObject<Block> POLISHED_AMPHIBOLITE_STAIRS = BLOCKS.register("polished_amphibolite_stairs", () -> new StrataStairsBlock(POLISHED_AMPHIBOLITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_AMPHIBOLITE.get())));

        //Cataclasite
        public static final RegistryObject<Block> CATACLASITE = BLOCKS.register("cataclasite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> CATACLASITE_SLAB = BLOCKS.register("cataclasite_slab", () -> new SlabBlock(Block.Properties.copy(CATACLASITE.get())));
        public static final RegistryObject<Block> CATACLASITE_STAIRS = BLOCKS.register("cataclasite_stairs", () -> new StrataStairsBlock(CATACLASITE.get().defaultBlockState(), Block.Properties.copy(CATACLASITE.get())));
        public static final RegistryObject<Block> CATACLASITE_WALL = BLOCKS.register("cataclasite_wall", () -> new WallBlock(Block.Properties.copy(CATACLASITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> CATACLASITE_COBBLESTONE = BLOCKS.register("cataclasite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> CATACLASITE_COBBLESTONE_SLAB = BLOCKS.register("cataclasite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(CATACLASITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> CATACLASITE_COBBLESTONE_STAIRS = BLOCKS.register("cataclasite_cobblestone_stairs", () -> new StrataStairsBlock(CATACLASITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(CATACLASITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> CATACLASITE_COBBLESTONE_WALL = BLOCKS.register("cataclasite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(CATACLASITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_CATACLASITE_COBBLESTONE = BLOCKS.register("mossy_cataclasite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_CATACLASITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_cataclasite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_CATACLASITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_CATACLASITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_cataclasite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_CATACLASITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_CATACLASITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_CATACLASITE_COBBLESTONE_WALL = BLOCKS.register("mossy_cataclasite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_CATACLASITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> CATACLASITE_BUTTON = BLOCKS.register("cataclasite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> CATACLASITE_PRESSURE_PLATE = BLOCKS.register("cataclasite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> CATACLASITE_BRICKS = BLOCKS.register("cataclasite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> CATACLASITE_BRICK_SLAB = BLOCKS.register("cataclasite_brick_slab", () -> new SlabBlock(Block.Properties.copy(CATACLASITE_BRICKS.get())));
        public static final RegistryObject<Block> CATACLASITE_BRICK_STAIRS = BLOCKS.register("cataclasite_brick_stairs", () -> new StrataStairsBlock(CATACLASITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(CATACLASITE_BRICKS.get())));
        public static final RegistryObject<Block> CATACLASITE_BRICK_WALL = BLOCKS.register("cataclasite_brick_wall", () -> new WallBlock(Block.Properties.copy(CATACLASITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_CATACLASITE_BRICKS = BLOCKS.register("chiseled_cataclasite_bricks", () -> new Block(Block.Properties.copy(CATACLASITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_CATACLASITE_BRICKS = BLOCKS.register("cracked_cataclasite_bricks", () -> new Block(Block.Properties.copy(CATACLASITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_CATACLASITE_BRICKS = BLOCKS.register("mossy_cataclasite_bricks", () -> new Block(Block.Properties.copy(CATACLASITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_CATACLASITE_BRICK_SLAB = BLOCKS.register("mossy_cataclasite_brick_slab", () -> new SlabBlock(Block.Properties.copy(CATACLASITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_CATACLASITE_BRICK_STAIRS = BLOCKS.register("mossy_cataclasite_brick_stairs", () -> new StrataStairsBlock(CATACLASITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(CATACLASITE.get())));
        public static final RegistryObject<Block> MOSSY_CATACLASITE_BRICK_WALL = BLOCKS.register("mossy_cataclasite_brick_wall", () -> new WallBlock(Block.Properties.copy(CATACLASITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_CATACLASITE = BLOCKS.register("polished_cataclasite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_CATACLASITE_SLAB = BLOCKS.register("polished_cataclasite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_CATACLASITE.get())));
        public static final RegistryObject<Block> POLISHED_CATACLASITE_STAIRS = BLOCKS.register("polished_cataclasite_stairs", () -> new StrataStairsBlock(POLISHED_CATACLASITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_CATACLASITE.get())));

        //Eclogite
        public static final RegistryObject<Block> ECLOGITE = BLOCKS.register("eclogite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> ECLOGITE_SLAB = BLOCKS.register("eclogite_slab", () -> new SlabBlock(Block.Properties.copy(ECLOGITE.get())));
        public static final RegistryObject<Block> ECLOGITE_STAIRS = BLOCKS.register("eclogite_stairs", () -> new StrataStairsBlock(ECLOGITE.get().defaultBlockState(), Block.Properties.copy(ECLOGITE.get())));
        public static final RegistryObject<Block> ECLOGITE_WALL = BLOCKS.register("eclogite_wall", () -> new WallBlock(Block.Properties.copy(ECLOGITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> ECLOGITE_COBBLESTONE = BLOCKS.register("eclogite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> ECLOGITE_COBBLESTONE_SLAB = BLOCKS.register("eclogite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(ECLOGITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ECLOGITE_COBBLESTONE_STAIRS = BLOCKS.register("eclogite_cobblestone_stairs", () -> new StrataStairsBlock(ECLOGITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(ECLOGITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ECLOGITE_COBBLESTONE_WALL = BLOCKS.register("eclogite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(ECLOGITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_ECLOGITE_COBBLESTONE = BLOCKS.register("mossy_eclogite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_eclogite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_ECLOGITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_eclogite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_ECLOGITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_ECLOGITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_COBBLESTONE_WALL = BLOCKS.register("mossy_eclogite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_ECLOGITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> ECLOGITE_BUTTON = BLOCKS.register("eclogite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> ECLOGITE_PRESSURE_PLATE = BLOCKS.register("eclogite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> ECLOGITE_BRICKS = BLOCKS.register("eclogite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> ECLOGITE_BRICK_SLAB = BLOCKS.register("eclogite_brick_slab", () -> new SlabBlock(Block.Properties.copy(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> ECLOGITE_BRICK_STAIRS = BLOCKS.register("eclogite_brick_stairs", () -> new StrataStairsBlock(ECLOGITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> ECLOGITE_BRICK_WALL = BLOCKS.register("eclogite_brick_wall", () -> new WallBlock(Block.Properties.copy(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_ECLOGITE_BRICKS = BLOCKS.register("chiseled_eclogite_bricks", () -> new Block(Block.Properties.copy(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_ECLOGITE_BRICKS = BLOCKS.register("cracked_eclogite_bricks", () -> new Block(Block.Properties.copy(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_BRICKS = BLOCKS.register("mossy_eclogite_bricks", () -> new Block(Block.Properties.copy(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_BRICK_SLAB = BLOCKS.register("mossy_eclogite_brick_slab", () -> new SlabBlock(Block.Properties.copy(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_BRICK_STAIRS = BLOCKS.register("mossy_eclogite_brick_stairs", () -> new StrataStairsBlock(ECLOGITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(ECLOGITE.get())));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_BRICK_WALL = BLOCKS.register("mossy_eclogite_brick_wall", () -> new WallBlock(Block.Properties.copy(ECLOGITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_ECLOGITE = BLOCKS.register("polished_eclogite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_ECLOGITE_SLAB = BLOCKS.register("polished_eclogite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_ECLOGITE.get())));
        public static final RegistryObject<Block> POLISHED_ECLOGITE_STAIRS = BLOCKS.register("polished_eclogite_stairs", () -> new StrataStairsBlock(POLISHED_ECLOGITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_ECLOGITE.get())));

        //Gneiss
        public static final RegistryObject<Block> GNEISS = BLOCKS.register("gneiss", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> GNEISS_SLAB = BLOCKS.register("gneiss_slab", () -> new SlabBlock(Block.Properties.copy(GNEISS.get())));
        public static final RegistryObject<Block> GNEISS_STAIRS = BLOCKS.register("gneiss_stairs", () -> new StrataStairsBlock(GNEISS.get().defaultBlockState(), Block.Properties.copy(GNEISS.get())));
        public static final RegistryObject<Block> GNEISS_WALL = BLOCKS.register("gneiss_wall", () -> new WallBlock(Block.Properties.copy(GNEISS.get())));

        //Cobblestone
        public static final RegistryObject<Block> GNEISS_COBBLESTONE = BLOCKS.register("gneiss_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> GNEISS_COBBLESTONE_SLAB = BLOCKS.register("gneiss_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(GNEISS_COBBLESTONE.get())));
        public static final RegistryObject<Block> GNEISS_COBBLESTONE_STAIRS = BLOCKS.register("gneiss_cobblestone_stairs", () -> new StrataStairsBlock(GNEISS_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(GNEISS_COBBLESTONE.get())));
        public static final RegistryObject<Block> GNEISS_COBBLESTONE_WALL = BLOCKS.register("gneiss_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(GNEISS_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_GNEISS_COBBLESTONE = BLOCKS.register("mossy_gneiss_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_GNEISS_COBBLESTONE_SLAB = BLOCKS.register("mossy_gneiss_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_GNEISS_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_GNEISS_COBBLESTONE_STAIRS = BLOCKS.register("mossy_gneiss_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_GNEISS_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_GNEISS_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_GNEISS_COBBLESTONE_WALL = BLOCKS.register("mossy_gneiss_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_GNEISS_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> GNEISS_BUTTON = BLOCKS.register("gneiss_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> GNEISS_PRESSURE_PLATE = BLOCKS.register("gneiss_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> GNEISS_BRICKS = BLOCKS.register("gneiss_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> GNEISS_BRICK_SLAB = BLOCKS.register("gneiss_brick_slab", () -> new SlabBlock(Block.Properties.copy(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> GNEISS_BRICK_STAIRS = BLOCKS.register("gneiss_brick_stairs", () -> new StrataStairsBlock(GNEISS_BRICKS.get().defaultBlockState(), Block.Properties.copy(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> GNEISS_BRICK_WALL = BLOCKS.register("gneiss_brick_wall", () -> new WallBlock(Block.Properties.copy(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_GNEISS_BRICKS = BLOCKS.register("chiseled_gneiss_bricks", () -> new Block(Block.Properties.copy(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_GNEISS_BRICKS = BLOCKS.register("cracked_gneiss_bricks", () -> new Block(Block.Properties.copy(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_GNEISS_BRICKS = BLOCKS.register("mossy_gneiss_bricks", () -> new Block(Block.Properties.copy(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_GNEISS_BRICK_SLAB = BLOCKS.register("mossy_gneiss_brick_slab", () -> new SlabBlock(Block.Properties.copy(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_GNEISS_BRICK_STAIRS = BLOCKS.register("mossy_gneiss_brick_stairs", () -> new StrataStairsBlock(GNEISS_BRICKS.get().defaultBlockState(), Block.Properties.copy(GNEISS.get())));
        public static final RegistryObject<Block> MOSSY_GNEISS_BRICK_WALL = BLOCKS.register("mossy_gneiss_brick_wall", () -> new WallBlock(Block.Properties.copy(GNEISS_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_GNEISS = BLOCKS.register("polished_gneiss", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_GNEISS_SLAB = BLOCKS.register("polished_gneiss_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_GNEISS.get())));
        public static final RegistryObject<Block> POLISHED_GNEISS_STAIRS = BLOCKS.register("polished_gneiss_stairs", () -> new StrataStairsBlock(POLISHED_GNEISS.get().defaultBlockState(), Block.Properties.copy(POLISHED_GNEISS.get())));

        //Marble
        public static final RegistryObject<Block> MARBLE = BLOCKS.register("marble", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MARBLE_SLAB = BLOCKS.register("marble_slab", () -> new SlabBlock(Block.Properties.copy(MARBLE.get())));
        public static final RegistryObject<Block> MARBLE_STAIRS = BLOCKS.register("marble_stairs", () -> new StrataStairsBlock(MARBLE.get().defaultBlockState(), Block.Properties.copy(MARBLE.get())));
        public static final RegistryObject<Block> MARBLE_WALL = BLOCKS.register("marble_wall", () -> new WallBlock(Block.Properties.copy(MARBLE.get())));

        //Cobblestone
        public static final RegistryObject<Block> MARBLE_COBBLESTONE = BLOCKS.register("marble_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MARBLE_COBBLESTONE_SLAB = BLOCKS.register("marble_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MARBLE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MARBLE_COBBLESTONE_STAIRS = BLOCKS.register("marble_cobblestone_stairs", () -> new StrataStairsBlock(MARBLE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MARBLE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MARBLE_COBBLESTONE_WALL = BLOCKS.register("marble_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MARBLE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE = BLOCKS.register("mossy_marble_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_SLAB = BLOCKS.register("mossy_marble_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_MARBLE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_marble_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_MARBLE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_MARBLE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_WALL = BLOCKS.register("mossy_marble_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_MARBLE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> MARBLE_BUTTON = BLOCKS.register("marble_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> MARBLE_PRESSURE_PLATE = BLOCKS.register("marble_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> MARBLE_BRICKS = BLOCKS.register("marble_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MARBLE_BRICK_SLAB = BLOCKS.register("marble_brick_slab", () -> new SlabBlock(Block.Properties.copy(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> MARBLE_BRICK_STAIRS = BLOCKS.register("marble_brick_stairs", () -> new StrataStairsBlock(MARBLE_BRICKS.get().defaultBlockState(), Block.Properties.copy(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> MARBLE_BRICK_WALL = BLOCKS.register("marble_brick_wall", () -> new WallBlock(Block.Properties.copy(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_MARBLE_BRICKS = BLOCKS.register("chiseled_marble_bricks", () -> new Block(Block.Properties.copy(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_MARBLE_BRICKS = BLOCKS.register("cracked_marble_bricks", () -> new Block(Block.Properties.copy(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_MARBLE_BRICKS = BLOCKS.register("mossy_marble_bricks", () -> new Block(Block.Properties.copy(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_MARBLE_BRICK_SLAB = BLOCKS.register("mossy_marble_brick_slab", () -> new SlabBlock(Block.Properties.copy(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_MARBLE_BRICK_STAIRS = BLOCKS.register("mossy_marble_brick_stairs", () -> new StrataStairsBlock(MARBLE_BRICKS.get().defaultBlockState(), Block.Properties.copy(MARBLE.get())));
        public static final RegistryObject<Block> MOSSY_MARBLE_BRICK_WALL = BLOCKS.register("mossy_marble_brick_wall", () -> new WallBlock(Block.Properties.copy(MARBLE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_MARBLE = BLOCKS.register("polished_marble", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_MARBLE_SLAB = BLOCKS.register("polished_marble_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_MARBLE.get())));
        public static final RegistryObject<Block> POLISHED_MARBLE_STAIRS = BLOCKS.register("polished_marble_stairs", () -> new StrataStairsBlock(POLISHED_MARBLE.get().defaultBlockState(), Block.Properties.copy(POLISHED_MARBLE.get())));

        //Migmatite
        public static final RegistryObject<Block> MIGMATITE = BLOCKS.register("migmatite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MIGMATITE_SLAB = BLOCKS.register("migmatite_slab", () -> new SlabBlock(Block.Properties.copy(MIGMATITE.get())));
        public static final RegistryObject<Block> MIGMATITE_STAIRS = BLOCKS.register("migmatite_stairs", () -> new StrataStairsBlock(MIGMATITE.get().defaultBlockState(), Block.Properties.copy(MIGMATITE.get())));
        public static final RegistryObject<Block> MIGMATITE_WALL = BLOCKS.register("migmatite_wall", () -> new WallBlock(Block.Properties.copy(MIGMATITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> MIGMATITE_COBBLESTONE = BLOCKS.register("migmatite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MIGMATITE_COBBLESTONE_SLAB = BLOCKS.register("migmatite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MIGMATITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MIGMATITE_COBBLESTONE_STAIRS = BLOCKS.register("migmatite_cobblestone_stairs", () -> new StrataStairsBlock(MIGMATITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MIGMATITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MIGMATITE_COBBLESTONE_WALL = BLOCKS.register("migmatite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MIGMATITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_MIGMATITE_COBBLESTONE = BLOCKS.register("mossy_migmatite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_MIGMATITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_migmatite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_MIGMATITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_MIGMATITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_migmatite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_MIGMATITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_MIGMATITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_MIGMATITE_COBBLESTONE_WALL = BLOCKS.register("mossy_migmatite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_MIGMATITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> MIGMATITE_BUTTON = BLOCKS.register("migmatite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> MIGMATITE_PRESSURE_PLATE = BLOCKS.register("migmatite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> MIGMATITE_BRICKS = BLOCKS.register("migmatite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MIGMATITE_BRICK_SLAB = BLOCKS.register("migmatite_brick_slab", () -> new SlabBlock(Block.Properties.copy(MIGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> MIGMATITE_BRICK_STAIRS = BLOCKS.register("migmatite_brick_stairs", () -> new StrataStairsBlock(MIGMATITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(MIGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> MIGMATITE_BRICK_WALL = BLOCKS.register("migmatite_brick_wall", () -> new WallBlock(Block.Properties.copy(MIGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_MIGMATITE_BRICKS = BLOCKS.register("chiseled_migmatite_bricks", () -> new Block(Block.Properties.copy(MIGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_MIGMATITE_BRICKS = BLOCKS.register("cracked_migmatite_bricks", () -> new Block(Block.Properties.copy(MIGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_MIGMATITE_BRICKS = BLOCKS.register("mossy_migmatite_bricks", () -> new Block(Block.Properties.copy(MIGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_MIGMATITE_BRICK_SLAB = BLOCKS.register("mossy_migmatite_brick_slab", () -> new SlabBlock(Block.Properties.copy(MIGMATITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_MIGMATITE_BRICK_STAIRS = BLOCKS.register("mossy_migmatite_brick_stairs", () -> new StrataStairsBlock(MIGMATITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(MIGMATITE.get())));
        public static final RegistryObject<Block> MOSSY_MIGMATITE_BRICK_WALL = BLOCKS.register("mossy_migmatite_brick_wall", () -> new WallBlock(Block.Properties.copy(MIGMATITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_MIGMATITE = BLOCKS.register("polished_migmatite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_MIGMATITE_SLAB = BLOCKS.register("polished_migmatite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_MIGMATITE.get())));
        public static final RegistryObject<Block> POLISHED_MIGMATITE_STAIRS = BLOCKS.register("polished_migmatite_stairs", () -> new StrataStairsBlock(POLISHED_MIGMATITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_MIGMATITE.get())));

        //Schist
        public static final RegistryObject<Block> SCHIST = BLOCKS.register("schist", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> SCHIST_SLAB = BLOCKS.register("schist_slab", () -> new SlabBlock(Block.Properties.copy(SCHIST.get())));
        public static final RegistryObject<Block> SCHIST_STAIRS = BLOCKS.register("schist_stairs", () -> new StrataStairsBlock(SCHIST.get().defaultBlockState(), Block.Properties.copy(SCHIST.get())));
        public static final RegistryObject<Block> SCHIST_WALL = BLOCKS.register("schist_wall", () -> new WallBlock(Block.Properties.copy(SCHIST.get())));

        //Cobblestone
        public static final RegistryObject<Block> SCHIST_COBBLESTONE = BLOCKS.register("schist_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> SCHIST_COBBLESTONE_SLAB = BLOCKS.register("schist_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(SCHIST_COBBLESTONE.get())));
        public static final RegistryObject<Block> SCHIST_COBBLESTONE_STAIRS = BLOCKS.register("schist_cobblestone_stairs", () -> new StrataStairsBlock(SCHIST_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(SCHIST_COBBLESTONE.get())));
        public static final RegistryObject<Block> SCHIST_COBBLESTONE_WALL = BLOCKS.register("schist_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(SCHIST_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_SCHIST_COBBLESTONE = BLOCKS.register("mossy_schist_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_SCHIST_COBBLESTONE_SLAB = BLOCKS.register("mossy_schist_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_SCHIST_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_SCHIST_COBBLESTONE_STAIRS = BLOCKS.register("mossy_schist_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_SCHIST_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_SCHIST_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_SCHIST_COBBLESTONE_WALL = BLOCKS.register("mossy_schist_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_SCHIST_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> SCHIST_BUTTON = BLOCKS.register("schist_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> SCHIST_PRESSURE_PLATE = BLOCKS.register("schist_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> SCHIST_BRICKS = BLOCKS.register("schist_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> SCHIST_BRICK_SLAB = BLOCKS.register("schist_brick_slab", () -> new SlabBlock(Block.Properties.copy(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> SCHIST_BRICK_STAIRS = BLOCKS.register("schist_brick_stairs", () -> new StrataStairsBlock(SCHIST_BRICKS.get().defaultBlockState(), Block.Properties.copy(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> SCHIST_BRICK_WALL = BLOCKS.register("schist_brick_wall", () -> new WallBlock(Block.Properties.copy(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_SCHIST_BRICKS = BLOCKS.register("chiseled_schist_bricks", () -> new Block(Block.Properties.copy(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_SCHIST_BRICKS = BLOCKS.register("cracked_schist_bricks", () -> new Block(Block.Properties.copy(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SCHIST_BRICKS = BLOCKS.register("mossy_schist_bricks", () -> new Block(Block.Properties.copy(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SCHIST_BRICK_SLAB = BLOCKS.register("mossy_schist_brick_slab", () -> new SlabBlock(Block.Properties.copy(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SCHIST_BRICK_STAIRS = BLOCKS.register("mossy_schist_brick_stairs", () -> new StrataStairsBlock(SCHIST_BRICKS.get().defaultBlockState(), Block.Properties.copy(SCHIST.get())));
        public static final RegistryObject<Block> MOSSY_SCHIST_BRICK_WALL = BLOCKS.register("mossy_schist_brick_wall", () -> new WallBlock(Block.Properties.copy(SCHIST_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_SCHIST = BLOCKS.register("polished_schist", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_SCHIST_SLAB = BLOCKS.register("polished_schist_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_SCHIST.get())));
        public static final RegistryObject<Block> POLISHED_SCHIST_STAIRS = BLOCKS.register("polished_schist_stairs", () -> new StrataStairsBlock(POLISHED_SCHIST.get().defaultBlockState(), Block.Properties.copy(POLISHED_SCHIST.get())));

        //Slate
        public static final RegistryObject<Block> SLATE = BLOCKS.register("slate", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> SLATE_SLAB = BLOCKS.register("slate_slab", () -> new SlabBlock(Block.Properties.copy(SLATE.get())));
        public static final RegistryObject<Block> SLATE_STAIRS = BLOCKS.register("slate_stairs", () -> new StrataStairsBlock(SLATE.get().defaultBlockState(), Block.Properties.copy(SLATE.get())));
        public static final RegistryObject<Block> SLATE_WALL = BLOCKS.register("slate_wall", () -> new WallBlock(Block.Properties.copy(SLATE.get())));

        //Cobblestone
        public static final RegistryObject<Block> SLATE_COBBLESTONE = BLOCKS.register("slate_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> SLATE_COBBLESTONE_SLAB = BLOCKS.register("slate_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(SLATE_COBBLESTONE.get())));
        public static final RegistryObject<Block> SLATE_COBBLESTONE_STAIRS = BLOCKS.register("slate_cobblestone_stairs", () -> new StrataStairsBlock(SLATE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(SLATE_COBBLESTONE.get())));
        public static final RegistryObject<Block> SLATE_COBBLESTONE_WALL = BLOCKS.register("slate_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(SLATE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_SLATE_COBBLESTONE = BLOCKS.register("mossy_slate_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_SLATE_COBBLESTONE_SLAB = BLOCKS.register("mossy_slate_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_SLATE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_SLATE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_slate_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_SLATE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_SLATE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_SLATE_COBBLESTONE_WALL = BLOCKS.register("mossy_slate_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_SLATE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> SLATE_BUTTON = BLOCKS.register("slate_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> SLATE_PRESSURE_PLATE = BLOCKS.register("slate_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> SLATE_BRICKS = BLOCKS.register("slate_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> SLATE_BRICK_SLAB = BLOCKS.register("slate_brick_slab", () -> new SlabBlock(Block.Properties.copy(SLATE_BRICKS.get())));
        public static final RegistryObject<Block> SLATE_BRICK_STAIRS = BLOCKS.register("slate_brick_stairs", () -> new StrataStairsBlock(SLATE_BRICKS.get().defaultBlockState(), Block.Properties.copy(SLATE_BRICKS.get())));
        public static final RegistryObject<Block> SLATE_BRICK_WALL = BLOCKS.register("slate_brick_wall", () -> new WallBlock(Block.Properties.copy(SLATE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_SLATE_BRICKS = BLOCKS.register("chiseled_slate_bricks", () -> new Block(Block.Properties.copy(SLATE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_SLATE_BRICKS = BLOCKS.register("cracked_slate_bricks", () -> new Block(Block.Properties.copy(SLATE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SLATE_BRICKS = BLOCKS.register("mossy_slate_bricks", () -> new Block(Block.Properties.copy(SLATE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SLATE_BRICK_SLAB = BLOCKS.register("mossy_slate_brick_slab", () -> new SlabBlock(Block.Properties.copy(SLATE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SLATE_BRICK_STAIRS = BLOCKS.register("mossy_slate_brick_stairs", () -> new StrataStairsBlock(SLATE_BRICKS.get().defaultBlockState(), Block.Properties.copy(SLATE.get())));
        public static final RegistryObject<Block> MOSSY_SLATE_BRICK_WALL = BLOCKS.register("mossy_slate_brick_wall", () -> new WallBlock(Block.Properties.copy(SLATE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_SLATE = BLOCKS.register("polished_slate", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_SLATE_SLAB = BLOCKS.register("polished_slate_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_SLATE.get())));
        public static final RegistryObject<Block> POLISHED_SLATE_STAIRS = BLOCKS.register("polished_slate_stairs", () -> new StrataStairsBlock(POLISHED_SLATE.get().defaultBlockState(), Block.Properties.copy(POLISHED_SLATE.get())));

        //Soapstone
        public static final RegistryObject<Block> SOAPSTONE = BLOCKS.register("soapstone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> SOAPSTONE_SLAB = BLOCKS.register("soapstone_slab", () -> new SlabBlock(Block.Properties.copy(SOAPSTONE.get())));
        public static final RegistryObject<Block> SOAPSTONE_STAIRS = BLOCKS.register("soapstone_stairs", () -> new StrataStairsBlock(SOAPSTONE.get().defaultBlockState(), Block.Properties.copy(SOAPSTONE.get())));
        public static final RegistryObject<Block> SOAPSTONE_WALL = BLOCKS.register("soapstone_wall", () -> new WallBlock(Block.Properties.copy(SOAPSTONE.get())));

        //Cobblestone
        public static final RegistryObject<Block> SOAPSTONE_COBBLESTONE = BLOCKS.register("soapstone_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> SOAPSTONE_COBBLESTONE_SLAB = BLOCKS.register("soapstone_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(SOAPSTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> SOAPSTONE_COBBLESTONE_STAIRS = BLOCKS.register("soapstone_cobblestone_stairs", () -> new StrataStairsBlock(SOAPSTONE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(SOAPSTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> SOAPSTONE_COBBLESTONE_WALL = BLOCKS.register("soapstone_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(SOAPSTONE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_SOAPSTONE_COBBLESTONE = BLOCKS.register("mossy_soapstone_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_SOAPSTONE_COBBLESTONE_SLAB = BLOCKS.register("mossy_soapstone_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_SOAPSTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_SOAPSTONE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_soapstone_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_SOAPSTONE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_SOAPSTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_SOAPSTONE_COBBLESTONE_WALL = BLOCKS.register("mossy_soapstone_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_SOAPSTONE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> SOAPSTONE_BUTTON = BLOCKS.register("soapstone_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> SOAPSTONE_PRESSURE_PLATE = BLOCKS.register("soapstone_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> SOAPSTONE_BRICKS = BLOCKS.register("soapstone_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> SOAPSTONE_BRICK_SLAB = BLOCKS.register("soapstone_brick_slab", () -> new SlabBlock(Block.Properties.copy(SOAPSTONE_BRICKS.get())));
        public static final RegistryObject<Block> SOAPSTONE_BRICK_STAIRS = BLOCKS.register("soapstone_brick_stairs", () -> new StrataStairsBlock(SOAPSTONE_BRICKS.get().defaultBlockState(), Block.Properties.copy(SOAPSTONE_BRICKS.get())));
        public static final RegistryObject<Block> SOAPSTONE_BRICK_WALL = BLOCKS.register("soapstone_brick_wall", () -> new WallBlock(Block.Properties.copy(SOAPSTONE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_SOAPSTONE_BRICKS = BLOCKS.register("chiseled_soapstone_bricks", () -> new Block(Block.Properties.copy(SOAPSTONE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_SOAPSTONE_BRICKS = BLOCKS.register("cracked_soapstone_bricks", () -> new Block(Block.Properties.copy(SOAPSTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SOAPSTONE_BRICKS = BLOCKS.register("mossy_soapstone_bricks", () -> new Block(Block.Properties.copy(SOAPSTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SOAPSTONE_BRICK_SLAB = BLOCKS.register("mossy_soapstone_brick_slab", () -> new SlabBlock(Block.Properties.copy(SOAPSTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SOAPSTONE_BRICK_STAIRS = BLOCKS.register("mossy_soapstone_brick_stairs", () -> new StrataStairsBlock(SOAPSTONE_BRICKS.get().defaultBlockState(), Block.Properties.copy(SOAPSTONE.get())));
        public static final RegistryObject<Block> MOSSY_SOAPSTONE_BRICK_WALL = BLOCKS.register("mossy_soapstone_brick_wall", () -> new WallBlock(Block.Properties.copy(SOAPSTONE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_SOAPSTONE = BLOCKS.register("polished_soapstone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_SOAPSTONE_SLAB = BLOCKS.register("polished_soapstone_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_SOAPSTONE.get())));
        public static final RegistryObject<Block> POLISHED_SOAPSTONE_STAIRS = BLOCKS.register("polished_soapstone_stairs", () -> new StrataStairsBlock(POLISHED_SOAPSTONE.get().defaultBlockState(), Block.Properties.copy(POLISHED_SOAPSTONE.get())));

        //Phyllite
        public static final RegistryObject<Block> PHYLLITE = BLOCKS.register("phyllite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> PHYLLITE_SLAB = BLOCKS.register("phyllite_slab", () -> new SlabBlock(Block.Properties.copy(PHYLLITE.get())));
        public static final RegistryObject<Block> PHYLLITE_STAIRS = BLOCKS.register("phyllite_stairs", () -> new StrataStairsBlock(PHYLLITE.get().defaultBlockState(), Block.Properties.copy(PHYLLITE.get())));
        public static final RegistryObject<Block> PHYLLITE_WALL = BLOCKS.register("phyllite_wall", () -> new WallBlock(Block.Properties.copy(PHYLLITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> PHYLLITE_COBBLESTONE = BLOCKS.register("phyllite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> PHYLLITE_COBBLESTONE_SLAB = BLOCKS.register("phyllite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(PHYLLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> PHYLLITE_COBBLESTONE_STAIRS = BLOCKS.register("phyllite_cobblestone_stairs", () -> new StrataStairsBlock(PHYLLITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(PHYLLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> PHYLLITE_COBBLESTONE_WALL = BLOCKS.register("phyllite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(PHYLLITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_PHYLLITE_COBBLESTONE = BLOCKS.register("mossy_phyllite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_PHYLLITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_phyllite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_PHYLLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_PHYLLITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_phyllite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_PHYLLITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_PHYLLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_PHYLLITE_COBBLESTONE_WALL = BLOCKS.register("mossy_phyllite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_PHYLLITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> PHYLLITE_BUTTON = BLOCKS.register("phyllite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> PHYLLITE_PRESSURE_PLATE = BLOCKS.register("phyllite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> PHYLLITE_BRICKS = BLOCKS.register("phyllite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> PHYLLITE_BRICK_SLAB = BLOCKS.register("phyllite_brick_slab", () -> new SlabBlock(Block.Properties.copy(PHYLLITE_BRICKS.get())));
        public static final RegistryObject<Block> PHYLLITE_BRICK_STAIRS = BLOCKS.register("phyllite_brick_stairs", () -> new StrataStairsBlock(PHYLLITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(PHYLLITE_BRICKS.get())));
        public static final RegistryObject<Block> PHYLLITE_BRICK_WALL = BLOCKS.register("phyllite_brick_wall", () -> new WallBlock(Block.Properties.copy(PHYLLITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_PHYLLITE_BRICKS = BLOCKS.register("chiseled_phyllite_bricks", () -> new Block(Block.Properties.copy(PHYLLITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_PHYLLITE_BRICKS = BLOCKS.register("cracked_phyllite_bricks", () -> new Block(Block.Properties.copy(PHYLLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PHYLLITE_BRICKS = BLOCKS.register("mossy_phyllite_bricks", () -> new Block(Block.Properties.copy(PHYLLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PHYLLITE_BRICK_SLAB = BLOCKS.register("mossy_phyllite_brick_slab", () -> new SlabBlock(Block.Properties.copy(PHYLLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PHYLLITE_BRICK_STAIRS = BLOCKS.register("mossy_phyllite_brick_stairs", () -> new StrataStairsBlock(PHYLLITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(PHYLLITE.get())));
        public static final RegistryObject<Block> MOSSY_PHYLLITE_BRICK_WALL = BLOCKS.register("mossy_phyllite_brick_wall", () -> new WallBlock(Block.Properties.copy(PHYLLITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_PHYLLITE = BLOCKS.register("polished_phyllite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_PHYLLITE_SLAB = BLOCKS.register("polished_phyllite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_PHYLLITE.get())));
        public static final RegistryObject<Block> POLISHED_PHYLLITE_STAIRS = BLOCKS.register("polished_phyllite_stairs", () -> new StrataStairsBlock(POLISHED_PHYLLITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_PHYLLITE.get())));

        /*Sedimentary Rocks*/

        //Argillite
        public static final RegistryObject<Block> ARGILLITE = BLOCKS.register("argillite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> ARGILLITE_SLAB = BLOCKS.register("argillite_slab", () -> new SlabBlock(Block.Properties.copy(ARGILLITE.get())));
        public static final RegistryObject<Block> ARGILLITE_STAIRS = BLOCKS.register("argillite_stairs", () -> new StrataStairsBlock(ARGILLITE.get().defaultBlockState(), Block.Properties.copy(ARGILLITE.get())));
        public static final RegistryObject<Block> ARGILLITE_WALL = BLOCKS.register("argillite_wall", () -> new WallBlock(Block.Properties.copy(ARGILLITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> ARGILLITE_COBBLESTONE = BLOCKS.register("argillite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> ARGILLITE_COBBLESTONE_SLAB = BLOCKS.register("argillite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(ARGILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ARGILLITE_COBBLESTONE_STAIRS = BLOCKS.register("argillite_cobblestone_stairs", () -> new StrataStairsBlock(ARGILLITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(ARGILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ARGILLITE_COBBLESTONE_WALL = BLOCKS.register("argillite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(ARGILLITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_ARGILLITE_COBBLESTONE = BLOCKS.register("mossy_argillite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_argillite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_ARGILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_argillite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_ARGILLITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_ARGILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_COBBLESTONE_WALL = BLOCKS.register("mossy_argillite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_ARGILLITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> ARGILLITE_BUTTON = BLOCKS.register("argillite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> ARGILLITE_PRESSURE_PLATE = BLOCKS.register("argillite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> ARGILLITE_BRICKS = BLOCKS.register("argillite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> ARGILLITE_BRICK_SLAB = BLOCKS.register("argillite_brick_slab", () -> new SlabBlock(Block.Properties.copy(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> ARGILLITE_BRICK_STAIRS = BLOCKS.register("argillite_brick_stairs", () -> new StrataStairsBlock(ARGILLITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> ARGILLITE_BRICK_WALL = BLOCKS.register("argillite_brick_wall", () -> new WallBlock(Block.Properties.copy(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_ARGILLITE_BRICKS = BLOCKS.register("chiseled_argillite_bricks", () -> new Block(Block.Properties.copy(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_ARGILLITE_BRICKS = BLOCKS.register("cracked_argillite_bricks", () -> new Block(Block.Properties.copy(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_BRICKS = BLOCKS.register("mossy_argillite_bricks", () -> new Block(Block.Properties.copy(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_BRICK_SLAB = BLOCKS.register("mossy_argillite_brick_slab", () -> new SlabBlock(Block.Properties.copy(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_BRICK_STAIRS = BLOCKS.register("mossy_argillite_brick_stairs", () -> new StrataStairsBlock(ARGILLITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(ARGILLITE.get())));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_BRICK_WALL = BLOCKS.register("mossy_argillite_brick_wall", () -> new WallBlock(Block.Properties.copy(ARGILLITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_ARGILLITE = BLOCKS.register("polished_argillite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_ARGILLITE_SLAB = BLOCKS.register("polished_argillite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_ARGILLITE.get())));
        public static final RegistryObject<Block> POLISHED_ARGILLITE_STAIRS = BLOCKS.register("polished_argillite_stairs", () -> new StrataStairsBlock(POLISHED_ARGILLITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_ARGILLITE.get())));

        //Arkose
        public static final RegistryObject<Block> ARKOSE = BLOCKS.register("arkose", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> ARKOSE_SLAB = BLOCKS.register("arkose_slab", () -> new SlabBlock(Block.Properties.copy(ARKOSE.get())));
        public static final RegistryObject<Block> ARKOSE_STAIRS = BLOCKS.register("arkose_stairs", () -> new StrataStairsBlock(ARKOSE.get().defaultBlockState(), Block.Properties.copy(ARKOSE.get())));
        public static final RegistryObject<Block> ARKOSE_WALL = BLOCKS.register("arkose_wall", () -> new WallBlock(Block.Properties.copy(ARKOSE.get())));

        //Cobblestone
        public static final RegistryObject<Block> ARKOSE_COBBLESTONE = BLOCKS.register("arkose_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> ARKOSE_COBBLESTONE_SLAB = BLOCKS.register("arkose_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(ARKOSE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ARKOSE_COBBLESTONE_STAIRS = BLOCKS.register("arkose_cobblestone_stairs", () -> new StrataStairsBlock(ARKOSE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(ARKOSE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ARKOSE_COBBLESTONE_WALL = BLOCKS.register("arkose_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(ARKOSE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_ARKOSE_COBBLESTONE = BLOCKS.register("mossy_arkose_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_ARKOSE_COBBLESTONE_SLAB = BLOCKS.register("mossy_arkose_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_ARKOSE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ARKOSE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_arkose_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_ARKOSE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_ARKOSE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ARKOSE_COBBLESTONE_WALL = BLOCKS.register("mossy_arkose_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_ARKOSE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> ARKOSE_BUTTON = BLOCKS.register("arkose_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> ARKOSE_PRESSURE_PLATE = BLOCKS.register("arkose_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> ARKOSE_BRICKS = BLOCKS.register("arkose_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> ARKOSE_BRICK_SLAB = BLOCKS.register("arkose_brick_slab", () -> new SlabBlock(Block.Properties.copy(ARKOSE_BRICKS.get())));
        public static final RegistryObject<Block> ARKOSE_BRICK_STAIRS = BLOCKS.register("arkose_brick_stairs", () -> new StrataStairsBlock(ARKOSE_BRICKS.get().defaultBlockState(), Block.Properties.copy(ARKOSE_BRICKS.get())));
        public static final RegistryObject<Block> ARKOSE_BRICK_WALL = BLOCKS.register("arkose_brick_wall", () -> new WallBlock(Block.Properties.copy(ARKOSE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_ARKOSE_BRICKS = BLOCKS.register("chiseled_arkose_bricks", () -> new Block(Block.Properties.copy(ARKOSE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_ARKOSE_BRICKS = BLOCKS.register("cracked_arkose_bricks", () -> new Block(Block.Properties.copy(ARKOSE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ARKOSE_BRICKS = BLOCKS.register("mossy_arkose_bricks", () -> new Block(Block.Properties.copy(ARKOSE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ARKOSE_BRICK_SLAB = BLOCKS.register("mossy_arkose_brick_slab", () -> new SlabBlock(Block.Properties.copy(ARKOSE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ARKOSE_BRICK_STAIRS = BLOCKS.register("mossy_arkose_brick_stairs", () -> new StrataStairsBlock(ARKOSE_BRICKS.get().defaultBlockState(), Block.Properties.copy(ARKOSE.get())));
        public static final RegistryObject<Block> MOSSY_ARKOSE_BRICK_WALL = BLOCKS.register("mossy_arkose_brick_wall", () -> new WallBlock(Block.Properties.copy(ARKOSE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_ARKOSE = BLOCKS.register("polished_arkose", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_ARKOSE_SLAB = BLOCKS.register("polished_arkose_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_ARKOSE.get())));
        public static final RegistryObject<Block> POLISHED_ARKOSE_STAIRS = BLOCKS.register("polished_arkose_stairs", () -> new StrataStairsBlock(POLISHED_ARKOSE.get().defaultBlockState(), Block.Properties.copy(POLISHED_ARKOSE.get())));

        //Breccia
        public static final RegistryObject<Block> BRECCIA = BLOCKS.register("breccia", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> BRECCIA_SLAB = BLOCKS.register("breccia_slab", () -> new SlabBlock(Block.Properties.copy(BRECCIA.get())));
        public static final RegistryObject<Block> BRECCIA_STAIRS = BLOCKS.register("breccia_stairs", () -> new StrataStairsBlock(BRECCIA.get().defaultBlockState(), Block.Properties.copy(BRECCIA.get())));
        public static final RegistryObject<Block> BRECCIA_WALL = BLOCKS.register("breccia_wall", () -> new WallBlock(Block.Properties.copy(BRECCIA.get())));

        //Cobblestone
        public static final RegistryObject<Block> BRECCIA_COBBLESTONE = BLOCKS.register("breccia_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> BRECCIA_COBBLESTONE_SLAB = BLOCKS.register("breccia_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(BRECCIA_COBBLESTONE.get())));
        public static final RegistryObject<Block> BRECCIA_COBBLESTONE_STAIRS = BLOCKS.register("breccia_cobblestone_stairs", () -> new StrataStairsBlock(BRECCIA_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(BRECCIA_COBBLESTONE.get())));
        public static final RegistryObject<Block> BRECCIA_COBBLESTONE_WALL = BLOCKS.register("breccia_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(BRECCIA_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_BRECCIA_COBBLESTONE = BLOCKS.register("mossy_breccia_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_BRECCIA_COBBLESTONE_SLAB = BLOCKS.register("mossy_breccia_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_BRECCIA_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_BRECCIA_COBBLESTONE_STAIRS = BLOCKS.register("mossy_breccia_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_BRECCIA_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_BRECCIA_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_BRECCIA_COBBLESTONE_WALL = BLOCKS.register("mossy_breccia_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_BRECCIA_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> BRECCIA_BUTTON = BLOCKS.register("breccia_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> BRECCIA_PRESSURE_PLATE = BLOCKS.register("breccia_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> BRECCIA_BRICKS = BLOCKS.register("breccia_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> BRECCIA_BRICK_SLAB = BLOCKS.register("breccia_brick_slab", () -> new SlabBlock(Block.Properties.copy(BRECCIA_BRICKS.get())));
        public static final RegistryObject<Block> BRECCIA_BRICK_STAIRS = BLOCKS.register("breccia_brick_stairs", () -> new StrataStairsBlock(BRECCIA_BRICKS.get().defaultBlockState(), Block.Properties.copy(BRECCIA_BRICKS.get())));
        public static final RegistryObject<Block> BRECCIA_BRICK_WALL = BLOCKS.register("breccia_brick_wall", () -> new WallBlock(Block.Properties.copy(BRECCIA_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_BRECCIA_BRICKS = BLOCKS.register("chiseled_breccia_bricks", () -> new Block(Block.Properties.copy(BRECCIA_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_BRECCIA_BRICKS = BLOCKS.register("cracked_breccia_bricks", () -> new Block(Block.Properties.copy(BRECCIA_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_BRECCIA_BRICKS = BLOCKS.register("mossy_breccia_bricks", () -> new Block(Block.Properties.copy(BRECCIA_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_BRECCIA_BRICK_SLAB = BLOCKS.register("mossy_breccia_brick_slab", () -> new SlabBlock(Block.Properties.copy(BRECCIA_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_BRECCIA_BRICK_STAIRS = BLOCKS.register("mossy_breccia_brick_stairs", () -> new StrataStairsBlock(BRECCIA_BRICKS.get().defaultBlockState(), Block.Properties.copy(BRECCIA.get())));
        public static final RegistryObject<Block> MOSSY_BRECCIA_BRICK_WALL = BLOCKS.register("mossy_breccia_brick_wall", () -> new WallBlock(Block.Properties.copy(BRECCIA_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_BRECCIA = BLOCKS.register("polished_breccia", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_BRECCIA_SLAB = BLOCKS.register("polished_breccia_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_BRECCIA.get())));
        public static final RegistryObject<Block> POLISHED_BRECCIA_STAIRS = BLOCKS.register("polished_breccia_stairs", () -> new StrataStairsBlock(POLISHED_BRECCIA.get().defaultBlockState(), Block.Properties.copy(POLISHED_BRECCIA.get())));

        //Chalk
        public static final RegistryObject<Block> CHALK = BLOCKS.register("chalk", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(0.4f).explosionResistance(0.4f)));
        public static final RegistryObject<Block> CHALK_SLAB = BLOCKS.register("chalk_slab", () -> new SlabBlock(Block.Properties.copy(CHALK.get())));
        public static final RegistryObject<Block> CHALK_STAIRS = BLOCKS.register("chalk_stairs", () -> new StrataStairsBlock(CHALK.get().defaultBlockState(), Block.Properties.copy(CHALK.get())));
        public static final RegistryObject<Block> CHALK_WALL = BLOCKS.register("chalk_wall", () -> new WallBlock(Block.Properties.copy(CHALK.get())));

        //Cobblestone
        public static final RegistryObject<Block> CHALK_COBBLESTONE = BLOCKS.register("chalk_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(0.4f).explosionResistance(0.4f)));
        public static final RegistryObject<Block> CHALK_COBBLESTONE_SLAB = BLOCKS.register("chalk_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(CHALK_COBBLESTONE.get())));
        public static final RegistryObject<Block> CHALK_COBBLESTONE_STAIRS = BLOCKS.register("chalk_cobblestone_stairs", () -> new StrataStairsBlock(CHALK_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(CHALK_COBBLESTONE.get())));
        public static final RegistryObject<Block> CHALK_COBBLESTONE_WALL = BLOCKS.register("chalk_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(CHALK_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_CHALK_COBBLESTONE = BLOCKS.register("mossy_chalk_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.4f).explosionResistance(1.4f)));
        public static final RegistryObject<Block> MOSSY_CHALK_COBBLESTONE_SLAB = BLOCKS.register("mossy_chalk_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_CHALK_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_CHALK_COBBLESTONE_STAIRS = BLOCKS.register("mossy_chalk_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_CHALK_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_CHALK_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_CHALK_COBBLESTONE_WALL = BLOCKS.register("mossy_chalk_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_CHALK_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> CHALK_BUTTON = BLOCKS.register("chalk_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> CHALK_PRESSURE_PLATE = BLOCKS.register("chalk_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> CHALK_BRICKS = BLOCKS.register("chalk_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.4f).explosionResistance(1.4f)));
        public static final RegistryObject<Block> CHALK_BRICK_SLAB = BLOCKS.register("chalk_brick_slab", () -> new SlabBlock(Block.Properties.copy(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> CHALK_BRICK_STAIRS = BLOCKS.register("chalk_brick_stairs", () -> new StrataStairsBlock(CHALK_BRICKS.get().defaultBlockState(), Block.Properties.copy(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> CHALK_BRICK_WALL = BLOCKS.register("chalk_brick_wall", () -> new WallBlock(Block.Properties.copy(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_CHALK_BRICKS = BLOCKS.register("chiseled_chalk_bricks", () -> new Block(Block.Properties.copy(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_CHALK_BRICKS = BLOCKS.register("cracked_chalk_bricks", () -> new Block(Block.Properties.copy(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_CHALK_BRICKS = BLOCKS.register("mossy_chalk_bricks", () -> new Block(Block.Properties.copy(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_CHALK_BRICK_SLAB = BLOCKS.register("mossy_chalk_brick_slab", () -> new SlabBlock(Block.Properties.copy(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_CHALK_BRICK_STAIRS = BLOCKS.register("mossy_chalk_brick_stairs", () -> new StrataStairsBlock(CHALK_BRICKS.get().defaultBlockState(), Block.Properties.copy(CHALK.get())));
        public static final RegistryObject<Block> MOSSY_CHALK_BRICK_WALL = BLOCKS.register("mossy_chalk_brick_wall", () -> new WallBlock(Block.Properties.copy(CHALK_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_CHALK = BLOCKS.register("polished_chalk", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.4f).explosionResistance(1.4f)));
        public static final RegistryObject<Block> POLISHED_CHALK_SLAB = BLOCKS.register("polished_chalk_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_CHALK.get())));
        public static final RegistryObject<Block> POLISHED_CHALK_STAIRS = BLOCKS.register("polished_chalk_stairs", () -> new StrataStairsBlock(POLISHED_CHALK.get().defaultBlockState(), Block.Properties.copy(POLISHED_CHALK.get())));

        //Claystone
        public static final RegistryObject<Block> CLAYSTONE = BLOCKS.register("claystone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> CLAYSTONE_SLAB = BLOCKS.register("claystone_slab", () -> new SlabBlock(Block.Properties.copy(CLAYSTONE.get())));
        public static final RegistryObject<Block> CLAYSTONE_STAIRS = BLOCKS.register("claystone_stairs", () -> new StrataStairsBlock(CLAYSTONE.get().defaultBlockState(), Block.Properties.copy(CLAYSTONE.get())));
        public static final RegistryObject<Block> CLAYSTONE_WALL = BLOCKS.register("claystone_wall", () -> new WallBlock(Block.Properties.copy(CLAYSTONE.get())));

        //Cobblestone
        public static final RegistryObject<Block> CLAYSTONE_COBBLESTONE = BLOCKS.register("claystone_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> CLAYSTONE_COBBLESTONE_SLAB = BLOCKS.register("claystone_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(CLAYSTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> CLAYSTONE_COBBLESTONE_STAIRS = BLOCKS.register("claystone_cobblestone_stairs", () -> new StrataStairsBlock(CLAYSTONE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(CLAYSTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> CLAYSTONE_COBBLESTONE_WALL = BLOCKS.register("claystone_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(CLAYSTONE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_CLAYSTONE_COBBLESTONE = BLOCKS.register("mossy_claystone_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_CLAYSTONE_COBBLESTONE_SLAB = BLOCKS.register("mossy_claystone_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_CLAYSTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_CLAYSTONE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_claystone_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_CLAYSTONE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_CLAYSTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_CLAYSTONE_COBBLESTONE_WALL = BLOCKS.register("mossy_claystone_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_CLAYSTONE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> CLAYSTONE_BUTTON = BLOCKS.register("claystone_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> CLAYSTONE_PRESSURE_PLATE = BLOCKS.register("claystone_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> CLAYSTONE_BRICKS = BLOCKS.register("claystone_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> CLAYSTONE_BRICK_SLAB = BLOCKS.register("claystone_brick_slab", () -> new SlabBlock(Block.Properties.copy(CLAYSTONE_BRICKS.get())));
        public static final RegistryObject<Block> CLAYSTONE_BRICK_STAIRS = BLOCKS.register("claystone_brick_stairs", () -> new StrataStairsBlock(CLAYSTONE_BRICKS.get().defaultBlockState(), Block.Properties.copy(CLAYSTONE_BRICKS.get())));
        public static final RegistryObject<Block> CLAYSTONE_BRICK_WALL = BLOCKS.register("claystone_brick_wall", () -> new WallBlock(Block.Properties.copy(CLAYSTONE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_CLAYSTONE_BRICKS = BLOCKS.register("chiseled_claystone_bricks", () -> new Block(Block.Properties.copy(CLAYSTONE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_CLAYSTONE_BRICKS = BLOCKS.register("cracked_claystone_bricks", () -> new Block(Block.Properties.copy(CLAYSTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_CLAYSTONE_BRICKS = BLOCKS.register("mossy_claystone_bricks", () -> new Block(Block.Properties.copy(CLAYSTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_CLAYSTONE_BRICK_SLAB = BLOCKS.register("mossy_claystone_brick_slab", () -> new SlabBlock(Block.Properties.copy(CLAYSTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_CLAYSTONE_BRICK_STAIRS = BLOCKS.register("mossy_claystone_brick_stairs", () -> new StrataStairsBlock(CLAYSTONE_BRICKS.get().defaultBlockState(), Block.Properties.copy(CLAYSTONE.get())));
        public static final RegistryObject<Block> MOSSY_CLAYSTONE_BRICK_WALL = BLOCKS.register("mossy_claystone_brick_wall", () -> new WallBlock(Block.Properties.copy(CLAYSTONE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_CLAYSTONE = BLOCKS.register("polished_claystone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_CLAYSTONE_SLAB = BLOCKS.register("polished_claystone_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_CLAYSTONE.get())));
        public static final RegistryObject<Block> POLISHED_CLAYSTONE_STAIRS = BLOCKS.register("polished_claystone_stairs", () -> new StrataStairsBlock(POLISHED_CLAYSTONE.get().defaultBlockState(), Block.Properties.copy(POLISHED_CLAYSTONE.get())));

        //Dolomite
        public static final RegistryObject<Block> DOLOMITE = BLOCKS.register("dolomite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> DOLOMITE_SLAB = BLOCKS.register("dolomite_slab", () -> new SlabBlock(Block.Properties.copy(DOLOMITE.get())));
        public static final RegistryObject<Block> DOLOMITE_STAIRS = BLOCKS.register("dolomite_stairs", () -> new StrataStairsBlock(DOLOMITE.get().defaultBlockState(), Block.Properties.copy(DOLOMITE.get())));
        public static final RegistryObject<Block> DOLOMITE_WALL = BLOCKS.register("dolomite_wall", () -> new WallBlock(Block.Properties.copy(DOLOMITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> DOLOMITE_COBBLESTONE = BLOCKS.register("dolomite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> DOLOMITE_COBBLESTONE_SLAB = BLOCKS.register("dolomite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(DOLOMITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> DOLOMITE_COBBLESTONE_STAIRS = BLOCKS.register("dolomite_cobblestone_stairs", () -> new StrataStairsBlock(DOLOMITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(DOLOMITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> DOLOMITE_COBBLESTONE_WALL = BLOCKS.register("dolomite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(DOLOMITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_DOLOMITE_COBBLESTONE = BLOCKS.register("mossy_dolomite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_DOLOMITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_dolomite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_DOLOMITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_DOLOMITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_dolomite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_DOLOMITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_DOLOMITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_DOLOMITE_COBBLESTONE_WALL = BLOCKS.register("mossy_dolomite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_DOLOMITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> DOLOMITE_BUTTON = BLOCKS.register("dolomite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> DOLOMITE_PRESSURE_PLATE = BLOCKS.register("dolomite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> DOLOMITE_BRICKS = BLOCKS.register("dolomite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> DOLOMITE_BRICK_SLAB = BLOCKS.register("dolomite_brick_slab", () -> new SlabBlock(Block.Properties.copy(DOLOMITE_BRICKS.get())));
        public static final RegistryObject<Block> DOLOMITE_BRICK_STAIRS = BLOCKS.register("dolomite_brick_stairs", () -> new StrataStairsBlock(DOLOMITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(DOLOMITE_BRICKS.get())));
        public static final RegistryObject<Block> DOLOMITE_BRICK_WALL = BLOCKS.register("dolomite_brick_wall", () -> new WallBlock(Block.Properties.copy(DOLOMITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_DOLOMITE_BRICKS = BLOCKS.register("chiseled_dolomite_bricks", () -> new Block(Block.Properties.copy(DOLOMITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_DOLOMITE_BRICKS = BLOCKS.register("cracked_dolomite_bricks", () -> new Block(Block.Properties.copy(DOLOMITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_DOLOMITE_BRICKS = BLOCKS.register("mossy_dolomite_bricks", () -> new Block(Block.Properties.copy(DOLOMITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_DOLOMITE_BRICK_SLAB = BLOCKS.register("mossy_dolomite_brick_slab", () -> new SlabBlock(Block.Properties.copy(DOLOMITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_DOLOMITE_BRICK_STAIRS = BLOCKS.register("mossy_dolomite_brick_stairs", () -> new StrataStairsBlock(DOLOMITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(DOLOMITE.get())));
        public static final RegistryObject<Block> MOSSY_DOLOMITE_BRICK_WALL = BLOCKS.register("mossy_dolomite_brick_wall", () -> new WallBlock(Block.Properties.copy(DOLOMITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_DOLOMITE = BLOCKS.register("polished_dolomite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_DOLOMITE_SLAB = BLOCKS.register("polished_dolomite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_DOLOMITE.get())));
        public static final RegistryObject<Block> POLISHED_DOLOMITE_STAIRS = BLOCKS.register("polished_dolomite_stairs", () -> new StrataStairsBlock(POLISHED_DOLOMITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_DOLOMITE.get())));

        //Jaspillite
        public static final RegistryObject<Block> JASPILLITE = BLOCKS.register("jaspillite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> JASPILLITE_SLAB = BLOCKS.register("jaspillite_slab", () -> new SlabBlock(Block.Properties.copy(JASPILLITE.get())));
        public static final RegistryObject<Block> JASPILLITE_STAIRS = BLOCKS.register("jaspillite_stairs", () -> new StrataStairsBlock(JASPILLITE.get().defaultBlockState(), Block.Properties.copy(JASPILLITE.get())));
        public static final RegistryObject<Block> JASPILLITE_WALL = BLOCKS.register("jaspillite_wall", () -> new WallBlock(Block.Properties.copy(JASPILLITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> JASPILLITE_COBBLESTONE = BLOCKS.register("jaspillite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> JASPILLITE_COBBLESTONE_SLAB = BLOCKS.register("jaspillite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(JASPILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> JASPILLITE_COBBLESTONE_STAIRS = BLOCKS.register("jaspillite_cobblestone_stairs", () -> new StrataStairsBlock(JASPILLITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(JASPILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> JASPILLITE_COBBLESTONE_WALL = BLOCKS.register("jaspillite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(JASPILLITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_JASPILLITE_COBBLESTONE = BLOCKS.register("mossy_jaspillite_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_jaspillite_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_JASPILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_jaspillite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_JASPILLITE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_JASPILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_COBBLESTONE_WALL = BLOCKS.register("mossy_jaspillite_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_JASPILLITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> JASPILLITE_BUTTON = BLOCKS.register("jaspillite_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> JASPILLITE_PRESSURE_PLATE = BLOCKS.register("jaspillite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> JASPILLITE_BRICKS = BLOCKS.register("jaspillite_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> JASPILLITE_BRICK_SLAB = BLOCKS.register("jaspillite_brick_slab", () -> new SlabBlock(Block.Properties.copy(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> JASPILLITE_BRICK_STAIRS = BLOCKS.register("jaspillite_brick_stairs", () -> new StrataStairsBlock(JASPILLITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> JASPILLITE_BRICK_WALL = BLOCKS.register("jaspillite_brick_wall", () -> new WallBlock(Block.Properties.copy(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_JASPILLITE_BRICKS = BLOCKS.register("chiseled_jaspillite_bricks", () -> new Block(Block.Properties.copy(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_JASPILLITE_BRICKS = BLOCKS.register("cracked_jaspillite_bricks", () -> new Block(Block.Properties.copy(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_BRICKS = BLOCKS.register("mossy_jaspillite_bricks", () -> new Block(Block.Properties.copy(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_BRICK_SLAB = BLOCKS.register("mossy_jaspillite_brick_slab", () -> new SlabBlock(Block.Properties.copy(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_BRICK_STAIRS = BLOCKS.register("mossy_jaspillite_brick_stairs", () -> new StrataStairsBlock(JASPILLITE_BRICKS.get().defaultBlockState(), Block.Properties.copy(JASPILLITE.get())));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_BRICK_WALL = BLOCKS.register("mossy_jaspillite_brick_wall", () -> new WallBlock(Block.Properties.copy(JASPILLITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_JASPILLITE = BLOCKS.register("polished_jaspillite", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_JASPILLITE_SLAB = BLOCKS.register("polished_jaspillite_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_JASPILLITE.get())));
        public static final RegistryObject<Block> POLISHED_JASPILLITE_STAIRS = BLOCKS.register("polished_jaspillite_stairs", () -> new StrataStairsBlock(POLISHED_JASPILLITE.get().defaultBlockState(), Block.Properties.copy(POLISHED_JASPILLITE.get())));

        //Limestone
        public static final RegistryObject<Block> LIMESTONE = BLOCKS.register("limestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> LIMESTONE_SLAB = BLOCKS.register("limestone_slab", () -> new SlabBlock(Block.Properties.copy(LIMESTONE.get())));
        public static final RegistryObject<Block> LIMESTONE_STAIRS = BLOCKS.register("limestone_stairs", () -> new StrataStairsBlock(LIMESTONE.get().defaultBlockState(), Block.Properties.copy(LIMESTONE.get())));
        public static final RegistryObject<Block> LIMESTONE_WALL = BLOCKS.register("limestone_wall", () -> new WallBlock(Block.Properties.copy(LIMESTONE.get())));

        //Cobblestone
        public static final RegistryObject<Block> LIMESTONE_COBBLESTONE = BLOCKS.register("limestone_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_SLAB = BLOCKS.register("limestone_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(LIMESTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_STAIRS = BLOCKS.register("limestone_cobblestone_stairs", () -> new StrataStairsBlock(LIMESTONE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(LIMESTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_WALL = BLOCKS.register("limestone_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(LIMESTONE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE = BLOCKS.register("mossy_limestone_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_SLAB = BLOCKS.register("mossy_limestone_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_LIMESTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_limestone_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_LIMESTONE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_LIMESTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_WALL = BLOCKS.register("mossy_limestone_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_LIMESTONE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> LIMESTONE_BUTTON = BLOCKS.register("limestone_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> LIMESTONE_PRESSURE_PLATE = BLOCKS.register("limestone_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> LIMESTONE_BRICKS = BLOCKS.register("limestone_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> LIMESTONE_BRICK_SLAB = BLOCKS.register("limestone_brick_slab", () -> new SlabBlock(Block.Properties.copy(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> LIMESTONE_BRICK_STAIRS = BLOCKS.register("limestone_brick_stairs", () -> new StrataStairsBlock(LIMESTONE_BRICKS.get().defaultBlockState(), Block.Properties.copy(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> LIMESTONE_BRICK_WALL = BLOCKS.register("limestone_brick_wall", () -> new WallBlock(Block.Properties.copy(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_LIMESTONE_BRICKS = BLOCKS.register("chiseled_limestone_bricks", () -> new Block(Block.Properties.copy(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_LIMESTONE_BRICKS = BLOCKS.register("cracked_limestone_bricks", () -> new Block(Block.Properties.copy(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICKS = BLOCKS.register("mossy_limestone_bricks", () -> new Block(Block.Properties.copy(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_SLAB = BLOCKS.register("mossy_limestone_brick_slab", () -> new SlabBlock(Block.Properties.copy(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_STAIRS = BLOCKS.register("mossy_limestone_brick_stairs", () -> new StrataStairsBlock(LIMESTONE_BRICKS.get().defaultBlockState(), Block.Properties.copy(LIMESTONE.get())));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_WALL = BLOCKS.register("mossy_limestone_brick_wall", () -> new WallBlock(Block.Properties.copy(LIMESTONE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_LIMESTONE = BLOCKS.register("polished_limestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_LIMESTONE_SLAB = BLOCKS.register("polished_limestone_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_LIMESTONE.get())));
        public static final RegistryObject<Block> POLISHED_LIMESTONE_STAIRS = BLOCKS.register("polished_limestone_stairs", () -> new StrataStairsBlock(POLISHED_LIMESTONE.get().defaultBlockState(), Block.Properties.copy(POLISHED_LIMESTONE.get())));

        //Mudstone
        public static final RegistryObject<Block> MUDSTONE = BLOCKS.register("mudstone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MUDSTONE_SLAB = BLOCKS.register("mudstone_slab", () -> new SlabBlock(Block.Properties.copy(MUDSTONE.get())));
        public static final RegistryObject<Block> MUDSTONE_STAIRS = BLOCKS.register("mudstone_stairs", () -> new StrataStairsBlock(MUDSTONE.get().defaultBlockState(), Block.Properties.copy(MUDSTONE.get())));
        public static final RegistryObject<Block> MUDSTONE_WALL = BLOCKS.register("mudstone_wall", () -> new WallBlock(Block.Properties.copy(MUDSTONE.get())));

        //Cobblestone
        public static final RegistryObject<Block> MUDSTONE_COBBLESTONE = BLOCKS.register("mudstone_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MUDSTONE_COBBLESTONE_SLAB = BLOCKS.register("mudstone_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MUDSTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MUDSTONE_COBBLESTONE_STAIRS = BLOCKS.register("mudstone_cobblestone_stairs", () -> new StrataStairsBlock(MUDSTONE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MUDSTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MUDSTONE_COBBLESTONE_WALL = BLOCKS.register("mudstone_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MUDSTONE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_MUDSTONE_COBBLESTONE = BLOCKS.register("mossy_mudstone_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_MUDSTONE_COBBLESTONE_SLAB = BLOCKS.register("mossy_mudstone_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_MUDSTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_MUDSTONE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_mudstone_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_MUDSTONE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_MUDSTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_MUDSTONE_COBBLESTONE_WALL = BLOCKS.register("mossy_mudstone_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_MUDSTONE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> MUDSTONE_BUTTON = BLOCKS.register("mudstone_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> MUDSTONE_PRESSURE_PLATE = BLOCKS.register("mudstone_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> MUDSTONE_BRICKS = BLOCKS.register("mudstone_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MUDSTONE_BRICK_SLAB = BLOCKS.register("mudstone_brick_slab", () -> new SlabBlock(Block.Properties.copy(MUDSTONE_BRICKS.get())));
        public static final RegistryObject<Block> MUDSTONE_BRICK_STAIRS = BLOCKS.register("mudstone_brick_stairs", () -> new StrataStairsBlock(MUDSTONE_BRICKS.get().defaultBlockState(), Block.Properties.copy(MUDSTONE_BRICKS.get())));
        public static final RegistryObject<Block> MUDSTONE_BRICK_WALL = BLOCKS.register("mudstone_brick_wall", () -> new WallBlock(Block.Properties.copy(MUDSTONE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_MUDSTONE_BRICKS = BLOCKS.register("chiseled_mudstone_bricks", () -> new Block(Block.Properties.copy(MUDSTONE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_MUDSTONE_BRICKS = BLOCKS.register("cracked_mudstone_bricks", () -> new Block(Block.Properties.copy(MUDSTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_MUDSTONE_BRICKS = BLOCKS.register("mossy_mudstone_bricks", () -> new Block(Block.Properties.copy(MUDSTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_MUDSTONE_BRICK_SLAB = BLOCKS.register("mossy_mudstone_brick_slab", () -> new SlabBlock(Block.Properties.copy(MUDSTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_MUDSTONE_BRICK_STAIRS = BLOCKS.register("mossy_mudstone_brick_stairs", () -> new StrataStairsBlock(MUDSTONE_BRICKS.get().defaultBlockState(), Block.Properties.copy(MUDSTONE.get())));
        public static final RegistryObject<Block> MOSSY_MUDSTONE_BRICK_WALL = BLOCKS.register("mossy_mudstone_brick_wall", () -> new WallBlock(Block.Properties.copy(MUDSTONE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_MUDSTONE = BLOCKS.register("polished_mudstone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_MUDSTONE_SLAB = BLOCKS.register("polished_mudstone_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_MUDSTONE.get())));
        public static final RegistryObject<Block> POLISHED_MUDSTONE_STAIRS = BLOCKS.register("polished_mudstone_stairs", () -> new StrataStairsBlock(POLISHED_MUDSTONE.get().defaultBlockState(), Block.Properties.copy(POLISHED_MUDSTONE.get())));

        //Shale
        public static final RegistryObject<Block> SHALE = BLOCKS.register("shale", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> SHALE_SLAB = BLOCKS.register("shale_slab", () -> new SlabBlock(Block.Properties.copy(SHALE.get())));
        public static final RegistryObject<Block> SHALE_STAIRS = BLOCKS.register("shale_stairs", () -> new StrataStairsBlock(SHALE.get().defaultBlockState(), Block.Properties.copy(SHALE.get())));
        public static final RegistryObject<Block> SHALE_WALL = BLOCKS.register("shale_wall", () -> new WallBlock(Block.Properties.copy(SHALE.get())));

        //Cobblestone
        public static final RegistryObject<Block> SHALE_COBBLESTONE = BLOCKS.register("shale_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> SHALE_COBBLESTONE_SLAB = BLOCKS.register("shale_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(SHALE_COBBLESTONE.get())));
        public static final RegistryObject<Block> SHALE_COBBLESTONE_STAIRS = BLOCKS.register("shale_cobblestone_stairs", () -> new StrataStairsBlock(SHALE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(SHALE_COBBLESTONE.get())));
        public static final RegistryObject<Block> SHALE_COBBLESTONE_WALL = BLOCKS.register("shale_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(SHALE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_SHALE_COBBLESTONE = BLOCKS.register("mossy_shale_cobblestone", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> MOSSY_SHALE_COBBLESTONE_SLAB = BLOCKS.register("mossy_shale_cobblestone_slab", () -> new SlabBlock(Block.Properties.copy(MOSSY_SHALE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_SHALE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_shale_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_SHALE_COBBLESTONE.get().defaultBlockState(), Block.Properties.copy(MOSSY_SHALE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_SHALE_COBBLESTONE_WALL = BLOCKS.register("mossy_shale_cobblestone_wall", () -> new WallBlock(Block.Properties.copy(MOSSY_SHALE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> SHALE_BUTTON = BLOCKS.register("shale_button", () -> new StrataButtonBlock(Block.Properties.of(Material.STONE).sound(SoundType.STONE).noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> SHALE_PRESSURE_PLATE = BLOCKS.register("shale_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().noCollission().destroyTime(0.5f).explosionResistance(0.5f)));

        //Bricks
        public static final RegistryObject<Block> SHALE_BRICKS = BLOCKS.register("shale_bricks", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> SHALE_BRICK_SLAB = BLOCKS.register("shale_brick_slab", () -> new SlabBlock(Block.Properties.copy(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> SHALE_BRICK_STAIRS = BLOCKS.register("shale_brick_stairs", () -> new StrataStairsBlock(SHALE_BRICKS.get().defaultBlockState(), Block.Properties.copy(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> SHALE_BRICK_WALL = BLOCKS.register("shale_brick_wall", () -> new WallBlock(Block.Properties.copy(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_SHALE_BRICKS = BLOCKS.register("chiseled_shale_bricks", () -> new Block(Block.Properties.copy(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_SHALE_BRICKS = BLOCKS.register("cracked_shale_bricks", () -> new Block(Block.Properties.copy(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SHALE_BRICKS = BLOCKS.register("mossy_shale_bricks", () -> new Block(Block.Properties.copy(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SHALE_BRICK_SLAB = BLOCKS.register("mossy_shale_brick_slab", () -> new SlabBlock(Block.Properties.copy(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SHALE_BRICK_STAIRS = BLOCKS.register("mossy_shale_brick_stairs", () -> new StrataStairsBlock(SHALE_BRICKS.get().defaultBlockState(), Block.Properties.copy(SHALE.get())));
        public static final RegistryObject<Block> MOSSY_SHALE_BRICK_WALL = BLOCKS.register("mossy_shale_brick_wall", () -> new WallBlock(Block.Properties.copy(SHALE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_SHALE = BLOCKS.register("polished_shale", () -> new Block(Block.Properties.of(Material.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().destroyTime(1.5f).explosionResistance(6.0f)));
        public static final RegistryObject<Block> POLISHED_SHALE_SLAB = BLOCKS.register("polished_shale_slab", () -> new SlabBlock(Block.Properties.copy(POLISHED_SHALE.get())));
        public static final RegistryObject<Block> POLISHED_SHALE_STAIRS = BLOCKS.register("polished_shale_stairs", () -> new StrataStairsBlock(POLISHED_SHALE.get().defaultBlockState(), Block.Properties.copy(POLISHED_SHALE.get())));


}

