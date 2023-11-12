package com.quizer9o8.strata;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import static com.quizer9o8.strata.list.BlockList.*;

@Mod.EventBusSubscriber(modid = Strata.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabs {
    public static CreativeModeTab IGNEOUS_TAB;
    public static CreativeModeTab METAMORPHIC_TAB;
    public static CreativeModeTab SEDIMENTARY_TAB;

    //This registers the Creative tabs
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        IGNEOUS_TAB = event.registerCreativeModeTab(new ResourceLocation(Strata.MOD_ID, "igneous"), builder -> builder
                .icon(() -> new ItemStack(AA.get()))
                .title(Component.translatable("itemGroup.igneous"))
                .displayItems((featureFlags, output) -> {
                    //This adds the items
                    //AA
                    output.accept(AA.get());
                    output.accept(AA_SLAB.get());
                    output.accept(AA_STAIRS.get());
                    output.accept(AA_WALL.get());

                    //AA REDSTONE
                    output.accept(AA_PRESSURE_PLATE.get());
                    output.accept(AA_BUTTON.get());

                    //AA COBBLESTONE
                    output.accept(AA_COBBLESTONE.get());
                    output.accept(AA_COBBLESTONE_SLAB.get());
                    output.accept(AA_COBBLESTONE_STAIRS.get());
                    output.accept(AA_COBBLESTONE_WALL.get());

                    //MOSSY AA COBBLESTONE
                    output.accept(MOSSY_AA_COBBLESTONE.get());
                    output.accept(MOSSY_AA_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_AA_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_AA_COBBLESTONE_WALL.get());

                    //AA BRICKS
                    output.accept(AA_BRICKS.get());
                    output.accept(AA_BRICK_SLAB.get());
                    output.accept(AA_BRICK_STAIRS.get());
                    output.accept(AA_BRICK_WALL.get());
                    output.accept(CHISELED_AA_BRICKS.get());
                    output.accept(CRACKED_AA_BRICKS.get());
                    output.accept(MOSSY_AA_BRICKS.get());
                    output.accept(MOSSY_AA_BRICK_SLAB.get());
                    output.accept(MOSSY_AA_BRICK_STAIRS.get());
                    output.accept(MOSSY_AA_BRICK_WALL.get());

                    //POLISHED AA
                    output.accept(POLISHED_AA.get());
                    output.accept(POLISHED_AA_SLAB.get());
                    output.accept(POLISHED_AA_STAIRS.get());

                    //ADAKITE
                    output.accept(ADAKITE.get());
                    output.accept(ADAKITE_SLAB.get());
                    output.accept(ADAKITE_STAIRS.get());
                    output.accept(ADAKITE_WALL.get());

                    //ADAKITE REDSTONE
                    output.accept(ADAKITE_PRESSURE_PLATE.get());
                    output.accept(ADAKITE_BUTTON.get());

                    //ADAKITE COBBLESTONE
                    output.accept(ADAKITE_COBBLESTONE.get());
                    output.accept(ADAKITE_COBBLESTONE_SLAB.get());
                    output.accept(ADAKITE_COBBLESTONE_STAIRS.get());
                    output.accept(ADAKITE_COBBLESTONE_WALL.get());

                    //MOSSY ADAKITE COBBLESTONE
                    output.accept(MOSSY_ADAKITE_COBBLESTONE.get());
                    output.accept(MOSSY_ADAKITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_ADAKITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_ADAKITE_COBBLESTONE_WALL.get());

                    //ADAKITE BRICKS
                    output.accept(ADAKITE_BRICKS.get());
                    output.accept(ADAKITE_BRICK_SLAB.get());
                    output.accept(ADAKITE_BRICK_STAIRS.get());
                    output.accept(ADAKITE_BRICK_WALL.get());
                    output.accept(CHISELED_ADAKITE_BRICKS.get());
                    output.accept(CRACKED_ADAKITE_BRICKS.get());
                    output.accept(MOSSY_ADAKITE_BRICKS.get());
                    output.accept(MOSSY_ADAKITE_BRICK_SLAB.get());
                    output.accept(MOSSY_ADAKITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_ADAKITE_BRICK_WALL.get());

                    //POLISHED ADAKITE
                    output.accept(POLISHED_ADAKITE.get());
                    output.accept(POLISHED_ADAKITE_SLAB.get());
                    output.accept(POLISHED_ADAKITE_STAIRS.get());

                    //DACITE
                    output.accept(DACITE.get());
                    output.accept(DACITE_SLAB.get());
                    output.accept(DACITE_STAIRS.get());
                    output.accept(DACITE_WALL.get());

                    //DACITE REDSTONE
                    output.accept(DACITE_PRESSURE_PLATE.get());
                    output.accept(DACITE_BUTTON.get());

                    //DACITE COBBLESTONE
                    output.accept(DACITE_COBBLESTONE.get());
                    output.accept(DACITE_COBBLESTONE_SLAB.get());
                    output.accept(DACITE_COBBLESTONE_STAIRS.get());
                    output.accept(DACITE_COBBLESTONE_WALL.get());

                    //MOSSY DACITE COBBLESTONE
                    output.accept(MOSSY_DACITE_COBBLESTONE.get());
                    output.accept(MOSSY_DACITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_DACITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_DACITE_COBBLESTONE_WALL.get());

                    //DACITE BRICKS
                    output.accept(DACITE_BRICKS.get());
                    output.accept(DACITE_BRICK_SLAB.get());
                    output.accept(DACITE_BRICK_STAIRS.get());
                    output.accept(DACITE_BRICK_WALL.get());
                    output.accept(CHISELED_DACITE_BRICKS.get());
                    output.accept(CRACKED_DACITE_BRICKS.get());
                    output.accept(MOSSY_DACITE_BRICKS.get());
                    output.accept(MOSSY_DACITE_BRICK_SLAB.get());
                    output.accept(MOSSY_DACITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_DACITE_BRICK_WALL.get());

                    //POLISHED DACITE
                    output.accept(POLISHED_DACITE.get());
                    output.accept(POLISHED_DACITE_SLAB.get());
                    output.accept(POLISHED_DACITE_STAIRS.get());

                    //DUNITE
                    output.accept(DUNITE.get());
                    output.accept(DUNITE_SLAB.get());
                    output.accept(DUNITE_STAIRS.get());
                    output.accept(DUNITE_WALL.get());

                    //DUNITE REDSTONE
                    output.accept(DUNITE_PRESSURE_PLATE.get());
                    output.accept(DUNITE_BUTTON.get());

                    //DUNITE COBBLESTONE
                    output.accept(DUNITE_COBBLESTONE.get());
                    output.accept(DUNITE_COBBLESTONE_SLAB.get());
                    output.accept(DUNITE_COBBLESTONE_STAIRS.get());
                    output.accept(DUNITE_COBBLESTONE_WALL.get());

                    //MOSSY DUNITE COBBLESTONE
                    output.accept(MOSSY_DUNITE_COBBLESTONE.get());
                    output.accept(MOSSY_DUNITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_DUNITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_DUNITE_COBBLESTONE_WALL.get());

                    //DUNITE BRICKS
                    output.accept(DUNITE_BRICKS.get());
                    output.accept(DUNITE_BRICK_SLAB.get());
                    output.accept(DUNITE_BRICK_STAIRS.get());
                    output.accept(DUNITE_BRICK_WALL.get());
                    output.accept(CHISELED_DUNITE_BRICKS.get());
                    output.accept(CRACKED_DUNITE_BRICKS.get());
                    output.accept(MOSSY_DUNITE_BRICKS.get());
                    output.accept(MOSSY_DUNITE_BRICK_SLAB.get());
                    output.accept(MOSSY_DUNITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_DUNITE_BRICK_WALL.get());

                    //POLISHED DUNITE
                    output.accept(POLISHED_DUNITE.get());
                    output.accept(POLISHED_DUNITE_SLAB.get());
                    output.accept(POLISHED_DUNITE_STAIRS.get());

                    //GABBRO
                    output.accept(GABBRO.get());
                    output.accept(GABBRO_SLAB.get());
                    output.accept(GABBRO_STAIRS.get());
                    output.accept(GABBRO_WALL.get());

                    //GABBRO REDSTONE
                    output.accept(GABBRO_PRESSURE_PLATE.get());
                    output.accept(GABBRO_BUTTON.get());

                    //GABBRO COBBLESTONE
                    output.accept(GABBRO_COBBLESTONE.get());
                    output.accept(GABBRO_COBBLESTONE_SLAB.get());
                    output.accept(GABBRO_COBBLESTONE_STAIRS.get());
                    output.accept(GABBRO_COBBLESTONE_WALL.get());

                    //MOSSY GABBRO COBBLESTONE
                    output.accept(MOSSY_GABBRO_COBBLESTONE.get());
                    output.accept(MOSSY_GABBRO_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_GABBRO_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_GABBRO_COBBLESTONE_WALL.get());

                    //GABBRO BRICKS
                    output.accept(GABBRO_BRICKS.get());
                    output.accept(GABBRO_BRICK_SLAB.get());
                    output.accept(GABBRO_BRICK_STAIRS.get());
                    output.accept(GABBRO_BRICK_WALL.get());
                    output.accept(CHISELED_GABBRO_BRICKS.get());
                    output.accept(CRACKED_GABBRO_BRICKS.get());
                    output.accept(MOSSY_GABBRO_BRICKS.get());
                    output.accept(MOSSY_GABBRO_BRICK_SLAB.get());
                    output.accept(MOSSY_GABBRO_BRICK_STAIRS.get());
                    output.accept(MOSSY_GABBRO_BRICK_WALL.get());

                    //POLISHED GABBRO
                    output.accept(POLISHED_GABBRO.get());
                    output.accept(POLISHED_GABBRO_SLAB.get());
                    output.accept(POLISHED_GABBRO_STAIRS.get());

                    //KOMATIITE
                    output.accept(KOMATIITE.get());
                    output.accept(KOMATIITE_SLAB.get());
                    output.accept(KOMATIITE_STAIRS.get());
                    output.accept(KOMATIITE_WALL.get());

                    //KOMATIITE REDSTONE
                    output.accept(KOMATIITE_PRESSURE_PLATE.get());
                    output.accept(KOMATIITE_BUTTON.get());

                    //KOMATIITE COBBLESTONE
                    output.accept(KOMATIITE_COBBLESTONE.get());
                    output.accept(KOMATIITE_COBBLESTONE_SLAB.get());
                    output.accept(KOMATIITE_COBBLESTONE_STAIRS.get());
                    output.accept(KOMATIITE_COBBLESTONE_WALL.get());

                    //MOSSY KOMATIITE COBBLESTONE
                    output.accept(MOSSY_KOMATIITE_COBBLESTONE.get());
                    output.accept(MOSSY_KOMATIITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_KOMATIITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_KOMATIITE_COBBLESTONE_WALL.get());

                    //KOMATIITE BRICKS
                    output.accept(KOMATIITE_BRICKS.get());
                    output.accept(KOMATIITE_BRICK_SLAB.get());
                    output.accept(KOMATIITE_BRICK_STAIRS.get());
                    output.accept(KOMATIITE_BRICK_WALL.get());
                    output.accept(CHISELED_KOMATIITE_BRICKS.get());
                    output.accept(CRACKED_KOMATIITE_BRICKS.get());
                    output.accept(MOSSY_KOMATIITE_BRICKS.get());
                    output.accept(MOSSY_KOMATIITE_BRICK_SLAB.get());
                    output.accept(MOSSY_KOMATIITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_KOMATIITE_BRICK_WALL.get());

                    //POLISHED KOMATIITE
                    output.accept(POLISHED_KOMATIITE.get());
                    output.accept(POLISHED_KOMATIITE_SLAB.get());
                    output.accept(POLISHED_KOMATIITE_STAIRS.get());

                    //PAHOEHOE
                    output.accept(PAHOEHOE.get());
                    output.accept(PAHOEHOE_SLAB.get());
                    output.accept(PAHOEHOE_STAIRS.get());
                    output.accept(PAHOEHOE_WALL.get());

                    //PAHOEHOE REDSTONE
                    output.accept(PAHOEHOE_PRESSURE_PLATE.get());
                    output.accept(PAHOEHOE_BUTTON.get());

                    //PAHOEHOE COBBLESTONE
                    output.accept(PAHOEHOE_COBBLESTONE.get());
                    output.accept(PAHOEHOE_COBBLESTONE_SLAB.get());
                    output.accept(PAHOEHOE_COBBLESTONE_STAIRS.get());
                    output.accept(PAHOEHOE_COBBLESTONE_WALL.get());

                    //MOSSY PAHOEHOE COBBLESTONE
                    output.accept(MOSSY_PAHOEHOE_COBBLESTONE.get());
                    output.accept(MOSSY_PAHOEHOE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_PAHOEHOE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_PAHOEHOE_COBBLESTONE_WALL.get());

                    //PAHOEHOE BRICKS
                    output.accept(PAHOEHOE_BRICKS.get());
                    output.accept(PAHOEHOE_BRICK_SLAB.get());
                    output.accept(PAHOEHOE_BRICK_STAIRS.get());
                    output.accept(PAHOEHOE_BRICK_WALL.get());
                    output.accept(CHISELED_PAHOEHOE_BRICKS.get());
                    output.accept(CRACKED_PAHOEHOE_BRICKS.get());
                    output.accept(MOSSY_PAHOEHOE_BRICKS.get());
                    output.accept(MOSSY_PAHOEHOE_BRICK_SLAB.get());
                    output.accept(MOSSY_PAHOEHOE_BRICK_STAIRS.get());
                    output.accept(MOSSY_PAHOEHOE_BRICK_WALL.get());

                    //POLISHED PAHOEHOE
                    output.accept(POLISHED_PAHOEHOE.get());
                    output.accept(POLISHED_PAHOEHOE_SLAB.get());
                    output.accept(POLISHED_PAHOEHOE_STAIRS.get());

                    //PEGMATITE
                    output.accept(PEGMATITE.get());
                    output.accept(PEGMATITE_SLAB.get());
                    output.accept(PEGMATITE_STAIRS.get());
                    output.accept(PEGMATITE_WALL.get());

                    //PEGMATITE REDSTONE
                    output.accept(PEGMATITE_PRESSURE_PLATE.get());
                    output.accept(PEGMATITE_BUTTON.get());

                    //PEGMATITE COBBLESTONE
                    output.accept(PEGMATITE_COBBLESTONE.get());
                    output.accept(PEGMATITE_COBBLESTONE_SLAB.get());
                    output.accept(PEGMATITE_COBBLESTONE_STAIRS.get());
                    output.accept(PEGMATITE_COBBLESTONE_WALL.get());

                    //MOSSY PEGMATITE COBBLESTONE
                    output.accept(MOSSY_PEGMATITE_COBBLESTONE.get());
                    output.accept(MOSSY_PEGMATITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_PEGMATITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_PEGMATITE_COBBLESTONE_WALL.get());

                    //PEGMATITE BRICKS
                    output.accept(PEGMATITE_BRICKS.get());
                    output.accept(PEGMATITE_BRICK_SLAB.get());
                    output.accept(PEGMATITE_BRICK_STAIRS.get());
                    output.accept(PEGMATITE_BRICK_WALL.get());
                    output.accept(CHISELED_PEGMATITE_BRICKS.get());
                    output.accept(CRACKED_PEGMATITE_BRICKS.get());
                    output.accept(MOSSY_PEGMATITE_BRICKS.get());
                    output.accept(MOSSY_PEGMATITE_BRICK_SLAB.get());
                    output.accept(MOSSY_PEGMATITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_PEGMATITE_BRICK_WALL.get());

                    //POLISHED PEGMATITE
                    output.accept(POLISHED_PEGMATITE.get());
                    output.accept(POLISHED_PEGMATITE_SLAB.get());
                    output.accept(POLISHED_PEGMATITE_STAIRS.get());

                    //PHONOLITE
                    output.accept(PHONOLITE.get());
                    output.accept(PHONOLITE_SLAB.get());
                    output.accept(PHONOLITE_STAIRS.get());
                    output.accept(PHONOLITE_WALL.get());

                    //PHONOLITE REDSTONE
                    output.accept(PHONOLITE_PRESSURE_PLATE.get());
                    output.accept(PHONOLITE_BUTTON.get());

                    //PHONOLITE COBBLESTONE
                    output.accept(PHONOLITE_COBBLESTONE.get());
                    output.accept(PHONOLITE_COBBLESTONE_SLAB.get());
                    output.accept(PHONOLITE_COBBLESTONE_STAIRS.get());
                    output.accept(PHONOLITE_COBBLESTONE_WALL.get());

                    //MOSSY PHONOLITE COBBLESTONE
                    output.accept(MOSSY_PHONOLITE_COBBLESTONE.get());
                    output.accept(MOSSY_PHONOLITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_PHONOLITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_PHONOLITE_COBBLESTONE_WALL.get());

                    //PHONOLITE BRICKS
                    output.accept(PHONOLITE_BRICKS.get());
                    output.accept(PHONOLITE_BRICK_SLAB.get());
                    output.accept(PHONOLITE_BRICK_STAIRS.get());
                    output.accept(PHONOLITE_BRICK_WALL.get());
                    output.accept(CHISELED_PHONOLITE_BRICKS.get());
                    output.accept(CRACKED_PHONOLITE_BRICKS.get());
                    output.accept(MOSSY_PHONOLITE_BRICKS.get());
                    output.accept(MOSSY_PHONOLITE_BRICK_SLAB.get());
                    output.accept(MOSSY_PHONOLITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_PHONOLITE_BRICK_WALL.get());

                    //POLISHED PHONOLITE
                    output.accept(POLISHED_PHONOLITE.get());
                    output.accept(POLISHED_PHONOLITE_SLAB.get());
                    output.accept(POLISHED_PHONOLITE_STAIRS.get());
                })
        );
        METAMORPHIC_TAB = event.registerCreativeModeTab(new ResourceLocation(Strata.MOD_ID, "metamorphic"), builder -> builder
                .icon(() -> new ItemStack(AMPHIBOLITE.get()))
                .title(Component.translatable("itemGroup.metamorphic"))
                .displayItems((featureFlags, output) -> {
                    //This adds the items
                    //AMPHIBOLITE
                    output.accept(AMPHIBOLITE.get());
                    output.accept(AMPHIBOLITE_SLAB.get());
                    output.accept(AMPHIBOLITE_STAIRS.get());
                    output.accept(AMPHIBOLITE_WALL.get());

                    //AMPHIBOLITE REDSTONE
                    output.accept(AMPHIBOLITE_PRESSURE_PLATE.get());
                    output.accept(AMPHIBOLITE_BUTTON.get());

                    //AMPHIBOLITE COBBLESTONE
                    output.accept(AMPHIBOLITE_COBBLESTONE.get());
                    output.accept(AMPHIBOLITE_COBBLESTONE_SLAB.get());
                    output.accept(AMPHIBOLITE_COBBLESTONE_STAIRS.get());
                    output.accept(AMPHIBOLITE_COBBLESTONE_WALL.get());

                    //MOSSY AMPHIBOLITE COBBLESTONE
                    output.accept(MOSSY_AMPHIBOLITE_COBBLESTONE.get());
                    output.accept(MOSSY_AMPHIBOLITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_AMPHIBOLITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_AMPHIBOLITE_COBBLESTONE_WALL.get());

                    //AMPHIBOLITE BRICKS
                    output.accept(AMPHIBOLITE_BRICKS.get());
                    output.accept(AMPHIBOLITE_BRICK_SLAB.get());
                    output.accept(AMPHIBOLITE_BRICK_STAIRS.get());
                    output.accept(AMPHIBOLITE_BRICK_WALL.get());
                    output.accept(CHISELED_AMPHIBOLITE_BRICKS.get());
                    output.accept(CRACKED_AMPHIBOLITE_BRICKS.get());
                    output.accept(MOSSY_AMPHIBOLITE_BRICKS.get());
                    output.accept(MOSSY_AMPHIBOLITE_BRICK_SLAB.get());
                    output.accept(MOSSY_AMPHIBOLITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_AMPHIBOLITE_BRICK_WALL.get());

                    //POLISHED AMPHIBOLITE
                    output.accept(POLISHED_AMPHIBOLITE.get());
                    output.accept(POLISHED_AMPHIBOLITE_SLAB.get());
                    output.accept(POLISHED_AMPHIBOLITE_STAIRS.get());

                    //CATACLASITE
                    output.accept(CATACLASITE.get());
                    output.accept(CATACLASITE_SLAB.get());
                    output.accept(CATACLASITE_STAIRS.get());
                    output.accept(CATACLASITE_WALL.get());

                    //CATACLASITE REDSTONE
                    output.accept(CATACLASITE_PRESSURE_PLATE.get());
                    output.accept(CATACLASITE_BUTTON.get());

                    //CATACLASITE COBBLESTONE
                    output.accept(CATACLASITE_COBBLESTONE.get());
                    output.accept(CATACLASITE_COBBLESTONE_SLAB.get());
                    output.accept(CATACLASITE_COBBLESTONE_STAIRS.get());
                    output.accept(CATACLASITE_COBBLESTONE_WALL.get());

                    //MOSSY CATACLASITE COBBLESTONE
                    output.accept(MOSSY_CATACLASITE_COBBLESTONE.get());
                    output.accept(MOSSY_CATACLASITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_CATACLASITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_CATACLASITE_COBBLESTONE_WALL.get());

                    //CATACLASITE BRICKS
                    output.accept(CATACLASITE_BRICKS.get());
                    output.accept(CATACLASITE_BRICK_SLAB.get());
                    output.accept(CATACLASITE_BRICK_STAIRS.get());
                    output.accept(CATACLASITE_BRICK_WALL.get());
                    output.accept(CHISELED_CATACLASITE_BRICKS.get());
                    output.accept(CRACKED_CATACLASITE_BRICKS.get());
                    output.accept(MOSSY_CATACLASITE_BRICKS.get());
                    output.accept(MOSSY_CATACLASITE_BRICK_SLAB.get());
                    output.accept(MOSSY_CATACLASITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_CATACLASITE_BRICK_WALL.get());

                    //POLISHED CATACLASITE
                    output.accept(POLISHED_CATACLASITE.get());
                    output.accept(POLISHED_CATACLASITE_SLAB.get());
                    output.accept(POLISHED_CATACLASITE_STAIRS.get());

                    //ECLOGITE
                    output.accept(ECLOGITE.get());
                    output.accept(ECLOGITE_SLAB.get());
                    output.accept(ECLOGITE_STAIRS.get());
                    output.accept(ECLOGITE_WALL.get());

                    //ECLOGITE REDSTONE
                    output.accept(ECLOGITE_PRESSURE_PLATE.get());
                    output.accept(ECLOGITE_BUTTON.get());

                    //ECLOGITE COBBLESTONE
                    output.accept(ECLOGITE_COBBLESTONE.get());
                    output.accept(ECLOGITE_COBBLESTONE_SLAB.get());
                    output.accept(ECLOGITE_COBBLESTONE_STAIRS.get());
                    output.accept(ECLOGITE_COBBLESTONE_WALL.get());

                    //MOSSY ECLOGITE COBBLESTONE
                    output.accept(MOSSY_ECLOGITE_COBBLESTONE.get());
                    output.accept(MOSSY_ECLOGITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_ECLOGITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_ECLOGITE_COBBLESTONE_WALL.get());

                    //ECLOGITE BRICKS
                    output.accept(ECLOGITE_BRICKS.get());
                    output.accept(ECLOGITE_BRICK_SLAB.get());
                    output.accept(ECLOGITE_BRICK_STAIRS.get());
                    output.accept(ECLOGITE_BRICK_WALL.get());
                    output.accept(CHISELED_ECLOGITE_BRICKS.get());
                    output.accept(CRACKED_ECLOGITE_BRICKS.get());
                    output.accept(MOSSY_ECLOGITE_BRICKS.get());
                    output.accept(MOSSY_ECLOGITE_BRICK_SLAB.get());
                    output.accept(MOSSY_ECLOGITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_ECLOGITE_BRICK_WALL.get());

                    //POLISHED ECLOGITE
                    output.accept(POLISHED_ECLOGITE.get());
                    output.accept(POLISHED_ECLOGITE_SLAB.get());
                    output.accept(POLISHED_ECLOGITE_STAIRS.get());

                    //GNEISS
                    output.accept(GNEISS.get());
                    output.accept(GNEISS_SLAB.get());
                    output.accept(GNEISS_STAIRS.get());
                    output.accept(GNEISS_WALL.get());

                    //GNEISS REDSTONE
                    output.accept(GNEISS_PRESSURE_PLATE.get());
                    output.accept(GNEISS_BUTTON.get());

                    //GNEISS COBBLESTONE
                    output.accept(GNEISS_COBBLESTONE.get());
                    output.accept(GNEISS_COBBLESTONE_SLAB.get());
                    output.accept(GNEISS_COBBLESTONE_STAIRS.get());
                    output.accept(GNEISS_COBBLESTONE_WALL.get());

                    //MOSSY GNEISS COBBLESTONE
                    output.accept(MOSSY_GNEISS_COBBLESTONE.get());
                    output.accept(MOSSY_GNEISS_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_GNEISS_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_GNEISS_COBBLESTONE_WALL.get());

                    //GNEISS BRICKS
                    output.accept(GNEISS_BRICKS.get());
                    output.accept(GNEISS_BRICK_SLAB.get());
                    output.accept(GNEISS_BRICK_STAIRS.get());
                    output.accept(GNEISS_BRICK_WALL.get());
                    output.accept(CHISELED_GNEISS_BRICKS.get());
                    output.accept(CRACKED_GNEISS_BRICKS.get());
                    output.accept(MOSSY_GNEISS_BRICKS.get());
                    output.accept(MOSSY_GNEISS_BRICK_SLAB.get());
                    output.accept(MOSSY_GNEISS_BRICK_STAIRS.get());
                    output.accept(MOSSY_GNEISS_BRICK_WALL.get());

                    //POLISHED GNEISS
                    output.accept(POLISHED_GNEISS.get());
                    output.accept(POLISHED_GNEISS_SLAB.get());
                    output.accept(POLISHED_GNEISS_STAIRS.get());

                    //MARBLE
                    output.accept(MARBLE.get());
                    output.accept(MARBLE_SLAB.get());
                    output.accept(MARBLE_STAIRS.get());
                    output.accept(MARBLE_WALL.get());

                    //MARBLE REDSTONE
                    output.accept(MARBLE_PRESSURE_PLATE.get());
                    output.accept(MARBLE_BUTTON.get());

                    //MARBLE COBBLESTONE
                    output.accept(MARBLE_COBBLESTONE.get());
                    output.accept(MARBLE_COBBLESTONE_SLAB.get());
                    output.accept(MARBLE_COBBLESTONE_STAIRS.get());
                    output.accept(MARBLE_COBBLESTONE_WALL.get());

                    //MOSSY MARBLE COBBLESTONE
                    output.accept(MOSSY_MARBLE_COBBLESTONE.get());
                    output.accept(MOSSY_MARBLE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_MARBLE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_MARBLE_COBBLESTONE_WALL.get());

                    //MARBLE BRICKS
                    output.accept(MARBLE_BRICKS.get());
                    output.accept(MARBLE_BRICK_SLAB.get());
                    output.accept(MARBLE_BRICK_STAIRS.get());
                    output.accept(MARBLE_BRICK_WALL.get());
                    output.accept(CHISELED_MARBLE_BRICKS.get());
                    output.accept(CRACKED_MARBLE_BRICKS.get());
                    output.accept(MOSSY_MARBLE_BRICKS.get());
                    output.accept(MOSSY_MARBLE_BRICK_SLAB.get());
                    output.accept(MOSSY_MARBLE_BRICK_STAIRS.get());
                    output.accept(MOSSY_MARBLE_BRICK_WALL.get());

                    //POLISHED MARBLE
                    output.accept(POLISHED_MARBLE.get());
                    output.accept(POLISHED_MARBLE_SLAB.get());
                    output.accept(POLISHED_MARBLE_STAIRS.get());

                    //MIGMATITE
                    output.accept(MIGMATITE.get());
                    output.accept(MIGMATITE_SLAB.get());
                    output.accept(MIGMATITE_STAIRS.get());
                    output.accept(MIGMATITE_WALL.get());

                    //MIGMATITE REDSTONE
                    output.accept(MIGMATITE_PRESSURE_PLATE.get());
                    output.accept(MIGMATITE_BUTTON.get());

                    //MIGMATITE COBBLESTONE
                    output.accept(MIGMATITE_COBBLESTONE.get());
                    output.accept(MIGMATITE_COBBLESTONE_SLAB.get());
                    output.accept(MIGMATITE_COBBLESTONE_STAIRS.get());
                    output.accept(MIGMATITE_COBBLESTONE_WALL.get());

                    //MOSSY MIGMATITE COBBLESTONE
                    output.accept(MOSSY_MIGMATITE_COBBLESTONE.get());
                    output.accept(MOSSY_MIGMATITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_MIGMATITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_MIGMATITE_COBBLESTONE_WALL.get());

                    //MIGMATITE BRICKS
                    output.accept(MIGMATITE_BRICKS.get());
                    output.accept(MIGMATITE_BRICK_SLAB.get());
                    output.accept(MIGMATITE_BRICK_STAIRS.get());
                    output.accept(MIGMATITE_BRICK_WALL.get());
                    output.accept(CHISELED_MIGMATITE_BRICKS.get());
                    output.accept(CRACKED_MIGMATITE_BRICKS.get());
                    output.accept(MOSSY_MIGMATITE_BRICKS.get());
                    output.accept(MOSSY_MIGMATITE_BRICK_SLAB.get());
                    output.accept(MOSSY_MIGMATITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_MIGMATITE_BRICK_WALL.get());

                    //POLISHED MIGMATITE
                    output.accept(POLISHED_MIGMATITE.get());
                    output.accept(POLISHED_MIGMATITE_SLAB.get());
                    output.accept(POLISHED_MIGMATITE_STAIRS.get());

                    //PHYLLITE
                    output.accept(PHYLLITE.get());
                    output.accept(PHYLLITE_SLAB.get());
                    output.accept(PHYLLITE_STAIRS.get());
                    output.accept(PHYLLITE_WALL.get());

                    //PHYLLITE REDSTONE
                    output.accept(PHYLLITE_PRESSURE_PLATE.get());
                    output.accept(PHYLLITE_BUTTON.get());

                    //PHYLLITE COBBLESTONE
                    output.accept(PHYLLITE_COBBLESTONE.get());
                    output.accept(PHYLLITE_COBBLESTONE_SLAB.get());
                    output.accept(PHYLLITE_COBBLESTONE_STAIRS.get());
                    output.accept(PHYLLITE_COBBLESTONE_WALL.get());

                    //MOSSY PHYLLITE COBBLESTONE
                    output.accept(MOSSY_PHYLLITE_COBBLESTONE.get());
                    output.accept(MOSSY_PHYLLITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_PHYLLITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_PHYLLITE_COBBLESTONE_WALL.get());

                    //PHYLLITE BRICKS
                    output.accept(PHYLLITE_BRICKS.get());
                    output.accept(PHYLLITE_BRICK_SLAB.get());
                    output.accept(PHYLLITE_BRICK_STAIRS.get());
                    output.accept(PHYLLITE_BRICK_WALL.get());
                    output.accept(CHISELED_PHYLLITE_BRICKS.get());
                    output.accept(CRACKED_PHYLLITE_BRICKS.get());
                    output.accept(MOSSY_PHYLLITE_BRICKS.get());
                    output.accept(MOSSY_PHYLLITE_BRICK_SLAB.get());
                    output.accept(MOSSY_PHYLLITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_PHYLLITE_BRICK_WALL.get());

                    //POLISHED PHYLLITE
                    output.accept(POLISHED_PHYLLITE.get());
                    output.accept(POLISHED_PHYLLITE_SLAB.get());
                    output.accept(POLISHED_PHYLLITE_STAIRS.get());

                    //SCHIST
                    output.accept(SCHIST.get());
                    output.accept(SCHIST_SLAB.get());
                    output.accept(SCHIST_STAIRS.get());
                    output.accept(SCHIST_WALL.get());

                    //SCHIST REDSTONE
                    output.accept(SCHIST_PRESSURE_PLATE.get());
                    output.accept(SCHIST_BUTTON.get());

                    //SCHIST COBBLESTONE
                    output.accept(SCHIST_COBBLESTONE.get());
                    output.accept(SCHIST_COBBLESTONE_SLAB.get());
                    output.accept(SCHIST_COBBLESTONE_STAIRS.get());
                    output.accept(SCHIST_COBBLESTONE_WALL.get());

                    //MOSSY SCHIST COBBLESTONE
                    output.accept(MOSSY_SCHIST_COBBLESTONE.get());
                    output.accept(MOSSY_SCHIST_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_SCHIST_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_SCHIST_COBBLESTONE_WALL.get());

                    //SCHIST BRICKS
                    output.accept(SCHIST_BRICKS.get());
                    output.accept(SCHIST_BRICK_SLAB.get());
                    output.accept(SCHIST_BRICK_STAIRS.get());
                    output.accept(SCHIST_BRICK_WALL.get());
                    output.accept(CHISELED_SCHIST_BRICKS.get());
                    output.accept(CRACKED_SCHIST_BRICKS.get());
                    output.accept(MOSSY_SCHIST_BRICKS.get());
                    output.accept(MOSSY_SCHIST_BRICK_SLAB.get());
                    output.accept(MOSSY_SCHIST_BRICK_STAIRS.get());
                    output.accept(MOSSY_SCHIST_BRICK_WALL.get());

                    //POLISHED SCHIST
                    output.accept(POLISHED_SCHIST.get());
                    output.accept(POLISHED_SCHIST_SLAB.get());
                    output.accept(POLISHED_SCHIST_STAIRS.get());

                    //SLATE
                    output.accept(SLATE.get());
                    output.accept(SLATE_SLAB.get());
                    output.accept(SLATE_STAIRS.get());
                    output.accept(SLATE_WALL.get());

                    //SLATE REDSTONE
                    output.accept(SLATE_PRESSURE_PLATE.get());
                    output.accept(SLATE_BUTTON.get());

                    //SLATE COBBLESTONE
                    output.accept(SLATE_COBBLESTONE.get());
                    output.accept(SLATE_COBBLESTONE_SLAB.get());
                    output.accept(SLATE_COBBLESTONE_STAIRS.get());
                    output.accept(SLATE_COBBLESTONE_WALL.get());

                    //MOSSY SLATE COBBLESTONE
                    output.accept(MOSSY_SLATE_COBBLESTONE.get());
                    output.accept(MOSSY_SLATE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_SLATE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_SLATE_COBBLESTONE_WALL.get());

                    //SLATE BRICKS
                    output.accept(SLATE_BRICKS.get());
                    output.accept(SLATE_BRICK_SLAB.get());
                    output.accept(SLATE_BRICK_STAIRS.get());
                    output.accept(SLATE_BRICK_WALL.get());
                    output.accept(CHISELED_SLATE_BRICKS.get());
                    output.accept(CRACKED_SLATE_BRICKS.get());
                    output.accept(MOSSY_SLATE_BRICKS.get());
                    output.accept(MOSSY_SLATE_BRICK_SLAB.get());
                    output.accept(MOSSY_SLATE_BRICK_STAIRS.get());
                    output.accept(MOSSY_SLATE_BRICK_WALL.get());

                    //POLISHED SLATE
                    output.accept(POLISHED_SLATE.get());
                    output.accept(POLISHED_SLATE_SLAB.get());
                    output.accept(POLISHED_SLATE_STAIRS.get());

                    //SOAPSTONE
                    output.accept(SOAPSTONE.get());
                    output.accept(SOAPSTONE_SLAB.get());
                    output.accept(SOAPSTONE_STAIRS.get());
                    output.accept(SOAPSTONE_WALL.get());

                    //SOAPSTONE REDSTONE
                    output.accept(SOAPSTONE_PRESSURE_PLATE.get());
                    output.accept(SOAPSTONE_BUTTON.get());

                    //SOAPSTONE COBBLESTONE
                    output.accept(SOAPSTONE_COBBLESTONE.get());
                    output.accept(SOAPSTONE_COBBLESTONE_SLAB.get());
                    output.accept(SOAPSTONE_COBBLESTONE_STAIRS.get());
                    output.accept(SOAPSTONE_COBBLESTONE_WALL.get());

                    //MOSSY SOAPSTONE COBBLESTONE
                    output.accept(MOSSY_SOAPSTONE_COBBLESTONE.get());
                    output.accept(MOSSY_SOAPSTONE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_SOAPSTONE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_SOAPSTONE_COBBLESTONE_WALL.get());

                    //SOAPSTONE BRICKS
                    output.accept(SOAPSTONE_BRICKS.get());
                    output.accept(SOAPSTONE_BRICK_SLAB.get());
                    output.accept(SOAPSTONE_BRICK_STAIRS.get());
                    output.accept(SOAPSTONE_BRICK_WALL.get());
                    output.accept(CHISELED_SOAPSTONE_BRICKS.get());
                    output.accept(CRACKED_SOAPSTONE_BRICKS.get());
                    output.accept(MOSSY_SOAPSTONE_BRICKS.get());
                    output.accept(MOSSY_SOAPSTONE_BRICK_SLAB.get());
                    output.accept(MOSSY_SOAPSTONE_BRICK_STAIRS.get());
                    output.accept(MOSSY_SOAPSTONE_BRICK_WALL.get());

                    //POLISHED SOAPSTONE
                    output.accept(POLISHED_SOAPSTONE.get());
                    output.accept(POLISHED_SOAPSTONE_SLAB.get());
                    output.accept(POLISHED_SOAPSTONE_STAIRS.get());
                })
        );
        SEDIMENTARY_TAB = event.registerCreativeModeTab(new ResourceLocation(Strata.MOD_ID, "sedimentary"), builder -> builder
                .icon(() -> new ItemStack(LIMESTONE.get()))
                .title(Component.translatable("itemGroup.sedimentary"))
                .displayItems((featureFlags, output) -> {
                    //This adds the items
                    //ARGILLITE
                    output.accept(ARGILLITE.get());
                    output.accept(ARGILLITE_SLAB.get());
                    output.accept(ARGILLITE_STAIRS.get());
                    output.accept(ARGILLITE_WALL.get());

                    //ARGILLITE REDSTONE
                    output.accept(ARGILLITE_PRESSURE_PLATE.get());
                    output.accept(ARGILLITE_BUTTON.get());

                    //ARGILLITE COBBLESTONE
                    output.accept(ARGILLITE_COBBLESTONE.get());
                    output.accept(ARGILLITE_COBBLESTONE_SLAB.get());
                    output.accept(ARGILLITE_COBBLESTONE_STAIRS.get());
                    output.accept(ARGILLITE_COBBLESTONE_WALL.get());

                    //MOSSY ARGILLITE COBBLESTONE
                    output.accept(MOSSY_ARGILLITE_COBBLESTONE.get());
                    output.accept(MOSSY_ARGILLITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_ARGILLITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_ARGILLITE_COBBLESTONE_WALL.get());

                    //ARGILLITE BRICKS
                    output.accept(ARGILLITE_BRICKS.get());
                    output.accept(ARGILLITE_BRICK_SLAB.get());
                    output.accept(ARGILLITE_BRICK_STAIRS.get());
                    output.accept(ARGILLITE_BRICK_WALL.get());
                    output.accept(CHISELED_ARGILLITE_BRICKS.get());
                    output.accept(CRACKED_ARGILLITE_BRICKS.get());
                    output.accept(MOSSY_ARGILLITE_BRICKS.get());
                    output.accept(MOSSY_ARGILLITE_BRICK_SLAB.get());
                    output.accept(MOSSY_ARGILLITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_ARGILLITE_BRICK_WALL.get());

                    //POLISHED ARGILLITE
                    output.accept(POLISHED_ARGILLITE.get());
                    output.accept(POLISHED_ARGILLITE_SLAB.get());
                    output.accept(POLISHED_ARGILLITE_STAIRS.get());

                    //ARKOSE
                    output.accept(ARKOSE.get());
                    output.accept(ARKOSE_SLAB.get());
                    output.accept(ARKOSE_STAIRS.get());
                    output.accept(ARKOSE_WALL.get());

                    //ARKOSE REDSTONE
                    output.accept(ARKOSE_PRESSURE_PLATE.get());
                    output.accept(ARKOSE_BUTTON.get());

                    //ARKOSE COBBLESTONE
                    output.accept(ARKOSE_COBBLESTONE.get());
                    output.accept(ARKOSE_COBBLESTONE_SLAB.get());
                    output.accept(ARKOSE_COBBLESTONE_STAIRS.get());
                    output.accept(ARKOSE_COBBLESTONE_WALL.get());

                    //MOSSY ARKOSE COBBLESTONE
                    output.accept(MOSSY_ARKOSE_COBBLESTONE.get());
                    output.accept(MOSSY_ARKOSE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_ARKOSE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_ARKOSE_COBBLESTONE_WALL.get());

                    //ARKOSE BRICKS
                    output.accept(ARKOSE_BRICKS.get());
                    output.accept(ARKOSE_BRICK_SLAB.get());
                    output.accept(ARKOSE_BRICK_STAIRS.get());
                    output.accept(ARKOSE_BRICK_WALL.get());
                    output.accept(CHISELED_ARKOSE_BRICKS.get());
                    output.accept(CRACKED_ARKOSE_BRICKS.get());
                    output.accept(MOSSY_ARKOSE_BRICKS.get());
                    output.accept(MOSSY_ARKOSE_BRICK_SLAB.get());
                    output.accept(MOSSY_ARKOSE_BRICK_STAIRS.get());
                    output.accept(MOSSY_ARKOSE_BRICK_WALL.get());

                    //POLISHED ARKOSE
                    output.accept(POLISHED_ARKOSE.get());
                    output.accept(POLISHED_ARKOSE_SLAB.get());
                    output.accept(POLISHED_ARKOSE_STAIRS.get());

                    //BRECCIA
                    output.accept(BRECCIA.get());
                    output.accept(BRECCIA_SLAB.get());
                    output.accept(BRECCIA_STAIRS.get());
                    output.accept(BRECCIA_WALL.get());

                    //BRECCIA REDSTONE
                    output.accept(BRECCIA_PRESSURE_PLATE.get());
                    output.accept(BRECCIA_BUTTON.get());

                    //BRECCIA COBBLESTONE
                    output.accept(BRECCIA_COBBLESTONE.get());
                    output.accept(BRECCIA_COBBLESTONE_SLAB.get());
                    output.accept(BRECCIA_COBBLESTONE_STAIRS.get());
                    output.accept(BRECCIA_COBBLESTONE_WALL.get());

                    //MOSSY BRECCIA COBBLESTONE
                    output.accept(MOSSY_BRECCIA_COBBLESTONE.get());
                    output.accept(MOSSY_BRECCIA_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_BRECCIA_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_BRECCIA_COBBLESTONE_WALL.get());

                    //BRECCIA BRICKS
                    output.accept(BRECCIA_BRICKS.get());
                    output.accept(BRECCIA_BRICK_SLAB.get());
                    output.accept(BRECCIA_BRICK_STAIRS.get());
                    output.accept(BRECCIA_BRICK_WALL.get());
                    output.accept(CHISELED_BRECCIA_BRICKS.get());
                    output.accept(CRACKED_BRECCIA_BRICKS.get());
                    output.accept(MOSSY_BRECCIA_BRICKS.get());
                    output.accept(MOSSY_BRECCIA_BRICK_SLAB.get());
                    output.accept(MOSSY_BRECCIA_BRICK_STAIRS.get());
                    output.accept(MOSSY_BRECCIA_BRICK_WALL.get());

                    //POLISHED BRECCIA
                    output.accept(POLISHED_BRECCIA.get());
                    output.accept(POLISHED_BRECCIA_SLAB.get());
                    output.accept(POLISHED_BRECCIA_STAIRS.get());

                    //CLAYSTONE
                    output.accept(CLAYSTONE.get());
                    output.accept(CLAYSTONE_SLAB.get());
                    output.accept(CLAYSTONE_STAIRS.get());
                    output.accept(CLAYSTONE_WALL.get());

                    //CLAYSTONE REDSTONE
                    output.accept(CLAYSTONE_PRESSURE_PLATE.get());
                    output.accept(CLAYSTONE_BUTTON.get());

                    //CLAYSTONE COBBLESTONE
                    output.accept(CLAYSTONE_COBBLESTONE.get());
                    output.accept(CLAYSTONE_COBBLESTONE_SLAB.get());
                    output.accept(CLAYSTONE_COBBLESTONE_STAIRS.get());
                    output.accept(CLAYSTONE_COBBLESTONE_WALL.get());

                    //MOSSY CLAYSTONE COBBLESTONE
                    output.accept(MOSSY_CLAYSTONE_COBBLESTONE.get());
                    output.accept(MOSSY_CLAYSTONE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_CLAYSTONE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_CLAYSTONE_COBBLESTONE_WALL.get());

                    //CLAYSTONE BRICKS
                    output.accept(CLAYSTONE_BRICKS.get());
                    output.accept(CLAYSTONE_BRICK_SLAB.get());
                    output.accept(CLAYSTONE_BRICK_STAIRS.get());
                    output.accept(CLAYSTONE_BRICK_WALL.get());
                    output.accept(CHISELED_CLAYSTONE_BRICKS.get());
                    output.accept(CRACKED_CLAYSTONE_BRICKS.get());
                    output.accept(MOSSY_CLAYSTONE_BRICKS.get());
                    output.accept(MOSSY_CLAYSTONE_BRICK_SLAB.get());
                    output.accept(MOSSY_CLAYSTONE_BRICK_STAIRS.get());
                    output.accept(MOSSY_CLAYSTONE_BRICK_WALL.get());

                    //POLISHED CLAYSTONE
                    output.accept(POLISHED_CLAYSTONE.get());
                    output.accept(POLISHED_CLAYSTONE_SLAB.get());
                    output.accept(POLISHED_CLAYSTONE_STAIRS.get());

                    //DOLOMITE
                    output.accept(DOLOMITE.get());
                    output.accept(DOLOMITE_SLAB.get());
                    output.accept(DOLOMITE_STAIRS.get());
                    output.accept(DOLOMITE_WALL.get());

                    //DOLOMITE REDSTONE
                    output.accept(DOLOMITE_PRESSURE_PLATE.get());
                    output.accept(DOLOMITE_BUTTON.get());

                    //DOLOMITE COBBLESTONE
                    output.accept(DOLOMITE_COBBLESTONE.get());
                    output.accept(DOLOMITE_COBBLESTONE_SLAB.get());
                    output.accept(DOLOMITE_COBBLESTONE_STAIRS.get());
                    output.accept(DOLOMITE_COBBLESTONE_WALL.get());

                    //MOSSY DOLOMITE COBBLESTONE
                    output.accept(MOSSY_DOLOMITE_COBBLESTONE.get());
                    output.accept(MOSSY_DOLOMITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_DOLOMITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_DOLOMITE_COBBLESTONE_WALL.get());

                    //DOLOMITE BRICKS
                    output.accept(DOLOMITE_BRICKS.get());
                    output.accept(DOLOMITE_BRICK_SLAB.get());
                    output.accept(DOLOMITE_BRICK_STAIRS.get());
                    output.accept(DOLOMITE_BRICK_WALL.get());
                    output.accept(CHISELED_DOLOMITE_BRICKS.get());
                    output.accept(CRACKED_DOLOMITE_BRICKS.get());
                    output.accept(MOSSY_DOLOMITE_BRICKS.get());
                    output.accept(MOSSY_DOLOMITE_BRICK_SLAB.get());
                    output.accept(MOSSY_DOLOMITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_DOLOMITE_BRICK_WALL.get());

                    //POLISHED DOLOMITE
                    output.accept(POLISHED_DOLOMITE.get());
                    output.accept(POLISHED_DOLOMITE_SLAB.get());
                    output.accept(POLISHED_DOLOMITE_STAIRS.get());

                    //CHALK
                    output.accept(CHALK.get());
                    output.accept(CHALK_SLAB.get());
                    output.accept(CHALK_STAIRS.get());
                    output.accept(CHALK_WALL.get());

                    //CHALK REDSTONE
                    output.accept(CHALK_PRESSURE_PLATE.get());
                    output.accept(CHALK_BUTTON.get());

                    //CHALK COBBLESTONE
                    output.accept(CHALK_COBBLESTONE.get());
                    output.accept(CHALK_COBBLESTONE_SLAB.get());
                    output.accept(CHALK_COBBLESTONE_STAIRS.get());
                    output.accept(CHALK_COBBLESTONE_WALL.get());

                    //MOSSY CHALK COBBLESTONE
                    output.accept(MOSSY_CHALK_COBBLESTONE.get());
                    output.accept(MOSSY_CHALK_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_CHALK_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_CHALK_COBBLESTONE_WALL.get());

                    //CHALK BRICKS
                    output.accept(CHALK_BRICKS.get());
                    output.accept(CHALK_BRICK_SLAB.get());
                    output.accept(CHALK_BRICK_STAIRS.get());
                    output.accept(CHALK_BRICK_WALL.get());
                    output.accept(CHISELED_CHALK_BRICKS.get());
                    output.accept(CRACKED_CHALK_BRICKS.get());
                    output.accept(MOSSY_CHALK_BRICKS.get());
                    output.accept(MOSSY_CHALK_BRICK_SLAB.get());
                    output.accept(MOSSY_CHALK_BRICK_STAIRS.get());
                    output.accept(MOSSY_CHALK_BRICK_WALL.get());

                    //POLISHED CHALK
                    output.accept(POLISHED_CHALK.get());
                    output.accept(POLISHED_CHALK_SLAB.get());
                    output.accept(POLISHED_CHALK_STAIRS.get());

                    //JASPILLITE
                    output.accept(JASPILLITE.get());
                    output.accept(JASPILLITE_SLAB.get());
                    output.accept(JASPILLITE_STAIRS.get());
                    output.accept(JASPILLITE_WALL.get());

                    //JASPILLITE REDSTONE
                    output.accept(JASPILLITE_PRESSURE_PLATE.get());
                    output.accept(JASPILLITE_BUTTON.get());

                    //JASPILLITE COBBLESTONE
                    output.accept(JASPILLITE_COBBLESTONE.get());
                    output.accept(JASPILLITE_COBBLESTONE_SLAB.get());
                    output.accept(JASPILLITE_COBBLESTONE_STAIRS.get());
                    output.accept(JASPILLITE_COBBLESTONE_WALL.get());

                    //MOSSY JASPILLITE COBBLESTONE
                    output.accept(MOSSY_JASPILLITE_COBBLESTONE.get());
                    output.accept(MOSSY_JASPILLITE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_JASPILLITE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_JASPILLITE_COBBLESTONE_WALL.get());

                    //JASPILLITE BRICKS
                    output.accept(JASPILLITE_BRICKS.get());
                    output.accept(JASPILLITE_BRICK_SLAB.get());
                    output.accept(JASPILLITE_BRICK_STAIRS.get());
                    output.accept(JASPILLITE_BRICK_WALL.get());
                    output.accept(CHISELED_JASPILLITE_BRICKS.get());
                    output.accept(CRACKED_JASPILLITE_BRICKS.get());
                    output.accept(MOSSY_JASPILLITE_BRICKS.get());
                    output.accept(MOSSY_JASPILLITE_BRICK_SLAB.get());
                    output.accept(MOSSY_JASPILLITE_BRICK_STAIRS.get());
                    output.accept(MOSSY_JASPILLITE_BRICK_WALL.get());

                    //POLISHED JASPILLITE
                    output.accept(POLISHED_JASPILLITE.get());
                    output.accept(POLISHED_JASPILLITE_SLAB.get());
                    output.accept(POLISHED_JASPILLITE_STAIRS.get());

                    //LIMESTONE
                    output.accept(LIMESTONE.get());
                    output.accept(LIMESTONE_SLAB.get());
                    output.accept(LIMESTONE_STAIRS.get());
                    output.accept(LIMESTONE_WALL.get());

                    //LIMESTONE REDSTONE
                    output.accept(LIMESTONE_PRESSURE_PLATE.get());
                    output.accept(LIMESTONE_BUTTON.get());

                    //LIMESTONE COBBLESTONE
                    output.accept(LIMESTONE_COBBLESTONE.get());
                    output.accept(LIMESTONE_COBBLESTONE_SLAB.get());
                    output.accept(LIMESTONE_COBBLESTONE_STAIRS.get());
                    output.accept(LIMESTONE_COBBLESTONE_WALL.get());

                    //MOSSY LIMESTONE COBBLESTONE
                    output.accept(MOSSY_LIMESTONE_COBBLESTONE.get());
                    output.accept(MOSSY_LIMESTONE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_LIMESTONE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_LIMESTONE_COBBLESTONE_WALL.get());

                    //LIMESTONE BRICKS
                    output.accept(LIMESTONE_BRICKS.get());
                    output.accept(LIMESTONE_BRICK_SLAB.get());
                    output.accept(LIMESTONE_BRICK_STAIRS.get());
                    output.accept(LIMESTONE_BRICK_WALL.get());
                    output.accept(CHISELED_LIMESTONE_BRICKS.get());
                    output.accept(CRACKED_LIMESTONE_BRICKS.get());
                    output.accept(MOSSY_LIMESTONE_BRICKS.get());
                    output.accept(MOSSY_LIMESTONE_BRICK_SLAB.get());
                    output.accept(MOSSY_LIMESTONE_BRICK_STAIRS.get());
                    output.accept(MOSSY_LIMESTONE_BRICK_WALL.get());

                    //POLISHED LIMESTONE
                    output.accept(POLISHED_LIMESTONE.get());
                    output.accept(POLISHED_LIMESTONE_SLAB.get());
                    output.accept(POLISHED_LIMESTONE_STAIRS.get());

                    //MUDSTONE
                    output.accept(MUDSTONE.get());
                    output.accept(MUDSTONE_SLAB.get());
                    output.accept(MUDSTONE_STAIRS.get());
                    output.accept(MUDSTONE_WALL.get());

                    //MUDSTONE REDSTONE
                    output.accept(MUDSTONE_PRESSURE_PLATE.get());
                    output.accept(MUDSTONE_BUTTON.get());

                    //MUDSTONE COBBLESTONE
                    output.accept(MUDSTONE_COBBLESTONE.get());
                    output.accept(MUDSTONE_COBBLESTONE_SLAB.get());
                    output.accept(MUDSTONE_COBBLESTONE_STAIRS.get());
                    output.accept(MUDSTONE_COBBLESTONE_WALL.get());

                    //MOSSY MUDSTONE COBBLESTONE
                    output.accept(MOSSY_MUDSTONE_COBBLESTONE.get());
                    output.accept(MOSSY_MUDSTONE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_MUDSTONE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_MUDSTONE_COBBLESTONE_WALL.get());

                    //MUDSTONE BRICKS
                    output.accept(MUDSTONE_BRICKS.get());
                    output.accept(MUDSTONE_BRICK_SLAB.get());
                    output.accept(MUDSTONE_BRICK_STAIRS.get());
                    output.accept(MUDSTONE_BRICK_WALL.get());
                    output.accept(CHISELED_MUDSTONE_BRICKS.get());
                    output.accept(CRACKED_MUDSTONE_BRICKS.get());
                    output.accept(MOSSY_MUDSTONE_BRICKS.get());
                    output.accept(MOSSY_MUDSTONE_BRICK_SLAB.get());
                    output.accept(MOSSY_MUDSTONE_BRICK_STAIRS.get());
                    output.accept(MOSSY_MUDSTONE_BRICK_WALL.get());

                    //POLISHED MUDSTONE
                    output.accept(POLISHED_MUDSTONE.get());
                    output.accept(POLISHED_MUDSTONE_SLAB.get());
                    output.accept(POLISHED_MUDSTONE_STAIRS.get());

                    //SHALE
                    output.accept(SHALE.get());
                    output.accept(SHALE_SLAB.get());
                    output.accept(SHALE_STAIRS.get());
                    output.accept(SHALE_WALL.get());

                    //SHALE REDSTONE
                    output.accept(SHALE_PRESSURE_PLATE.get());
                    output.accept(SHALE_BUTTON.get());

                    //SHALE COBBLESTONE
                    output.accept(SHALE_COBBLESTONE.get());
                    output.accept(SHALE_COBBLESTONE_SLAB.get());
                    output.accept(SHALE_COBBLESTONE_STAIRS.get());
                    output.accept(SHALE_COBBLESTONE_WALL.get());

                    //MOSSY SHALE COBBLESTONE
                    output.accept(MOSSY_SHALE_COBBLESTONE.get());
                    output.accept(MOSSY_SHALE_COBBLESTONE_SLAB.get());
                    output.accept(MOSSY_SHALE_COBBLESTONE_STAIRS.get());
                    output.accept(MOSSY_SHALE_COBBLESTONE_WALL.get());

                    //SHALE BRICKS
                    output.accept(SHALE_BRICKS.get());
                    output.accept(SHALE_BRICK_SLAB.get());
                    output.accept(SHALE_BRICK_STAIRS.get());
                    output.accept(SHALE_BRICK_WALL.get());
                    output.accept(CHISELED_SHALE_BRICKS.get());
                    output.accept(CRACKED_SHALE_BRICKS.get());
                    output.accept(MOSSY_SHALE_BRICKS.get());
                    output.accept(MOSSY_SHALE_BRICK_SLAB.get());
                    output.accept(MOSSY_SHALE_BRICK_STAIRS.get());
                    output.accept(MOSSY_SHALE_BRICK_WALL.get());

                    //POLISHED SHALE
                    output.accept(POLISHED_SHALE.get());
                    output.accept(POLISHED_SHALE_SLAB.get());
                    output.accept(POLISHED_SHALE_STAIRS.get());
                })
        );
    }
}
