package net.manmaed.antiblocksrechiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.manmaed.antiblocksrechiseled.utils.ABRCUtils;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public static RecipeCategory BUILDING_BLOCKS = RecipeCategory.BUILDING_BLOCKS;

    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {
            @Override
            public void buildRecipes() {
                //Bright White Builder
                this.shaped(BUILDING_BLOCKS , ABRCBrightColors.BRIGHT_WHITE, 4)
                        .define('s', Ingredient.of(Blocks.STONE.asItem()))
                        .define('d', Ingredient.of(Items.WHITE_DYE))
                        .define('g', Ingredient.of(Items.GLOWSTONE_DUST))
                        .pattern("sds")
                        .pattern("dgd")
                        .pattern("sds").unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST)).save(output);

                //The Rest of Bright Colors
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_ORANGE, Items.ORANGE_DYE, output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_MAGENTA, Items.MAGENTA_DYE, output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_YELLOW, Items.YELLOW_DYE, output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_CYAN, Items.CYAN_DYE, output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_BLUE, Items.BLUE_DYE, output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_GREEN, Items.GREEN_DYE, output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_RED, Items.RED_DYE, output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_BLACK, Items.BLACK_DYE, output);

                //Bright With Borders
                fullToBorderedBuilder(ABRCBrightColors.BRIGHT_WHITE_BORDER, ABRCBrightColors.BRIGHT_WHITE, false, output);
                fullToBorderedBuilder(ABRCBrightColors.BRIGHT_ORANGE_BORDER, ABRCBrightColors.BRIGHT_ORANGE, false, output);
                fullToBorderedBuilder(ABRCBrightColors.BRIGHT_MAGENTA_BORDER, ABRCBrightColors.BRIGHT_MAGENTA, false, output);
                fullToBorderedBuilder(ABRCBrightColors.BRIGHT_YELLOW_BORDER, ABRCBrightColors.BRIGHT_YELLOW, false, output);
                fullToBorderedBuilder(ABRCBrightColors.BRIGHT_CYAN_BORDER, ABRCBrightColors.BRIGHT_CYAN, false, output);
                fullToBorderedBuilder(ABRCBrightColors.BRIGHT_BLUE_BORDER, ABRCBrightColors.BRIGHT_BLUE, false, output);
                fullToBorderedBuilder(ABRCBrightColors.BRIGHT_GREEN_BORDER, ABRCBrightColors.BRIGHT_GREEN, false, output);
                fullToBorderedBuilder(ABRCBrightColors.BRIGHT_RED_BORDER, ABRCBrightColors.BRIGHT_RED, false, output);
                fullToBorderedBuilder(ABRCBrightColors.BRIGHT_BLACK_BORDER, ABRCBrightColors.BRIGHT_BLACK, true, output);

                //Wool Colors
                woolBuilder(ABRCWoolColors.WOOL_WHITE, Blocks.WHITE_WOOL, Items.WHITE_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_ORANGE, Blocks.ORANGE_WOOL, Items.ORANGE_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_MAGENTA, Blocks.MAGENTA_WOOL, Items.MAGENTA_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_LIGHT_BLUE, Blocks.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_YELLOW, Blocks.YELLOW_WOOL, Items.YELLOW_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_LIME, Blocks.LIME_WOOL, Items.LIME_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_PINK, Blocks.PINK_WOOL, Items.PINK_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_GRAY, Blocks.GRAY_WOOL, Items.GRAY_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_LIGHT_GRAY, Blocks.LIGHT_GRAY_WOOL, Items.LIGHT_GRAY_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_CYAN, Blocks.CYAN_WOOL, Items.CYAN_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_PURPLE, Blocks.PURPLE_WOOL, Items.PURPLE_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_BLUE, Blocks.BLUE_WOOL, Items.BLUE_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_BROWN, Blocks.BROWN_WOOL, Items.BROWN_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_GREEN, Blocks.GREEN_WOOL, Items.GREEN_DYE, output);
                woolBuilder(ABRCWoolColors.WOOL_RED, Blocks.RED_WOOL, Items.RED_DYE, output);

                //Wool with Borders
                fullToBorderedBuilder(ABRCWoolColors.WOOL_WHITE_BORDER, ABRCWoolColors.WOOL_WHITE, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_ORANGE_BORDER, ABRCWoolColors.WOOL_ORANGE, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_MAGENTA_BORDER, ABRCWoolColors.WOOL_MAGENTA, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER, ABRCWoolColors.WOOL_LIGHT_BLUE, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_YELLOW_BORDER, ABRCWoolColors.WOOL_YELLOW, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_LIME_BORDER, ABRCWoolColors.WOOL_LIME, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_PINK_BORDER, ABRCWoolColors.WOOL_PINK, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_GRAY_BORDER, ABRCWoolColors.WOOL_GRAY, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER, ABRCWoolColors.WOOL_LIGHT_GRAY, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_CYAN_BORDER, ABRCWoolColors.WOOL_CYAN, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_PURPLE_BORDER, ABRCWoolColors.WOOL_PURPLE, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_BLUE_BORDER, ABRCWoolColors.WOOL_BLUE, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_BROWN_BORDER, ABRCWoolColors.WOOL_BROWN, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_GREEN_BORDER, ABRCWoolColors.WOOL_GREEN, false, output);
                fullToBorderedBuilder(ABRCWoolColors.WOOL_RED_BORDER, ABRCWoolColors.WOOL_RED, false, output);

                //Slabs
                //-Wool
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_WHITE, ABRCWoolColors.WOOL_WHITE, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_ORANGE, ABRCWoolColors.WOOL_ORANGE, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_MAGENTA, ABRCWoolColors.WOOL_MAGENTA, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE, ABRCWoolColors.WOOL_LIGHT_BLUE, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_YELLOW, ABRCWoolColors.WOOL_YELLOW, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_LIME, ABRCWoolColors.WOOL_LIME, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_PINK, ABRCWoolColors.WOOL_PINK, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_GRAY, ABRCWoolColors.WOOL_GRAY, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY, ABRCWoolColors.WOOL_LIGHT_GRAY, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_CYAN, ABRCWoolColors.WOOL_CYAN, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_PURPLE, ABRCWoolColors.WOOL_PURPLE, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_BLUE, ABRCWoolColors.WOOL_BLUE, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_BROWN, ABRCWoolColors.WOOL_BROWN, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_GREEN, ABRCWoolColors.WOOL_GREEN, output);
                mySlabBuilder(ABRCSlabs.SLAB_WOOL_RED, ABRCWoolColors.WOOL_RED, output);
                //-Bright
                mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_WHITE, ABRCBrightColors.BRIGHT_WHITE, output);
                mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_ORANGE, ABRCBrightColors.BRIGHT_ORANGE, output);
                mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_MAGENTA, ABRCBrightColors.BRIGHT_MAGENTA, output);
                mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_YELLOW, ABRCBrightColors.BRIGHT_YELLOW, output);
                mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_CYAN, ABRCBrightColors.BRIGHT_CYAN, output);
                mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_BLUE, ABRCBrightColors.BRIGHT_BLUE, output);
                mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_GREEN, ABRCBrightColors.BRIGHT_GREEN, output);
                mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_RED, ABRCBrightColors.BRIGHT_RED, output);
                mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_BLACK, ABRCBrightColors.BRIGHT_BLACK, output);
                //Stairs
                //-Wool
                myStairBuilder(ABRCStairs.STAIR_WOOL_WHITE, ABRCWoolColors.WOOL_WHITE, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_ORANGE, ABRCWoolColors.WOOL_ORANGE, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_MAGENTA, ABRCWoolColors.WOOL_MAGENTA, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_LIGHT_BLUE, ABRCWoolColors.WOOL_LIGHT_BLUE, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_YELLOW, ABRCWoolColors.WOOL_YELLOW, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_LIME, ABRCWoolColors.WOOL_LIME, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_PINK, ABRCWoolColors.WOOL_PINK, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_GRAY, ABRCWoolColors.WOOL_GRAY, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_LIGHT_GRAY, ABRCWoolColors.WOOL_LIGHT_GRAY, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_CYAN, ABRCWoolColors.WOOL_CYAN, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_PURPLE, ABRCWoolColors.WOOL_PURPLE, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_BLUE, ABRCWoolColors.WOOL_BLUE, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_BROWN, ABRCWoolColors.WOOL_BROWN, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_GREEN, ABRCWoolColors.WOOL_GREEN, output);
                myStairBuilder(ABRCStairs.STAIR_WOOL_RED, ABRCWoolColors.WOOL_RED, output);
                //-Bright
                myStairBuilder(ABRCStairs.STAIR_BRIGHT_WHITE, ABRCBrightColors.BRIGHT_WHITE, output);
                myStairBuilder(ABRCStairs.STAIR_BRIGHT_ORANGE, ABRCBrightColors.BRIGHT_ORANGE, output);
                myStairBuilder(ABRCStairs.STAIR_BRIGHT_MAGENTA, ABRCBrightColors.BRIGHT_MAGENTA, output);
                myStairBuilder(ABRCStairs.STAIR_BRIGHT_YELLOW, ABRCBrightColors.BRIGHT_YELLOW, output);
                myStairBuilder(ABRCStairs.STAIR_BRIGHT_CYAN, ABRCBrightColors.BRIGHT_CYAN, output);
                myStairBuilder(ABRCStairs.STAIR_BRIGHT_BLUE, ABRCBrightColors.BRIGHT_BLUE, output);
                myStairBuilder(ABRCStairs.STAIR_BRIGHT_GREEN, ABRCBrightColors.BRIGHT_GREEN, output);
                myStairBuilder(ABRCStairs.STAIR_BRIGHT_RED, ABRCBrightColors.BRIGHT_RED, output);
                myStairBuilder(ABRCStairs.STAIR_BRIGHT_BLACK, ABRCBrightColors.BRIGHT_BLACK, output);

                myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_WHITE, ABRCBrightColors.BRIGHT_WHITE, output);
                myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_ORANGE, ABRCBrightColors.BRIGHT_ORANGE, output);
                myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_MAGENTA, ABRCBrightColors.BRIGHT_MAGENTA, output);
                myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_YELLOW, ABRCBrightColors.BRIGHT_YELLOW, output);
                myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_CYAN, ABRCBrightColors.BRIGHT_CYAN, output);
                myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_BLUE, ABRCBrightColors.BRIGHT_BLUE, output);
                myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_GREEN, ABRCBrightColors.BRIGHT_GREEN, output);
                myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_RED, ABRCBrightColors.BRIGHT_RED, output);
                myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_BLACK, ABRCBrightColors.BRIGHT_BLACK, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_WHITE, ABRCWoolColors.WOOL_WHITE, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_ORANGE, ABRCWoolColors.WOOL_ORANGE, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_MAGENTA, ABRCWoolColors.WOOL_MAGENTA, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE, ABRCWoolColors.WOOL_LIGHT_BLUE, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_YELLOW, ABRCWoolColors.WOOL_YELLOW, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_LIME, ABRCWoolColors.WOOL_LIME, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_PINK, ABRCWoolColors.WOOL_PINK, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_GRAY, ABRCWoolColors.WOOL_GRAY, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY, ABRCWoolColors.WOOL_LIGHT_GRAY, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_CYAN, ABRCWoolColors.WOOL_CYAN, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_PURPLE, ABRCWoolColors.WOOL_PURPLE, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_BLUE, ABRCWoolColors.WOOL_BLUE, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_BROWN, ABRCWoolColors.WOOL_BROWN, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_GREEN, ABRCWoolColors.WOOL_GREEN, output);
                myButtonBuilder(ABRCButtons.BUTTON_WOOL_RED, ABRCWoolColors.WOOL_RED, output);

                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE, ABRCBrightColors.BRIGHT_WHITE, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE, ABRCBrightColors.BRIGHT_ORANGE, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA, ABRCBrightColors.BRIGHT_MAGENTA, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW, ABRCBrightColors.BRIGHT_YELLOW, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN, ABRCBrightColors.BRIGHT_CYAN, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE, ABRCBrightColors.BRIGHT_BLUE, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN, ABRCBrightColors.BRIGHT_GREEN, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED, ABRCBrightColors.BRIGHT_RED, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK, ABRCBrightColors.BRIGHT_BLACK, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE, ABRCWoolColors.WOOL_WHITE, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE, ABRCWoolColors.WOOL_ORANGE, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA, ABRCWoolColors.WOOL_MAGENTA, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE, ABRCWoolColors.WOOL_LIGHT_BLUE, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW, ABRCWoolColors.WOOL_YELLOW, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME, ABRCWoolColors.WOOL_LIME, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK, ABRCWoolColors.WOOL_PINK, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY, ABRCWoolColors.WOOL_GRAY, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY, ABRCWoolColors.WOOL_LIGHT_GRAY, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN, ABRCWoolColors.WOOL_CYAN, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE, ABRCWoolColors.WOOL_PURPLE, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE, ABRCWoolColors.WOOL_BLUE, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN, ABRCWoolColors.WOOL_BROWN, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN, ABRCWoolColors.WOOL_GREEN, output);
                myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED, ABRCWoolColors.WOOL_RED, output);
            }

            private static ResourceKey getSave(String string) {
                return ResourceKey.create(Registries.RECIPE, ABRCUtils.ident(string));
            }

            private void woolBuilder(ItemLike itemOut, ItemLike wool, ItemLike dye, RecipeOutput recipeConsumer) {
                this.shaped(BUILDING_BLOCKS, itemOut, 4)
                        .define('w', wool).define('d', dye).define('g', Items.GLOWSTONE_DUST)
                        .pattern("wdw")
                        .pattern("wgw")
                        .pattern("wdw")
                        .unlockedBy("has_wool", has(Blocks.WHITE_WOOL)).save(recipeConsumer);
            }

            private void whiteToColorBuilder(ItemLike itemOut, ItemLike dye, RecipeOutput  recipeConsumer) {
                    this.shapeless(BUILDING_BLOCKS,itemOut, 4)
                            .requires(dye).requires(ABRCBrightColors.BRIGHT_WHITE)
                            .unlockedBy("has_anitblock", has(ABRCBrightColors.BRIGHT_WHITE))
                            .save(recipeConsumer);
                }

            private void fullToBorderedBuilder(ItemLike itemOut, ItemLike colorBlock, Boolean invertDye, RecipeOutput  recipeConsumer) {
                    if (!invertDye) {
                        this.shaped(BUILDING_BLOCKS, itemOut, 2)
                                .define('#', colorBlock).define('d', Items.BLACK_DYE)
                                .pattern("ddd")
                                .pattern("d#d")
                                .pattern("ddd")
                                .unlockedBy(getHasName(colorBlock), has(colorBlock))
                                .save(recipeConsumer, getSave("full_to_border_" + getItemName(colorBlock)));
                    } else this.shaped(BUILDING_BLOCKS, itemOut, 2)
                            .define('#', colorBlock).define('d', Items.WHITE_DYE)
                            .pattern("ddd")
                            .pattern("d#d")
                            .pattern("ddd")
                            .unlockedBy(getHasName(colorBlock), has(colorBlock))
                            .save(recipeConsumer, getSave("full_to_border_" + getItemName(colorBlock)));
                }

            private void myStairBuilder(ItemLike itemOut, ItemLike itemIn, RecipeOutput  recipeConsumer) {
                    this.shaped(BUILDING_BLOCKS, itemOut, 4)
                            .define('#', itemIn)
                            .pattern("#  ")
                            .pattern("## ")
                            .pattern("###")
                            .unlockedBy(getHasName(itemIn), has(itemIn))
                            .save(recipeConsumer, getSave(getItemName(itemIn) + "_stairs"));
                }

            private void mySlabBuilder(ItemLike itemOut, ItemLike itemIn, RecipeOutput  recipeConsumer) {
                    this.shaped(BUILDING_BLOCKS, itemOut, 6)
                            .define('#', itemIn)
                            .pattern("###")
                            .unlockedBy(getHasName(itemIn), has(itemIn))
                            .save(recipeConsumer, getSave(getItemName(itemIn) + "_slabs"));
                }

            private void myButtonBuilder(ItemLike itemOut, ItemLike itemIn, RecipeOutput  recipeConsumer) {
                    this.shapeless(BUILDING_BLOCKS, itemOut)
                            .requires(itemIn)
                            .unlockedBy(getHasName(itemIn), has(itemIn))
                            .save(recipeConsumer, getSave(getItemName(itemIn) + "_button"));
                }

                private void myPlateBuilder(ItemLike itemOut, ItemLike itemIn, RecipeOutput recipeConsumer) {
                    this.shaped(BUILDING_BLOCKS, itemOut)
                            .define('#', itemIn)
                            .pattern("##")
                            .unlockedBy(getHasName(itemIn), has(itemIn))
                            .save(recipeConsumer, getSave(getItemName(itemIn) + "_pressure_plate"));
                }
        };
    }


    /*
    protected void woolBuilder(Item itemOut, Item wool, Item dye, RecipeExporter recipeConsumer) {
        this.createShaped(BUILDING_BLOCKS, itemOut, 4)
                .input('w', wool).input('d', dye).input('g', Items.GLOWSTONE_DUST)
                .pattern("wdw")
                .pattern("wgw")
                .pattern("wdw")
                .criterion(hasItem(Blocks.WHITE_WOOL), conditionsFromItem(Blocks.WHITE_WOOL)).offerTo(recipeConsumer);
    }
     */

    /*@Override
    public void generate() {
        //Bright White Builder
        this.createShaped(BUILDING_BLOCKS ,ABRCBrightColors.BRIGHT_WHITE, 4)
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
    }*/

    /*protected void woolBuilder(Item itemOut, Item wool, Item dye, RecipeExporter recipeConsumer) {
        this.createShaped(BUILDING_BLOCKS, itemOut, 4)
                .input('w', wool).input('d', dye).input('g', Items.GLOWSTONE_DUST)
                .pattern("wdw")
                .pattern("wgw")
                .pattern("wdw")
                .criterion(hasItem(Blocks.WHITE_WOOL), conditionsFromItem(Blocks.WHITE_WOOL)).offerTo(recipeConsumer);
    }

    protected void whiteToColorBuilder(Item itemOut, Item dye, RecipeExporter recipeConsumer) {
        this.createShapeless(BUILDING_BLOCKS,itemOut, 4)
                .input(dye)
                .input(ABRCBrightColors.BRIGHT_WHITE)
                .criterion(hasItem(ABRCBrightColors.BRIGHT_WHITE), conditionsFromItem(ABRCBrightColors.BRIGHT_WHITE))
                .offerTo(recipeConsumer);
    }

    protected void fullToBorderedBuilder(Item itemOut, Item colorBlock, Boolean invertDye, RecipeExporter recipeConsumer) {
        if (!invertDye) {
            this.createShaped(BUILDING_BLOCKS, itemOut, 2)
                    .input('#', colorBlock).input('d', Items.BLACK_DYE)
                    .pattern("ddd")
                    .pattern("d#d")
                    .pattern("ddd")
                    .criterion(hasItem(colorBlock.asItem()), conditionsFromItem(colorBlock.asItem()))
                    .offerTo(recipeConsumer, getSave("full_to_border_" + getItemPath(colorBlock)));
        } else this.createShaped(BUILDING_BLOCKS, itemOut, 2)
                .input('#', colorBlock).input('d', Items.WHITE_DYE)
                .pattern("ddd")
                .pattern("d#d")
                .pattern("ddd")
                .criterion(hasItem(colorBlock.asItem()), conditionsFromItem(colorBlock.asItem()))
                .offerTo(recipeConsumer, getSave("full_to_border_" + getItemPath(colorBlock)));
    }

    protected void myStairBuilder(Item itemOut, Item itemIn, RecipeExporter recipeConsumer) {
        this.createShaped(BUILDING_BLOCKS, itemOut, 4)
                .input('#', itemIn)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .criterion(hasItem(itemIn), conditionsFromItem(itemIn))
                .offerTo(recipeConsumer, getSave(getItemPath(itemIn) + "_stairs"));
    }

    protected void mySlabBuilder(Item itemOut, Item itemIn, RecipeExporter recipeConsumer) {
        this.createShaped(BUILDING_BLOCKS, itemOut, 6)
                .input('#', itemIn)
                .pattern("###")
                .criterion(hasItem(itemIn), conditionsFromItem(itemIn))
                .offerTo(recipeConsumer, getSave(getItemPath(itemIn) + "_slabs"));
    }

    protected void myButtonBuilder(Item itemOut, Item itemIn, RecipeExporter recipeConsumer) {
        this.createShapeless(BUILDING_BLOCKS, itemOut)
                .input(itemIn)
                .criterion(hasItem(itemIn), conditionsFromItem(itemIn))
                .offerTo(recipeConsumer, getSave(getItemPath(itemIn) + "_button"));
    }

    protected void myPlateBuilder(Item itemOut, Item itemIn, RecipeExporter recipeConsumer) {
        this.createShaped(BUILDING_BLOCKS, itemOut)
                .input('#', itemIn)
                .pattern("##")
                .criterion(hasItem(itemIn), conditionsFromItem(itemIn))
                .offerTo(recipeConsumer, getSave(getItemPath(itemIn) + "_pressure_plate"));
    }*/

    @Override
    public String getName() {
        return "AntiBlocksReChiseled Recipes";
    }
}