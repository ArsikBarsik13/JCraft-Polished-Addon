package net.arsik.jcraftpolished.fabric.datagen;

import net.arna.jcraft.api.registry.JItemRegistry;
import net.arsik.jcraftpolished.common.registry.JPBlockRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class JPRecipeProvider extends FabricRecipeProvider {

    public JPRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        //crafting table recipes
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.POLISHED_METEORITE_SLAB.get(), Ingredient.of(JItemRegistry.POLISHED_METEORITE_BLOCK.get()))
                .unlockedBy(getHasName(JItemRegistry.POLISHED_METEORITE_BLOCK.get()), has(JItemRegistry.POLISHED_METEORITE_BLOCK.get()))
                .save(exporter);

        stairBuilder(JPBlockRegistry.POLISHED_METEORITE_STAIRS.get(), Ingredient.of(JItemRegistry.POLISHED_METEORITE_BLOCK.get()))
                .unlockedBy(getHasName(JItemRegistry.POLISHED_METEORITE_BLOCK.get()), has(JItemRegistry.POLISHED_METEORITE_BLOCK.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.POLISHED_METEORITE_WALL.get(), Ingredient.of(JItemRegistry.POLISHED_METEORITE_BLOCK.get()))
                .unlockedBy(getHasName(JItemRegistry.POLISHED_METEORITE_BLOCK.get()), has(JItemRegistry.POLISHED_METEORITE_BLOCK.get()))
                .save(exporter);

        pressurePlateBuilder(RecipeCategory.REDSTONE, JPBlockRegistry.POLISHED_METEORITE_PRESSURE_PLATE.get(), Ingredient.of(JItemRegistry.POLISHED_METEORITE_BLOCK.get()))
                .unlockedBy(getHasName(JItemRegistry.POLISHED_METEORITE_BLOCK.get()), has(JItemRegistry.POLISHED_METEORITE_BLOCK.get()))
                .save(exporter);


        slabBuilder(RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.METEORITE_SLAB.get(), Ingredient.of(JItemRegistry.METEORITE_BLOCK.get()))
                .unlockedBy(getHasName(JItemRegistry.METEORITE_BLOCK.get()), has(JItemRegistry.METEORITE_BLOCK.get()))
                .save(exporter);

        stairBuilder(JPBlockRegistry.METEORITE_STAIRS.get(), Ingredient.of(JItemRegistry.METEORITE_BLOCK.get()))
                .unlockedBy(getHasName(JItemRegistry.METEORITE_BLOCK.get()), has(JItemRegistry.METEORITE_BLOCK.get()))
                .save(exporter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.METEORITE_WALL.get(), Ingredient.of(JItemRegistry.METEORITE_BLOCK.get()))
                .unlockedBy(getHasName(JItemRegistry.METEORITE_BLOCK.get()), has(JItemRegistry.METEORITE_BLOCK.get()))
                .save(exporter);

        //stonecutter recipes
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.POLISHED_METEORITE_SLAB.get(), JItemRegistry.POLISHED_METEORITE_BLOCK.get(), 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.POLISHED_METEORITE_STAIRS.get(), JItemRegistry.POLISHED_METEORITE_BLOCK.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.POLISHED_METEORITE_WALL.get(), JItemRegistry.POLISHED_METEORITE_BLOCK.get());

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.METEORITE_SLAB.get(), JItemRegistry.METEORITE_BLOCK.get(), 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.METEORITE_STAIRS.get(), JItemRegistry.METEORITE_BLOCK.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.METEORITE_WALL.get(), JItemRegistry.METEORITE_BLOCK.get());

        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, JPBlockRegistry.POLISHED_METEORITE_PRESSURE_PLATE.get(), JItemRegistry.POLISHED_METEORITE_BLOCK.get(), 2);
        stonecutterResultFromBase(exporter, RecipeCategory.REDSTONE, JPBlockRegistry.POLISHED_METEORITE_PRESSURE_PLATE.get(), JItemRegistry.METEORITE_BLOCK.get(), 2);

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JItemRegistry.POLISHED_METEORITE_BLOCK.get(), JItemRegistry.METEORITE_BLOCK.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.POLISHED_METEORITE_SLAB.get(), JItemRegistry.METEORITE_BLOCK.get(), 2);
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.POLISHED_METEORITE_STAIRS.get(), JItemRegistry.METEORITE_BLOCK.get());
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, JPBlockRegistry.POLISHED_METEORITE_WALL.get(), JItemRegistry.METEORITE_BLOCK.get());
    }
}
