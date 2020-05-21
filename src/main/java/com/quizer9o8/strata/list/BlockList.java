package com.quizer9o8.strata.list;

import com.quizer9o8.strata.Main;
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
        public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, Main.MOD_ID);

/*
        //Debug Blocks
        public static final RegistryObject<Block> DEBUG_BLOCK = BLOCKS.register("debug_block", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(0.0f, 0.0f).harvestLevel(0)));
        public static final RegistryObject<Block> DEBUG_SLAB = BLOCKS.register("debug_slab", () -> new SlabBlock(Block.Properties.from(DEBUG_BLOCK.get())));
        public static final RegistryObject<Block> DEBUG_STAIRS = BLOCKS.register("debug_stairs", () -> new StrataStairsBlock(DEBUG_BLOCK.get().getDefaultState(), Block.Properties.from(DEBUG_BLOCK.get())));
        public static final RegistryObject<Block> DEBUG_WALL = BLOCKS.register("debug_wall", () -> new WallBlock(Block.Properties.from(DEBUG_BLOCK.get())));
        //public static final RegistryObject<Block> DEBUG_ORE = BLOCKS.register("debug_ore", () -> new StrataOreBlock(Block.Properties.from(Blocks.IRON_ORE)));
*/

        //Igneous Rocks
        public static final RegistryObject<Block> GABBRO = BLOCKS.register("gabbro", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> GABBRO_SLAB = BLOCKS.register("gabbro_slab", () -> new SlabBlock(Block.Properties.from(GABBRO.get())));
        public static final RegistryObject<Block> GABBRO_STAIRS = BLOCKS.register("gabbro_stairs", () -> new StrataStairsBlock(GABBRO.get().getDefaultState(), Block.Properties.from(GABBRO.get())));
        public static final RegistryObject<Block> GABBRO_WALL = BLOCKS.register("gabbro_wall", () -> new WallBlock(Block.Properties.from(GABBRO.get())));

        public static final RegistryObject<Block> BASALT = BLOCKS.register("basalt", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> BASALT_SLAB = BLOCKS.register("basalt_slab", () -> new SlabBlock(Block.Properties.from(BASALT.get())));
        public static final RegistryObject<Block> BASALT_STAIRS = BLOCKS.register("basalt_stairs", () -> new StrataStairsBlock(BASALT.get().getDefaultState(), Block.Properties.from(BASALT.get())));
        public static final RegistryObject<Block> BASALT_WALL = BLOCKS.register("basalt_wall", () -> new WallBlock(Block.Properties.from(BASALT.get())));

        //Metamorphic Rocks
        public static final RegistryObject<Block> GNEISS = BLOCKS.register("gneiss", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> GNEISS_SLAB = BLOCKS.register("gneiss_slab", () -> new SlabBlock(Block.Properties.from(GNEISS.get())));
        public static final RegistryObject<Block> GNEISS_STAIRS = BLOCKS.register("gneiss_stairs", () -> new StrataStairsBlock(GNEISS.get().getDefaultState(), Block.Properties.from(GNEISS.get())));
        public static final RegistryObject<Block> GNEISS_WALL = BLOCKS.register("gneiss_wall", () -> new WallBlock(Block.Properties.from(GNEISS.get())));

        public static final RegistryObject<Block> SCHIST = BLOCKS.register("schist", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> SCHIST_SLAB = BLOCKS.register("schist_slab", () -> new SlabBlock(Block.Properties.from(SCHIST.get())));
        public static final RegistryObject<Block> SCHIST_STAIRS = BLOCKS.register("schist_stairs", () -> new StrataStairsBlock(SCHIST.get().getDefaultState(), Block.Properties.from(SCHIST.get())));
        public static final RegistryObject<Block> SCHIST_WALL = BLOCKS.register("schist_wall", () -> new WallBlock(Block.Properties.from(SCHIST.get())));

        public static final RegistryObject<Block> AMPHIBOLITE = BLOCKS.register("amphibolite", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> AMPHIBOLITE_SLAB = BLOCKS.register("amphibolite_slab", () -> new SlabBlock(Block.Properties.from(AMPHIBOLITE.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_STAIRS = BLOCKS.register("amphibolite_stairs", () -> new StrataStairsBlock(AMPHIBOLITE.get().getDefaultState(), Block.Properties.from(AMPHIBOLITE.get())));
        public static final RegistryObject<Block> AMPHIBOLITE_WALL = BLOCKS.register("amphibolite_wall", () -> new WallBlock(Block.Properties.from(AMPHIBOLITE.get())));

        //Sedimentary Rocks
        public static final RegistryObject<Block> LIMESTONE = BLOCKS.register("limestone", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> LIMESTONE_SLAB = BLOCKS.register("limestone_slab", () -> new SlabBlock(Block.Properties.from(LIMESTONE.get())));
        public static final RegistryObject<Block> LIMESTONE_STAIRS = BLOCKS.register("limestone_stairs", () -> new StrataStairsBlock(LIMESTONE.get().getDefaultState(), Block.Properties.from(LIMESTONE.get())));
        public static final RegistryObject<Block> LIMESTONE_WALL = BLOCKS.register("limestone_wall", () -> new WallBlock(Block.Properties.from(LIMESTONE.get())));

        public static final RegistryObject<Block> SHALE = BLOCKS.register("shale", () -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 6.0f)));
        public static final RegistryObject<Block> SHALE_SLAB = BLOCKS.register("shale_slab", () -> new SlabBlock(Block.Properties.from(SHALE.get())));
        public static final RegistryObject<Block> SHALE_STAIRS = BLOCKS.register("shale_stairs", () -> new StrataStairsBlock(SHALE.get().getDefaultState(), Block.Properties.from(SHALE.get())));
        public static final RegistryObject<Block> SHALE_WALL = BLOCKS.register("shale_wall", () -> new WallBlock(Block.Properties.from(SHALE.get())));


}

