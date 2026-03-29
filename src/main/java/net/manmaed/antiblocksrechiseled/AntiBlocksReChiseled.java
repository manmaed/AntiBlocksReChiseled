package net.manmaed.antiblocksrechiseled;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.manmaed.antiblocksrechiseled.utils.ABRCUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.Arrays;
import java.util.List;

public class AntiBlocksReChiseled implements ModInitializer {

    public static final String MOD_ID = "antiblocksrechiseled";


    public static final ResourceKey<CreativeModeTab> CREATIVE_MODE_TABS = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ABRCUtils.ident("creative_tab"));
    public static final CreativeModeTab ABRC_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ABRCBrightColors.BRIGHT_WHITE_BORDER))
            .title(Component.translatable("itemGroup." + MOD_ID))
            .build();

    @Override
    public void onInitialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CREATIVE_MODE_TABS, ABRC_TAB);
        ABRCBlocksAndItems.init();
    }
}
