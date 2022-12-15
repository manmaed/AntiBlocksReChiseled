package net.manmaed.antiblocksrechiseled;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.manmaed.antiblocksrechiseled.block.ABRCBrightColors;
import net.manmaed.antiblocksrechiseled.block.ABRCWoolColors;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AntiBlocksReChiseled implements ModInitializer {

    public static final String MOD_ID = "antiblocksrechiseled";


    public static final ItemGroup itemGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "name"),
            () -> new ItemStack(ABRCBrightColors.BRIGHT_WHITE_BORDER));

    @Override
    public void onInitialize() {
        ABRCBrightColors.doBlockRegistery();
        ABRCBrightColors.doBlockItemRegistery();
        ABRCWoolColors.doBlockRegistery();
        ABRCWoolColors.doBlockItemRegistery();

    }
}
