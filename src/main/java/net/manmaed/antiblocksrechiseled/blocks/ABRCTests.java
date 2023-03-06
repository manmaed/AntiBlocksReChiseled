package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ABRCTests {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AntiBlocksReChiseled.MOD_ID);

    /*
     * Block:     public static final RegistryObject<Block> BRIGHT_WHITE = BLOCKS.register("bright_white", AntiBlock::new);
     * BlockItem: public static final RegistryObject<Item> BRIGHT_WHITE_ITEM = ITEMS.register("bright_white", () -> new AntiBlockItem(BRIGHT_WHITE.get()));
     */

    /* LIST OF COLORS:
BRIGHT_WHITE
BRIGHT_ORANGE
BRIGHT_MAGENTA
BRIGHT_YELLOW
BRIGHT_CYAN
BRIGHT_BLUE
BRIGHT_GREEN
BRIGHT_RED
BRIGHT_BLACK
WOOL_WHITE
WOOL_ORANGE
WOOL_MAGENTA
WOOL_LIGHT_BLUE
WOOL_YELLOW
WOOL_LIME
WOOL_PINK
WOOL_GRAY
WOOL_LIGHT_GRAY
WOOL_CYAN
WOOL_PURPLE
WOOL_BLUE
WOOL_BROWN
WOOL_GREEN
WOOL_RED
     */
    /**
     * TODO:
     * - TBD:
     * Crafting Tabels (TBD)
     * Chests (TBD)
     *
     * Doors (TBD)
     * Trap Door (TBD)
     */
    /*public static final RegistryObject<Block> TEST_TABLE = BLOCKS.register("table_white_bright", AntiCraftingTable::new);*/
    /*public static final RegistryObject<Item> TEST_TABLE_Item = ITEMS.register("table_white_bright", () -> new AntiBlockItem(TEST_TABLE.get()));*/

}
