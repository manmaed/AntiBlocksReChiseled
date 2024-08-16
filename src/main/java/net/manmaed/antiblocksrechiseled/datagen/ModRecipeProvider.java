package net.manmaed.antiblocksrechiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static Identifier getSave(String string) {
        return Identifier.of(AntiBlocksReChiseled.MOD_ID, string);
    }

    public static RecipeCategory block = RecipeCategory.BUILDING_BLOCKS;
    @Override
    public void generate(RecipeExporter exporter) {
        //Bright White Builder
        ShapedRecipeJsonBuilder.create(block ,ABRCBrightColors.BRIGHT_WHITE, 4)
                .input('s', Ingredient.ofItems(Blocks.STONE.asItem()))
                .input('d', Ingredient.ofItems(Items.WHITE_DYE))
                .input('g', Ingredient.ofItems(Items.GLOWSTONE_DUST))
                .pattern("sds")
                .pattern("dgd")
                .pattern("sds").criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST)).offerTo(exporter);
        //The Rest of Bright Colors
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_ORANGE.asItem(), Items.ORANGE_DYE, exporter);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_MAGENTA.asItem(), Items.MAGENTA_DYE, exporter);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_YELLOW.asItem(), Items.YELLOW_DYE, exporter);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_CYAN.asItem(), Items.CYAN_DYE, exporter);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_BLUE.asItem(), Items.BLUE_DYE, exporter);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_GREEN.asItem(), Items.GREEN_DYE, exporter);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_RED.asItem(), Items.RED_DYE, exporter);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_BLACK.asItem(), Items.BLACK_DYE, exporter);

        //Bright With Borders
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_WHITE_BORDER.asItem(), ABRCBrightColors.BRIGHT_WHITE.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_ORANGE_BORDER.asItem(), ABRCBrightColors.BRIGHT_ORANGE.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.asItem(), ABRCBrightColors.BRIGHT_MAGENTA.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_YELLOW_BORDER.asItem(), ABRCBrightColors.BRIGHT_YELLOW.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_CYAN_BORDER.asItem(), ABRCBrightColors.BRIGHT_CYAN.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_BLUE_BORDER.asItem(), ABRCBrightColors.BRIGHT_BLUE.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_GREEN_BORDER.asItem(), ABRCBrightColors.BRIGHT_GREEN.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_RED_BORDER.asItem(), ABRCBrightColors.BRIGHT_RED.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_BLACK_BORDER.asItem(), ABRCBrightColors.BRIGHT_BLACK.asItem(), true, exporter);

        //Wool Colors
        woolBuilder(ABRCWoolColors.WOOL_WHITE.asItem(), Blocks.WHITE_WOOL.asItem(), Items.WHITE_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_ORANGE.asItem(), Blocks.ORANGE_WOOL.asItem(), Items.ORANGE_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_MAGENTA.asItem(), Blocks.MAGENTA_WOOL.asItem(), Items.MAGENTA_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_LIGHT_BLUE.asItem(), Blocks.LIGHT_BLUE_WOOL.asItem(), Items.LIGHT_BLUE_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_YELLOW.asItem(), Blocks.YELLOW_WOOL.asItem(), Items.YELLOW_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_LIME.asItem(), Blocks.LIME_WOOL.asItem(), Items.LIME_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_PINK.asItem(), Blocks.PINK_WOOL.asItem(), Items.PINK_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_GRAY.asItem(), Blocks.GRAY_WOOL.asItem(), Items.GRAY_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_LIGHT_GRAY.asItem(), Blocks.LIGHT_GRAY_WOOL.asItem(), Items.LIGHT_GRAY_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_CYAN.asItem(), Blocks.CYAN_WOOL.asItem(), Items.CYAN_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_PURPLE.asItem(), Blocks.PURPLE_WOOL.asItem(), Items.PURPLE_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_BLUE.asItem(), Blocks.BLUE_WOOL.asItem(), Items.BLUE_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_BROWN.asItem(), Blocks.BROWN_WOOL.asItem(), Items.BROWN_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_GREEN.asItem(), Blocks.GREEN_WOOL.asItem(), Items.GREEN_DYE, exporter);
        woolBuilder(ABRCWoolColors.WOOL_RED.asItem(), Blocks.RED_WOOL.asItem(), Items.RED_DYE, exporter);

        //Wool with Borders
        fullToBorderedBuilder(ABRCWoolColors.WOOL_WHITE_BORDER.asItem(), ABRCWoolColors.WOOL_WHITE.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_ORANGE_BORDER.asItem(), ABRCWoolColors.WOOL_ORANGE.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_MAGENTA_BORDER.asItem(), ABRCWoolColors.WOOL_MAGENTA.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.asItem(), ABRCWoolColors.WOOL_LIGHT_BLUE.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_YELLOW_BORDER.asItem(), ABRCWoolColors.WOOL_YELLOW.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_LIME_BORDER.asItem(), ABRCWoolColors.WOOL_LIME.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_PINK_BORDER.asItem(), ABRCWoolColors.WOOL_PINK.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_GRAY_BORDER.asItem(), ABRCWoolColors.WOOL_GRAY.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.asItem(), ABRCWoolColors.WOOL_LIGHT_GRAY.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_CYAN_BORDER.asItem(), ABRCWoolColors.WOOL_CYAN.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_PURPLE_BORDER.asItem(), ABRCWoolColors.WOOL_PURPLE.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_BLUE_BORDER.asItem(), ABRCWoolColors.WOOL_BLUE.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_BROWN_BORDER.asItem(), ABRCWoolColors.WOOL_BROWN.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_GREEN_BORDER.asItem(), ABRCWoolColors.WOOL_GREEN.asItem(), false, exporter);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_RED_BORDER.asItem(), ABRCWoolColors.WOOL_RED.asItem(), false, exporter);

        //Slabs
        //-Wool
        mySlabBuilder(ABRCSlabs.SLAB_WHITE_WOOL.asItem(), ABRCWoolColors.WOOL_WHITE.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_ORANGE_WOOL.asItem(), ABRCWoolColors.WOOL_ORANGE.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_MAGENTA_WOOL.asItem(), ABRCWoolColors.WOOL_MAGENTA.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.asItem(), ABRCWoolColors.WOOL_LIGHT_BLUE.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_YELLOW_WOOL.asItem(), ABRCWoolColors.WOOL_YELLOW.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_LIME_WOOL.asItem(), ABRCWoolColors.WOOL_LIME.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_PINK_WOOL.asItem(), ABRCWoolColors.WOOL_PINK.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_GRAY_WOOL.asItem(), ABRCWoolColors.WOOL_GRAY.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.asItem(), ABRCWoolColors.WOOL_LIGHT_GRAY.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_CYAN_WOOL.asItem(), ABRCWoolColors.WOOL_CYAN.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_PURPLE_WOOL.asItem(), ABRCWoolColors.WOOL_PURPLE.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_BLUE_WOOL.asItem(), ABRCWoolColors.WOOL_BLUE.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_BROWN_WOOL.asItem(), ABRCWoolColors.WOOL_BROWN.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_GREEN_WOOL.asItem(), ABRCWoolColors.WOOL_GREEN.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_RED_WOOL.asItem(), ABRCWoolColors.WOOL_RED.asItem(), exporter);
        //-Bright
        mySlabBuilder(ABRCSlabs.SLAB_WHITE_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_WHITE.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_ORANGE_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_ORANGE.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_MAGENTA_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_MAGENTA.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_YELLOW_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_YELLOW.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_CYAN_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_CYAN.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_BLUE_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_BLUE.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_GREEN_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_GREEN.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_RED_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_RED.asItem(), exporter);
        mySlabBuilder(ABRCSlabs.SLAB_BLACK.asItem(), ABRCBrightColors.BRIGHT_BLACK.asItem(), exporter);
        //Stairs
        //-Wool
        myStairBuilder(ABRCStairs.STAIR_WHITE_WOOL.asItem(), ABRCWoolColors.WOOL_WHITE.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_ORANGE_WOOL.asItem(), ABRCWoolColors.WOOL_ORANGE.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_MAGENTA_WOOL.asItem(), ABRCWoolColors.WOOL_MAGENTA.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_LIGHT_BLUE_WOOL.asItem(), ABRCWoolColors.WOOL_LIGHT_BLUE.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_YELLOW_WOOL.asItem(), ABRCWoolColors.WOOL_YELLOW.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_LIME_WOOL.asItem(), ABRCWoolColors.WOOL_LIME.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_PINK_WOOL.asItem(), ABRCWoolColors.WOOL_PINK.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_GRAY_WOOL.asItem(), ABRCWoolColors.WOOL_GRAY.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_LIGHT_GRAY_WOOL.asItem(), ABRCWoolColors.WOOL_LIGHT_GRAY.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_CYAN_WOOL.asItem(), ABRCWoolColors.WOOL_CYAN.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_PURPLE_WOOL.asItem(), ABRCWoolColors.WOOL_PURPLE.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_BLUE_WOOL.asItem(), ABRCWoolColors.WOOL_BLUE.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_BROWN_WOOL.asItem(), ABRCWoolColors.WOOL_BROWN.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_GREEN_WOOL.asItem(), ABRCWoolColors.WOOL_GREEN.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_RED_WOOL.asItem(), ABRCWoolColors.WOOL_RED.asItem(), exporter);
        //-Bright
        myStairBuilder(ABRCStairs.STAIR_WHITE_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_WHITE.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_ORANGE_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_ORANGE.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_MAGENTA_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_MAGENTA.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_YELLOW_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_YELLOW.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_CYAN_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_CYAN.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_BLUE_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_BLUE.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_GREEN_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_GREEN.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_RED_BRIGHT.asItem(), ABRCBrightColors.BRIGHT_RED.asItem(), exporter);
        myStairBuilder(ABRCStairs.STAIR_BLACK.asItem(), ABRCBrightColors.BRIGHT_BLACK.asItem(), exporter);

        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_WHITE.asItem(), ABRCBrightColors.BRIGHT_WHITE.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_ORANGE.asItem(), ABRCBrightColors.BRIGHT_ORANGE.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_MAGENTA.asItem(), ABRCBrightColors.BRIGHT_MAGENTA.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_YELLOW.asItem(), ABRCBrightColors.BRIGHT_YELLOW.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_CYAN.asItem(), ABRCBrightColors.BRIGHT_CYAN.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_BLUE.asItem(), ABRCBrightColors.BRIGHT_BLUE.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_GREEN.asItem(), ABRCBrightColors.BRIGHT_GREEN.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_RED.asItem(), ABRCBrightColors.BRIGHT_RED.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_BLACK.asItem(), ABRCBrightColors.BRIGHT_BLACK.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_WHITE.asItem(), ABRCWoolColors.WOOL_WHITE.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_ORANGE.asItem(), ABRCWoolColors.WOOL_ORANGE.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_MAGENTA.asItem(), ABRCWoolColors.WOOL_MAGENTA.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.asItem(), ABRCWoolColors.WOOL_LIGHT_BLUE.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_YELLOW.asItem(), ABRCWoolColors.WOOL_YELLOW.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_LIME.asItem(), ABRCWoolColors.WOOL_LIME.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_PINK.asItem(), ABRCWoolColors.WOOL_PINK.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_GRAY.asItem(), ABRCWoolColors.WOOL_GRAY.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.asItem(), ABRCWoolColors.WOOL_LIGHT_GRAY.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_CYAN.asItem(), ABRCWoolColors.WOOL_CYAN.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_PURPLE.asItem(), ABRCWoolColors.WOOL_PURPLE.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_BLUE.asItem(), ABRCWoolColors.WOOL_BLUE.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_BROWN.asItem(), ABRCWoolColors.WOOL_BROWN.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_GREEN.asItem(), ABRCWoolColors.WOOL_GREEN.asItem(), exporter);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_RED.asItem(), ABRCWoolColors.WOOL_RED.asItem(), exporter);

        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.asItem(), ABRCBrightColors.BRIGHT_WHITE.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.asItem(), ABRCBrightColors.BRIGHT_ORANGE.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.asItem(), ABRCBrightColors.BRIGHT_MAGENTA.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.asItem(), ABRCBrightColors.BRIGHT_YELLOW.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.asItem(), ABRCBrightColors.BRIGHT_CYAN.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.asItem(), ABRCBrightColors.BRIGHT_BLUE.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.asItem(), ABRCBrightColors.BRIGHT_GREEN.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.asItem(), ABRCBrightColors.BRIGHT_RED.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.asItem(), ABRCBrightColors.BRIGHT_BLACK.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.asItem(), ABRCWoolColors.WOOL_WHITE.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.asItem(), ABRCWoolColors.WOOL_ORANGE.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.asItem(), ABRCWoolColors.WOOL_MAGENTA.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.asItem(), ABRCWoolColors.WOOL_LIGHT_BLUE.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.asItem(), ABRCWoolColors.WOOL_YELLOW.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.asItem(), ABRCWoolColors.WOOL_LIME.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.asItem(), ABRCWoolColors.WOOL_PINK.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.asItem(), ABRCWoolColors.WOOL_GRAY.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.asItem(), ABRCWoolColors.WOOL_LIGHT_GRAY.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.asItem(), ABRCWoolColors.WOOL_CYAN.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.asItem(), ABRCWoolColors.WOOL_PURPLE.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.asItem(), ABRCWoolColors.WOOL_BLUE.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.asItem(), ABRCWoolColors.WOOL_BROWN.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.asItem(), ABRCWoolColors.WOOL_GREEN.asItem(), exporter);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.asItem(), ABRCWoolColors.WOOL_RED.asItem(), exporter);
    }

    protected static void woolBuilder(Item itemOut, Item wool, Item dye, RecipeExporter recipeConsumer) {
        ShapedRecipeJsonBuilder.create(block, itemOut, 4)
                .input('w', wool).input('d', dye).input('g', Items.GLOWSTONE_DUST)
                .pattern("wdw")
                .pattern("wgw")
                .pattern("wdw")
                .criterion(hasItem(Blocks.WHITE_WOOL), conditionsFromItem(Blocks.WHITE_WOOL)).offerTo(recipeConsumer);
    }

    protected static void whiteToColorBuilder(Item itemOut, Item dye, RecipeExporter recipeConsumer) {
        ShapelessRecipeJsonBuilder.create(block,itemOut, 4)
                .input(dye)
                .input(ABRCBrightColors.BRIGHT_WHITE)
                .criterion(hasItem(ABRCBrightColors.BRIGHT_WHITE), conditionsFromItem(ABRCBrightColors.BRIGHT_WHITE))
                .offerTo(recipeConsumer);
    }

    protected static void fullToBorderedBuilder(Item itemOut, Item colorBlock, Boolean invertDye, RecipeExporter recipeConsumer) {
        if (!invertDye) {
            ShapedRecipeJsonBuilder.create(block, itemOut, 2)
                    .input('#', colorBlock).input('d', Items.BLACK_DYE)
                    .pattern("ddd")
                    .pattern("d#d")
                    .pattern("ddd")
                    .criterion(hasItem(colorBlock.asItem()), conditionsFromItem(colorBlock.asItem()))
                    .offerTo(recipeConsumer, getSave("full_to_border_" + getItemPath(colorBlock)));
        } else ShapedRecipeJsonBuilder.create(block, itemOut, 2)
                .input('#', colorBlock).input('d', Items.WHITE_DYE)
                .pattern("ddd")
                .pattern("d#d")
                .pattern("ddd")
                .criterion(hasItem(colorBlock.asItem()), conditionsFromItem(colorBlock.asItem()))
                .offerTo(recipeConsumer, getSave("full_to_border_" + getItemPath(colorBlock)));
    }

    protected static void myStairBuilder(Item itemOut, Item itemIn, RecipeExporter recipeConsumer) {
        ShapedRecipeJsonBuilder.create(block, itemOut, 4)
                .input('#', itemIn)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .criterion(hasItem(itemIn), conditionsFromItem(itemIn))
                .offerTo(recipeConsumer, getSave(getItemPath(itemIn) + "_stairs"));
    }

    protected static void mySlabBuilder(Item itemOut, Item itemIn, RecipeExporter recipeConsumer) {
        ShapedRecipeJsonBuilder.create(block, itemOut, 6)
                .input('#', itemIn)
                .pattern("###")
                .criterion(hasItem(itemIn), conditionsFromItem(itemIn))
                .offerTo(recipeConsumer, getSave(getItemPath(itemIn) + "_slabs"));
    }

    protected static void myButtonBuilder(Item itemOut, Item itemIn, RecipeExporter recipeConsumer) {
        ShapelessRecipeJsonBuilder.create(block, itemOut)
                .input(itemIn)
                .criterion(hasItem(itemIn), conditionsFromItem(itemIn))
                .offerTo(recipeConsumer, getSave(getItemPath(itemIn) + "_button"));
    }

    protected static void myPlateBuilder(Item itemOut, Item itemIn, RecipeExporter recipeConsumer) {
        ShapedRecipeJsonBuilder.create(block, itemOut)
                .input('#', itemIn)
                .pattern("##")
                .criterion(hasItem(itemIn), conditionsFromItem(itemIn))
                .offerTo(recipeConsumer, getSave(getItemPath(itemIn) + "_pressure_plate"));
    }
}
