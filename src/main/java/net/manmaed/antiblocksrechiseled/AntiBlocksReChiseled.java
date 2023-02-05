package net.manmaed.antiblocksrechiseled;

import net.manmaed.antiblocksrechiseled.blocks.ABRCBrightColors;
import net.manmaed.antiblocksrechiseled.blocks.ABRCWoolColors;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(AntiBlocksReChiseled.MOD_ID)
public class AntiBlocksReChiseled {

    public static final String MOD_ID = "antiblocksrechiseled";

    public AntiBlocksReChiseled() {
        IEventBus event = FMLJavaModLoadingContext.get().getModEventBus();
        ABRCWoolColors.BLOCKS.register(event);
        ABRCBrightColors.BLOCKS.register(event);
        ABRCWoolColors.ITEMS.register(event);
        ABRCBrightColors.ITEMS.register(event);
        event.addListener(this::createTab);
    }

    public void createTab(CreativeModeTabEvent.Register event) {
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
    }

}
