package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    public static ResourceLocation getSave(String string) {
        return new ResourceLocation(AntiBlocksReChiseled.MOD_ID, string);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        //Bright White Builder
        ShapedRecipeBuilder.shaped(ABRCBrightColors.BRIGHT_WHITE.get(), 4)
                .define('s', Ingredient.of(Blocks.STONE.asItem()))
                .define('d', Ingredient.of(Items.WHITE_DYE))
                .define('g', Ingredient.of(Items.GLOWSTONE_DUST))
                .pattern("sds")
                .pattern("dgd")
                .pattern("sds").unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST)).save(consumer);

        //The Rest of Bright Colors
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_ORANGE.get(), Items.ORANGE_DYE, consumer);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_MAGENTA.get(), Items.MAGENTA_DYE, consumer);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_YELLOW.get(), Items.YELLOW_DYE, consumer);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_CYAN.get(), Items.CYAN_DYE, consumer);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_BLUE.get(), Items.BLUE_DYE, consumer);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_GREEN.get(), Items.GREEN_DYE, consumer);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_RED.get(), Items.RED_DYE, consumer);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_BLACK.get(), Items.BLACK_DYE, consumer);

        //Bright With Borders
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_WHITE_BORDER.get(), ABRCBrightColors.BRIGHT_WHITE.get(), false, consumer);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get(), ABRCBrightColors.BRIGHT_ORANGE.get(), false, consumer);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get(), ABRCBrightColors.BRIGHT_MAGENTA.get(), false, consumer);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get(), ABRCBrightColors.BRIGHT_YELLOW.get(), false, consumer);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_CYAN_BORDER.get(), ABRCBrightColors.BRIGHT_CYAN.get(), false, consumer);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_BLUE_BORDER.get(), ABRCBrightColors.BRIGHT_BLUE.get(), false, consumer);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_GREEN_BORDER.get(), ABRCBrightColors.BRIGHT_GREEN.get(), false, consumer);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_RED_BORDER.get(), ABRCBrightColors.BRIGHT_RED.get(), false, consumer);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_BLACK_BORDER.get(), ABRCBrightColors.BRIGHT_BLACK.get(), true, consumer);

        //Wool Colors
        woolBuilder(ABRCWoolColors.WOOL_WHITE.get(), Blocks.WHITE_WOOL, Items.WHITE_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_ORANGE.get(), Blocks.ORANGE_WOOL, Items.ORANGE_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_MAGENTA.get(), Blocks.MAGENTA_WOOL, Items.MAGENTA_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_YELLOW.get(), Blocks.YELLOW_WOOL, Items.YELLOW_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_LIME.get(), Blocks.LIME_WOOL, Items.LIME_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_PINK.get(), Blocks.PINK_WOOL, Items.PINK_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_GRAY.get(), Blocks.GRAY_WOOL, Items.GRAY_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_WOOL, Items.LIGHT_GRAY_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_CYAN.get(), Blocks.CYAN_WOOL, Items.CYAN_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_PURPLE.get(), Blocks.PURPLE_WOOL, Items.PURPLE_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_BLUE.get(), Blocks.BLUE_WOOL, Items.BLUE_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_BROWN.get(), Blocks.BROWN_WOOL, Items.BROWN_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_GREEN.get(), Blocks.GREEN_WOOL, Items.GREEN_DYE, consumer);
        woolBuilder(ABRCWoolColors.WOOL_RED.get(), Blocks.RED_WOOL, Items.RED_DYE, consumer);

        //Wool with Borders
        fullToBorderedBuilder(ABRCWoolColors.WOOL_WHITE_BORDER.get(), ABRCWoolColors.WOOL_WHITE.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_ORANGE_BORDER.get(), ABRCWoolColors.WOOL_ORANGE.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_MAGENTA_BORDER.get(), ABRCWoolColors.WOOL_MAGENTA.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get(), ABRCWoolColors.WOOL_LIGHT_BLUE.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_YELLOW_BORDER.get(), ABRCWoolColors.WOOL_YELLOW.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_LIME_BORDER.get(), ABRCWoolColors.WOOL_LIME.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_PINK_BORDER.get(), ABRCWoolColors.WOOL_PINK.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_GRAY_BORDER.get(), ABRCWoolColors.WOOL_GRAY.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get(), ABRCWoolColors.WOOL_LIGHT_GRAY.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_CYAN_BORDER.get(), ABRCWoolColors.WOOL_CYAN.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_PURPLE_BORDER.get(), ABRCWoolColors.WOOL_PURPLE.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_BLUE_BORDER.get(), ABRCWoolColors.WOOL_BLUE.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_BROWN_BORDER.get(), ABRCWoolColors.WOOL_BROWN.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_GREEN_BORDER.get(), ABRCWoolColors.WOOL_GREEN.get(), false, consumer);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_RED_BORDER.get(), ABRCWoolColors.WOOL_RED.get(), false, consumer);

        //Slabs
        //-Wool
        mySlabBuilder(ABRCSlabs.SLAB_WHITE_WOOL.get(), ABRCWoolColors.WOOL_WHITE.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_ORANGE_WOOL.get(), ABRCWoolColors.WOOL_ORANGE.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_MAGENTA_WOOL.get(), ABRCWoolColors.WOOL_MAGENTA.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.get(), ABRCWoolColors.WOOL_LIGHT_BLUE.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_YELLOW_WOOL.get(), ABRCWoolColors.WOOL_YELLOW.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_LIME_WOOL.get(), ABRCWoolColors.WOOL_LIME.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_PINK_WOOL.get(), ABRCWoolColors.WOOL_PINK.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_GRAY_WOOL.get(), ABRCWoolColors.WOOL_GRAY.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.get(), ABRCWoolColors.WOOL_LIGHT_GRAY.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_CYAN_WOOL.get(), ABRCWoolColors.WOOL_CYAN.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_PURPLE_WOOL.get(), ABRCWoolColors.WOOL_PURPLE.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_BLUE_WOOL.get(), ABRCWoolColors.WOOL_BLUE.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_BROWN_WOOL.get(), ABRCWoolColors.WOOL_BROWN.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_GREEN_WOOL.get(), ABRCWoolColors.WOOL_GREEN.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_RED_WOOL.get(), ABRCWoolColors.WOOL_RED.get(), consumer);
        //-Bright
        mySlabBuilder(ABRCSlabs.SLAB_WHITE_BRIGHT.get(), ABRCBrightColors.BRIGHT_WHITE.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_ORANGE_BRIGHT.get(), ABRCBrightColors.BRIGHT_ORANGE.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_MAGENTA_BRIGHT.get(), ABRCBrightColors.BRIGHT_MAGENTA.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_YELLOW_BRIGHT.get(), ABRCBrightColors.BRIGHT_YELLOW.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_CYAN_BRIGHT.get(), ABRCBrightColors.BRIGHT_CYAN.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_BLUE_BRIGHT.get(), ABRCBrightColors.BRIGHT_BLUE.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_GREEN_BRIGHT.get(), ABRCBrightColors.BRIGHT_GREEN.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_RED_BRIGHT.get(), ABRCBrightColors.BRIGHT_RED.get(), consumer);
        mySlabBuilder(ABRCSlabs.SLAB_BLACK.get(), ABRCBrightColors.BRIGHT_BLACK.get(), consumer);
        //Stairs
        //-Wool
        myStairBuilder(ABRCStairs.STAIR_WHITE_WOOL.get(), ABRCWoolColors.WOOL_WHITE.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_ORANGE_WOOL.get(), ABRCWoolColors.WOOL_ORANGE.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_MAGENTA_WOOL.get(), ABRCWoolColors.WOOL_MAGENTA.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_LIGHT_BLUE_WOOL.get(), ABRCWoolColors.WOOL_LIGHT_BLUE.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_YELLOW_WOOL.get(), ABRCWoolColors.WOOL_YELLOW.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_LIME_WOOL.get(), ABRCWoolColors.WOOL_LIME.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_PINK_WOOL.get(), ABRCWoolColors.WOOL_PINK.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_GRAY_WOOL.get(), ABRCWoolColors.WOOL_GRAY.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_LIGHT_GRAY_WOOL.get(), ABRCWoolColors.WOOL_LIGHT_GRAY.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_CYAN_WOOL.get(), ABRCWoolColors.WOOL_CYAN.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_PURPLE_WOOL.get(), ABRCWoolColors.WOOL_PURPLE.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_BLUE_WOOL.get(), ABRCWoolColors.WOOL_BLUE.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_BROWN_WOOL.get(), ABRCWoolColors.WOOL_BROWN.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_GREEN_WOOL.get(), ABRCWoolColors.WOOL_GREEN.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_RED_WOOL.get(), ABRCWoolColors.WOOL_RED.get(), consumer);
        //-Bright
        myStairBuilder(ABRCStairs.STAIR_WHITE_BRIGHT.get(), ABRCBrightColors.BRIGHT_WHITE.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_ORANGE_BRIGHT.get(), ABRCBrightColors.BRIGHT_ORANGE.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_MAGENTA_BRIGHT.get(), ABRCBrightColors.BRIGHT_MAGENTA.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_YELLOW_BRIGHT.get(), ABRCBrightColors.BRIGHT_YELLOW.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_CYAN_BRIGHT.get(), ABRCBrightColors.BRIGHT_CYAN.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_BLUE_BRIGHT.get(), ABRCBrightColors.BRIGHT_BLUE.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_GREEN_BRIGHT.get(), ABRCBrightColors.BRIGHT_GREEN.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_RED_BRIGHT.get(), ABRCBrightColors.BRIGHT_RED.get(), consumer);
        myStairBuilder(ABRCStairs.STAIR_BLACK.get(), ABRCBrightColors.BRIGHT_BLACK.get(), consumer);

        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_WHITE.get(), ABRCBrightColors.BRIGHT_WHITE.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_ORANGE.get(), ABRCBrightColors.BRIGHT_ORANGE.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get(), ABRCBrightColors.BRIGHT_MAGENTA.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_YELLOW.get(), ABRCBrightColors.BRIGHT_YELLOW.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_CYAN.get(), ABRCBrightColors.BRIGHT_CYAN.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_BLUE.get(), ABRCBrightColors.BRIGHT_BLUE.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_GREEN.get(), ABRCBrightColors.BRIGHT_GREEN.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_RED.get(), ABRCBrightColors.BRIGHT_RED.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_BLACK.get(), ABRCBrightColors.BRIGHT_BLACK.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_WHITE.get(), ABRCWoolColors.WOOL_WHITE.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_ORANGE.get(), ABRCWoolColors.WOOL_ORANGE.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_MAGENTA.get(), ABRCWoolColors.WOOL_MAGENTA.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get(), ABRCWoolColors.WOOL_LIGHT_BLUE.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_YELLOW.get(), ABRCWoolColors.WOOL_YELLOW.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_LIME.get(), ABRCWoolColors.WOOL_LIME.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_PINK.get(), ABRCWoolColors.WOOL_PINK.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_GRAY.get(), ABRCWoolColors.WOOL_GRAY.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get(), ABRCWoolColors.WOOL_LIGHT_GRAY.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_CYAN.get(), ABRCWoolColors.WOOL_CYAN.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_PURPLE.get(), ABRCWoolColors.WOOL_PURPLE.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_BLUE.get(), ABRCWoolColors.WOOL_BLUE.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_BROWN.get(), ABRCWoolColors.WOOL_BROWN.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_GREEN.get(), ABRCWoolColors.WOOL_GREEN.get(), consumer);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_RED.get(), ABRCWoolColors.WOOL_RED.get(), consumer);

        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get(), ABRCBrightColors.BRIGHT_WHITE.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get(), ABRCBrightColors.BRIGHT_ORANGE.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get(), ABRCBrightColors.BRIGHT_MAGENTA.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get(), ABRCBrightColors.BRIGHT_YELLOW.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get(), ABRCBrightColors.BRIGHT_CYAN.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get(), ABRCBrightColors.BRIGHT_BLUE.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get(), ABRCBrightColors.BRIGHT_GREEN.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get(), ABRCBrightColors.BRIGHT_RED.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get(), ABRCBrightColors.BRIGHT_BLACK.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get(), ABRCWoolColors.WOOL_WHITE.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get(), ABRCWoolColors.WOOL_ORANGE.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get(), ABRCWoolColors.WOOL_MAGENTA.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get(), ABRCWoolColors.WOOL_LIGHT_BLUE.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get(), ABRCWoolColors.WOOL_YELLOW.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get(), ABRCWoolColors.WOOL_LIME.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get(), ABRCWoolColors.WOOL_PINK.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get(), ABRCWoolColors.WOOL_GRAY.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get(), ABRCWoolColors.WOOL_LIGHT_GRAY.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get(), ABRCWoolColors.WOOL_CYAN.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get(), ABRCWoolColors.WOOL_PURPLE.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get(), ABRCWoolColors.WOOL_BLUE.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get(), ABRCWoolColors.WOOL_BROWN.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get(), ABRCWoolColors.WOOL_GREEN.get(), consumer);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get(), ABRCWoolColors.WOOL_RED.get(), consumer);

    }

    protected static void woolBuilder(ItemLike itemOut, ItemLike wool, ItemLike dye, Consumer<FinishedRecipe> recipeConsumer) {
        ShapedRecipeBuilder.shaped(itemOut, 4)
                .define('w', wool).define('d', dye).define('g', Items.GLOWSTONE_DUST)
                .pattern("wdw")
                .pattern("wgw")
                .pattern("wdw")
                .unlockedBy("has_wool", has(Blocks.WHITE_WOOL)).save(recipeConsumer);
    }

    protected static void whiteToColorBuilder(ItemLike itemOut, ItemLike dye, Consumer<FinishedRecipe> recipeConsumer) {
        ShapelessRecipeBuilder.shapeless(itemOut, 4)
                .requires(dye).requires(ABRCBrightColors.BRIGHT_WHITE.get())
                .unlockedBy("has_anitblock", has(ABRCBrightColors.BRIGHT_WHITE.get()))
                .save(recipeConsumer);
    }

    protected static void fullToBorderedBuilder(ItemLike itemOut, ItemLike colorBlock, Boolean invertDye, Consumer<FinishedRecipe> recipeConsumer) {
        if (!invertDye) {
            ShapedRecipeBuilder.shaped(itemOut, 2)
                    .define('#', colorBlock).define('d', Items.BLACK_DYE)
                    .pattern("ddd")
                    .pattern("d#d")
                    .pattern("ddd")
                    .unlockedBy(getHasName(colorBlock), has(colorBlock))
                    .save(recipeConsumer, getSave("full_to_border_" + colorBlock.asItem().toString().toLowerCase()));
        } else ShapedRecipeBuilder.shaped(itemOut, 2)
                .define('#', colorBlock).define('d', Items.WHITE_DYE)
                .pattern("ddd")
                .pattern("d#d")
                .pattern("ddd")
                .unlockedBy(getHasName(colorBlock), has(colorBlock))
                .save(recipeConsumer, getSave("full_to_border_" + colorBlock.asItem().toString().toLowerCase()));
    }

    protected static void myStairBuilder(ItemLike itemOut, ItemLike itemIn, Consumer<FinishedRecipe> recipeConsumer) {
        ShapedRecipeBuilder.shaped(itemOut, 4)
                .define('#', itemIn)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .unlockedBy(getHasName(itemIn), has(itemIn))
                .save(recipeConsumer, getSave(itemIn.asItem().toString().toLowerCase() + "_stairs"));
    }

    protected static void mySlabBuilder(ItemLike itemOut, ItemLike itemIn, Consumer<FinishedRecipe> recipeConsumer) {
        ShapedRecipeBuilder.shaped(itemOut, 6)
                .define('#', itemIn)
                .pattern("###")
                .unlockedBy(getHasName(itemIn), has(itemIn))
                .save(recipeConsumer, getSave(itemIn.asItem().toString().toLowerCase() + "_slabs"));
    }

    protected static void myButtonBuilder(ItemLike itemOut, ItemLike itemIn, Consumer<FinishedRecipe> recipeConsumer) {
        ShapelessRecipeBuilder.shapeless(itemOut)
                .requires(itemIn)
                .unlockedBy(getHasName(itemIn), has(itemIn))
                .save(recipeConsumer, getSave(itemIn.asItem().toString().toLowerCase() + "_button"));
    }

    protected static void myPlateBuilder(ItemLike itemOut, ItemLike itemIn, Consumer<FinishedRecipe> recipeConsumer) {
        ShapedRecipeBuilder.shaped(itemOut)
                .define('#', itemIn)
                .pattern("##")
                .unlockedBy(getHasName(itemIn), has(itemIn))
                .save(recipeConsumer, getSave(itemIn.asItem().toString().toLowerCase() + "_pressure_plate"));
    }


}
