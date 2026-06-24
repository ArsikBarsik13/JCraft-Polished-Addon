package net.arsik.jcraftpolished.fabric.datagen;

import net.arna.jcraft.api.registry.JBlockRegistry;
import net.arna.jcraft.api.registry.JItemRegistry;
import net.arsik.jcraftpolished.JCraftPolished;
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
        // slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, JPItemRegistry.POLISHED_METEORITE_SLAB.get())
                .pattern("BBB")
                .define('B', JItemRegistry.POLISHED_METEORITE_BLOCK.get())
                .unlockedBy("has_block", InventoryChangeTrigger.TriggerInstance.hasItems(JBlockRegistry.POLISHED_METEORITE_BLOCK.get()))
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
