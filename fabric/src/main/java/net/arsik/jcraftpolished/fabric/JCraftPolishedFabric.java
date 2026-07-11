package net.arsik.jcraftpolished.fabric;

import net.fabricmc.api.ModInitializer;

import net.arsik.jcraftpolished.JCraftPolished;

public final class JCraftPolishedFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        JCraftPolished.init();
    }
}
