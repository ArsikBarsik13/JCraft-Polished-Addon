package net.arsik.jcraftpolished.fabric.datagen;

import net.arna.jcraft.api.registry.JItemRegistry;
import net.arsik.jcraftpolished.common.registry.JPBlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.critereon.*;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;

public class JPRecipeProvider extends FabricRecipeProvider {

    public JPRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        //slab
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.POLISHED_METEORITE_SLAB.get(), Ingredient.of(JItemRegistry.POLISHED_METEORITE_BLOCK.get()));
        //stonecutterResultFromBase(, RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.POLISHED_METEORITE_SLAB.get(), JItemRegistry.POLISHED_METEORITE_BLOCK.get());
        //stairs
        stairBuilder(JPBlockRegistry.POLISHED_METEORITE_STAIRS.get(), Ingredient.of(JItemRegistry.POLISHED_METEORITE_BLOCK.get()));
        //wall
        wallBuilder(RecipeCategory.BUILDING_BLOCKS ,JPBlockRegistry.POLISHED_METEORITE_WALL.get(), Ingredient.of(JItemRegistry.POLISHED_METEORITE_BLOCK.get()));
        //pressure plate
        pressurePlateBuilder(RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.POLISHED_METEORITE_PRESSURE_PLATE.get(), Ingredient.of(JItemRegistry.POLISHED_METEORITE_BLOCK.get()));
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
