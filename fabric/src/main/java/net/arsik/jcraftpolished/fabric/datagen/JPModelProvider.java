package net.arsik.jcraftpolished.fabric.datagen;

import lombok.NonNull;
import net.arna.jcraft.api.registry.JBlockRegistry;
import net.arsik.jcraftpolished.common.registry.JPBlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;

public class JPModelProvider extends FabricModelProvider {

    public JPModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(final @NonNull BlockModelGenerators generator) {
        generator.family(JBlockRegistry.POLISHED_METEORITE_BLOCK.get())
                .slab(JPBlockRegistry.POLISHED_METEORITE_SLAB.get())
                .stairs(JPBlockRegistry.POLISHED_METEORITE_STAIRS.get())
                .wall(JPBlockRegistry.POLISHED_METEORITE_WALL.get())
                .pressurePlate(JPBlockRegistry.POLISHED_METEORITE_PRESSURE_PLATE.get());

    }

    @Override
    public void generateItemModels(final @NonNull ItemModelGenerators generator) {

    }
}


