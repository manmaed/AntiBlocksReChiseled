package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {

    public static RecipeCategory BUILDING_BLOCKS = RecipeCategory.BUILDING_BLOCKS;
    protected final RecipeOutput output;

    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput recipeOutput) {
        super(registries, recipeOutput);
        this.output = recipeOutput;
    }

    public static ResourceKey getSave(String string) {
        return ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(AntiBlocksReChiseled.MOD_ID, string));
    }

    @Override
    protected void buildRecipes() {
        //Bright White Builder
        this.shaped(BUILDING_BLOCKS , ABRCBrightColors.BRIGHT_WHITE.get(), 4)
                .define('s', Ingredient.of(Blocks.STONE.asItem()))
                .define('d', Ingredient.of(Items.DYE.white()))
                .define('g', Ingredient.of(Items.GLOWSTONE_DUST))
                .pattern("sds")
                .pattern("dgd")
                .pattern("sds").unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST)).save(output);

        //The Rest of Bright Colors
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_ORANGE.get(), Items.DYE.orange(), output);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_MAGENTA.get(), Items.DYE.magenta(), output);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_YELLOW.get(), Items.DYE.yellow(), output);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_CYAN.get(), Items.DYE.cyan(), output);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_BLUE.get(), Items.DYE.blue(), output);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_GREEN.get(), Items.DYE.green(), output);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_RED.get(), Items.DYE.red(), output);
        whiteToColorBuilder(ABRCBrightColors.BRIGHT_BLACK.get(), Items.DYE.black(), output);

        //Bright With Borders
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_WHITE_BORDER.get(), ABRCBrightColors.BRIGHT_WHITE.get(), false, output);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get(), ABRCBrightColors.BRIGHT_ORANGE.get(), false, output);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get(), ABRCBrightColors.BRIGHT_MAGENTA.get(), false, output);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get(), ABRCBrightColors.BRIGHT_YELLOW.get(), false, output);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_CYAN_BORDER.get(), ABRCBrightColors.BRIGHT_CYAN.get(), false, output);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_BLUE_BORDER.get(), ABRCBrightColors.BRIGHT_BLUE.get(), false, output);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_GREEN_BORDER.get(), ABRCBrightColors.BRIGHT_GREEN.get(), false, output);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_RED_BORDER.get(), ABRCBrightColors.BRIGHT_RED.get(), false, output);
        fullToBorderedBuilder(ABRCBrightColors.BRIGHT_BLACK_BORDER.get(), ABRCBrightColors.BRIGHT_BLACK.get(), true, output);

        //Wool Colors
        woolBuilder(ABRCWoolColors.WOOL_WHITE.get(), Blocks.WOOL.white(), Items.DYE.white(), output);
        woolBuilder(ABRCWoolColors.WOOL_ORANGE.get(), Blocks.WOOL.orange(), Items.DYE.orange(), output);
        woolBuilder(ABRCWoolColors.WOOL_MAGENTA.get(), Blocks.WOOL.magenta(), Items.DYE.magenta(), output);
        woolBuilder(ABRCWoolColors.WOOL_LIGHT_BLUE.get(), Blocks.WOOL.lightBlue(), Items.DYE.lightBlue(), output);
        woolBuilder(ABRCWoolColors.WOOL_YELLOW.get(), Blocks.WOOL.yellow(), Items.DYE.yellow(), output);
        woolBuilder(ABRCWoolColors.WOOL_LIME.get(), Blocks.WOOL.lime(), Items.DYE.lime(), output);
        woolBuilder(ABRCWoolColors.WOOL_PINK.get(), Blocks.WOOL.pink(), Items.DYE.pink(), output);
        woolBuilder(ABRCWoolColors.WOOL_GRAY.get(), Blocks.WOOL.gray(), Items.DYE.gray(), output);
        woolBuilder(ABRCWoolColors.WOOL_LIGHT_GRAY.get(), Blocks.WOOL.lightGray(), Items.DYE.lightGray(), output);
        woolBuilder(ABRCWoolColors.WOOL_CYAN.get(), Blocks.WOOL.cyan(), Items.DYE.cyan(), output);
        woolBuilder(ABRCWoolColors.WOOL_PURPLE.get(), Blocks.WOOL.purple(), Items.DYE.purple(), output);
        woolBuilder(ABRCWoolColors.WOOL_BLUE.get(), Blocks.WOOL.blue(), Items.DYE.blue(), output);
        woolBuilder(ABRCWoolColors.WOOL_BROWN.get(), Blocks.WOOL.brown(), Items.DYE.brown(), output);
        woolBuilder(ABRCWoolColors.WOOL_GREEN.get(), Blocks.WOOL.green(), Items.DYE.green(), output);
        woolBuilder(ABRCWoolColors.WOOL_RED.get(), Blocks.WOOL.red(), Items.DYE.red(), output);

        //Wool with Borders
        fullToBorderedBuilder(ABRCWoolColors.WOOL_WHITE_BORDER.get(), ABRCWoolColors.WOOL_WHITE.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_ORANGE_BORDER.get(), ABRCWoolColors.WOOL_ORANGE.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_MAGENTA_BORDER.get(), ABRCWoolColors.WOOL_MAGENTA.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get(), ABRCWoolColors.WOOL_LIGHT_BLUE.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_YELLOW_BORDER.get(), ABRCWoolColors.WOOL_YELLOW.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_LIME_BORDER.get(), ABRCWoolColors.WOOL_LIME.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_PINK_BORDER.get(), ABRCWoolColors.WOOL_PINK.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_GRAY_BORDER.get(), ABRCWoolColors.WOOL_GRAY.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get(), ABRCWoolColors.WOOL_LIGHT_GRAY.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_CYAN_BORDER.get(), ABRCWoolColors.WOOL_CYAN.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_PURPLE_BORDER.get(), ABRCWoolColors.WOOL_PURPLE.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_BLUE_BORDER.get(), ABRCWoolColors.WOOL_BLUE.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_BROWN_BORDER.get(), ABRCWoolColors.WOOL_BROWN.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_GREEN_BORDER.get(), ABRCWoolColors.WOOL_GREEN.get(), false, output);
        fullToBorderedBuilder(ABRCWoolColors.WOOL_RED_BORDER.get(), ABRCWoolColors.WOOL_RED.get(), false, output);

        //Slabs
        //-Wool
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_WHITE.get(), ABRCWoolColors.WOOL_WHITE.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_ORANGE.get(), ABRCWoolColors.WOOL_ORANGE.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_MAGENTA.get(), ABRCWoolColors.WOOL_MAGENTA.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.get(), ABRCWoolColors.WOOL_LIGHT_BLUE.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_YELLOW.get(), ABRCWoolColors.WOOL_YELLOW.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_LIME.get(), ABRCWoolColors.WOOL_LIME.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_PINK.get(), ABRCWoolColors.WOOL_PINK.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_GRAY.get(), ABRCWoolColors.WOOL_GRAY.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.get(), ABRCWoolColors.WOOL_LIGHT_GRAY.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_CYAN.get(), ABRCWoolColors.WOOL_CYAN.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_PURPLE.get(), ABRCWoolColors.WOOL_PURPLE.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_BLUE.get(), ABRCWoolColors.WOOL_BLUE.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_BROWN.get(), ABRCWoolColors.WOOL_BROWN.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_GREEN.get(), ABRCWoolColors.WOOL_GREEN.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_WOOL_RED.get(), ABRCWoolColors.WOOL_RED.get(), output);
        //-Bright
        mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_WHITE.get(), ABRCBrightColors.BRIGHT_WHITE.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_ORANGE.get(), ABRCBrightColors.BRIGHT_ORANGE.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_MAGENTA.get(), ABRCBrightColors.BRIGHT_MAGENTA.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_YELLOW.get(), ABRCBrightColors.BRIGHT_YELLOW.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_CYAN.get(), ABRCBrightColors.BRIGHT_CYAN.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_BLUE.get(), ABRCBrightColors.BRIGHT_BLUE.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_GREEN.get(), ABRCBrightColors.BRIGHT_GREEN.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_RED.get(), ABRCBrightColors.BRIGHT_RED.get(), output);
        mySlabBuilder(ABRCSlabs.SLAB_BRIGHT_BLACK.get(), ABRCBrightColors.BRIGHT_BLACK.get(), output);
        //Stairs
        //-Wool
        myStairBuilder(ABRCStairs.STAIR_WOOL_WHITE.get(), ABRCWoolColors.WOOL_WHITE.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_ORANGE.get(), ABRCWoolColors.WOOL_ORANGE.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_MAGENTA.get(), ABRCWoolColors.WOOL_MAGENTA.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_LIGHT_BLUE.get(), ABRCWoolColors.WOOL_LIGHT_BLUE.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_YELLOW.get(), ABRCWoolColors.WOOL_YELLOW.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_LIME.get(), ABRCWoolColors.WOOL_LIME.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_PINK.get(), ABRCWoolColors.WOOL_PINK.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_GRAY.get(), ABRCWoolColors.WOOL_GRAY.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_LIGHT_GRAY.get(), ABRCWoolColors.WOOL_LIGHT_GRAY.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_CYAN.get(), ABRCWoolColors.WOOL_CYAN.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_PURPLE.get(), ABRCWoolColors.WOOL_PURPLE.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_BLUE.get(), ABRCWoolColors.WOOL_BLUE.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_BROWN.get(), ABRCWoolColors.WOOL_BROWN.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_GREEN.get(), ABRCWoolColors.WOOL_GREEN.get(), output);
        myStairBuilder(ABRCStairs.STAIR_WOOL_RED.get(), ABRCWoolColors.WOOL_RED.get(), output);
        //-Bright
        myStairBuilder(ABRCStairs.STAIR_BRIGHT_WHITE.get(), ABRCBrightColors.BRIGHT_WHITE.get(), output);
        myStairBuilder(ABRCStairs.STAIR_BRIGHT_ORANGE.get(), ABRCBrightColors.BRIGHT_ORANGE.get(), output);
        myStairBuilder(ABRCStairs.STAIR_BRIGHT_MAGENTA.get(), ABRCBrightColors.BRIGHT_MAGENTA.get(), output);
        myStairBuilder(ABRCStairs.STAIR_BRIGHT_YELLOW.get(), ABRCBrightColors.BRIGHT_YELLOW.get(), output);
        myStairBuilder(ABRCStairs.STAIR_BRIGHT_CYAN.get(), ABRCBrightColors.BRIGHT_CYAN.get(), output);
        myStairBuilder(ABRCStairs.STAIR_BRIGHT_BLUE.get(), ABRCBrightColors.BRIGHT_BLUE.get(), output);
        myStairBuilder(ABRCStairs.STAIR_BRIGHT_GREEN.get(), ABRCBrightColors.BRIGHT_GREEN.get(), output);
        myStairBuilder(ABRCStairs.STAIR_BRIGHT_RED.get(), ABRCBrightColors.BRIGHT_RED.get(), output);
        myStairBuilder(ABRCStairs.STAIR_BRIGHT_BLACK.get(), ABRCBrightColors.BRIGHT_BLACK.get(), output);

        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_WHITE.get(), ABRCBrightColors.BRIGHT_WHITE.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_ORANGE.get(), ABRCBrightColors.BRIGHT_ORANGE.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get(), ABRCBrightColors.BRIGHT_MAGENTA.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_YELLOW.get(), ABRCBrightColors.BRIGHT_YELLOW.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_CYAN.get(), ABRCBrightColors.BRIGHT_CYAN.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_BLUE.get(), ABRCBrightColors.BRIGHT_BLUE.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_GREEN.get(), ABRCBrightColors.BRIGHT_GREEN.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_RED.get(), ABRCBrightColors.BRIGHT_RED.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_BRIGHT_BLACK.get(), ABRCBrightColors.BRIGHT_BLACK.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_WHITE.get(), ABRCWoolColors.WOOL_WHITE.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_ORANGE.get(), ABRCWoolColors.WOOL_ORANGE.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_MAGENTA.get(), ABRCWoolColors.WOOL_MAGENTA.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get(), ABRCWoolColors.WOOL_LIGHT_BLUE.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_YELLOW.get(), ABRCWoolColors.WOOL_YELLOW.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_LIME.get(), ABRCWoolColors.WOOL_LIME.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_PINK.get(), ABRCWoolColors.WOOL_PINK.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_GRAY.get(), ABRCWoolColors.WOOL_GRAY.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get(), ABRCWoolColors.WOOL_LIGHT_GRAY.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_CYAN.get(), ABRCWoolColors.WOOL_CYAN.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_PURPLE.get(), ABRCWoolColors.WOOL_PURPLE.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_BLUE.get(), ABRCWoolColors.WOOL_BLUE.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_BROWN.get(), ABRCWoolColors.WOOL_BROWN.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_GREEN.get(), ABRCWoolColors.WOOL_GREEN.get(), output);
        myButtonBuilder(ABRCButtons.BUTTON_WOOL_RED.get(), ABRCWoolColors.WOOL_RED.get(), output);

        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get(), ABRCBrightColors.BRIGHT_WHITE.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get(), ABRCBrightColors.BRIGHT_ORANGE.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get(), ABRCBrightColors.BRIGHT_MAGENTA.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get(), ABRCBrightColors.BRIGHT_YELLOW.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get(), ABRCBrightColors.BRIGHT_CYAN.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get(), ABRCBrightColors.BRIGHT_BLUE.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get(), ABRCBrightColors.BRIGHT_GREEN.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get(), ABRCBrightColors.BRIGHT_RED.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get(), ABRCBrightColors.BRIGHT_BLACK.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get(), ABRCWoolColors.WOOL_WHITE.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get(), ABRCWoolColors.WOOL_ORANGE.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get(), ABRCWoolColors.WOOL_MAGENTA.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get(), ABRCWoolColors.WOOL_LIGHT_BLUE.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get(), ABRCWoolColors.WOOL_YELLOW.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get(), ABRCWoolColors.WOOL_LIME.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get(), ABRCWoolColors.WOOL_PINK.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get(), ABRCWoolColors.WOOL_GRAY.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get(), ABRCWoolColors.WOOL_LIGHT_GRAY.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get(), ABRCWoolColors.WOOL_CYAN.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get(), ABRCWoolColors.WOOL_PURPLE.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get(), ABRCWoolColors.WOOL_BLUE.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get(), ABRCWoolColors.WOOL_BROWN.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get(), ABRCWoolColors.WOOL_GREEN.get(), output);
        myPlateBuilder(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get(), ABRCWoolColors.WOOL_RED.get(), output);

    }

    protected void woolBuilder(ItemLike itemOut, ItemLike wool, ItemLike dye, RecipeOutput recipeConsumer) {
        this.shaped(BUILDING_BLOCKS, itemOut, 4)
                .define('w', wool).define('d', dye).define('g', Items.GLOWSTONE_DUST)
                .pattern("wdw")
                .pattern("wgw")
                .pattern("wdw")
                .unlockedBy("has_wool", has(Blocks.WOOL.white())).save(recipeConsumer);
    }

    protected void whiteToColorBuilder(ItemLike itemOut, ItemLike dye, RecipeOutput  recipeConsumer) {
        this.shapeless(BUILDING_BLOCKS,itemOut, 4)
                .requires(dye).requires(ABRCBrightColors.BRIGHT_WHITE.get())
                .unlockedBy("has_anitblock", has(ABRCBrightColors.BRIGHT_WHITE.get()))
                .save(recipeConsumer);
    }

    protected void fullToBorderedBuilder(ItemLike itemOut, ItemLike colorBlock, Boolean invertDye, RecipeOutput  recipeConsumer) {
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

    protected void myStairBuilder(ItemLike itemOut, ItemLike itemIn, RecipeOutput  recipeConsumer) {
        this.shaped(BUILDING_BLOCKS, itemOut, 4)
                .define('#', itemIn)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .unlockedBy(getHasName(itemIn), has(itemIn))
                .save(recipeConsumer, getSave(getItemName(itemIn) + "_stairs"));
    }

    protected void mySlabBuilder(ItemLike itemOut, ItemLike itemIn, RecipeOutput  recipeConsumer) {
        this.shaped(BUILDING_BLOCKS, itemOut, 6)
                .define('#', itemIn)
                .pattern("###")
                .unlockedBy(getHasName(itemIn), has(itemIn))
                .save(recipeConsumer, getSave(getItemName(itemIn) + "_slabs"));
    }

    protected void myButtonBuilder(ItemLike itemOut, ItemLike itemIn, RecipeOutput  recipeConsumer) {
        this.shapeless(BUILDING_BLOCKS, itemOut)
                .requires(itemIn)
                .unlockedBy(getHasName(itemIn), has(itemIn))
                .save(recipeConsumer, getSave(getItemName(itemIn) + "_button"));
    }

    protected void myPlateBuilder(ItemLike itemOut, ItemLike itemIn, RecipeOutput recipeConsumer) {
        this.shaped(BUILDING_BLOCKS, itemOut)
                .define('#', itemIn)
                .pattern("##")
                .unlockedBy(getHasName(itemIn), has(itemIn))
                .save(recipeConsumer, getSave(getItemName(itemIn) + "_pressure_plate"));
    }

    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookup) {
            super(packOutput, lookup);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "AntiBlocksReChiseled Recipes";
        }
    }
}
