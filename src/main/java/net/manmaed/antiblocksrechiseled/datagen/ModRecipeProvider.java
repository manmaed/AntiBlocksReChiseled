package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.blocks.ABRCBrightColors;
import net.manmaed.antiblocksrechiseled.blocks.ABRCSlabs;
import net.manmaed.antiblocksrechiseled.blocks.ABRCStairs;
import net.manmaed.antiblocksrechiseled.blocks.ABRCWoolColors;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> p_176532_) {
        //Bright White Builder
        ShapedRecipeBuilder.shaped(ABRCBrightColors.BRIGHT_WHITE_ITEM.get(), 4)
                .define('s', Ingredient.of(Blocks.STONE.asItem()))
                .define('d', Ingredient.of(Items.WHITE_DYE))
                .define('s', Ingredient.of(Items.GLOWSTONE_DUST))
                .pattern("sds")
                .pattern("dgd")
                .pattern("sds");

        //The Rest of Bright Colors
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_ORANGE.get(), Items.ORANGE_DYE);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_MAGENTA.get(), Items.MAGENTA_DYE);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_YELLOW.get(), Items.YELLOW_DYE);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_CYAN.get(), Items.CYAN_DYE);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_BLUE.get(), Items.BLUE_DYE);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_GREEN.get(), Items.GREEN_DYE);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_RED.get(), Items.RED_DYE);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_BLACK.get(), Items.BLACK_DYE);

        //Bright With Borders
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_WHITE_BORDER.get(), ABRCBrightColors.BRIGHT_WHITE.get(), false);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get(), ABRCBrightColors.BRIGHT_ORANGE.get(), false);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get(), ABRCBrightColors.BRIGHT_MAGENTA.get(), false);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get(), ABRCBrightColors.BRIGHT_YELLOW.get(), false);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_CYAN_BORDER.get(), ABRCBrightColors.BRIGHT_CYAN.get(), false);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_BLUE_BORDER.get(), ABRCBrightColors.BRIGHT_BLUE.get(), false);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_GREEN_BORDER.get(), ABRCBrightColors.BRIGHT_GREEN.get(), false);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_RED_BORDER.get(), ABRCBrightColors.BRIGHT_RED.get(), false);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_BLACK_BORDER.get(), ABRCBrightColors.BRIGHT_BLACK.get(), true);

        //Wool Colors
        woolBuilder(ABRCWoolColors.WOOL_WHITE.get(), Blocks.WHITE_WOOL, Items.WHITE_DYE);
        woolBuilder(ABRCWoolColors.WOOL_ORANGE.get(), Blocks.ORANGE_WOOL, Items.ORANGE_DYE);
        woolBuilder(ABRCWoolColors.WOOL_MAGENTA.get(), Blocks.MAGENTA_WOOL, Items.MAGENTA_DYE);
        woolBuilder(ABRCWoolColors.WOOL_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_DYE);
        woolBuilder(ABRCWoolColors.WOOL_YELLOW.get(), Blocks.YELLOW_WOOL, Items.YELLOW_DYE);
        woolBuilder(ABRCWoolColors.WOOL_LIME.get(), Blocks.LIME_WOOL, Items.LIME_DYE);
        woolBuilder(ABRCWoolColors.WOOL_PINK.get(), Blocks.PINK_WOOL, Items.PINK_DYE);
        woolBuilder(ABRCWoolColors.WOOL_GRAY.get(), Blocks.GRAY_WOOL, Items.GRAY_DYE);
        woolBuilder(ABRCWoolColors.WOOL_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_WOOL, Items.LIGHT_GRAY_DYE);
        woolBuilder(ABRCWoolColors.WOOL_CYAN.get(), Blocks.CYAN_WOOL, Items.CYAN_DYE);
        woolBuilder(ABRCWoolColors.WOOL_PURPLE.get(), Blocks.PURPLE_WOOL, Items.PURPLE_DYE);
        woolBuilder(ABRCWoolColors.WOOL_BLUE.get(), Blocks.BLUE_WOOL, Items.BLUE_DYE);
        woolBuilder(ABRCWoolColors.WOOL_BROWN.get(), Blocks.BROWN_WOOL, Items.BROWN_DYE);
        woolBuilder(ABRCWoolColors.WOOL_GREEN.get(), Blocks.GREEN_WOOL, Items.GREEN_DYE);
        woolBuilder(ABRCWoolColors.WOOL_RED.get(), Blocks.RED_WOOL, Items.RED_DYE);

        //Wool with Borders
        fullToBorderedBuilder(ABRCWoolColors.WOOL_WHITE.get(), ABRCWoolColors.WOOL_WHITE_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_ORANGE.get(), ABRCWoolColors.WOOL_ORANGE_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_MAGENTA.get(), ABRCWoolColors.WOOL_MAGENTA_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_LIGHT_BLUE.get(), ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_YELLOW.get(), ABRCWoolColors.WOOL_YELLOW_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_LIME.get(), ABRCWoolColors.WOOL_LIME_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_PINK.get(), ABRCWoolColors.WOOL_PINK_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_GRAY.get(), ABRCWoolColors.WOOL_GRAY_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_LIGHT_GRAY.get(), ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_CYAN.get(), ABRCWoolColors.WOOL_CYAN_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_PURPLE.get(), ABRCWoolColors.WOOL_PURPLE_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_BLUE.get(), ABRCWoolColors.WOOL_BLUE_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_BROWN.get(), ABRCWoolColors.WOOL_BROWN_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_GREEN.get(), ABRCWoolColors.WOOL_GREEN_BORDER.get(), false);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_RED.get(), ABRCWoolColors.WOOL_RED_BORDER.get(), false);

        //Slabs
        //-Wool
        slabBuilder(ABRCSlabs.SLAB_WHITE_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_WHITE.get()));
        slabBuilder(ABRCSlabs.SLAB_ORANGE_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_ORANGE.get()));
        slabBuilder(ABRCSlabs.SLAB_MAGENTA_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_MAGENTA.get()));
        slabBuilder(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_LIGHT_BLUE.get()));
        slabBuilder(ABRCSlabs.SLAB_YELLOW_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_YELLOW.get()));
        slabBuilder(ABRCSlabs.SLAB_LIME_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_LIME.get()));
        slabBuilder(ABRCSlabs.SLAB_PINK_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_PINK.get()));
        slabBuilder(ABRCSlabs.SLAB_GRAY_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_GRAY.get()));
        slabBuilder(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_LIGHT_GRAY.get()));
        slabBuilder(ABRCSlabs.SLAB_CYAN_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_CYAN.get()));
        slabBuilder(ABRCSlabs.SLAB_PURPLE_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_PURPLE.get()));
        slabBuilder(ABRCSlabs.SLAB_BLUE_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_BLUE.get()));
        slabBuilder(ABRCSlabs.SLAB_BROWN_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_BROWN.get()));
        slabBuilder(ABRCSlabs.SLAB_GREEN_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_GREEN.get()));
        slabBuilder(ABRCSlabs.SLAB_RED_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_RED.get()));
        //-Bright
        slabBuilder(ABRCSlabs.SLAB_WHITE_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_WHITE.get()));
        slabBuilder(ABRCSlabs.SLAB_ORANGE_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_ORANGE.get()));
        slabBuilder(ABRCSlabs.SLAB_MAGENTA_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_MAGENTA.get()));
        slabBuilder(ABRCSlabs.SLAB_YELLOW_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_YELLOW.get()));
        slabBuilder(ABRCSlabs.SLAB_CYAN_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_CYAN.get()));
        slabBuilder(ABRCSlabs.SLAB_BLUE_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_BLUE.get()));
        slabBuilder(ABRCSlabs.SLAB_GREEN_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_GREEN.get()));
        slabBuilder(ABRCSlabs.SLAB_RED_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_RED.get()));
        slabBuilder(ABRCSlabs.SLAB_BLACK.get(), Ingredient.of(ABRCBrightColors.BRIGHT_BLACK.get()));

        //Stairs
        //-Wool
        stairBuilder(ABRCStairs.STAIR_WHITE_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_WHITE.get()));
        stairBuilder(ABRCStairs.STAIR_ORANGE_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_ORANGE.get()));
        stairBuilder(ABRCStairs.STAIR_MAGENTA_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_MAGENTA.get()));
        stairBuilder(ABRCStairs.STAIR_LIGHT_BLUE_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_LIGHT_BLUE.get()));
        stairBuilder(ABRCStairs.STAIR_YELLOW_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_YELLOW.get()));
        stairBuilder(ABRCStairs.STAIR_LIME_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_LIME.get()));
        stairBuilder(ABRCStairs.STAIR_PINK_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_PINK.get()));
        stairBuilder(ABRCStairs.STAIR_GRAY_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_GRAY.get()));
        stairBuilder(ABRCStairs.STAIR_LIGHT_GRAY_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_LIGHT_GRAY.get()));
        stairBuilder(ABRCStairs.STAIR_CYAN_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_CYAN.get()));
        stairBuilder(ABRCStairs.STAIR_PURPLE_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_PURPLE.get()));
        stairBuilder(ABRCStairs.STAIR_BLUE_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_BLUE.get()));
        stairBuilder(ABRCStairs.STAIR_BROWN_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_BROWN.get()));
        stairBuilder(ABRCStairs.STAIR_GREEN_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_GREEN.get()));
        stairBuilder(ABRCStairs.STAIR_RED_WOOL.get(), Ingredient.of(ABRCWoolColors.WOOL_RED.get()));
        //-Bright
        stairBuilder(ABRCStairs.STAIR_WHITE_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_WHITE.get()));
        stairBuilder(ABRCStairs.STAIR_ORANGE_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_ORANGE.get()));
        stairBuilder(ABRCStairs.STAIR_MAGENTA_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_MAGENTA.get()));
        stairBuilder(ABRCStairs.STAIR_YELLOW_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_YELLOW.get()));
        stairBuilder(ABRCStairs.STAIR_CYAN_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_CYAN.get()));
        stairBuilder(ABRCStairs.STAIR_BLUE_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_BLUE.get()));
        stairBuilder(ABRCStairs.STAIR_GREEN_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_GREEN.get()));
        stairBuilder(ABRCStairs.STAIR_RED_BRIGHT.get(), Ingredient.of(ABRCBrightColors.BRIGHT_RED.get()));
        stairBuilder(ABRCStairs.STAIR_BLACK.get(), Ingredient.of(ABRCBrightColors.BRIGHT_BLACK.get()));

    }

    protected static RecipeBuilder woolBuilder(ItemLike itemOut, ItemLike wool, ItemLike dye) {
        return ShapedRecipeBuilder.shaped(itemOut, 4)
                .define('w', wool).define('d', dye).define('g', Items.GLOWSTONE_DUST)
                .pattern("wdw")
                .pattern("wgw")
                .pattern("wdw");
    }

    protected static RecipeBuilder whiteToColorBuilder(ItemLike itemOut, ItemLike dye) {
        return ShapelessRecipeBuilder.shapeless(itemOut, 4)
                .requires(dye).requires(ABRCBrightColors.BRIGHT_WHITE.get());
    }

    protected static RecipeBuilder fullToBorderedBuilder(ItemLike itemOut, ItemLike colorBlock, Boolean invertDye) {
        if (invertDye) {
            return ShapedRecipeBuilder.shaped(itemOut, 2)
                    .define('#', colorBlock).define('d', Items.BLACK_DYE)
                    .pattern("ddd")
                    .pattern("d#d")
                    .pattern("ddd");
        } else return ShapedRecipeBuilder.shaped(itemOut, 2)
                .define('#', colorBlock).define('d', Items.WHITE_DYE)
                .pattern("ddd")
                .pattern("d#d")
                .pattern("ddd");
    }

}
