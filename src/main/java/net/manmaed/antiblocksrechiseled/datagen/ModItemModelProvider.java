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


        makeBlock("slab_bright_white");
        makeBlock("slab_bright_black");
        makeBlock("slab_bright_orange");
        makeBlock("slab_bright_magenta");
        makeBlock("slab_bright_yellow");
        makeBlock("slab_bright_cyan");
        makeBlock("slab_bright_blue");
        makeBlock("slab_bright_green");
        makeBlock("slab_bright_red");
        makeBlock("slab_wool_white");
        makeBlock("slab_wool_orange");
        makeBlock("slab_wool_magenta");
        makeBlock("slab_wool_light_blue");
        makeBlock("slab_wool_yellow");
        makeBlock("slab_wool_lime");
        makeBlock("slab_wool_pink");
        makeBlock("slab_wool_gray");
        makeBlock("slab_wool_light_gray");
        makeBlock("slab_wool_cyan");
        makeBlock("slab_wool_purple");
        makeBlock("slab_wool_blue");
        makeBlock("slab_wool_brown");
        makeBlock("slab_wool_green");
        makeBlock("slab_wool_red");

        makeBlock("stair_bright_white");
        makeBlock("stair_bright_black");
        makeBlock("stair_bright_orange");
        makeBlock("stair_bright_magenta");
        makeBlock("stair_bright_yellow");
        makeBlock("stair_bright_cyan");
        makeBlock("stair_bright_blue");
        makeBlock("stair_bright_green");
        makeBlock("stair_bright_red");
        makeBlock("stair_wool_white");
        makeBlock("stair_wool_orange");
        makeBlock("stair_wool_magenta");
        makeBlock("stair_wool_light_blue");
        makeBlock("stair_wool_yellow");
        makeBlock("stair_wool_lime");
        makeBlock("stair_wool_pink");
        makeBlock("stair_wool_gray");
        makeBlock("stair_wool_light_gray");
        makeBlock("stair_wool_cyan");
        makeBlock("stair_wool_purple");
        makeBlock("stair_wool_blue");
        makeBlock("stair_wool_brown");
        makeBlock("stair_wool_green");
        makeBlock("stair_wool_red");

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

        makeBlock("pressure_plate_bright_white");
        makeBlock("pressure_plate_bright_orange");
        makeBlock("pressure_plate_bright_magenta");
        makeBlock("pressure_plate_bright_yellow");
        makeBlock("pressure_plate_bright_cyan");
        makeBlock("pressure_plate_bright_blue");
        makeBlock("pressure_plate_bright_green");
        makeBlock("pressure_plate_bright_red");
        makeBlock("pressure_plate_bright_black");
        makeBlock("pressure_plate_wool_white");
        makeBlock("pressure_plate_wool_orange");
        makeBlock("pressure_plate_wool_magenta");
        makeBlock("pressure_plate_wool_light_blue");
        makeBlock("pressure_plate_wool_yellow");
        makeBlock("pressure_plate_wool_lime");
        makeBlock("pressure_plate_wool_pink");
        makeBlock("pressure_plate_wool_gray");
        makeBlock("pressure_plate_wool_light_gray");
        makeBlock("pressure_plate_wool_cyan");
        makeBlock("pressure_plate_wool_purple");
        makeBlock("pressure_plate_wool_blue");
        makeBlock("pressure_plate_wool_brown");
        makeBlock("pressure_plate_wool_green");
        makeBlock("pressure_plate_wool_red");

    }


    public void makeBlock(String name) {
        withExistingParent(name, getLoc(name));
    }

    public void makeButton(String name) {
        withExistingParent(name, getLoc(name + "_inventory"));
    }
}
