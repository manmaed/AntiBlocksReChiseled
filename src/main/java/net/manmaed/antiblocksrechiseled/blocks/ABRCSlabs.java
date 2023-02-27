package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.items.AnitBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ABRCSlabs {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AntiBlocksReChiseled.MOD_ID);

    /*
    * Block:     public static final RegistryObject<Block> BRIGHT_WHITE = BLOCKS.register("bright_white", AntiBlock::new);
    * BlockItem: public static final RegistryObject<Item> BRIGHT_WHITE_ITEM = ITEMS.register("bright_white", () -> new AnitBlockItem(BRIGHT_WHITE.get()));
     */

    public static final RegistryObject<Block> SLAB_WHITE = BLOCKS.register("slab_white", AntiSlabBlock::new);

    public static final RegistryObject<Item> SLAB_WHITE_ITEM = ITEMS.register("slab_white", () -> new AnitBlockItem(SLAB_WHITE.get()));
}
