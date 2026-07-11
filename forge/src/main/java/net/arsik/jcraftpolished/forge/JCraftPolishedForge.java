package net.arsik.jcraftpolished.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.arsik.jcraftpolished.JCraftPolished;

@Mod(JCraftPolished.MOD_ID)
public final class JCraftPolishedForge {
    public JCraftPolishedForge(FMLJavaModLoadingContext ctx) {
        EventBuses.registerModEventBus(JCraftPolished.MOD_ID, ctx.getModEventBus());

        JCraftPolished.init();
    }
}
