package net.arsik.jcraftpolished.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.arsik.jcraftpolished.JCraftPolished;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public interface JPBlockRegistry {

    DeferredRegister<Block> BLOCK_REGISTRY = DeferredRegister.create(JCraftPolished.MOD_ID, Registries.BLOCK);

    RegistrySupplier<Block> POLISHED_METEORITE_BLOCK = BLOCK_REGISTRY.register("polished_meteorite_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
            .requiresCorrectToolForDrops()
            .strength(6.0f, 1200f)
            .sound(SoundType.ANCIENT_DEBRIS)
            .mapColor(MapColor.COLOR_BLACK)
    ));
    RegistrySupplier<SlabBlock> POLISHED_METEORITE_SLAB = BLOCK_REGISTRY.register("polished_meteorite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
            .requiresCorrectToolForDrops()
            .strength(6.0f, 1200f)
            .sound(SoundType.ANCIENT_DEBRIS)
            .mapColor(MapColor.COLOR_BLACK)
    ));

    static void init() {

    }
}