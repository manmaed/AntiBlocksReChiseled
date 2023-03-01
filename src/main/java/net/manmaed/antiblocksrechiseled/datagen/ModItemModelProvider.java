package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, AntiBlocksReChiseled.MOD_ID, existingFileHelper);
    }

    private ResourceLocation getLoc(String loc) {
        return new ResourceLocation(AntiBlocksReChiseled.MOD_ID, "block/" + loc);
    }
    @Override
    protected void registerModels() {
        makeBlock("bright", "white");
        makeBlock("bright", "orange");
        makeBlock("bright", "magenta");
        makeBlock("bright", "yellow");
        makeBlock("bright", "cyan");
        makeBlock("bright", "blue");
        makeBlock("bright", "green");
        makeBlock("bright", "red");
        makeBlock("bright", "black");
        makeBlock("bright", "white_border");
        makeBlock("bright", "orange_border");
        makeBlock("bright", "magenta_border");
        makeBlock("bright", "yellow_border");
        makeBlock("bright", "cyan_border");
        makeBlock("bright", "blue_border");
        makeBlock("bright", "green_border");
        makeBlock("bright", "red_border");
        makeBlock("bright", "black_border");

        makeBlock("wool", "white");
        makeBlock("wool", "orange");
        makeBlock("wool", "magenta");
        makeBlock("wool", "light_blue");
        makeBlock("wool", "yellow");
        makeBlock("wool", "lime");
        makeBlock("wool", "pink");
        makeBlock("wool", "gray");
        makeBlock("wool", "light_gray");
        makeBlock("wool", "cyan");
        makeBlock("wool", "purple");
        makeBlock("wool", "blue");
        makeBlock("wool", "brown");
        makeBlock("wool", "green");
        makeBlock("wool", "red");
        makeBlock("wool", "white_border");
        makeBlock("wool", "orange_border");
        makeBlock("wool", "magenta_border");
        makeBlock("wool", "light_blue_border");
        makeBlock("wool", "yellow_border");
        makeBlock("wool", "lime_border");
        makeBlock("wool", "pink_border");
        makeBlock("wool", "gray_border");
        makeBlock("wool", "light_gray_border");
        makeBlock("wool", "cyan_border");
        makeBlock("wool", "purple_border");
        makeBlock("wool", "blue_border");
        makeBlock("wool", "brown_border");
        makeBlock("wool", "green_border");
        makeBlock("wool", "red_border");


        makeSlabs("slab_white_bright");
        makeSlabs("slab_black");
        makeSlabs("slab_orange_bright");
        makeSlabs("slab_magenta_bright");
        makeSlabs("slab_yellow_bright");
        makeSlabs("slab_cyan_bright");
        makeSlabs("slab_blue_bright");
        makeSlabs("slab_green_bright");
        makeSlabs("slab_red_bright");
        makeSlabs("slab_white_wool");
        makeSlabs("slab_orange_wool");
        makeSlabs("slab_magenta_wool");
        makeSlabs("slab_light_blue_wool");
        makeSlabs("slab_yellow_wool");
        makeSlabs("slab_lime_wool");
        makeSlabs("slab_pink_wool");
        makeSlabs("slab_gray_wool");
        makeSlabs("slab_light_gray_wool");
        makeSlabs("slab_cyan_wool");
        makeSlabs("slab_purple_wool");
        makeSlabs("slab_blue_wool");
        makeSlabs("slab_brown_wool");
        makeSlabs("slab_green_wool");
        makeSlabs("slab_red_wool");

        makeStairs("stair_white_bright");
        makeStairs("stair_black");
        makeStairs("stair_orange_bright");
        makeStairs("stair_magenta_bright");
        makeStairs("stair_yellow_bright");
        makeStairs("stair_cyan_bright");
        makeStairs("stair_blue_bright");
        makeStairs("stair_green_bright");
        makeStairs("stair_red_bright");
        makeStairs("stair_white_wool");
        makeStairs("stair_orange_wool");
        makeStairs("stair_magenta_wool");
        makeStairs("stair_light_blue_wool");
        makeStairs("stair_yellow_wool");
        makeStairs("stair_lime_wool");
        makeStairs("stair_pink_wool");
        makeStairs("stair_gray_wool");
        makeStairs("stair_light_gray_wool");
        makeStairs("stair_cyan_wool");
        makeStairs("stair_purple_wool");
        makeStairs("stair_blue_wool");
        makeStairs("stair_brown_wool");
        makeStairs("stair_green_wool");
        makeStairs("stair_red_wool");

    }

    public void makeBlock(String type, String name) {
        withExistingParent(type + "_" + name, getLoc(type + "/"+ name));
    }

    public void makeSlabs(String name) {
        withExistingParent(name, getLoc("slab/"+ name));
    }

    public void makeStairs(String name) {
        withExistingParent(name, getLoc("stair/"+ name));
    }
}
