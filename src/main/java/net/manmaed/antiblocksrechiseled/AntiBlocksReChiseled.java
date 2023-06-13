package net.manmaed.antiblocksrechiseled;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AntiBlocksReChiseled implements ModInitializer {

    public static final String MOD_ID = "antiblocksrechiseled";


    public static final RegistryKey<ItemGroup> itemGroup = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "item_group"));


    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, itemGroup, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ABRCBrightColors.BRIGHT_WHITE_BORDER.asItem()))
                .displayName(Text.translatable("itemGroup." + MOD_ID))
                .build());
        ABRCWoolColors.doRegistery();
        ABRCBrightColors.doRegistery();
        ABRCSlabs.doRegistery();
        ABRCStairs.doRegistery();
        ABRCButtons.doRegistery();
        ABRCPressurePlates.doRegistery();
    }
}
