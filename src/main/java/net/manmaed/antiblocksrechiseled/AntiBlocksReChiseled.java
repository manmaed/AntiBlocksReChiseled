package net.manmaed.antiblocksrechiseled;

import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AntiBlocksReChiseled.MOD_ID)
public class AntiBlocksReChiseled {

    public static final String MOD_ID = "antiblocksrechiseled";
    public static final CreativeModeTab itemGroup = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ABRCBrightColors.BRIGHT_WHITE_BORDER.get());
        }
    };

    public AntiBlocksReChiseled() {
        IEventBus event = FMLJavaModLoadingContext.get().getModEventBus();
        ABRCWoolColors.BLOCKS.register(event);
        ABRCBrightColors.BLOCKS.register(event);
        ABRCSlabs.BLOCKS.register(event);
        ABRCStairs.BLOCKS.register(event);
        ABRCWoolColors.ITEMS.register(event);
        ABRCBrightColors.ITEMS.register(event);
        ABRCSlabs.ITEMS.register(event);
        ABRCStairs.ITEMS.register(event);
        ABRCTests.BLOCKS.register(event);
        ABRCTests.ITEMS.register(event);
    }

}
