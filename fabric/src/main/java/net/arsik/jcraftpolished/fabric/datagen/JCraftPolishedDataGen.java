package net.arsik.jcraftpolished.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class JCraftPolishedDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGen) {
        final FabricDataGenerator.Pack pack = dataGen.createPack();
        pack.addProvider(JPModelProvider::new);

        pack.addProvider(JPRecipeProvider::new);
        pack.addProvider(JPLootTableProvider.BlockLoot::new);

        pack.addProvider(JPTagProvider.JPItemTags::new);
        pack.addProvider(JPTagProvider.JPBlockTags::new);
    }
}
