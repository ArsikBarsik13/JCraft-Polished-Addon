package net.arsik.jcraftpolished.fabric.datagen.assets;

import lombok.NonNull;
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
        generator.family(JPBlockRegistry.POLISHED_METEORITE_BLOCK)
                .slab(JPBlockRegistry.POLISHED_METEORITE_SLAB);
    }

    @Override
    public void generateItemModels(final @NonNull ItemModelGenerators generator) {

    }
}


