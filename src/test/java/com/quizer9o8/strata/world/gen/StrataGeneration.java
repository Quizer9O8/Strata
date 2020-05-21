
package com.quizer9o8.strata.world.gen;

import com.quizer9o8.strata.list.BlockList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class StrataGeneration
{
    private static void setupOreGeneration(){


    //size = maximum amount of that said block to generate in the world
    //count = how common that said block will be in your world. The higher

/* Unused for now...
        //Gabbro

        for(Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                            BlockList.GABBRO.get().getDefaultState(), 33))
                            .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.OCEAN) {

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }
        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.FROZEN_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.COLD_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.DEEP_COLD_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.DEEP_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.LUKEWARM_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.DEEP_LUKEWARM_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.WARM_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.DEEP_WARM_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(23, 0, 0, 128))));
            }
        }

        // Basalt

        for(Biome biome : ForgeRegistries.BIOMES) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 33))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 128))));
            }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.OCEAN) {

                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
    }
        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.FROZEN_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.COLD_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.DEEP_COLD_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.DEEP_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.LUKEWARM_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.DEEP_LUKEWARM_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.WARM_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
        }

        for(Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.DEEP_WARM_OCEAN) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                        Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                BlockList.GABBRO.get().getDefaultState(), 66))
                                .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(30, 0, 0, 128))));
            }
        }

        //Gneiss

        for(Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                            BlockList.GNEISS.get().getDefaultState(), 33))
                            .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));
        }

        //Schist

        for(Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                            BlockList.SCHIST.get().getDefaultState(), 33))
                            .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));
        }

        //Amphibolite

        for(Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                            BlockList.AMPHIBOLITE.get().getDefaultState(), 33))
                            .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));
        }

        //Limestone

        for(Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                            BlockList.LIMESTONE.get().getDefaultState(), 33))
                            .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));
        }

        //Shale

        for(Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                            BlockList.SHALE.get().getDefaultState(), 33))
                            .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));
        }*/

    }

    public static void generate() {
        setupOreGeneration();
    }
}

