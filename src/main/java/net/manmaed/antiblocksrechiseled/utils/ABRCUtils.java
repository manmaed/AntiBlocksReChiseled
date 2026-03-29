package net.manmaed.antiblocksrechiseled.utils;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.resources.Identifier;

/**
 * Made by manmaed on 28/03/2026
 */

public class ABRCUtils {

    public static Identifier ident(String name) {
        return Identifier.fromNamespaceAndPath(AntiBlocksReChiseled.MOD_ID, name);
    }
}
