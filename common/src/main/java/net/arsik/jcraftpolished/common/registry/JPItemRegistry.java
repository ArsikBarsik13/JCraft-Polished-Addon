package net.arsik.jcraftpolished.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.arsik.jcraftpolished.JCraftPolished;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

public interface JPItemRegistry {

    DeferredRegister<Item> ITEM_REGISTRY = DeferredRegister.create(JCraftPolished.MOD_ID, Registries.ITEM);
    Map<RegistrySupplier<? extends Item>, ResourceLocation> ITEMS = new LinkedHashMap<>();

    RegistrySupplier<Item> POLISHED_METEORITE_SLAB = register("polished_meteorite_slab", () -> new BlockItem(JPBlockRegistry.POLISHED_METEORITE_SLAB.get(), settings()));
    RegistrySupplier<Item> POLISHED_METEORITE_STAIRS = register("polished_meteorite_stairs", () -> new BlockItem(JPBlockRegistry.POLISHED_METEORITE_STAIRS.get(), settings()));
    RegistrySupplier<Item> POLISHED_METEORITE_WALL = register("polished_meteorite_wall", () -> new BlockItem(JPBlockRegistry.POLISHED_METEORITE_WALL.get(), settings()));
    RegistrySupplier<Item> POLISHED_METEORITE_PRESSURE_PLATE = register("polished_meteorite_pressure_plate", () -> new BlockItem(JPBlockRegistry.POLISHED_METEORITE_PRESSURE_PLATE.get(), settings()));


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