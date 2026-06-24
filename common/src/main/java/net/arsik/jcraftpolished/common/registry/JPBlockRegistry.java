package net.arsik.jcraftpolished.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.arna.jcraft.api.registry.JBlockRegistry;
import net.arsik.jcraftpolished.JCraftPolished;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;

public interface JPBlockRegistry {

    DeferredRegister<Block> BLOCK_REGISTRY = DeferredRegister.create(JCraftPolished.MOD_ID, Registries.BLOCK);

    RegistrySupplier<SlabBlock> POLISHED_METEORITE_SLAB = BLOCK_REGISTRY.register("polished_meteorite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
            .requiresCorrectToolForDrops()
            .strength(6.0f, 1200f)
            .sound(SoundType.ANCIENT_DEBRIS)
            .mapColor(MapColor.COLOR_BLACK)
    ));

    RegistrySupplier<StairBlock> POLISHED_METEORITE_STAIRS = BLOCK_REGISTRY.register("polished_meteorite_stairs", () -> new StairBlock(JBlockRegistry.POLISHED_METEORITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
            .requiresCorrectToolForDrops()
            .strength(6.0f, 1200f)
            .sound(SoundType.ANCIENT_DEBRIS)
            .mapColor(MapColor.COLOR_BLACK)
    ));

    RegistrySupplier<WallBlock> POLISHED_METEORITE_WALL = BLOCK_REGISTRY.register("polished_meteorite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
            .requiresCorrectToolForDrops()
            .strength(6.0f, 1200f)
            .sound(SoundType.ANCIENT_DEBRIS)
            .mapColor(MapColor.COLOR_BLACK)
    ));

    RegistrySupplier<PressurePlateBlock> POLISHED_METEORITE_PRESSURE_PLATE = BLOCK_REGISTRY.register("polished_meteorite_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
            .requiresCorrectToolForDrops()
            .strength(6.0f, 1200f)
            .sound(SoundType.ANCIENT_DEBRIS)
            .mapColor(MapColor.COLOR_BLACK),BlockSetType.IRON)
    );

    static void init() {

    }
}