package net.arsik.jcraftpolished.common.registry;

import net.arna.jcraft.api.registry.JItemRegistry;
import net.arsik.jcraftpolished.JCraftPolished;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;


public interface JPCreativeMenuTabRegistry {
    static void init() {
        JCraftPolished.CREATIVE_TAB_REGISTRY.register("general", JPCreativeMenuTabRegistry::createJcraftPolishedItemGroup);
    }
        static CreativeModeTab createJcraftPolishedItemGroup() {
            return CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.literal("JCraft: Polished Blocks"))
                    .icon(() -> JItemRegistry.POLISHED_METEORITE_BLOCK.get().getDefaultInstance())
                    .displayItems((displayContext, entries) -> {
                        entries.accept(JPItemRegistry.POLISHED_METEORITE_SLAB.get());
                        entries.accept(JPItemRegistry.POLISHED_METEORITE_STAIRS.get());
                        entries.accept(JPItemRegistry.POLISHED_METEORITE_WALL.get());
                        entries.accept(JPItemRegistry.POLISHED_METEORITE_PRESSURE_PLATE.get());
                    })
                    .build();
        }}