package net.manmaed.antiblocksrechiseled;

import net.manmaed.antiblocksrechiseled.blocks.ABRCBrightColors;
import net.manmaed.antiblocksrechiseled.blocks.ABRCWoolColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ABRCClient {

    public static void setRenderLayers(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_WHITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_ORANGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_MAGENTA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_YELLOW.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_CYAN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_BLUE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_GREEN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_RED.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_BLACK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_WHITE_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_CYAN_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_BLUE_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_GREEN_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_RED_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCBrightColors.BRIGHT_BLACK_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_WHITE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_ORANGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_MAGENTA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_LIGHT_BLUE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_YELLOW.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_LIME.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_PINK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_GRAY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_LIGHT_GRAY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_CYAN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_PURPLE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_BLUE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_BROWN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_GREEN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_RED.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_WHITE_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_ORANGE_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_MAGENTA_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_YELLOW_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_LIME_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_PINK_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_GRAY_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_CYAN_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_PURPLE_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_BLUE_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_BROWN_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_GREEN_BORDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ABRCWoolColors.WOOL_RED_BORDER.get(), RenderType.cutout());
    }
}