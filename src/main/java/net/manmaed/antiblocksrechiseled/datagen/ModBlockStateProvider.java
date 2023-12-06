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


        myslabBlock(ABRCSlabs.SLAB_WHITE_BRIGHT.get(), getFile("slab/slab_white_bright"), getFile("slab/slab_white_bright_top"), getFile("bright/white"));
        myslabBlock(ABRCSlabs.SLAB_BLACK.get(), getFile("slab/slab_black"), getFile("slab/slab_black_top"), getFile("bright/black"));
        myslabBlock(ABRCSlabs.SLAB_ORANGE_BRIGHT.get(), getFile("slab/slab_orange_bright"), getFile("slab/slab_orange_bright_top"), getFile("bright/orange"));
        myslabBlock(ABRCSlabs.SLAB_MAGENTA_BRIGHT.get(), getFile("slab/slab_magenta_bright"), getFile("slab/slab_magenta_bright_top"), getFile("bright/magenta"));
        myslabBlock(ABRCSlabs.SLAB_YELLOW_BRIGHT.get(), getFile("slab/slab_yellow_bright"), getFile("slab/slab_yellow_bright_top"), getFile("bright/yellow"));
        myslabBlock(ABRCSlabs.SLAB_CYAN_BRIGHT.get(), getFile("slab/slab_cyan_bright"), getFile("slab/slab_cyan_bright_top"), getFile("bright/cyan"));
        myslabBlock(ABRCSlabs.SLAB_BLUE_BRIGHT.get(), getFile("slab/slab_blue_bright"), getFile("slab/slab_blue_bright_top"), getFile("bright/blue"));
        myslabBlock(ABRCSlabs.SLAB_GREEN_BRIGHT.get(), getFile("slab/slab_green_bright"), getFile("slab/slab_green_bright_top"), getFile("bright/green"));
        myslabBlock(ABRCSlabs.SLAB_RED_BRIGHT.get(), getFile("slab/slab_red_bright"), getFile("slab/slab_red_bright_top"), getFile("bright/red"));
        myslabBlock(ABRCSlabs.SLAB_WHITE_WOOL.get(), getFile("slab/slab_white_wool"), getFile("slab/slab_white_wool_top"), getFile("wool/white"));
        myslabBlock(ABRCSlabs.SLAB_ORANGE_WOOL.get(), getFile("slab/slab_orange_wool"), getFile("slab/slab_orange_wool_top"), getFile("wool/orange"));
        myslabBlock(ABRCSlabs.SLAB_MAGENTA_WOOL.get(), getFile("slab/slab_magenta_wool"), getFile("slab/slab_magenta_wool_top"), getFile("wool/magenta"));
        myslabBlock(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.get(), getFile("slab/slab_light_blue_wool"), getFile("slab/slab_light_blue_wool_top"), getFile("wool/light_blue"));
        myslabBlock(ABRCSlabs.SLAB_YELLOW_WOOL.get(), getFile("slab/slab_yellow_wool"), getFile("slab/slab_yellow_wool_top"), getFile("wool/yellow"));
        myslabBlock(ABRCSlabs.SLAB_LIME_WOOL.get(), getFile("slab/slab_lime_wool"), getFile("slab/slab_lime_wool_top"), getFile("wool/lime"));
        myslabBlock(ABRCSlabs.SLAB_PINK_WOOL.get(), getFile("slab/slab_pink_wool"), getFile("slab/slab_pink_wool_top"), getFile("wool/pink"));
        myslabBlock(ABRCSlabs.SLAB_GRAY_WOOL.get(), getFile("slab/slab_gray_wool"), getFile("slab/slab_gray_wool_top"), getFile("wool/gray"));
        myslabBlock(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.get(), getFile("slab/slab_light_gray_wool"), getFile("slab/slab_light_gray_wool_top"), getFile("wool/light_gray"));
        myslabBlock(ABRCSlabs.SLAB_CYAN_WOOL.get(), getFile("slab/slab_cyan_wool"), getFile("slab/slab_cyan_wool_top"), getFile("wool/cyan"));
        myslabBlock(ABRCSlabs.SLAB_PURPLE_WOOL.get(), getFile("slab/slab_purple_wool"), getFile("slab/slab_purple_wool_top"), getFile("wool/purple"));
        myslabBlock(ABRCSlabs.SLAB_BLUE_WOOL.get(), getFile("slab/slab_blue_wool"), getFile("slab/slab_blue_wool_top"), getFile("wool/blue"));
        myslabBlock(ABRCSlabs.SLAB_BROWN_WOOL.get(), getFile("slab/slab_brown_wool"), getFile("slab/slab_brown_wool_top"), getFile("wool/brown"));
        myslabBlock(ABRCSlabs.SLAB_GREEN_WOOL.get(), getFile("slab/slab_green_wool"), getFile("slab/slab_green_wool_top"), getFile("wool/green"));
        myslabBlock(ABRCSlabs.SLAB_RED_WOOL.get(), getFile("slab/slab_red_wool"), getFile("slab/slab_red_wool_top"), getFile("wool/red"));

        mystairsBlock(ABRCStairs.STAIR_WHITE_BRIGHT.get(), "stair_white_bright");
        mystairsBlock(ABRCStairs.STAIR_BLACK.get(), "stair_black");
        mystairsBlock(ABRCStairs.STAIR_ORANGE_BRIGHT.get(), "stair_orange_bright");
        mystairsBlock(ABRCStairs.STAIR_MAGENTA_BRIGHT.get(), "stair_magenta_bright");
        mystairsBlock(ABRCStairs.STAIR_YELLOW_BRIGHT.get(), "stair_yellow_bright");
        mystairsBlock(ABRCStairs.STAIR_CYAN_BRIGHT.get(), "stair_cyan_bright");
        mystairsBlock(ABRCStairs.STAIR_BLUE_BRIGHT.get(), "stair_blue_bright");
        mystairsBlock(ABRCStairs.STAIR_GREEN_BRIGHT.get(), "stair_green_bright");
        mystairsBlock(ABRCStairs.STAIR_RED_BRIGHT.get(), "stair_red_bright");
        mystairsBlock(ABRCStairs.STAIR_WHITE_WOOL.get(), "stair_white_wool");
        mystairsBlock(ABRCStairs.STAIR_ORANGE_WOOL.get(), "stair_orange_wool");
        mystairsBlock(ABRCStairs.STAIR_MAGENTA_WOOL.get(), "stair_magenta_wool");
        mystairsBlock(ABRCStairs.STAIR_LIGHT_BLUE_WOOL.get(), "stair_light_blue_wool");
        mystairsBlock(ABRCStairs.STAIR_YELLOW_WOOL.get(), "stair_yellow_wool");
        mystairsBlock(ABRCStairs.STAIR_LIME_WOOL.get(), "stair_lime_wool");
        mystairsBlock(ABRCStairs.STAIR_PINK_WOOL.get(), "stair_pink_wool");
        mystairsBlock(ABRCStairs.STAIR_GRAY_WOOL.get(), "stair_gray_wool");
        mystairsBlock(ABRCStairs.STAIR_LIGHT_GRAY_WOOL.get(), "stair_light_gray_wool");
        mystairsBlock(ABRCStairs.STAIR_CYAN_WOOL.get(), "stair_cyan_wool");
        mystairsBlock(ABRCStairs.STAIR_PURPLE_WOOL.get(), "stair_purple_wool");
        mystairsBlock(ABRCStairs.STAIR_BLUE_WOOL.get(), "stair_blue_wool");
        mystairsBlock(ABRCStairs.STAIR_BROWN_WOOL.get(), "stair_brown_wool");
        mystairsBlock(ABRCStairs.STAIR_GREEN_WOOL.get(), "stair_green_wool");
        mystairsBlock(ABRCStairs.STAIR_RED_WOOL.get(), "stair_red_wool");

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

    public void myslabBlock(Block block, ModelFile bottom, ModelFile top, ModelFile doubleslab) {
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
