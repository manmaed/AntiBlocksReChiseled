//package net.manmaed.antiblocksrechiseled.datagen;
//
//import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
//import net.minecraft.data.DataGenerator;
//import net.minecraft.data.PackOutput;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraftforge.client.model.generators.BlockModelProvider;
//import net.minecraftforge.common.data.ExistingFileHelper;
//
//public class ModBlockModelProvider extends BlockModelProvider {
//    public ModBlockModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
//        super(packOutput, AntiBlocksReChiseled.MOD_ID, existingFileHelper);
//    }
//
//    private ResourceLocation getLoc(String loc) {
//        return new ResourceLocation(AntiBlocksReChiseled.MOD_ID, "block/" + loc);
//    }
//
//    @Override
//    protected void registerModels() {
//        makeBlock("bright", "white");
//        makeBlock("bright", "orange");
//        makeBlock("bright", "magenta");
//        makeBlock("bright", "yellow");
//        makeBlock("bright", "cyan");
//        makeBlock("bright", "blue");
//        makeBlock("bright", "green");
//        makeBlock("bright", "red");
//        makeBlock("bright", "black");
//        makeBlock("bright", "white_border");
//        makeBlock("bright", "orange_border");
//        makeBlock("bright", "magenta_border");
//        makeBlock("bright", "yellow_border");
//        makeBlock("bright", "cyan_border");
//        makeBlock("bright", "blue_border");
//        makeBlock("bright", "green_border");
//        makeBlock("bright", "red_border");
//        makeBlock("bright", "black_border");
//
//        makeBlock("wool", "white");
//        makeBlock("wool", "orange");
//        makeBlock("wool", "magenta");
//        makeBlock("wool", "light_blue");
//        makeBlock("wool", "yellow");
//        makeBlock("wool", "lime");
//        makeBlock("wool", "pink");
//        makeBlock("wool", "gray");
//        makeBlock("wool", "light_gray");
//        makeBlock("wool", "cyan");
//        makeBlock("wool", "purple");
//        makeBlock("wool", "blue");
//        makeBlock("wool", "brown");
//        makeBlock("wool", "green");
//        makeBlock("wool", "red");
//        makeBlock("wool", "white_border");
//        makeBlock("wool", "orange_border");
//        makeBlock("wool", "magenta_border");
//        makeBlock("wool", "light_blue_border");
//        makeBlock("wool", "yellow_border");
//        makeBlock("wool", "lime_border");
//        makeBlock("wool", "pink_border");
//        makeBlock("wool", "gray_border");
//        makeBlock("wool", "light_gray_border");
//        makeBlock("wool", "cyan_border");
//        makeBlock("wool", "purple_border");
//        makeBlock("wool", "blue_border");
//        makeBlock("wool", "brown_border");
//        makeBlock("wool", "green_border");
//        makeBlock("wool", "red_border");
//
//
//        makeSlabs("slab_white_bright", "bright/white");
//        makeSlabs("slab_black", "bright/black");
//        makeSlabs("slab_orange_bright", "bright/orange");
//        makeSlabs("slab_magenta_bright", "bright/magenta");
//        makeSlabs("slab_yellow_bright", "bright/yellow");
//        makeSlabs("slab_cyan_bright", "bright/cyan");
//        makeSlabs("slab_blue_bright", "bright/blue");
//        makeSlabs("slab_green_bright", "bright/green");
//        makeSlabs("slab_red_bright", "bright/red");
//        makeSlabs("slab_white_wool", "wool/white");
//        makeSlabs("slab_orange_wool", "wool/orange");
//        makeSlabs("slab_magenta_wool", "wool/magenta");
//        makeSlabs("slab_light_blue_wool", "wool/light_blue");
//        makeSlabs("slab_yellow_wool", "wool/yellow");
//        makeSlabs("slab_lime_wool", "wool/lime");
//        makeSlabs("slab_pink_wool", "wool/pink");
//        makeSlabs("slab_gray_wool", "wool/gray");
//        makeSlabs("slab_light_gray_wool", "wool/light_gray");
//        makeSlabs("slab_cyan_wool", "wool/cyan");
//        makeSlabs("slab_purple_wool", "wool/purple");
//        makeSlabs("slab_blue_wool", "wool/blue");
//        makeSlabs("slab_brown_wool", "wool/brown");
//        makeSlabs("slab_green_wool", "wool/green");
//        makeSlabs("slab_red_wool", "wool/red");
//
//        makeStairs("stair_white_bright", "bright/white");
//        makeStairs("stair_black", "bright/black");
//        makeStairs("stair_orange_bright", "bright/orange");
//        makeStairs("stair_magenta_bright", "bright/magenta");
//        makeStairs("stair_yellow_bright", "bright/yellow");
//        makeStairs("stair_cyan_bright", "bright/cyan");
//        makeStairs("stair_blue_bright", "bright/blue");
//        makeStairs("stair_green_bright", "bright/green");
//        makeStairs("stair_red_bright", "bright/red");
//        makeStairs("stair_white_wool", "wool/white");
//        makeStairs("stair_orange_wool", "wool/orange");
//        makeStairs("stair_magenta_wool", "wool/magenta");
//        makeStairs("stair_light_blue_wool", "wool/light_blue");
//        makeStairs("stair_yellow_wool", "wool/yellow");
//        makeStairs("stair_lime_wool", "wool/lime");
//        makeStairs("stair_pink_wool", "wool/pink");
//        makeStairs("stair_gray_wool", "wool/gray");
//        makeStairs("stair_light_gray_wool", "wool/light_gray");
//        makeStairs("stair_cyan_wool", "wool/cyan");
//        makeStairs("stair_purple_wool", "wool/purple");
//        makeStairs("stair_blue_wool", "wool/blue");
//        makeStairs("stair_brown_wool", "wool/brown");
//        makeStairs("stair_green_wool", "wool/green");
//        makeStairs("stair_red_wool", "wool/red");
//
//        //Button
//        makeButton("button_bright_white", "bright/white");
//        makeButton("button_bright_orange", "bright/orange");
//        makeButton("button_bright_magenta", "bright/magenta");
//        makeButton("button_bright_yellow", "bright/yellow");
//        makeButton("button_bright_cyan", "bright/cyan");
//        makeButton("button_bright_blue", "bright/blue");
//        makeButton("button_bright_green", "bright/green");
//        makeButton("button_bright_red", "bright/red");
//        makeButton("button_bright_black", "bright/black");
//        makeButton("button_wool_white", "wool/white");
//        makeButton("button_wool_orange", "wool/orange");
//        makeButton("button_wool_magenta", "wool/magenta");
//        makeButton("button_wool_light_blue", "wool/light_blue");
//        makeButton("button_wool_yellow", "wool/yellow");
//        makeButton("button_wool_lime", "wool/lime");
//        makeButton("button_wool_pink", "wool/pink");
//        makeButton("button_wool_gray", "wool/gray");
//        makeButton("button_wool_light_gray", "wool/light_gray");
//        makeButton("button_wool_cyan", "wool/cyan");
//        makeButton("button_wool_purple", "wool/purple");
//        makeButton("button_wool_blue", "wool/blue");
//        makeButton("button_wool_brown", "wool/brown");
//        makeButton("button_wool_green", "wool/green");
//        makeButton("button_wool_red", "wool/red");
//
//        //Pressure Plate
//        makePressurePlate("pressure_plate_bright_white", "bright/white");
//        makePressurePlate("pressure_plate_bright_orange", "bright/orange");
//        makePressurePlate("pressure_plate_bright_magenta", "bright/magenta");
//        makePressurePlate("pressure_plate_bright_yellow", "bright/yellow");
//        makePressurePlate("pressure_plate_bright_cyan", "bright/cyan");
//        makePressurePlate("pressure_plate_bright_blue", "bright/blue");
//        makePressurePlate("pressure_plate_bright_green", "bright/green");
//        makePressurePlate("pressure_plate_bright_red", "bright/red");
//        makePressurePlate("pressure_plate_bright_black", "bright/black");
//        makePressurePlate("pressure_plate_wool_white", "wool/white");
//        makePressurePlate("pressure_plate_wool_orange", "wool/orange");
//        makePressurePlate("pressure_plate_wool_magenta", "wool/magenta");
//        makePressurePlate("pressure_plate_wool_light_blue", "wool/light_blue");
//        makePressurePlate("pressure_plate_wool_yellow", "wool/yellow");
//        makePressurePlate("pressure_plate_wool_lime", "wool/lime");
//        makePressurePlate("pressure_plate_wool_pink", "wool/pink");
//        makePressurePlate("pressure_plate_wool_gray", "wool/gray");
//        makePressurePlate("pressure_plate_wool_light_gray", "wool/light_gray");
//        makePressurePlate("pressure_plate_wool_cyan", "wool/cyan");
//        makePressurePlate("pressure_plate_wool_purple", "wool/purple");
//        makePressurePlate("pressure_plate_wool_blue", "wool/blue");
//        makePressurePlate("pressure_plate_wool_brown", "wool/brown");
//        makePressurePlate("pressure_plate_wool_green", "wool/green");
//        makePressurePlate("pressure_plate_wool_red", "wool/red");
//    }
//
//    /*
//       private T singleTexture(String name, String parent, String textureKey, ResourceLocation texture) {
//            return singleTexture(name, mcLoc(parent), textureKey, texture);
//        }
//     */
//    private void makeBlock(String type, String name) {
//        singleTexture("block/" + type + "/" + name, getLoc("full_bright"), "color", getLoc(type + "/" + name));
//    }
//
//    private void makeSlabs(String name, String color) {
//        singleTexture("block/slab/" + name, getLoc("full_bright_slab"), "color", getLoc(color));
//        singleTexture("block/slab/" + name + "_top", getLoc("full_bright_slab_top"), "color", getLoc(color));
//    }
//
//    private void makeStairs(String name, String color) {
//        singleTexture("block/stair/" + name, getLoc("full_bright_stair"), "color", getLoc(color));
//        singleTexture("block/stair/" + name + "_inner", getLoc("full_bright_inner_stair"), "color", getLoc(color));
//        singleTexture("block/stair/" + name + "_outer", getLoc("full_bright_outer_stair"), "color", getLoc(color));
//    }
//
//    private void makeButton(String name, String color) {
//        singleTexture("block/button/" + name, getLoc("full_bright_button"), "color", getLoc(color));
//        singleTexture("block/button/" + name + "_pressed", getLoc("full_bright_button_pressed"), "color", getLoc(color));
//        singleTexture("block/button/" + name + "_inventory", getLoc("full_bright_button_inventory"), "color", getLoc(color));
//    }
//
//    private void makePressurePlate(String name, String color) {
//        singleTexture("block/pressure_plate/" + name, getLoc("full_bright_pressure_plate_up"), "color", getLoc(color));
//        singleTexture("block/pressure_plate/" + name + "_down", getLoc("full_bright_pressure_plate_down"), "color", getLoc(color));
//    }
//}
