package net.arsik.jcraftpolished.fabric.datagen;

import net.arna.jcraft.api.registry.JTagRegistry;
import net.arsik.jcraftpolished.common.registry.JPBlockRegistry;
import net.arsik.jcraftpolished.common.registry.JPItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class JPTagProvider {
    public static class JPBlockTags extends FabricTagProvider.BlockTagProvider {

        public JPBlockTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider arg) {
            getOrCreateRawBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                    .addElement(JPBlockRegistry.POLISHED_METEORITE_SLAB.getId())
                    .addElement(JPBlockRegistry.POLISHED_METEORITE_STAIRS.getId())
                    .addElement(JPBlockRegistry.POLISHED_METEORITE_WALL.getId())
                    .addElement(JPBlockRegistry.POLISHED_METEORITE_PRESSURE_PLATE.getId())

                    .addElement(JPBlockRegistry.METEORITE_SLAB.getId())
                    .addElement(JPBlockRegistry.METEORITE_STAIRS.getId())
                    .addElement(JPBlockRegistry.METEORITE_WALL.getId());
            getOrCreateRawBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                    .addElement(JPBlockRegistry.POLISHED_METEORITE_SLAB.getId())
                    .addElement(JPBlockRegistry.POLISHED_METEORITE_STAIRS.getId())
                    .addElement(JPBlockRegistry.POLISHED_METEORITE_WALL.getId())
                    .addElement(JPBlockRegistry.POLISHED_METEORITE_PRESSURE_PLATE.getId())

                    .addElement(JPBlockRegistry.METEORITE_SLAB.getId())
                    .addElement(JPBlockRegistry.METEORITE_STAIRS.getId())
                    .addElement(JPBlockRegistry.METEORITE_WALL.getId());
            getOrCreateRawBuilder(BlockTags.WALLS)
                    .addElement(JPBlockRegistry.POLISHED_METEORITE_WALL.getId())
                    .addElement(JPBlockRegistry.METEORITE_WALL.getId());
        }
    }
    public static class JPItemTags extends FabricTagProvider.ItemTagProvider {

        public JPItemTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider arg) {

            final var heavyImpact = getOrCreateTagBuilder(JTagRegistry.HEAVY_IMPACT);
            heavyImpact.add(JPItemRegistry.POLISHED_METEORITE_SLAB.getId());
            heavyImpact.add(JPItemRegistry.POLISHED_METEORITE_STAIRS.getId());
            heavyImpact.add(JPItemRegistry.POLISHED_METEORITE_WALL.getId());
            heavyImpact.add(JPItemRegistry.POLISHED_METEORITE_PRESSURE_PLATE.getId());

            heavyImpact.add(JPItemRegistry.METEORITE_SLAB.getId());
            heavyImpact.add(JPItemRegistry.METEORITE_STAIRS.getId());
            heavyImpact.add(JPItemRegistry.METEORITE_WALL.getId());

            final var heavy = getOrCreateTagBuilder(JTagRegistry.HEAVY);
            heavy.add(JPItemRegistry.POLISHED_METEORITE_SLAB.getId());
            heavy.add(JPItemRegistry.POLISHED_METEORITE_STAIRS.getId());
            heavy.add(JPItemRegistry.POLISHED_METEORITE_WALL.getId());
            heavy.add(JPItemRegistry.POLISHED_METEORITE_PRESSURE_PLATE.getId());

            heavy.add(JPItemRegistry.METEORITE_SLAB.getId());
            heavy.add(JPItemRegistry.METEORITE_STAIRS.getId());
            heavy.add(JPItemRegistry.METEORITE_WALL.getId());

            getOrCreateTagBuilder(ItemTags.WALLS)
                    .add(JPItemRegistry.POLISHED_METEORITE_WALL.getId())
                    .add(JPItemRegistry.METEORITE_WALL.getId());
        }
}}
