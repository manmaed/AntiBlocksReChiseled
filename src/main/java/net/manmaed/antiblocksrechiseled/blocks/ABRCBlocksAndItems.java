package net.manmaed.antiblocksrechiseled.blocks;


import net.minecraftforge.eventbus.api.bus.BusGroup;

/**
 * Made by manmaed on 04/09/2025
 */

public class ABRCBlocksAndItems {
    public static void init(BusGroup e) {
        ABRCWoolColors.init(e);
        ABRCBrightColors.init(e);
        ABRCSlabs.init(e);
        ABRCStairs.init(e);
        ABRCButtons.init(e);
        ABRCPressurePlates.init(e);
    }
}
