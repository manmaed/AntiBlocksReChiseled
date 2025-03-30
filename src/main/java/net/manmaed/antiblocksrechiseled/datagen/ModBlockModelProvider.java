package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;


public class ModBlockModelProvider extends BlockModelProvider {
    public ModBlockModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, AntiBlocksReChiseled.MOD_ID, existingFileHelper);
    }

    private ResourceLocation getLoc(String loc) {
        return ResourceLocation.fromNamespaceAndPath(AntiBlocksReChiseled.MOD_ID, "block/" + loc);
    }

    @Override
    protected void registerModels() {
        makeBlock("bright_white");
        makeBlock("bright_orange");
        makeBlock("bright_magenta");
        makeBlock("bright_yellow");
        makeBlock("bright_cyan");
        makeBlock("bright_blue");
        makeBlock("bright_green");
        makeBlock("bright_red");
        makeBlock("bright_black");
        makeBlock("bright_white_border");
        makeBlock("bright_orange_border");
        makeBlock("bright_magenta_border");
        makeBlock("bright_yellow_border");
        makeBlock("bright_cyan_border");
        makeBlock("bright_blue_border");
        makeBlock("bright_green_border");
        makeBlock("bright_red_border");
        makeBlock("bright_black_border");

        makeBlock("wool_white");
        makeBlock("wool_orange");
        makeBlock("wool_magenta");
        makeBlock("wool_light_blue");
        makeBlock("wool_yellow");
        makeBlock("wool_lime");
        makeBlock("wool_pink");
        makeBlock("wool_gray");
        makeBlock("wool_light_gray");
        makeBlock("wool_cyan");
        makeBlock("wool_purple");
        makeBlock("wool_blue");
        makeBlock("wool_brown");
        makeBlock("wool_green");
        makeBlock("wool_red");
        makeBlock("wool_white_border");
        makeBlock("wool_orange_border");
        makeBlock("wool_magenta_border");
        makeBlock("wool_light_blue_border");
        makeBlock("wool_yellow_border");
        makeBlock("wool_lime_border");
        makeBlock("wool_pink_border");
        makeBlock("wool_gray_border");
        makeBlock("wool_light_gray_border");
        makeBlock("wool_cyan_border");
        makeBlock("wool_purple_border");
        makeBlock("wool_blue_border");
        makeBlock("wool_brown_border");
        makeBlock("wool_green_border");
        makeBlock("wool_red_border");


        makeSlabs("slab_bright_white", "bright_white");
        makeSlabs("slab_bright_black", "bright_black");
        makeSlabs("slab_bright_orange", "bright_orange");
        makeSlabs("slab_bright_magenta", "bright_magenta");
        makeSlabs("slab_bright_yellow", "bright_yellow");
        makeSlabs("slab_bright_cyan", "bright_cyan");
        makeSlabs("slab_bright_blue", "bright_blue");
        makeSlabs("slab_bright_green", "bright_green");
        makeSlabs("slab_bright_red", "bright_red");
        makeSlabs("slab_wool_white", "wool_white");
        makeSlabs("slab_wool_orange", "wool_orange");
        makeSlabs("slab_wool_magenta", "wool_magenta");
        makeSlabs("slab_wool_light_blue", "wool_light_blue");
        makeSlabs("slab_wool_yellow", "wool_yellow");
        makeSlabs("slab_wool_lime", "wool_lime");
        makeSlabs("slab_wool_pink", "wool_pink");
        makeSlabs("slab_wool_gray", "wool_gray");
        makeSlabs("slab_wool_light_gray", "wool_light_gray");
        makeSlabs("slab_wool_cyan", "wool_cyan");
        makeSlabs("slab_wool_purple", "wool_purple");
        makeSlabs("slab_wool_blue", "wool_blue");
        makeSlabs("slab_wool_brown", "wool_brown");
        makeSlabs("slab_wool_green", "wool_green");
        makeSlabs("slab_wool_red", "wool_red");

        makeStairs("stair_bright_white", "bright_white");
        makeStairs("stair_bright_black", "bright_black");
        makeStairs("stair_bright_orange", "bright_orange");
        makeStairs("stair_bright_magenta", "bright_magenta");
        makeStairs("stair_bright_yellow", "bright_yellow");
        makeStairs("stair_bright_cyan", "bright_cyan");
        makeStairs("stair_bright_blue", "bright_blue");
        makeStairs("stair_bright_green", "bright_green");
        makeStairs("stair_bright_red", "bright_red");
        makeStairs("stair_wool_white", "wool_white");
        makeStairs("stair_wool_orange", "wool_orange");
        makeStairs("stair_wool_magenta", "wool_magenta");
        makeStairs("stair_wool_light_blue", "wool_light_blue");
        makeStairs("stair_wool_yellow", "wool_yellow");
        makeStairs("stair_wool_lime", "wool_lime");
        makeStairs("stair_wool_pink", "wool_pink");
        makeStairs("stair_wool_gray", "wool_gray");
        makeStairs("stair_wool_light_gray", "wool_light_gray");
        makeStairs("stair_wool_cyan", "wool_cyan");
        makeStairs("stair_wool_purple", "wool_purple");
        makeStairs("stair_wool_blue", "wool_blue");
        makeStairs("stair_wool_brown", "wool_brown");
        makeStairs("stair_wool_green", "wool_green");
        makeStairs("stair_wool_red", "wool_red");

        //Button
        makeButton("button_bright_white", "bright_white");
        makeButton("button_bright_orange", "bright_orange");
        makeButton("button_bright_magenta", "bright_magenta");
        makeButton("button_bright_yellow", "bright_yellow");
        makeButton("button_bright_cyan", "bright_cyan");
        makeButton("button_bright_blue", "bright_blue");
        makeButton("button_bright_green", "bright_green");
        makeButton("button_bright_red", "bright_red");
        makeButton("button_bright_black", "bright_black");
        makeButton("button_wool_white", "wool_white");
        makeButton("button_wool_orange", "wool_orange");
        makeButton("button_wool_magenta", "wool_magenta");
        makeButton("button_wool_light_blue", "wool_light_blue");
        makeButton("button_wool_yellow", "wool_yellow");
        makeButton("button_wool_lime", "wool_lime");
        makeButton("button_wool_pink", "wool_pink");
        makeButton("button_wool_gray", "wool_gray");
        makeButton("button_wool_light_gray", "wool_light_gray");
        makeButton("button_wool_cyan", "wool_cyan");
        makeButton("button_wool_purple", "wool_purple");
        makeButton("button_wool_blue", "wool_blue");
        makeButton("button_wool_brown", "wool_brown");
        makeButton("button_wool_green", "wool_green");
        makeButton("button_wool_red", "wool_red");

        //Pressure Plate
        makePressurePlate("pressure_plate_bright_white", "bright_white");
        makePressurePlate("pressure_plate_bright_orange", "bright_orange");
        makePressurePlate("pressure_plate_bright_magenta", "bright_magenta");
        makePressurePlate("pressure_plate_bright_yellow", "bright_yellow");
        makePressurePlate("pressure_plate_bright_cyan", "bright_cyan");
        makePressurePlate("pressure_plate_bright_blue", "bright_blue");
        makePressurePlate("pressure_plate_bright_green", "bright_green");
        makePressurePlate("pressure_plate_bright_red", "bright_red");
        makePressurePlate("pressure_plate_bright_black", "bright_black");
        makePressurePlate("pressure_plate_wool_white", "wool_white");
        makePressurePlate("pressure_plate_wool_orange", "wool_orange");
        makePressurePlate("pressure_plate_wool_magenta", "wool_magenta");
        makePressurePlate("pressure_plate_wool_light_blue", "wool_light_blue");
        makePressurePlate("pressure_plate_wool_yellow", "wool_yellow");
        makePressurePlate("pressure_plate_wool_lime", "wool_lime");
        makePressurePlate("pressure_plate_wool_pink", "wool_pink");
        makePressurePlate("pressure_plate_wool_gray", "wool_gray");
        makePressurePlate("pressure_plate_wool_light_gray", "wool_light_gray");
        makePressurePlate("pressure_plate_wool_cyan", "wool_cyan");
        makePressurePlate("pressure_plate_wool_purple", "wool_purple");
        makePressurePlate("pressure_plate_wool_blue", "wool_blue");
        makePressurePlate("pressure_plate_wool_brown", "wool_brown");
        makePressurePlate("pressure_plate_wool_green", "wool_green");
        makePressurePlate("pressure_plate_wool_red", "wool_red");
    }

    /*
       private T singleTexture(String name, String parent, String textureKey, ResourceLocation texture) {
            return singleTexture(name, mcLoc(parent), textureKey, texture);
        }
     */
    private void makeBlock(String name) {
        singleTexture("block/" + name, getLoc("full_bright"), "color", getLoc(name));
    }

    private void makeSlabs(String name, String color) {
        singleTexture("block/" + name, getLoc("full_bright_slab"), "color", getLoc(color));
        singleTexture("block/" + name + "_top", getLoc("full_bright_slab_top"), "color", getLoc(color));
    }

    private void makeStairs(String name, String color) {
        singleTexture("block/" + name, getLoc("full_bright_stair"), "color", getLoc(color));
        singleTexture("block/" + name + "_inner", getLoc("full_bright_inner_stair"), "color", getLoc(color));
        singleTexture("block/" + name + "_outer", getLoc("full_bright_outer_stair"), "color", getLoc(color));
    }

    private void makeButton(String name, String color) {
        singleTexture("block/" + name, getLoc("full_bright_button"), "color", getLoc(color));
        singleTexture("block/" + name + "_pressed", getLoc("full_bright_button_pressed"), "color", getLoc(color));
        singleTexture("block/" + name + "_inventory", getLoc("full_bright_button_inventory"), "color", getLoc(color));
    }

    private void makePressurePlate(String name, String color) {
        singleTexture("block/" + name, getLoc("full_bright_pressure_plate_up"), "color", getLoc(color));
        singleTexture("block/" + name + "_down", getLoc("full_bright_pressure_plate_down"), "color", getLoc(color));
    }
}
