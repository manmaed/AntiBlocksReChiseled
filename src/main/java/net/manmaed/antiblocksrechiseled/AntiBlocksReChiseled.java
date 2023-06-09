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

@Mod(AntiBlocksReChiseled.MOD_ID)
public class AntiBlocksReChiseled {

    public static final String MOD_ID = "antiblocksrechiseled";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final RegistryObject<CreativeModeTab> ABRC_TAB = CREATIVE_MODE_TABS.register(MOD_ID, () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ABRCBrightColors.BRIGHT_WHITE_BORDER.get()))
            .title(Component.translatable("itemGroup." + MOD_ID ))
            .displayItems((parameters, output) -> {
                for (Item item: ForgeRegistries.ITEMS.getValues()) {
                    if (item.getCreatorModId(item.getDefaultInstance()).equals(MOD_ID)) {
                        output.accept(item);
                    }
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
        /*ABRCTests.BLOCKS.register(event);
        ABRCTests.ITEMS.register(event);*/
        CREATIVE_MODE_TABS.register(event);

        /*event.addListener(this::createTab);*/
    }

    /*public void createTab(BuildCreativeModeTabContentsEvent event) {
        event.getTabKey()
        event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "creative_tab"), builder -> builder
                .icon(() -> new ItemStack(ABRCBrightColors.BRIGHT_WHITE_BORDER.get()))
                .title(Component.translatable("itemGroup." + MOD_ID))
                .displayItems((features, output, hasPrems) -> {
                    for (Item item : ForgeRegistries.ITEMS.getValues()) {
                        if (item.getCreatorModId(item.getDefaultInstance()).equals(MOD_ID)) {
                            //LogHelper.warn("This item is form this mod" + item.toString());
                            output.accept(item);
                        }
                    }
                })
        );
    }*/

}
