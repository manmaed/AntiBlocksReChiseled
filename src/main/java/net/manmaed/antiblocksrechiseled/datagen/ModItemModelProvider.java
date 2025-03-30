package net.manmaed.antiblocksrechiseled.datagen;


import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, AntiBlocksReChiseled.MOD_ID, existingFileHelper);
    }

    private ResourceLocation getLoc(String loc) {
        return ResourceLocation.fromNamespaceAndPath(AntiBlocksReChiseled.MOD_ID, "block/" + loc);
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


        makeSlabs("slab_bright_white");
        makeSlabs("slab_bright_black");
        makeSlabs("slab_bright_orange");
        makeSlabs("slab_bright_magenta");
        makeSlabs("slab_bright_yellow");
        makeSlabs("slab_bright_cyan");
        makeSlabs("slab_bright_blue");
        makeSlabs("slab_bright_green");
        makeSlabs("slab_bright_red");
        makeSlabs("slab_wool_white");
        makeSlabs("slab_wool_orange");
        makeSlabs("slab_wool_magenta");
        makeSlabs("slab_wool_light_blue");
        makeSlabs("slab_wool_yellow");
        makeSlabs("slab_wool_lime");
        makeSlabs("slab_wool_pink");
        makeSlabs("slab_wool_gray");
        makeSlabs("slab_wool_light_gray");
        makeSlabs("slab_wool_cyan");
        makeSlabs("slab_wool_purple");
        makeSlabs("slab_wool_blue");
        makeSlabs("slab_wool_brown");
        makeSlabs("slab_wool_green");
        makeSlabs("slab_wool_red");

        makeStairs("stair_bright_white");
        makeStairs("stair_bright_black");
        makeStairs("stair_bright_orange");
        makeStairs("stair_bright_magenta");
        makeStairs("stair_bright_yellow");
        makeStairs("stair_bright_cyan");
        makeStairs("stair_bright_blue");
        makeStairs("stair_bright_green");
        makeStairs("stair_bright_red");
        makeStairs("stair_wool_white");
        makeStairs("stair_wool_orange");
        makeStairs("stair_wool_magenta");
        makeStairs("stair_wool_light_blue");
        makeStairs("stair_wool_yellow");
        makeStairs("stair_wool_lime");
        makeStairs("stair_wool_pink");
        makeStairs("stair_wool_gray");
        makeStairs("stair_wool_light_gray");
        makeStairs("stair_wool_cyan");
        makeStairs("stair_wool_purple");
        makeStairs("stair_wool_blue");
        makeStairs("stair_wool_brown");
        makeStairs("stair_wool_green");
        makeStairs("stair_wool_red");

        makeButton("button_bright_white");
        makeButton("button_bright_orange");
        makeButton("button_bright_magenta");
        makeButton("button_bright_yellow");
        makeButton("button_bright_cyan");
        makeButton("button_bright_blue");
        makeButton("button_bright_green");
        makeButton("button_bright_red");
        makeButton("button_bright_black");
        makeButton("button_wool_white");
        makeButton("button_wool_orange");
        makeButton("button_wool_magenta");
        makeButton("button_wool_light_blue");
        makeButton("button_wool_yellow");
        makeButton("button_wool_lime");
        makeButton("button_wool_pink");
        makeButton("button_wool_gray");
        makeButton("button_wool_light_gray");
        makeButton("button_wool_cyan");
        makeButton("button_wool_purple");
        makeButton("button_wool_blue");
        makeButton("button_wool_brown");
        makeButton("button_wool_green");
        makeButton("button_wool_red");

        makePlate("pressure_plate_bright_white");
        makePlate("pressure_plate_bright_orange");
        makePlate("pressure_plate_bright_magenta");
        makePlate("pressure_plate_bright_yellow");
        makePlate("pressure_plate_bright_cyan");
        makePlate("pressure_plate_bright_blue");
        makePlate("pressure_plate_bright_green");
        makePlate("pressure_plate_bright_red");
        makePlate("pressure_plate_bright_black");
        makePlate("pressure_plate_wool_white");
        makePlate("pressure_plate_wool_orange");
        makePlate("pressure_plate_wool_magenta");
        makePlate("pressure_plate_wool_light_blue");
        makePlate("pressure_plate_wool_yellow");
        makePlate("pressure_plate_wool_lime");
        makePlate("pressure_plate_wool_pink");
        makePlate("pressure_plate_wool_gray");
        makePlate("pressure_plate_wool_light_gray");
        makePlate("pressure_plate_wool_cyan");
        makePlate("pressure_plate_wool_purple");
        makePlate("pressure_plate_wool_blue");
        makePlate("pressure_plate_wool_brown");
        makePlate("pressure_plate_wool_green");
        makePlate("pressure_plate_wool_red");

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

    public void makeButton(String name) {
        withExistingParent(name, getLoc("button/" + name+ "_inventory"));
    }

    public void makePlate(String name) {
        withExistingParent(name, getLoc("pressure_plate/" + name));
    }
    public void makeOthers(String type, String name) {
        withExistingParent(name, getLoc(type + "/" + name));
    }
}
