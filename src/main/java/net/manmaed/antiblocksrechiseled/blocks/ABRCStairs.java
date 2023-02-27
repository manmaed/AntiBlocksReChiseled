package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.items.AnitBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ABRCStairs {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AntiBlocksReChiseled.MOD_ID);

    /*
     * Block:     public static final RegistryObject<Block> BRIGHT_WHITE = BLOCKS.register("bright_white", AntiBlock::new);
     * BlockItem: public static final RegistryObject<Item> BRIGHT_WHITE_ITEM = ITEMS.register("bright_white", () -> new AnitBlockItem(BRIGHT_WHITE.get()));
     */

    public static final RegistryObject<Block> STAIR_WHITE = BLOCKS.register("stair_white", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_WHITE.get().defaultBlockState()));
    /*public static final RegistryObject<Block> SLAB_ORANGE_BRIGHT = BLOCKS.register("bright_orange", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_MAGENTA = BLOCKS.register("bright_magenta", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_YELLOW = BLOCKS.register("bright_yellow", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_CYAN = BLOCKS.register("bright_cyan", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_BLUE = BLOCKS.register("bright_blue", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_GREEN = BLOCKS.register("bright_green", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_RED = BLOCKS.register("bright_red", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_BLACK = BLOCKS.register("bright_black", AntiBlock::new);
*/
    public static final RegistryObject<Item> STAIR_WHITE_ITEM = ITEMS.register("stair_white", () -> new AnitBlockItem(STAIR_WHITE.get()));
}
