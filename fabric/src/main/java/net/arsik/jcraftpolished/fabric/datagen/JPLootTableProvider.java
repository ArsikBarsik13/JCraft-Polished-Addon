package net.arsik.jcraftpolished.fabric.datagen;

import net.arsik.jcraftpolished.common.registry.JPBlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class JPLootTableProvider {
    public static class BlockLoot extends FabricBlockLootTableProvider {

        public BlockLoot(FabricDataOutput output) {
            super(output);
        }

        @Override
        public void generate() {
            dropSelf(JPBlockRegistry.POLISHED_METEORITE_BLOCK.get());
        }
                                {dropSelf(JPBlockRegistry.POLISHED_METEORITE_SLAB.get());}
    }
}
