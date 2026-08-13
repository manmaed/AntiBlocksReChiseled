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
                        .define('d', Ingredient.of(Items.DYE.white()))
                        .define('g', Ingredient.of(Items.GLOWSTONE_DUST))
                        .pattern("sds")
                        .pattern("dgd")
                        .pattern("sds").unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST)).save(output);

                //The Rest of Bright Colors
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_ORANGE, Items.DYE.orange(), output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_MAGENTA, Items.DYE.magenta(), output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_YELLOW, Items.DYE.yellow(), output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_CYAN, Items.DYE.cyan(), output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_BLUE, Items.DYE.blue(), output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_GREEN, Items.DYE.green(), output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_RED, Items.DYE.red(), output);
                whiteToColorBuilder(ABRCBrightColors.BRIGHT_BLACK, Items.DYE.black(), output);

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
                woolBuilder(ABRCWoolColors.WOOL_WHITE, Blocks.WOOL.white(), Items.DYE.white(), output);
                woolBuilder(ABRCWoolColors.WOOL_ORANGE, Blocks.WOOL.orange(), Items.DYE.orange(), output);
                woolBuilder(ABRCWoolColors.WOOL_MAGENTA, Blocks.WOOL.magenta(), Items.DYE.magenta(), output);
                woolBuilder(ABRCWoolColors.WOOL_LIGHT_BLUE, Blocks.WOOL.lightBlue(), Items.DYE.lightBlue(), output);
                woolBuilder(ABRCWoolColors.WOOL_YELLOW, Blocks.WOOL.yellow(), Items.DYE.yellow(), output);
                woolBuilder(ABRCWoolColors.WOOL_LIME, Blocks.WOOL.lime(), Items.DYE.lime(), output);
                woolBuilder(ABRCWoolColors.WOOL_PINK, Blocks.WOOL.pink(), Items.DYE.pink(), output);
                woolBuilder(ABRCWoolColors.WOOL_GRAY, Blocks.WOOL.gray(), Items.DYE.gray(), output);
                woolBuilder(ABRCWoolColors.WOOL_LIGHT_GRAY, Blocks.WOOL.lightGray(), Items.DYE.lightGray(), output);
                woolBuilder(ABRCWoolColors.WOOL_CYAN, Blocks.WOOL.cyan(), Items.DYE.cyan(), output);
                woolBuilder(ABRCWoolColors.WOOL_PURPLE, Blocks.WOOL.purple(), Items.DYE.purple(), output);
                woolBuilder(ABRCWoolColors.WOOL_BLUE, Blocks.WOOL.blue(), Items.DYE.blue(), output);
                woolBuilder(ABRCWoolColors.WOOL_BROWN, Blocks.WOOL.brown(), Items.DYE.brown(), output);
                woolBuilder(ABRCWoolColors.WOOL_GREEN, Blocks.WOOL.green(), Items.DYE.green(), output);
                woolBuilder(ABRCWoolColors.WOOL_RED, Blocks.WOOL.red(), Items.DYE.red(), output);

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
                        .unlockedBy("has_wool", has(Blocks.WOOL.white())).save(recipeConsumer);
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
                                .define('#', colorBlock).define('d', Items.DYE.black())
                                .pattern("ddd")
                                .pattern("d#d")
                                .pattern("ddd")
                                .unlockedBy(getHasName(colorBlock), has(colorBlock))
                                .save(recipeConsumer, getSave("full_to_border_" + getItemName(colorBlock)));
                    } else this.shaped(BUILDING_BLOCKS, itemOut, 2)
                            .define('#', colorBlock).define('d', Items.DYE.white())
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

    @Override
    public String getName() {
        return "AntiBlocksReChiseled Recipes";
    }
}