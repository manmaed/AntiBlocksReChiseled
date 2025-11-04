package net.manmaed.antiblocksrechiseled.blocks;

import net.neoforged.bus.api.IEventBus;

/**
 * Made by manmaed on 04/09/2025
 */

public class ABRCBlocksAndItems {
    public static void init(IEventBus e) {
        ABRCWoolColors.init(e);
        ABRCBrightColors.init(e);
        ABRCSlabs.init(e);
        ABRCStairs.init(e);
        ABRCButtons.init(e);
        ABRCPressurePlates.init(e);
    }
}

