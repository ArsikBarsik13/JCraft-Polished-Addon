package net.arsik.jcraftpolished.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.arsik.jcraftpolished.JCraftPolished;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SlabBlock;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

public interface JPItemRegistry {

    DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(JCraftPolished.MOD_ID, Registries.ITEM);
    Map<RegistrySupplier<? extends Item>, ResourceLocation> ITEMS = new LinkedHashMap<>();

    RegistrySupplier<Item> POLISHED_METEORITE_BLOCK = register("polished_meteorite_block", () -> new BlockItem(JPBlockRegistry.POLISHED_METEORITE_BLOCK.get(), settings()));
    RegistrySupplier<Item> POLISHED_METEORITE_SLAB = register("polished_meteorite_slab", () -> new BlockItem(JPBlockRegistry.POLISHED_METEORITE_SLAB.get(), settings()));


    static <T extends Item> RegistrySupplier<T> register(String id, Supplier<? extends T> supplier) {
        RegistrySupplier<T> item = ITEM_REGISTRY.register(id, supplier);
        ITEMS.put(item, JCraftPolished.id(id));
        return item;
    }

    static Item.Properties settings() {
        return new Item.Properties();
    }

    static void init() {}

}