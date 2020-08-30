package com.quizer9o8.strata.list;

import com.quizer9o8.strata.Strata;
import com.quizer9o8.strata.objects.blocks.StrataButtonBlock;
import com.quizer9o8.strata.objects.blocks.StrataPressurePlateBlock;
import com.quizer9o8.strata.objects.blocks.StrataStairsBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList
{
        //Deferred Registries Method
        public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, Strata.MOD_ID);

/*
        //Debug Blocks
        public static final RegistryObject<Block> DEBUG_BLOCK = BLOCKS.register("debug_block", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(0.0f, 0.0f).harvestLevel(0)));
        public static final RegistryObject<Block> DEBUG_SLAB = BLOCKS.register("debug_slab", () -> new SlabBlock(Block.Properties.from(DEBUG_BLOCK.get())));
        public static final RegistryObject<Block> DEBUG_STAIRS = BLOCKS.register("debug_stairs", () -> new StrataStairsBlock(DEBUG_BLOCK.get().getDefaultState(), Block.Properties.from(DEBUG_BLOCK.get())));
        public static final RegistryObject<Block> DEBUG_WALL = BLOCKS.register("debug_wall", () -> new WallBlock(Block.Properties.from(DEBUG_BLOCK.get())));
        //public static final RegistryObject<Block> DEBUG_ORE = BLOCKS.register("debug_ore", () -> new StrataOreBlock(Block.Properties.from(Blocks.IRON_ORE)));
*/

        /*Igneous Rocks*/

        //Aa
        public static final RegistryObject<Block> AA = BLOCKS.register("aa", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> AA_SLAB = BLOCKS.register("aa_slab", () -> new SlabBlock(Block.Properties.from(AA.get())));
        public static final RegistryObject<Block> AA_STAIRS = BLOCKS.register("aa_stairs", () -> new StrataStairsBlock(AA.get().getDefaultState(), Block.Properties.from(AA.get())));
        public static final RegistryObject<Block> AA_WALL = BLOCKS.register("aa_wall", () -> new WallBlock(Block.Properties.from(AA.get())));

        //Cobblestone
        public static final RegistryObject<Block> AA_COBBLESTONE = BLOCKS.register("aa_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> AA_COBBLESTONE_SLAB = BLOCKS.register("aa_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(AA_COBBLESTONE.get())));
        public static final RegistryObject<Block> AA_COBBLESTONE_STAIRS = BLOCKS.register("aa_cobblestone_stairs", () -> new StrataStairsBlock(AA_COBBLESTONE.get().getDefaultState(), Block.Properties.from(AA_COBBLESTONE.get())));
        public static final RegistryObject<Block> AA_COBBLESTONE_WALL = BLOCKS.register("aa_cobblestone_wall", () -> new WallBlock(Block.Properties.from(AA_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_AA_COBBLESTONE = BLOCKS.register("mossy_aa_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_AA_COBBLESTONE_SLAB = BLOCKS.register("mossy_aa_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_AA_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_AA_COBBLESTONE_STAIRS = BLOCKS.register("mossy_aa_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_AA_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_AA_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_AA_COBBLESTONE_WALL = BLOCKS.register("mossy_aa_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_AA_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> AA_BUTTON = BLOCKS.register("aa_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> AA_PRESSURE_PLATE = BLOCKS.register("aa_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> AA_BRICKS = BLOCKS.register("aa_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> AA_BRICK_SLAB = BLOCKS.register("aa_brick_slab", () -> new SlabBlock(Block.Properties.from(AA_BRICKS.get())));
        public static final RegistryObject<Block> AA_BRICK_STAIRS = BLOCKS.register("aa_brick_stairs", () -> new StrataStairsBlock(AA_BRICKS.get().getDefaultState(), Block.Properties.from(AA_BRICKS.get())));
        public static final RegistryObject<Block> AA_BRICK_WALL = BLOCKS.register("aa_brick_wall", () -> new WallBlock(Block.Properties.from(AA_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_AA_BRICKS = BLOCKS.register("chiseled_aa_bricks", () -> new Block(Block.Properties.from(AA_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_AA_BRICKS = BLOCKS.register("cracked_aa_bricks", () -> new Block(Block.Properties.from(AA_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_AA_BRICKS = BLOCKS.register("mossy_aa_bricks", () -> new Block(Block.Properties.from(AA_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_AA_BRICK_SLAB = BLOCKS.register("mossy_aa_brick_slab", () -> new SlabBlock(Block.Properties.from(AA_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_AA_BRICK_STAIRS = BLOCKS.register("mossy_aa_brick_stairs", () -> new StrataStairsBlock(AA_BRICKS.get().getDefaultState(), Block.Properties.from(AA.get())));
        public static final RegistryObject<Block> MOSSY_AA_BRICK_WALL = BLOCKS.register("mossy_aa_brick_wall", () -> new WallBlock(Block.Properties.from(AA_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_AA = BLOCKS.register("polished_aa", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_AA_SLAB = BLOCKS.register("polished_aa_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_AA.get())));
        public static final RegistryObject<Block> POLISHED_AA_STAIRS = BLOCKS.register("polished_aa_stairs", () -> new StrataStairsBlock(POLISHED_AA.get().getDefaultState(), Block.Properties.from(POLISHED_AA.get())));

        //Adakite
        public static final RegistryObject<Block> ADAKITE = BLOCKS.register("adakite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> ADAKITE_SLAB = BLOCKS.register("adakite_slab", () -> new SlabBlock(Block.Properties.from(ADAKITE.get())));
        public static final RegistryObject<Block> ADAKITE_STAIRS = BLOCKS.register("adakite_stairs", () -> new StrataStairsBlock(ADAKITE.get().getDefaultState(), Block.Properties.from(ADAKITE.get())));
        public static final RegistryObject<Block> ADAKITE_WALL = BLOCKS.register("adakite_wall", () -> new WallBlock(Block.Properties.from(ADAKITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> ADAKITE_COBBLESTONE = BLOCKS.register("adakite_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> ADAKITE_COBBLESTONE_SLAB = BLOCKS.register("adakite_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(ADAKITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ADAKITE_COBBLESTONE_STAIRS = BLOCKS.register("adakite_cobblestone_stairs", () -> new StrataStairsBlock(ADAKITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(ADAKITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ADAKITE_COBBLESTONE_WALL = BLOCKS.register("adakite_cobblestone_wall", () -> new WallBlock(Block.Properties.from(ADAKITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_ADAKITE_COBBLESTONE = BLOCKS.register("mossy_adakite_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_ADAKITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_adakite_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_ADAKITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ADAKITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_adakite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_ADAKITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_ADAKITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ADAKITE_COBBLESTONE_WALL = BLOCKS.register("mossy_adakite_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_ADAKITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> ADAKITE_BUTTON = BLOCKS.register("adakite_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> ADAKITE_PRESSURE_PLATE = BLOCKS.register("adakite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> ADAKITE_BRICKS = BLOCKS.register("adakite_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> ADAKITE_BRICK_SLAB = BLOCKS.register("adakite_brick_slab", () -> new SlabBlock(Block.Properties.from(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> ADAKITE_BRICK_STAIRS = BLOCKS.register("adakite_brick_stairs", () -> new StrataStairsBlock(ADAKITE_BRICKS.get().getDefaultState(), Block.Properties.from(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> ADAKITE_BRICK_WALL = BLOCKS.register("adakite_brick_wall", () -> new WallBlock(Block.Properties.from(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_ADAKITE_BRICKS = BLOCKS.register("chiseled_adakite_bricks", () -> new Block(Block.Properties.from(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_ADAKITE_BRICKS = BLOCKS.register("cracked_adakite_bricks", () -> new Block(Block.Properties.from(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ADAKITE_BRICKS = BLOCKS.register("mossy_adakite_bricks", () -> new Block(Block.Properties.from(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ADAKITE_BRICK_SLAB = BLOCKS.register("mossy_adakite_brick_slab", () -> new SlabBlock(Block.Properties.from(ADAKITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ADAKITE_BRICK_STAIRS = BLOCKS.register("mossy_adakite_brick_stairs", () -> new StrataStairsBlock(ADAKITE_BRICKS.get().getDefaultState(), Block.Properties.from(ADAKITE.get())));
        public static final RegistryObject<Block> MOSSY_ADAKITE_BRICK_WALL = BLOCKS.register("mossy_adakite_brick_wall", () -> new WallBlock(Block.Properties.from(ADAKITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_ADAKITE = BLOCKS.register("polished_adakite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_ADAKITE_SLAB = BLOCKS.register("polished_adakite_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_ADAKITE.get())));
        public static final RegistryObject<Block> POLISHED_ADAKITE_STAIRS = BLOCKS.register("polished_adakite_stairs", () -> new StrataStairsBlock(POLISHED_ADAKITE.get().getDefaultState(), Block.Properties.from(POLISHED_ADAKITE.get())));

        //Basalt
        public static final RegistryObject<Block> BASALT = BLOCKS.register("basalt", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> BASALT_SLAB = BLOCKS.register("basalt_slab", () -> new SlabBlock(Block.Properties.from(BASALT.get())));
        public static final RegistryObject<Block> BASALT_STAIRS = BLOCKS.register("basalt_stairs", () -> new StrataStairsBlock(BASALT.get().getDefaultState(), Block.Properties.from(BASALT.get())));
        public static final RegistryObject<Block> BASALT_WALL = BLOCKS.register("basalt_wall", () -> new WallBlock(Block.Properties.from(BASALT.get())));

        //Cobblestone
        public static final RegistryObject<Block> BASALT_COBBLESTONE = BLOCKS.register("basalt_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> BASALT_COBBLESTONE_SLAB = BLOCKS.register("basalt_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(BASALT_COBBLESTONE.get())));
        public static final RegistryObject<Block> BASALT_COBBLESTONE_STAIRS = BLOCKS.register("basalt_cobblestone_stairs", () -> new StrataStairsBlock(BASALT_COBBLESTONE.get().getDefaultState(), Block.Properties.from(BASALT_COBBLESTONE.get())));
        public static final RegistryObject<Block> BASALT_COBBLESTONE_WALL = BLOCKS.register("basalt_cobblestone_wall", () -> new WallBlock(Block.Properties.from(BASALT_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_BASALT_COBBLESTONE = BLOCKS.register("mossy_basalt_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_BASALT_COBBLESTONE_SLAB = BLOCKS.register("mossy_basalt_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_BASALT_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_BASALT_COBBLESTONE_STAIRS = BLOCKS.register("mossy_basalt_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_BASALT_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_BASALT_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_BASALT_COBBLESTONE_WALL = BLOCKS.register("mossy_basalt_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_BASALT_COBBLESTONE.get())));
        
        //Buttons
        public static final RegistryObject<Block> BASALT_BUTTON = BLOCKS.register("basalt_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));
        
        //Pressure Plates
        public static final RegistryObject<Block> BASALT_PRESSURE_PLATE = BLOCKS.register("basalt_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));
        
        //Bricks
        public static final RegistryObject<Block> BASALT_BRICKS = BLOCKS.register("basalt_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> BASALT_BRICK_SLAB = BLOCKS.register("basalt_brick_slab", () -> new SlabBlock(Block.Properties.from(BASALT_BRICKS.get())));
        public static final RegistryObject<Block> BASALT_BRICK_STAIRS = BLOCKS.register("basalt_brick_stairs", () -> new StrataStairsBlock(BASALT_BRICKS.get().getDefaultState(), Block.Properties.from(BASALT_BRICKS.get())));
        public static final RegistryObject<Block> BASALT_BRICK_WALL = BLOCKS.register("basalt_brick_wall", () -> new WallBlock(Block.Properties.from(BASALT_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_BASALT_BRICKS = BLOCKS.register("chiseled_basalt_bricks", () -> new Block(Block.Properties.from(BASALT_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_BASALT_BRICKS = BLOCKS.register("cracked_basalt_bricks", () -> new Block(Block.Properties.from(BASALT_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_BASALT_BRICKS = BLOCKS.register("mossy_basalt_bricks", () -> new Block(Block.Properties.from(BASALT_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_BASALT_BRICK_SLAB = BLOCKS.register("mossy_basalt_brick_slab", () -> new SlabBlock(Block.Properties.from(BASALT_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_BASALT_BRICK_STAIRS = BLOCKS.register("mossy_basalt_brick_stairs", () -> new StrataStairsBlock(BASALT_BRICKS.get().getDefaultState(), Block.Properties.from(BASALT.get())));
        public static final RegistryObject<Block> MOSSY_BASALT_BRICK_WALL = BLOCKS.register("mossy_basalt_brick_wall", () -> new WallBlock(Block.Properties.from(BASALT_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_BASALT = BLOCKS.register("polished_basalt", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_BASALT_SLAB = BLOCKS.register("polished_basalt_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_BASALT.get())));
        public static final RegistryObject<Block> POLISHED_BASALT_STAIRS = BLOCKS.register("polished_basalt_stairs", () -> new StrataStairsBlock(POLISHED_BASALT.get().getDefaultState(), Block.Properties.from(POLISHED_BASALT.get())));

        //Gabbro
        public static final RegistryObject<Block> GABBRO = BLOCKS.register("gabbro", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> GABBRO_SLAB = BLOCKS.register("gabbro_slab", () -> new SlabBlock(Block.Properties.from(GABBRO.get())));
        public static final RegistryObject<Block> GABBRO_STAIRS = BLOCKS.register("gabbro_stairs", () -> new StrataStairsBlock(GABBRO.get().getDefaultState(), Block.Properties.from(GABBRO.get())));
        public static final RegistryObject<Block> GABBRO_WALL = BLOCKS.register("gabbro_wall", () -> new WallBlock(Block.Properties.from(GABBRO.get())));

        //Cobblestone
        public static final RegistryObject<Block> GABBRO_COBBLESTONE = BLOCKS.register("gabbro_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> GABBRO_COBBLESTONE_SLAB = BLOCKS.register("gabbro_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(GABBRO_COBBLESTONE.get())));
        public static final RegistryObject<Block> GABBRO_COBBLESTONE_STAIRS = BLOCKS.register("gabbro_cobblestone_stairs", () -> new StrataStairsBlock(GABBRO_COBBLESTONE.get().getDefaultState(), Block.Properties.from(GABBRO_COBBLESTONE.get())));
        public static final RegistryObject<Block> GABBRO_COBBLESTONE_WALL = BLOCKS.register("gabbro_cobblestone_wall", () -> new WallBlock(Block.Properties.from(GABBRO_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_GABBRO_COBBLESTONE = BLOCKS.register("mossy_gabbro_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_GABBRO_COBBLESTONE_SLAB = BLOCKS.register("mossy_gabbro_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_GABBRO_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_GABBRO_COBBLESTONE_STAIRS = BLOCKS.register("mossy_gabbro_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_GABBRO_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_GABBRO_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_GABBRO_COBBLESTONE_WALL = BLOCKS.register("mossy_gabbro_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_GABBRO_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> GABBRO_BUTTON = BLOCKS.register("gabbro_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> GABBRO_PRESSURE_PLATE = BLOCKS.register("gabbro_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> GABBRO_BRICKS = BLOCKS.register("gabbro_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> GABBRO_BRICK_SLAB = BLOCKS.register("gabbro_brick_slab", () -> new SlabBlock(Block.Properties.from(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> GABBRO_BRICK_STAIRS = BLOCKS.register("gabbro_brick_stairs", () -> new StrataStairsBlock(GABBRO_BRICKS.get().getDefaultState(), Block.Properties.from(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> GABBRO_BRICK_WALL = BLOCKS.register("gabbro_brick_wall", () -> new WallBlock(Block.Properties.from(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_GABBRO_BRICKS = BLOCKS.register("chiseled_gabbro_bricks", () -> new Block(Block.Properties.from(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_GABBRO_BRICKS = BLOCKS.register("cracked_gabbro_bricks", () -> new Block(Block.Properties.from(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_GABBRO_BRICKS = BLOCKS.register("mossy_gabbro_bricks", () -> new Block(Block.Properties.from(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_GABBRO_BRICK_SLAB = BLOCKS.register("mossy_gabbro_brick_slab", () -> new SlabBlock(Block.Properties.from(GABBRO_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_GABBRO_BRICK_STAIRS = BLOCKS.register("mossy_gabbro_brick_stairs", () -> new StrataStairsBlock(GABBRO_BRICKS.get().getDefaultState(), Block.Properties.from(GABBRO.get())));
        public static final RegistryObject<Block> MOSSY_GABBRO_BRICK_WALL = BLOCKS.register("mossy_gabbro_brick_wall", () -> new WallBlock(Block.Properties.from(GABBRO_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_GABBRO = BLOCKS.register("polished_gabbro", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_GABBRO_SLAB = BLOCKS.register("polished_gabbro_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_GABBRO.get())));
        public static final RegistryObject<Block> POLISHED_GABBRO_STAIRS = BLOCKS.register("polished_gabbro_stairs", () -> new StrataStairsBlock(POLISHED_GABBRO.get().getDefaultState(), Block.Properties.from(POLISHED_GABBRO.get())));

        //Pahoehoe
        public static final RegistryObject<Block> PAHOEHOE = BLOCKS.register("pahoehoe", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> PAHOEHOE_SLAB = BLOCKS.register("pahoehoe_slab", () -> new SlabBlock(Block.Properties.from(PAHOEHOE.get())));
        public static final RegistryObject<Block> PAHOEHOE_STAIRS = BLOCKS.register("pahoehoe_stairs", () -> new StrataStairsBlock(PAHOEHOE.get().getDefaultState(), Block.Properties.from(PAHOEHOE.get())));
        public static final RegistryObject<Block> PAHOEHOE_WALL = BLOCKS.register("pahoehoe_wall", () -> new WallBlock(Block.Properties.from(PAHOEHOE.get())));

        //Cobblestone
        public static final RegistryObject<Block> PAHOEHOE_COBBLESTONE = BLOCKS.register("pahoehoe_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> PAHOEHOE_COBBLESTONE_SLAB = BLOCKS.register("pahoehoe_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(PAHOEHOE_COBBLESTONE.get())));
        public static final RegistryObject<Block> PAHOEHOE_COBBLESTONE_STAIRS = BLOCKS.register("pahoehoe_cobblestone_stairs", () -> new StrataStairsBlock(PAHOEHOE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(PAHOEHOE_COBBLESTONE.get())));
        public static final RegistryObject<Block> PAHOEHOE_COBBLESTONE_WALL = BLOCKS.register("pahoehoe_cobblestone_wall", () -> new WallBlock(Block.Properties.from(PAHOEHOE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_COBBLESTONE = BLOCKS.register("mossy_pahoehoe_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_COBBLESTONE_SLAB = BLOCKS.register("mossy_pahoehoe_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_PAHOEHOE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_pahoehoe_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_PAHOEHOE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_PAHOEHOE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_COBBLESTONE_WALL = BLOCKS.register("mossy_pahoehoe_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_PAHOEHOE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> PAHOEHOE_BUTTON = BLOCKS.register("pahoehoe_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> PAHOEHOE_PRESSURE_PLATE = BLOCKS.register("pahoehoe_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> PAHOEHOE_BRICKS = BLOCKS.register("pahoehoe_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> PAHOEHOE_BRICK_SLAB = BLOCKS.register("pahoehoe_brick_slab", () -> new SlabBlock(Block.Properties.from(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> PAHOEHOE_BRICK_STAIRS = BLOCKS.register("pahoehoe_brick_stairs", () -> new StrataStairsBlock(PAHOEHOE_BRICKS.get().getDefaultState(), Block.Properties.from(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> PAHOEHOE_BRICK_WALL = BLOCKS.register("pahoehoe_brick_wall", () -> new WallBlock(Block.Properties.from(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_PAHOEHOE_BRICKS = BLOCKS.register("chiseled_pahoehoe_bricks", () -> new Block(Block.Properties.from(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_PAHOEHOE_BRICKS = BLOCKS.register("cracked_pahoehoe_bricks", () -> new Block(Block.Properties.from(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_BRICKS = BLOCKS.register("mossy_pahoehoe_bricks", () -> new Block(Block.Properties.from(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_BRICK_SLAB = BLOCKS.register("mossy_pahoehoe_brick_slab", () -> new SlabBlock(Block.Properties.from(PAHOEHOE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_BRICK_STAIRS = BLOCKS.register("mossy_pahoehoe_brick_stairs", () -> new StrataStairsBlock(PAHOEHOE_BRICKS.get().getDefaultState(), Block.Properties.from(PAHOEHOE.get())));
        public static final RegistryObject<Block> MOSSY_PAHOEHOE_BRICK_WALL = BLOCKS.register("mossy_pahoehoe_brick_wall", () -> new WallBlock(Block.Properties.from(PAHOEHOE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_PAHOEHOE = BLOCKS.register("polished_pahoehoe", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_PAHOEHOE_SLAB = BLOCKS.register("polished_pahoehoe_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_PAHOEHOE.get())));
        public static final RegistryObject<Block> POLISHED_PAHOEHOE_STAIRS = BLOCKS.register("polished_pahoehoe_stairs", () -> new StrataStairsBlock(POLISHED_PAHOEHOE.get().getDefaultState(), Block.Properties.from(POLISHED_PAHOEHOE.get())));

        /*Metamorphic Rocks*/

        //Amphibolite
        public static final RegistryObject<Block> AMPHIBOLITE = BLOCKS.register("amphibolite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> AMPHIBOLITE_SLAB = BLOCKS.register("amphibolite_slab", () -> new SlabBlock(Block.Properties.from(AMPHIBOLITE.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_STAIRS = BLOCKS.register("amphibolite_stairs", () -> new StrataStairsBlock(AMPHIBOLITE.get().getDefaultState(), Block.Properties.from(AMPHIBOLITE.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_WALL = BLOCKS.register("amphibolite_wall", () -> new WallBlock(Block.Properties.from(AMPHIBOLITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> AMPHIBOLITE_COBBLESTONE = BLOCKS.register("amphibolite_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> AMPHIBOLITE_COBBLESTONE_SLAB = BLOCKS.register("amphibolite_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(AMPHIBOLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_COBBLESTONE_STAIRS = BLOCKS.register("amphibolite_cobblestone_stairs", () -> new StrataStairsBlock(AMPHIBOLITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(AMPHIBOLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_COBBLESTONE_WALL = BLOCKS.register("amphibolite_cobblestone_wall", () -> new WallBlock(Block.Properties.from(AMPHIBOLITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_COBBLESTONE = BLOCKS.register("mossy_amphibolite_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_amphibolite_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_AMPHIBOLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_amphibolite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_AMPHIBOLITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_AMPHIBOLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_COBBLESTONE_WALL = BLOCKS.register("mossy_amphibolite_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_AMPHIBOLITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> AMPHIBOLITE_BUTTON = BLOCKS.register("amphibolite_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> AMPHIBOLITE_PRESSURE_PLATE = BLOCKS.register("amphibolite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> AMPHIBOLITE_BRICKS = BLOCKS.register("amphibolite_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> AMPHIBOLITE_BRICK_SLAB = BLOCKS.register("amphibolite_brick_slab", () -> new SlabBlock(Block.Properties.from(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_BRICK_STAIRS = BLOCKS.register("amphibolite_brick_stairs", () -> new StrataStairsBlock(AMPHIBOLITE_BRICKS.get().getDefaultState(), Block.Properties.from(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_BRICK_WALL = BLOCKS.register("amphibolite_brick_wall", () -> new WallBlock(Block.Properties.from(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_AMPHIBOLITE_BRICKS = BLOCKS.register("chiseled_amphibolite_bricks", () -> new Block(Block.Properties.from(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_AMPHIBOLITE_BRICKS = BLOCKS.register("cracked_amphibolite_bricks", () -> new Block(Block.Properties.from(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_BRICKS = BLOCKS.register("mossy_amphibolite_bricks", () -> new Block(Block.Properties.from(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_BRICK_SLAB = BLOCKS.register("mossy_amphibolite_brick_slab", () -> new SlabBlock(Block.Properties.from(AMPHIBOLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_BRICK_STAIRS = BLOCKS.register("mossy_amphibolite_brick_stairs", () -> new StrataStairsBlock(AMPHIBOLITE_BRICKS.get().getDefaultState(), Block.Properties.from(AMPHIBOLITE.get())));
        public static final RegistryObject<Block> MOSSY_AMPHIBOLITE_BRICK_WALL = BLOCKS.register("mossy_amphibolite_brick_wall", () -> new WallBlock(Block.Properties.from(AMPHIBOLITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_AMPHIBOLITE = BLOCKS.register("polished_amphibolite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_AMPHIBOLITE_SLAB = BLOCKS.register("polished_amphibolite_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_AMPHIBOLITE.get())));
        public static final RegistryObject<Block> POLISHED_AMPHIBOLITE_STAIRS = BLOCKS.register("polished_amphibolite_stairs", () -> new StrataStairsBlock(POLISHED_AMPHIBOLITE.get().getDefaultState(), Block.Properties.from(POLISHED_AMPHIBOLITE.get())));

        //Eclogite
        public static final RegistryObject<Block> ECLOGITE = BLOCKS.register("eclogite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> ECLOGITE_SLAB = BLOCKS.register("eclogite_slab", () -> new SlabBlock(Block.Properties.from(ECLOGITE.get())));
        public static final RegistryObject<Block> ECLOGITE_STAIRS = BLOCKS.register("eclogite_stairs", () -> new StrataStairsBlock(ECLOGITE.get().getDefaultState(), Block.Properties.from(ECLOGITE.get())));
        public static final RegistryObject<Block> ECLOGITE_WALL = BLOCKS.register("eclogite_wall", () -> new WallBlock(Block.Properties.from(ECLOGITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> ECLOGITE_COBBLESTONE = BLOCKS.register("eclogite_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> ECLOGITE_COBBLESTONE_SLAB = BLOCKS.register("eclogite_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(ECLOGITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ECLOGITE_COBBLESTONE_STAIRS = BLOCKS.register("eclogite_cobblestone_stairs", () -> new StrataStairsBlock(ECLOGITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(ECLOGITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ECLOGITE_COBBLESTONE_WALL = BLOCKS.register("eclogite_cobblestone_wall", () -> new WallBlock(Block.Properties.from(ECLOGITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_ECLOGITE_COBBLESTONE = BLOCKS.register("mossy_eclogite_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_eclogite_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_ECLOGITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_eclogite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_ECLOGITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_ECLOGITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_COBBLESTONE_WALL = BLOCKS.register("mossy_eclogite_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_ECLOGITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> ECLOGITE_BUTTON = BLOCKS.register("eclogite_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> ECLOGITE_PRESSURE_PLATE = BLOCKS.register("eclogite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> ECLOGITE_BRICKS = BLOCKS.register("eclogite_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> ECLOGITE_BRICK_SLAB = BLOCKS.register("eclogite_brick_slab", () -> new SlabBlock(Block.Properties.from(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> ECLOGITE_BRICK_STAIRS = BLOCKS.register("eclogite_brick_stairs", () -> new StrataStairsBlock(ECLOGITE_BRICKS.get().getDefaultState(), Block.Properties.from(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> ECLOGITE_BRICK_WALL = BLOCKS.register("eclogite_brick_wall", () -> new WallBlock(Block.Properties.from(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_ECLOGITE_BRICKS = BLOCKS.register("chiseled_eclogite_bricks", () -> new Block(Block.Properties.from(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_ECLOGITE_BRICKS = BLOCKS.register("cracked_eclogite_bricks", () -> new Block(Block.Properties.from(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_BRICKS = BLOCKS.register("mossy_eclogite_bricks", () -> new Block(Block.Properties.from(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_BRICK_SLAB = BLOCKS.register("mossy_eclogite_brick_slab", () -> new SlabBlock(Block.Properties.from(ECLOGITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_BRICK_STAIRS = BLOCKS.register("mossy_eclogite_brick_stairs", () -> new StrataStairsBlock(ECLOGITE_BRICKS.get().getDefaultState(), Block.Properties.from(ECLOGITE.get())));
        public static final RegistryObject<Block> MOSSY_ECLOGITE_BRICK_WALL = BLOCKS.register("mossy_eclogite_brick_wall", () -> new WallBlock(Block.Properties.from(ECLOGITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_ECLOGITE = BLOCKS.register("polished_eclogite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_ECLOGITE_SLAB = BLOCKS.register("polished_eclogite_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_ECLOGITE.get())));
        public static final RegistryObject<Block> POLISHED_ECLOGITE_STAIRS = BLOCKS.register("polished_eclogite_stairs", () -> new StrataStairsBlock(POLISHED_ECLOGITE.get().getDefaultState(), Block.Properties.from(POLISHED_ECLOGITE.get())));

        //Gneiss
        public static final RegistryObject<Block> GNEISS = BLOCKS.register("gneiss", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> GNEISS_SLAB = BLOCKS.register("gneiss_slab", () -> new SlabBlock(Block.Properties.from(GNEISS.get())));
        public static final RegistryObject<Block> GNEISS_STAIRS = BLOCKS.register("gneiss_stairs", () -> new StrataStairsBlock(GNEISS.get().getDefaultState(), Block.Properties.from(GNEISS.get())));
        public static final RegistryObject<Block> GNEISS_WALL = BLOCKS.register("gneiss_wall", () -> new WallBlock(Block.Properties.from(GNEISS.get())));

        //Cobblestone
        public static final RegistryObject<Block> GNEISS_COBBLESTONE = BLOCKS.register("gneiss_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> GNEISS_COBBLESTONE_SLAB = BLOCKS.register("gneiss_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(GNEISS_COBBLESTONE.get())));
        public static final RegistryObject<Block> GNEISS_COBBLESTONE_STAIRS = BLOCKS.register("gneiss_cobblestone_stairs", () -> new StrataStairsBlock(GNEISS_COBBLESTONE.get().getDefaultState(), Block.Properties.from(GNEISS_COBBLESTONE.get())));
        public static final RegistryObject<Block> GNEISS_COBBLESTONE_WALL = BLOCKS.register("gneiss_cobblestone_wall", () -> new WallBlock(Block.Properties.from(GNEISS_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_GNEISS_COBBLESTONE = BLOCKS.register("mossy_gneiss_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_GNEISS_COBBLESTONE_SLAB = BLOCKS.register("mossy_gneiss_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_GNEISS_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_GNEISS_COBBLESTONE_STAIRS = BLOCKS.register("mossy_gneiss_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_GNEISS_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_GNEISS_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_GNEISS_COBBLESTONE_WALL = BLOCKS.register("mossy_gneiss_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_GNEISS_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> GNEISS_BUTTON = BLOCKS.register("gneiss_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> GNEISS_PRESSURE_PLATE = BLOCKS.register("gneiss_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> GNEISS_BRICKS = BLOCKS.register("gneiss_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> GNEISS_BRICK_SLAB = BLOCKS.register("gneiss_brick_slab", () -> new SlabBlock(Block.Properties.from(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> GNEISS_BRICK_STAIRS = BLOCKS.register("gneiss_brick_stairs", () -> new StrataStairsBlock(GNEISS_BRICKS.get().getDefaultState(), Block.Properties.from(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> GNEISS_BRICK_WALL = BLOCKS.register("gneiss_brick_wall", () -> new WallBlock(Block.Properties.from(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_GNEISS_BRICKS = BLOCKS.register("chiseled_gneiss_bricks", () -> new Block(Block.Properties.from(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_GNEISS_BRICKS = BLOCKS.register("cracked_gneiss_bricks", () -> new Block(Block.Properties.from(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_GNEISS_BRICKS = BLOCKS.register("mossy_gneiss_bricks", () -> new Block(Block.Properties.from(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_GNEISS_BRICK_SLAB = BLOCKS.register("mossy_gneiss_brick_slab", () -> new SlabBlock(Block.Properties.from(GNEISS_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_GNEISS_BRICK_STAIRS = BLOCKS.register("mossy_gneiss_brick_stairs", () -> new StrataStairsBlock(GNEISS_BRICKS.get().getDefaultState(), Block.Properties.from(GNEISS.get())));
        public static final RegistryObject<Block> MOSSY_GNEISS_BRICK_WALL = BLOCKS.register("mossy_gneiss_brick_wall", () -> new WallBlock(Block.Properties.from(GNEISS_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_GNEISS = BLOCKS.register("polished_gneiss", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_GNEISS_SLAB = BLOCKS.register("polished_gneiss_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_GNEISS.get())));
        public static final RegistryObject<Block> POLISHED_GNEISS_STAIRS = BLOCKS.register("polished_gneiss_stairs", () -> new StrataStairsBlock(POLISHED_GNEISS.get().getDefaultState(), Block.Properties.from(POLISHED_GNEISS.get())));

        //Marble
        public static final RegistryObject<Block> MARBLE = BLOCKS.register("marble", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MARBLE_SLAB = BLOCKS.register("marble_slab", () -> new SlabBlock(Block.Properties.from(MARBLE.get())));
        public static final RegistryObject<Block> MARBLE_STAIRS = BLOCKS.register("marble_stairs", () -> new StrataStairsBlock(MARBLE.get().getDefaultState(), Block.Properties.from(MARBLE.get())));
        public static final RegistryObject<Block> MARBLE_WALL = BLOCKS.register("marble_wall", () -> new WallBlock(Block.Properties.from(MARBLE.get())));

        //Cobblestone
        public static final RegistryObject<Block> MARBLE_COBBLESTONE = BLOCKS.register("marble_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MARBLE_COBBLESTONE_SLAB = BLOCKS.register("marble_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MARBLE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MARBLE_COBBLESTONE_STAIRS = BLOCKS.register("marble_cobblestone_stairs", () -> new StrataStairsBlock(MARBLE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MARBLE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MARBLE_COBBLESTONE_WALL = BLOCKS.register("marble_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MARBLE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE = BLOCKS.register("mossy_marble_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_SLAB = BLOCKS.register("mossy_marble_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_MARBLE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_marble_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_MARBLE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_MARBLE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_MARBLE_COBBLESTONE_WALL = BLOCKS.register("mossy_marble_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_MARBLE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> MARBLE_BUTTON = BLOCKS.register("marble_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> MARBLE_PRESSURE_PLATE = BLOCKS.register("marble_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> MARBLE_BRICKS = BLOCKS.register("marble_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MARBLE_BRICK_SLAB = BLOCKS.register("marble_brick_slab", () -> new SlabBlock(Block.Properties.from(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> MARBLE_BRICK_STAIRS = BLOCKS.register("marble_brick_stairs", () -> new StrataStairsBlock(MARBLE_BRICKS.get().getDefaultState(), Block.Properties.from(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> MARBLE_BRICK_WALL = BLOCKS.register("marble_brick_wall", () -> new WallBlock(Block.Properties.from(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_MARBLE_BRICKS = BLOCKS.register("chiseled_marble_bricks", () -> new Block(Block.Properties.from(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_MARBLE_BRICKS = BLOCKS.register("cracked_marble_bricks", () -> new Block(Block.Properties.from(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_MARBLE_BRICKS = BLOCKS.register("mossy_marble_bricks", () -> new Block(Block.Properties.from(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_MARBLE_BRICK_SLAB = BLOCKS.register("mossy_marble_brick_slab", () -> new SlabBlock(Block.Properties.from(MARBLE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_MARBLE_BRICK_STAIRS = BLOCKS.register("mossy_marble_brick_stairs", () -> new StrataStairsBlock(MARBLE_BRICKS.get().getDefaultState(), Block.Properties.from(MARBLE.get())));
        public static final RegistryObject<Block> MOSSY_MARBLE_BRICK_WALL = BLOCKS.register("mossy_marble_brick_wall", () -> new WallBlock(Block.Properties.from(MARBLE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_MARBLE = BLOCKS.register("polished_marble", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_MARBLE_SLAB = BLOCKS.register("polished_marble_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_MARBLE.get())));
        public static final RegistryObject<Block> POLISHED_MARBLE_STAIRS = BLOCKS.register("polished_marble_stairs", () -> new StrataStairsBlock(POLISHED_MARBLE.get().getDefaultState(), Block.Properties.from(POLISHED_MARBLE.get())));

        //Schist
        public static final RegistryObject<Block> SCHIST = BLOCKS.register("schist", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> SCHIST_SLAB = BLOCKS.register("schist_slab", () -> new SlabBlock(Block.Properties.from(SCHIST.get())));
        public static final RegistryObject<Block> SCHIST_STAIRS = BLOCKS.register("schist_stairs", () -> new StrataStairsBlock(SCHIST.get().getDefaultState(), Block.Properties.from(SCHIST.get())));
        public static final RegistryObject<Block> SCHIST_WALL = BLOCKS.register("schist_wall", () -> new WallBlock(Block.Properties.from(SCHIST.get())));

        //Cobblestone
        public static final RegistryObject<Block> SCHIST_COBBLESTONE = BLOCKS.register("schist_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> SCHIST_COBBLESTONE_SLAB = BLOCKS.register("schist_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(SCHIST_COBBLESTONE.get())));
        public static final RegistryObject<Block> SCHIST_COBBLESTONE_STAIRS = BLOCKS.register("schist_cobblestone_stairs", () -> new StrataStairsBlock(SCHIST_COBBLESTONE.get().getDefaultState(), Block.Properties.from(SCHIST_COBBLESTONE.get())));
        public static final RegistryObject<Block> SCHIST_COBBLESTONE_WALL = BLOCKS.register("schist_cobblestone_wall", () -> new WallBlock(Block.Properties.from(SCHIST_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_SCHIST_COBBLESTONE = BLOCKS.register("mossy_schist_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_SCHIST_COBBLESTONE_SLAB = BLOCKS.register("mossy_schist_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_SCHIST_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_SCHIST_COBBLESTONE_STAIRS = BLOCKS.register("mossy_schist_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_SCHIST_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_SCHIST_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_SCHIST_COBBLESTONE_WALL = BLOCKS.register("mossy_schist_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_SCHIST_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> SCHIST_BUTTON = BLOCKS.register("schist_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> SCHIST_PRESSURE_PLATE = BLOCKS.register("schist_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> SCHIST_BRICKS = BLOCKS.register("schist_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> SCHIST_BRICK_SLAB = BLOCKS.register("schist_brick_slab", () -> new SlabBlock(Block.Properties.from(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> SCHIST_BRICK_STAIRS = BLOCKS.register("schist_brick_stairs", () -> new StrataStairsBlock(SCHIST_BRICKS.get().getDefaultState(), Block.Properties.from(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> SCHIST_BRICK_WALL = BLOCKS.register("schist_brick_wall", () -> new WallBlock(Block.Properties.from(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_SCHIST_BRICKS = BLOCKS.register("chiseled_schist_bricks", () -> new Block(Block.Properties.from(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_SCHIST_BRICKS = BLOCKS.register("cracked_schist_bricks", () -> new Block(Block.Properties.from(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SCHIST_BRICKS = BLOCKS.register("mossy_schist_bricks", () -> new Block(Block.Properties.from(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SCHIST_BRICK_SLAB = BLOCKS.register("mossy_schist_brick_slab", () -> new SlabBlock(Block.Properties.from(SCHIST_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SCHIST_BRICK_STAIRS = BLOCKS.register("mossy_schist_brick_stairs", () -> new StrataStairsBlock(SCHIST_BRICKS.get().getDefaultState(), Block.Properties.from(SCHIST.get())));
        public static final RegistryObject<Block> MOSSY_SCHIST_BRICK_WALL = BLOCKS.register("mossy_schist_brick_wall", () -> new WallBlock(Block.Properties.from(SCHIST_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_SCHIST = BLOCKS.register("polished_schist", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_SCHIST_SLAB = BLOCKS.register("polished_schist_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_SCHIST.get())));
        public static final RegistryObject<Block> POLISHED_SCHIST_STAIRS = BLOCKS.register("polished_schist_stairs", () -> new StrataStairsBlock(POLISHED_SCHIST.get().getDefaultState(), Block.Properties.from(POLISHED_SCHIST.get())));

        /*Sedimentary Rocks*/

        //Argillite
        public static final RegistryObject<Block> ARGILLITE = BLOCKS.register("argillite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> ARGILLITE_SLAB = BLOCKS.register("argillite_slab", () -> new SlabBlock(Block.Properties.from(ARGILLITE.get())));
        public static final RegistryObject<Block> ARGILLITE_STAIRS = BLOCKS.register("argillite_stairs", () -> new StrataStairsBlock(ARGILLITE.get().getDefaultState(), Block.Properties.from(ARGILLITE.get())));
        public static final RegistryObject<Block> ARGILLITE_WALL = BLOCKS.register("argillite_wall", () -> new WallBlock(Block.Properties.from(ARGILLITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> ARGILLITE_COBBLESTONE = BLOCKS.register("argillite_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> ARGILLITE_COBBLESTONE_SLAB = BLOCKS.register("argillite_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(ARGILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ARGILLITE_COBBLESTONE_STAIRS = BLOCKS.register("argillite_cobblestone_stairs", () -> new StrataStairsBlock(ARGILLITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(ARGILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> ARGILLITE_COBBLESTONE_WALL = BLOCKS.register("argillite_cobblestone_wall", () -> new WallBlock(Block.Properties.from(ARGILLITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_ARGILLITE_COBBLESTONE = BLOCKS.register("mossy_argillite_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_argillite_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_ARGILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_argillite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_ARGILLITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_ARGILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_COBBLESTONE_WALL = BLOCKS.register("mossy_argillite_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_ARGILLITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> ARGILLITE_BUTTON = BLOCKS.register("argillite_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> ARGILLITE_PRESSURE_PLATE = BLOCKS.register("argillite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> ARGILLITE_BRICKS = BLOCKS.register("argillite_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> ARGILLITE_BRICK_SLAB = BLOCKS.register("argillite_brick_slab", () -> new SlabBlock(Block.Properties.from(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> ARGILLITE_BRICK_STAIRS = BLOCKS.register("argillite_brick_stairs", () -> new StrataStairsBlock(ARGILLITE_BRICKS.get().getDefaultState(), Block.Properties.from(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> ARGILLITE_BRICK_WALL = BLOCKS.register("argillite_brick_wall", () -> new WallBlock(Block.Properties.from(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_ARGILLITE_BRICKS = BLOCKS.register("chiseled_argillite_bricks", () -> new Block(Block.Properties.from(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_ARGILLITE_BRICKS = BLOCKS.register("cracked_argillite_bricks", () -> new Block(Block.Properties.from(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_BRICKS = BLOCKS.register("mossy_argillite_bricks", () -> new Block(Block.Properties.from(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_BRICK_SLAB = BLOCKS.register("mossy_argillite_brick_slab", () -> new SlabBlock(Block.Properties.from(ARGILLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_BRICK_STAIRS = BLOCKS.register("mossy_argillite_brick_stairs", () -> new StrataStairsBlock(ARGILLITE_BRICKS.get().getDefaultState(), Block.Properties.from(ARGILLITE.get())));
        public static final RegistryObject<Block> MOSSY_ARGILLITE_BRICK_WALL = BLOCKS.register("mossy_argillite_brick_wall", () -> new WallBlock(Block.Properties.from(ARGILLITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_ARGILLITE = BLOCKS.register("polished_argillite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_ARGILLITE_SLAB = BLOCKS.register("polished_argillite_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_ARGILLITE.get())));
        public static final RegistryObject<Block> POLISHED_ARGILLITE_STAIRS = BLOCKS.register("polished_argillite_stairs", () -> new StrataStairsBlock(POLISHED_ARGILLITE.get().getDefaultState(), Block.Properties.from(POLISHED_ARGILLITE.get())));

        //Chalk
        public static final RegistryObject<Block> CHALK = BLOCKS.register("chalk", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> CHALK_SLAB = BLOCKS.register("chalk_slab", () -> new SlabBlock(Block.Properties.from(CHALK.get())));
        public static final RegistryObject<Block> CHALK_STAIRS = BLOCKS.register("chalk_stairs", () -> new StrataStairsBlock(CHALK.get().getDefaultState(), Block.Properties.from(CHALK.get())));
        public static final RegistryObject<Block> CHALK_WALL = BLOCKS.register("chalk_wall", () -> new WallBlock(Block.Properties.from(CHALK.get())));

        //Cobblestone
        public static final RegistryObject<Block> CHALK_COBBLESTONE = BLOCKS.register("chalk_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> CHALK_COBBLESTONE_SLAB = BLOCKS.register("chalk_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(CHALK_COBBLESTONE.get())));
        public static final RegistryObject<Block> CHALK_COBBLESTONE_STAIRS = BLOCKS.register("chalk_cobblestone_stairs", () -> new StrataStairsBlock(CHALK_COBBLESTONE.get().getDefaultState(), Block.Properties.from(CHALK_COBBLESTONE.get())));
        public static final RegistryObject<Block> CHALK_COBBLESTONE_WALL = BLOCKS.register("chalk_cobblestone_wall", () -> new WallBlock(Block.Properties.from(CHALK_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_CHALK_COBBLESTONE = BLOCKS.register("mossy_chalk_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_CHALK_COBBLESTONE_SLAB = BLOCKS.register("mossy_chalk_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_CHALK_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_CHALK_COBBLESTONE_STAIRS = BLOCKS.register("mossy_chalk_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_CHALK_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_CHALK_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_CHALK_COBBLESTONE_WALL = BLOCKS.register("mossy_chalk_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_CHALK_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> CHALK_BUTTON = BLOCKS.register("chalk_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> CHALK_PRESSURE_PLATE = BLOCKS.register("chalk_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> CHALK_BRICKS = BLOCKS.register("chalk_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> CHALK_BRICK_SLAB = BLOCKS.register("chalk_brick_slab", () -> new SlabBlock(Block.Properties.from(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> CHALK_BRICK_STAIRS = BLOCKS.register("chalk_brick_stairs", () -> new StrataStairsBlock(CHALK_BRICKS.get().getDefaultState(), Block.Properties.from(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> CHALK_BRICK_WALL = BLOCKS.register("chalk_brick_wall", () -> new WallBlock(Block.Properties.from(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_CHALK_BRICKS = BLOCKS.register("chiseled_chalk_bricks", () -> new Block(Block.Properties.from(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_CHALK_BRICKS = BLOCKS.register("cracked_chalk_bricks", () -> new Block(Block.Properties.from(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_CHALK_BRICKS = BLOCKS.register("mossy_chalk_bricks", () -> new Block(Block.Properties.from(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_CHALK_BRICK_SLAB = BLOCKS.register("mossy_chalk_brick_slab", () -> new SlabBlock(Block.Properties.from(CHALK_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_CHALK_BRICK_STAIRS = BLOCKS.register("mossy_chalk_brick_stairs", () -> new StrataStairsBlock(CHALK_BRICKS.get().getDefaultState(), Block.Properties.from(CHALK.get())));
        public static final RegistryObject<Block> MOSSY_CHALK_BRICK_WALL = BLOCKS.register("mossy_chalk_brick_wall", () -> new WallBlock(Block.Properties.from(CHALK_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_CHALK = BLOCKS.register("polished_chalk", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_CHALK_SLAB = BLOCKS.register("polished_chalk_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_CHALK.get())));
        public static final RegistryObject<Block> POLISHED_CHALK_STAIRS = BLOCKS.register("polished_chalk_stairs", () -> new StrataStairsBlock(POLISHED_CHALK.get().getDefaultState(), Block.Properties.from(POLISHED_CHALK.get())));

        //Jaspillite
        public static final RegistryObject<Block> JASPILLITE = BLOCKS.register("jaspillite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> JASPILLITE_SLAB = BLOCKS.register("jaspillite_slab", () -> new SlabBlock(Block.Properties.from(JASPILLITE.get())));
        public static final RegistryObject<Block> JASPILLITE_STAIRS = BLOCKS.register("jaspillite_stairs", () -> new StrataStairsBlock(JASPILLITE.get().getDefaultState(), Block.Properties.from(JASPILLITE.get())));
        public static final RegistryObject<Block> JASPILLITE_WALL = BLOCKS.register("jaspillite_wall", () -> new WallBlock(Block.Properties.from(JASPILLITE.get())));

        //Cobblestone
        public static final RegistryObject<Block> JASPILLITE_COBBLESTONE = BLOCKS.register("jaspillite_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> JASPILLITE_COBBLESTONE_SLAB = BLOCKS.register("jaspillite_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(JASPILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> JASPILLITE_COBBLESTONE_STAIRS = BLOCKS.register("jaspillite_cobblestone_stairs", () -> new StrataStairsBlock(JASPILLITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(JASPILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> JASPILLITE_COBBLESTONE_WALL = BLOCKS.register("jaspillite_cobblestone_wall", () -> new WallBlock(Block.Properties.from(JASPILLITE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_JASPILLITE_COBBLESTONE = BLOCKS.register("mossy_jaspillite_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_COBBLESTONE_SLAB = BLOCKS.register("mossy_jaspillite_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_JASPILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_jaspillite_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_JASPILLITE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_JASPILLITE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_COBBLESTONE_WALL = BLOCKS.register("mossy_jaspillite_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_JASPILLITE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> JASPILLITE_BUTTON = BLOCKS.register("jaspillite_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> JASPILLITE_PRESSURE_PLATE = BLOCKS.register("jaspillite_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> JASPILLITE_BRICKS = BLOCKS.register("jaspillite_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> JASPILLITE_BRICK_SLAB = BLOCKS.register("jaspillite_brick_slab", () -> new SlabBlock(Block.Properties.from(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> JASPILLITE_BRICK_STAIRS = BLOCKS.register("jaspillite_brick_stairs", () -> new StrataStairsBlock(JASPILLITE_BRICKS.get().getDefaultState(), Block.Properties.from(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> JASPILLITE_BRICK_WALL = BLOCKS.register("jaspillite_brick_wall", () -> new WallBlock(Block.Properties.from(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_JASPILLITE_BRICKS = BLOCKS.register("chiseled_jaspillite_bricks", () -> new Block(Block.Properties.from(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_JASPILLITE_BRICKS = BLOCKS.register("cracked_jaspillite_bricks", () -> new Block(Block.Properties.from(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_BRICKS = BLOCKS.register("mossy_jaspillite_bricks", () -> new Block(Block.Properties.from(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_BRICK_SLAB = BLOCKS.register("mossy_jaspillite_brick_slab", () -> new SlabBlock(Block.Properties.from(JASPILLITE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_BRICK_STAIRS = BLOCKS.register("mossy_jaspillite_brick_stairs", () -> new StrataStairsBlock(JASPILLITE_BRICKS.get().getDefaultState(), Block.Properties.from(JASPILLITE.get())));
        public static final RegistryObject<Block> MOSSY_JASPILLITE_BRICK_WALL = BLOCKS.register("mossy_jaspillite_brick_wall", () -> new WallBlock(Block.Properties.from(JASPILLITE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_JASPILLITE = BLOCKS.register("polished_jaspillite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_JASPILLITE_SLAB = BLOCKS.register("polished_jaspillite_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_JASPILLITE.get())));
        public static final RegistryObject<Block> POLISHED_JASPILLITE_STAIRS = BLOCKS.register("polished_jaspillite_stairs", () -> new StrataStairsBlock(POLISHED_JASPILLITE.get().getDefaultState(), Block.Properties.from(POLISHED_JASPILLITE.get())));

        //Limestone
        public static final RegistryObject<Block> LIMESTONE = BLOCKS.register("limestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> LIMESTONE_SLAB = BLOCKS.register("limestone_slab", () -> new SlabBlock(Block.Properties.from(LIMESTONE.get())));
        public static final RegistryObject<Block> LIMESTONE_STAIRS = BLOCKS.register("limestone_stairs", () -> new StrataStairsBlock(LIMESTONE.get().getDefaultState(), Block.Properties.from(LIMESTONE.get())));
        public static final RegistryObject<Block> LIMESTONE_WALL = BLOCKS.register("limestone_wall", () -> new WallBlock(Block.Properties.from(LIMESTONE.get())));

        //Cobblestone
        public static final RegistryObject<Block> LIMESTONE_COBBLESTONE = BLOCKS.register("limestone_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_SLAB = BLOCKS.register("limestone_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(LIMESTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_STAIRS = BLOCKS.register("limestone_cobblestone_stairs", () -> new StrataStairsBlock(LIMESTONE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(LIMESTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> LIMESTONE_COBBLESTONE_WALL = BLOCKS.register("limestone_cobblestone_wall", () -> new WallBlock(Block.Properties.from(LIMESTONE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE = BLOCKS.register("mossy_limestone_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_SLAB = BLOCKS.register("mossy_limestone_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_LIMESTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_limestone_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_LIMESTONE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_LIMESTONE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_COBBLESTONE_WALL = BLOCKS.register("mossy_limestone_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_LIMESTONE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> LIMESTONE_BUTTON = BLOCKS.register("limestone_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> LIMESTONE_PRESSURE_PLATE = BLOCKS.register("limestone_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> LIMESTONE_BRICKS = BLOCKS.register("limestone_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> LIMESTONE_BRICK_SLAB = BLOCKS.register("limestone_brick_slab", () -> new SlabBlock(Block.Properties.from(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> LIMESTONE_BRICK_STAIRS = BLOCKS.register("limestone_brick_stairs", () -> new StrataStairsBlock(LIMESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> LIMESTONE_BRICK_WALL = BLOCKS.register("limestone_brick_wall", () -> new WallBlock(Block.Properties.from(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_LIMESTONE_BRICKS = BLOCKS.register("chiseled_limestone_bricks", () -> new Block(Block.Properties.from(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_LIMESTONE_BRICKS = BLOCKS.register("cracked_limestone_bricks", () -> new Block(Block.Properties.from(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICKS = BLOCKS.register("mossy_limestone_bricks", () -> new Block(Block.Properties.from(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_SLAB = BLOCKS.register("mossy_limestone_brick_slab", () -> new SlabBlock(Block.Properties.from(LIMESTONE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_STAIRS = BLOCKS.register("mossy_limestone_brick_stairs", () -> new StrataStairsBlock(LIMESTONE_BRICKS.get().getDefaultState(), Block.Properties.from(LIMESTONE.get())));
        public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_WALL = BLOCKS.register("mossy_limestone_brick_wall", () -> new WallBlock(Block.Properties.from(LIMESTONE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_LIMESTONE = BLOCKS.register("polished_limestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_LIMESTONE_SLAB = BLOCKS.register("polished_limestone_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_LIMESTONE.get())));
        public static final RegistryObject<Block> POLISHED_LIMESTONE_STAIRS = BLOCKS.register("polished_limestone_stairs", () -> new StrataStairsBlock(POLISHED_LIMESTONE.get().getDefaultState(), Block.Properties.from(POLISHED_LIMESTONE.get())));

        //Shale
        public static final RegistryObject<Block> SHALE = BLOCKS.register("shale", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> SHALE_SLAB = BLOCKS.register("shale_slab", () -> new SlabBlock(Block.Properties.from(SHALE.get())));
        public static final RegistryObject<Block> SHALE_STAIRS = BLOCKS.register("shale_stairs", () -> new StrataStairsBlock(SHALE.get().getDefaultState(), Block.Properties.from(SHALE.get())));
        public static final RegistryObject<Block> SHALE_WALL = BLOCKS.register("shale_wall", () -> new WallBlock(Block.Properties.from(SHALE.get())));

        //Cobblestone
        public static final RegistryObject<Block> SHALE_COBBLESTONE = BLOCKS.register("shale_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> SHALE_COBBLESTONE_SLAB = BLOCKS.register("shale_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(SHALE_COBBLESTONE.get())));
        public static final RegistryObject<Block> SHALE_COBBLESTONE_STAIRS = BLOCKS.register("shale_cobblestone_stairs", () -> new StrataStairsBlock(SHALE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(SHALE_COBBLESTONE.get())));
        public static final RegistryObject<Block> SHALE_COBBLESTONE_WALL = BLOCKS.register("shale_cobblestone_wall", () -> new WallBlock(Block.Properties.from(SHALE_COBBLESTONE.get())));

        //Mossy Cobblestone
        public static final RegistryObject<Block> MOSSY_SHALE_COBBLESTONE = BLOCKS.register("mossy_shale_cobblestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> MOSSY_SHALE_COBBLESTONE_SLAB = BLOCKS.register("mossy_shale_cobblestone_slab", () -> new SlabBlock(Block.Properties.from(MOSSY_SHALE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_SHALE_COBBLESTONE_STAIRS = BLOCKS.register("mossy_shale_cobblestone_stairs", () -> new StrataStairsBlock(MOSSY_SHALE_COBBLESTONE.get().getDefaultState(), Block.Properties.from(MOSSY_SHALE_COBBLESTONE.get())));
        public static final RegistryObject<Block> MOSSY_SHALE_COBBLESTONE_WALL = BLOCKS.register("mossy_shale_cobblestone_wall", () -> new WallBlock(Block.Properties.from(MOSSY_SHALE_COBBLESTONE.get())));

        //Buttons
        public static final RegistryObject<Block> SHALE_BUTTON = BLOCKS.register("shale_button", () -> new StrataButtonBlock(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.STONE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Pressure Plates
        public static final RegistryObject<Block> SHALE_PRESSURE_PLATE = BLOCKS.register("shale_pressure_plate", () -> new StrataPressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).doesNotBlockMovement().hardnessAndResistance(0.5f, 0.5f)));

        //Bricks
        public static final RegistryObject<Block> SHALE_BRICKS = BLOCKS.register("shale_bricks", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> SHALE_BRICK_SLAB = BLOCKS.register("shale_brick_slab", () -> new SlabBlock(Block.Properties.from(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> SHALE_BRICK_STAIRS = BLOCKS.register("shale_brick_stairs", () -> new StrataStairsBlock(SHALE_BRICKS.get().getDefaultState(), Block.Properties.from(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> SHALE_BRICK_WALL = BLOCKS.register("shale_brick_wall", () -> new WallBlock(Block.Properties.from(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> CHISELED_SHALE_BRICKS = BLOCKS.register("chiseled_shale_bricks", () -> new Block(Block.Properties.from(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> CRACKED_SHALE_BRICKS = BLOCKS.register("cracked_shale_bricks", () -> new Block(Block.Properties.from(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SHALE_BRICKS = BLOCKS.register("mossy_shale_bricks", () -> new Block(Block.Properties.from(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SHALE_BRICK_SLAB = BLOCKS.register("mossy_shale_brick_slab", () -> new SlabBlock(Block.Properties.from(SHALE_BRICKS.get())));
        public static final RegistryObject<Block> MOSSY_SHALE_BRICK_STAIRS = BLOCKS.register("mossy_shale_brick_stairs", () -> new StrataStairsBlock(SHALE_BRICKS.get().getDefaultState(), Block.Properties.from(SHALE.get())));
        public static final RegistryObject<Block> MOSSY_SHALE_BRICK_WALL = BLOCKS.register("mossy_shale_brick_wall", () -> new WallBlock(Block.Properties.from(SHALE_BRICKS.get())));

        //Polished
        public static final RegistryObject<Block> POLISHED_SHALE = BLOCKS.register("polished_shale", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> POLISHED_SHALE_SLAB = BLOCKS.register("polished_shale_slab", () -> new SlabBlock(Block.Properties.from(POLISHED_SHALE.get())));
        public static final RegistryObject<Block> POLISHED_SHALE_STAIRS = BLOCKS.register("polished_shale_stairs", () -> new StrataStairsBlock(POLISHED_SHALE.get().getDefaultState(), Block.Properties.from(POLISHED_SHALE.get())));


}

