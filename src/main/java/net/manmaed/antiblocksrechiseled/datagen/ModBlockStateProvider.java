package net.manmaed.antiblocksrechiseled.datagen;


import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
        super(packOutput, AntiBlocksReChiseled.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Bright Colors
        simpleBlock(ABRCBrightColors.BRIGHT_WHITE.get(), getFile("bright/white"));
        simpleBlock(ABRCBrightColors.BRIGHT_ORANGE.get(), getFile("bright/orange"));
        simpleBlock(ABRCBrightColors.BRIGHT_MAGENTA.get(), getFile("bright/magenta"));
        simpleBlock(ABRCBrightColors.BRIGHT_YELLOW.get(), getFile("bright/yellow"));
        simpleBlock(ABRCBrightColors.BRIGHT_CYAN.get(), getFile("bright/cyan"));
        simpleBlock(ABRCBrightColors.BRIGHT_BLUE.get(), getFile("bright/blue"));
        simpleBlock(ABRCBrightColors.BRIGHT_GREEN.get(), getFile("bright/green"));
        simpleBlock(ABRCBrightColors.BRIGHT_RED.get(), getFile("bright/red"));
        simpleBlock(ABRCBrightColors.BRIGHT_BLACK.get(), getFile("bright/black"));
        simpleBlock(ABRCBrightColors.BRIGHT_WHITE_BORDER.get(), getFile("bright/white_border"));
        simpleBlock(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get(), getFile("bright/orange_border"));
        simpleBlock(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get(), getFile("bright/magenta_border"));
        simpleBlock(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get(), getFile("bright/yellow_border"));
        simpleBlock(ABRCBrightColors.BRIGHT_CYAN_BORDER.get(), getFile("bright/cyan_border"));
        simpleBlock(ABRCBrightColors.BRIGHT_BLUE_BORDER.get(), getFile("bright/blue_border"));
        simpleBlock(ABRCBrightColors.BRIGHT_GREEN_BORDER.get(), getFile("bright/green_border"));
        simpleBlock(ABRCBrightColors.BRIGHT_RED_BORDER.get(), getFile("bright/red_border"));
        simpleBlock(ABRCBrightColors.BRIGHT_BLACK_BORDER.get(), getFile("bright/black_border"));

        //Wool Colors
        simpleBlock(ABRCWoolColors.WOOL_WHITE.get(), getFile("wool/white"));
        simpleBlock(ABRCWoolColors.WOOL_ORANGE.get(), getFile("wool/orange"));
        simpleBlock(ABRCWoolColors.WOOL_MAGENTA.get(), getFile("wool/magenta"));
        simpleBlock(ABRCWoolColors.WOOL_LIGHT_BLUE.get(), getFile("wool/light_blue"));
        simpleBlock(ABRCWoolColors.WOOL_YELLOW.get(), getFile("wool/yellow"));
        simpleBlock(ABRCWoolColors.WOOL_LIME.get(), getFile("wool/lime"));
        simpleBlock(ABRCWoolColors.WOOL_PINK.get(), getFile("wool/pink"));
        simpleBlock(ABRCWoolColors.WOOL_GRAY.get(), getFile("wool/gray"));
        simpleBlock(ABRCWoolColors.WOOL_LIGHT_GRAY.get(), getFile("wool/light_gray"));
        simpleBlock(ABRCWoolColors.WOOL_CYAN.get(), getFile("wool/cyan"));
        simpleBlock(ABRCWoolColors.WOOL_PURPLE.get(), getFile("wool/purple"));
        simpleBlock(ABRCWoolColors.WOOL_BLUE.get(), getFile("wool/blue"));
        simpleBlock(ABRCWoolColors.WOOL_BROWN.get(), getFile("wool/brown"));
        simpleBlock(ABRCWoolColors.WOOL_GREEN.get(), getFile("wool/green"));
        simpleBlock(ABRCWoolColors.WOOL_RED.get(), getFile("wool/red"));
        simpleBlock(ABRCWoolColors.WOOL_WHITE_BORDER.get(), getFile("wool/white_border"));
        simpleBlock(ABRCWoolColors.WOOL_ORANGE_BORDER.get(), getFile("wool/orange_border"));
        simpleBlock(ABRCWoolColors.WOOL_MAGENTA_BORDER.get(), getFile("wool/magenta_border"));
        simpleBlock(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get(), getFile("wool/light_blue_border"));
        simpleBlock(ABRCWoolColors.WOOL_YELLOW_BORDER.get(), getFile("wool/yellow_border"));
        simpleBlock(ABRCWoolColors.WOOL_LIME_BORDER.get(), getFile("wool/lime_border"));
        simpleBlock(ABRCWoolColors.WOOL_PINK_BORDER.get(), getFile("wool/pink_border"));
        simpleBlock(ABRCWoolColors.WOOL_GRAY_BORDER.get(), getFile("wool/gray_border"));
        simpleBlock(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get(), getFile("wool/light_gray_border"));
        simpleBlock(ABRCWoolColors.WOOL_CYAN_BORDER.get(), getFile("wool/cyan_border"));
        simpleBlock(ABRCWoolColors.WOOL_PURPLE_BORDER.get(), getFile("wool/purple_border"));
        simpleBlock(ABRCWoolColors.WOOL_BLUE_BORDER.get(), getFile("wool/blue_border"));
        simpleBlock(ABRCWoolColors.WOOL_BROWN_BORDER.get(), getFile("wool/brown_border"));
        simpleBlock(ABRCWoolColors.WOOL_GREEN_BORDER.get(), getFile("wool/green_border"));
        simpleBlock(ABRCWoolColors.WOOL_RED_BORDER.get(), getFile("wool/red_border"));


        myslabBlock(ABRCSlabs.SLAB_BRIGHT_WHITE.get(), "bright", "white");
        myslabBlock(ABRCSlabs.SLAB_BRIGHT_BLACK.get(), "bright", "black");
        myslabBlock(ABRCSlabs.SLAB_BRIGHT_ORANGE.get(), "bright", "orange");
        myslabBlock(ABRCSlabs.SLAB_BRIGHT_MAGENTA.get(), "bright", "magenta");
        myslabBlock(ABRCSlabs.SLAB_BRIGHT_YELLOW.get(), "bright", "yellow");
        myslabBlock(ABRCSlabs.SLAB_BRIGHT_CYAN.get(), "bright", "cyan");
        myslabBlock(ABRCSlabs.SLAB_BRIGHT_BLUE.get(), "bright", "blue");
        myslabBlock(ABRCSlabs.SLAB_BRIGHT_GREEN.get(), "bright", "green");
        myslabBlock(ABRCSlabs.SLAB_BRIGHT_RED.get(), "bright", "red");
        myslabBlock(ABRCSlabs.SLAB_WOOL_WHITE.get(), "wool", "white");
        myslabBlock(ABRCSlabs.SLAB_WOOL_ORANGE.get(), "wool", "orange");
        myslabBlock(ABRCSlabs.SLAB_WOOL_MAGENTA.get(), "wool", "magenta");
        myslabBlock(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.get(), "wool", "light_blue");
        myslabBlock(ABRCSlabs.SLAB_WOOL_YELLOW.get(), "wool", "yellow");
        myslabBlock(ABRCSlabs.SLAB_WOOL_LIME.get(), "wool", "lime");
        myslabBlock(ABRCSlabs.SLAB_WOOL_PINK.get(), "wool", "pink");
        myslabBlock(ABRCSlabs.SLAB_WOOL_GRAY.get(), "wool", "gray");
        myslabBlock(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.get(), "wool", "light_gray");
        myslabBlock(ABRCSlabs.SLAB_WOOL_CYAN.get(), "wool", "cyan");
        myslabBlock(ABRCSlabs.SLAB_WOOL_PURPLE.get(), "wool", "purple");
        myslabBlock(ABRCSlabs.SLAB_WOOL_BLUE.get(), "wool", "blue");
        myslabBlock(ABRCSlabs.SLAB_WOOL_BROWN.get(), "wool", "brown");
        myslabBlock(ABRCSlabs.SLAB_WOOL_GREEN.get(), "wool", "green");
        myslabBlock(ABRCSlabs.SLAB_WOOL_RED.get(), "wool", "red");

        mystairsBlock(ABRCStairs.STAIR_BRIGHT_WHITE.get(), "stair_bright_white");
        mystairsBlock(ABRCStairs.STAIR_BRIGHT_BLACK.get(), "stair_bright_black");
        mystairsBlock(ABRCStairs.STAIR_BRIGHT_ORANGE.get(), "stair_bright_orange");
        mystairsBlock(ABRCStairs.STAIR_BRIGHT_MAGENTA.get(), "stair_bright_magenta");
        mystairsBlock(ABRCStairs.STAIR_BRIGHT_YELLOW.get(), "stair_bright_yellow");
        mystairsBlock(ABRCStairs.STAIR_BRIGHT_CYAN.get(), "stair_bright_cyan");
        mystairsBlock(ABRCStairs.STAIR_BRIGHT_BLUE.get(), "stair_bright_blue");
        mystairsBlock(ABRCStairs.STAIR_BRIGHT_GREEN.get(), "stair_bright_green");
        mystairsBlock(ABRCStairs.STAIR_BRIGHT_RED.get(), "stair_bright_red");
        mystairsBlock(ABRCStairs.STAIR_WOOL_WHITE.get(), "stair_wool_white");
        mystairsBlock(ABRCStairs.STAIR_WOOL_ORANGE.get(), "stair_wool_orange");
        mystairsBlock(ABRCStairs.STAIR_WOOL_MAGENTA.get(), "stair_wool_magenta");
        mystairsBlock(ABRCStairs.STAIR_WOOL_LIGHT_BLUE.get(), "stair_wool_light_blue");
        mystairsBlock(ABRCStairs.STAIR_WOOL_YELLOW.get(), "stair_wool_yellow");
        mystairsBlock(ABRCStairs.STAIR_WOOL_LIME.get(), "stair_wool_lime");
        mystairsBlock(ABRCStairs.STAIR_WOOL_PINK.get(), "stair_wool_pink");
        mystairsBlock(ABRCStairs.STAIR_WOOL_GRAY.get(), "stair_wool_gray");
        mystairsBlock(ABRCStairs.STAIR_WOOL_LIGHT_GRAY.get(), "stair_wool_light_gray");
        mystairsBlock(ABRCStairs.STAIR_WOOL_CYAN.get(), "stair_wool_cyan");
        mystairsBlock(ABRCStairs.STAIR_WOOL_PURPLE.get(), "stair_wool_purple");
        mystairsBlock(ABRCStairs.STAIR_WOOL_BLUE.get(), "stair_wool_blue");
        mystairsBlock(ABRCStairs.STAIR_WOOL_BROWN.get(), "stair_wool_brown");
        mystairsBlock(ABRCStairs.STAIR_WOOL_GREEN.get(), "stair_wool_green");
        mystairsBlock(ABRCStairs.STAIR_WOOL_RED.get(), "stair_wool_red");

        myButtonBlock(ABRCButtons.BUTTON_BRIGHT_WHITE.get(), "button_bright_white");
        myButtonBlock(ABRCButtons.BUTTON_BRIGHT_ORANGE.get(), "button_bright_orange");
        myButtonBlock(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get(), "button_bright_magenta");
        myButtonBlock(ABRCButtons.BUTTON_BRIGHT_YELLOW.get(), "button_bright_yellow");
        myButtonBlock(ABRCButtons.BUTTON_BRIGHT_CYAN.get(), "button_bright_cyan");
        myButtonBlock(ABRCButtons.BUTTON_BRIGHT_BLUE.get(), "button_bright_blue");
        myButtonBlock(ABRCButtons.BUTTON_BRIGHT_GREEN.get(), "button_bright_green");
        myButtonBlock(ABRCButtons.BUTTON_BRIGHT_RED.get(), "button_bright_red");
        myButtonBlock(ABRCButtons.BUTTON_BRIGHT_BLACK.get(), "button_bright_black");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_WHITE.get(), "button_wool_white");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_ORANGE.get(), "button_wool_orange");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_MAGENTA.get(), "button_wool_magenta");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get(), "button_wool_light_blue");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_YELLOW.get(), "button_wool_yellow");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_LIME.get(), "button_wool_lime");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_PINK.get(), "button_wool_pink");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_GRAY.get(), "button_wool_gray");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get(), "button_wool_light_gray");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_CYAN.get(), "button_wool_cyan");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_PURPLE.get(), "button_wool_purple");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_BLUE.get(), "button_wool_blue");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_BROWN.get(), "button_wool_brown");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_GREEN.get(), "button_wool_green");
        myButtonBlock(ABRCButtons.BUTTON_WOOL_RED.get(), "button_wool_red");

        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get(), "pressure_plate_bright_white");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get(), "pressure_plate_bright_orange");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get(), "pressure_plate_bright_magenta");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get(), "pressure_plate_bright_yellow");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get(), "pressure_plate_bright_cyan");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get(), "pressure_plate_bright_blue");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get(), "pressure_plate_bright_green");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get(), "pressure_plate_bright_red");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get(), "pressure_plate_bright_black");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get(), "pressure_plate_wool_white");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get(), "pressure_plate_wool_orange");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get(), "pressure_plate_wool_magenta");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get(), "pressure_plate_wool_light_blue");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get(), "pressure_plate_wool_yellow");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get(), "pressure_plate_wool_lime");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get(), "pressure_plate_wool_pink");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get(), "pressure_plate_wool_gray");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get(), "pressure_plate_wool_light_gray");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get(), "pressure_plate_wool_cyan");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get(), "pressure_plate_wool_purple");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get(), "pressure_plate_wool_blue");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get(), "pressure_plate_wool_brown");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get(), "pressure_plate_wool_green");
        myPressurePlateBlock(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get(), "pressure_plate_wool_red");
    }

    public void mystairsBlock(Block block, String name) {
        String model = "stair/" + name;
        ModelFile stairs = getFile(model);
        ModelFile stairsInner = getFile(model + "_inner");
        ModelFile stairsOuter = getFile(model + "_outer");
        getVariantBuilder(block)
                .forAllStatesExcept(state -> {
                    Direction facing = state.getValue(StairBlock.FACING);
                    Half half = state.getValue(StairBlock.HALF);
                    StairsShape shape = state.getValue(StairBlock.SHAPE);
                    int yRot = (int) facing.getClockWise().toYRot(); // Stairs model is rotated 90 degrees clockwise for some reason
                    if (shape == StairsShape.INNER_LEFT || shape == StairsShape.OUTER_LEFT) {
                        yRot += 270; // Left facing stairs are rotated 90 degrees clockwise
                    }
                    if (shape != StairsShape.STRAIGHT && half == Half.TOP) {
                        yRot += 90; // Top stairs are rotated 90 degrees clockwise
                    }
                    yRot %= 360;
                    boolean uvlock = yRot != 0 || half == Half.TOP; // Don't set uvlock for states that have no rotation
                    return ConfiguredModel.builder()
                            .modelFile(shape == StairsShape.STRAIGHT ? stairs : shape == StairsShape.INNER_LEFT || shape == StairsShape.INNER_RIGHT ? stairsInner : stairsOuter)
                            .rotationX(half == Half.BOTTOM ? 0 : 180)
                            .rotationY(yRot)
                            .uvLock(uvlock)
                            .build();
                }, StairBlock.WATERLOGGED);
    }

    public void myslabBlock(Block block,String type, String color) {
        //ModelFile bottom, ModelFile top, ModelFile doubleslab
        String full = type + "_" + color;
        ModelFile bottom = getFile("slab/slab_" + full);
        ModelFile top = getFile("slab/slab_" + full + "_top");
        ModelFile doubleslab = getFile(type + "/" + color);
        getVariantBuilder(block)
                .partialState().with(SlabBlock.TYPE, SlabType.BOTTOM).addModels(new ConfiguredModel(bottom))
                .partialState().with(SlabBlock.TYPE, SlabType.TOP).addModels(new ConfiguredModel(top))
                .partialState().with(SlabBlock.TYPE, SlabType.DOUBLE).addModels(new ConfiguredModel(doubleslab));
    }

    public void myButtonBlock(Block block, String name) {
        String model = "button/" + name;
        ModelFile button = getFile(model);
        ModelFile buttonPressed = getFile(model + "_pressed");
        getVariantBuilder(block).forAllStates(state -> {
            Direction facing = state.getValue(ButtonBlock.FACING);
            AttachFace face = state.getValue(ButtonBlock.FACE);
            boolean powered = state.getValue(ButtonBlock.POWERED);

            return ConfiguredModel.builder()
                    .modelFile(powered ? buttonPressed : button)
                    .rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180))
                    .rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot())
                    .uvLock(face == AttachFace.WALL)
                    .build();
        });
    }

    public void myPressurePlateBlock(Block block, String name) {
        String model = "pressure_plate/" + name;
        ModelFile pressurePlate = getFile(model);
        ModelFile pressurePlateDown = getFile(model + "_down");
        getVariantBuilder(block)
                .partialState().with(PressurePlateBlock.POWERED, true).addModels(new ConfiguredModel(pressurePlateDown))
                .partialState().with(PressurePlateBlock.POWERED, false).addModels(new ConfiguredModel(pressurePlate));
    }

    private ModelFile getFile(String name) {
        return models().getBuilder(AntiBlocksReChiseled.MOD_ID + ":block/" + name);
    }
}
