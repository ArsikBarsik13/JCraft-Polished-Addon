package net.arsik.jcraftpolished;

import dev.architectury.registry.registries.DeferredRegister;
import net.arsik.jcraftpolished.common.registry.JPCreativeMenuTabRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

import static net.arsik.jcraftpolished.common.registry.JPBlockRegistry.BLOCK_REGISTRY;
import static net.arsik.jcraftpolished.common.registry.JPItemRegistry.ITEM_REGISTRY;

public final class JCraftPolished {
    public static final String MOD_ID = "jcraftpolished";
    public static final String BASE_CONTROLLER = "base_controller";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_REGISTRY = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static void init() {
        BLOCK_REGISTRY.register();
        ITEM_REGISTRY.register();

        JPCreativeMenuTabRegistry.init();
        CREATIVE_TAB_REGISTRY.register();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
