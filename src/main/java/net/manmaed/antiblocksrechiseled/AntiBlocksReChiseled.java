package net.manmaed.antiblocksrechiseled;

import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.List;

@Mod(AntiBlocksReChiseled.MOD_ID)
public class AntiBlocksReChiseled {

    public static final String MOD_ID = "antiblocksrechiseled";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final RegistryObject<CreativeModeTab> ABRC_TAB = CREATIVE_MODE_TABS.register(MOD_ID, () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ABRCBrightColors.BRIGHT_WHITE_BORDER.get()))
            .title(Component.translatable("itemGroup." + MOD_ID ))
            .displayItems((parameters, output) -> {
                List<DeferredRegister<Item>> myItems = Arrays.asList(
                        ABRCWoolColors.ITEMS,
                        ABRCBrightColors.ITEMS,
                        ABRCSlabs.ITEMS,
                        ABRCStairs.ITEMS,
                        ABRCButtons.ITEMS,
                        ABRCPressurePlates.ITEMS
                );
                for (DeferredRegister<Item> register : myItems) {
                    register.getEntries().forEach(entry -> output.accept(entry.get()));
                }
            })
            .build());

    public AntiBlocksReChiseled() {
        IEventBus event = FMLJavaModLoadingContext.get().getModEventBus();
        ABRCWoolColors.BLOCKS.register(event);
        ABRCBrightColors.BLOCKS.register(event);
        ABRCSlabs.BLOCKS.register(event);
        ABRCStairs.BLOCKS.register(event);
        ABRCButtons.BLOCKS.register(event);
        ABRCPressurePlates.BLOCKS.register(event);
        ABRCWoolColors.ITEMS.register(event);
        ABRCBrightColors.ITEMS.register(event);
        ABRCSlabs.ITEMS.register(event);
        ABRCStairs.ITEMS.register(event);
        ABRCButtons.ITEMS.register(event);
        ABRCPressurePlates.ITEMS.register(event);
        CREATIVE_MODE_TABS.register(event);
    }
}
