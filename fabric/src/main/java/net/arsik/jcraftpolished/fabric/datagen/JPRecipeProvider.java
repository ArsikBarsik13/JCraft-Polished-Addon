package net.arsik.jcraftpolished.fabric.datagen;

import net.arna.jcraft.api.registry.JItemRegistry;
import net.arsik.jcraftpolished.JCraftPolished;
import net.arsik.jcraftpolished.common.registry.JPBlockRegistry;
import net.arsik.jcraftpolished.common.registry.JPItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.critereon.*;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.function.Consumer;

public class JPRecipeProvider extends FabricRecipeProvider {

    public JPRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        // polished meteorite block
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, JPItemRegistry.POLISHED_METEORITE_BLOCK.get(), 4)
                .pattern("BB")
                .pattern("BB")
                .define('B', JItemRegistry.METEORITE_BLOCK.get())
                .unlockedBy("has_block", InventoryChangeTrigger.TriggerInstance.hasItems(JItemRegistry.METEORITE_BLOCK.get()))
                .save(exporter);
        // stellar iron ingot from smelting
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, JPItemRegistry.POLISHED_METEORITE_SLAB.get())
                .pattern("BBB")
                .define('B', JPItemRegistry.POLISHED_METEORITE_BLOCK.get())
                .unlockedBy("has_block", InventoryChangeTrigger.TriggerInstance.hasItems(JPBlockRegistry.POLISHED_METEORITE_BLOCK.get()))
                .save(exporter, JCraftPolished.id("polished_meteorte_slab"));
    }
    public static ItemPredicate ofTag(TagKey<Item> tag) {
        return new ItemPredicate(tag,
                null,
                MinMaxBounds.Ints.ANY,
                MinMaxBounds.Ints.ANY,
                EnchantmentPredicate.NONE,
                EnchantmentPredicate.NONE,
                null,
                NbtPredicate.ANY
        );
    }
}
