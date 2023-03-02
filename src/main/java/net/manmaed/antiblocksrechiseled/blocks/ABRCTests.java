package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiCraftingTable;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ABRCTests {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AntiBlocksReChiseled.MOD_ID);


    /*
     * Block:     public static final RegistryObject<Block> BRIGHT_WHITE = BLOCKS.register("bright_white", AntiBlock::new);
     * BlockItem: public static final RegistryObject<Item> BRIGHT_WHITE_ITEM = ITEMS.register("bright_white", () -> new AntiBlockItem(BRIGHT_WHITE.get()));
     */

    //TODO: Buttons, Crafting Tabes, Chests, Presher Plates, Doors, Trap Door
    public static final RegistryObject<Block> TEST_TABLE = BLOCKS.register("table_white_bright", AntiCraftingTable::new);
    public static final RegistryObject<Item> TEST_TABLE_Item = ITEMS.register("table_white_bright", () -> new AntiBlockItem(TEST_TABLE.get()));

    public static final RegistryObject<Block> TEST_BUTTON = BLOCKS.register("button_white_bright", () -> new ButtonBlock(false,Properties.of(Material.STONE).strength(3.0F, 5.0F).requiresCorrectToolForDrops().lightLevel((light) -> {
        return 15;
    })) {
        @Override
        protected SoundEvent getSound(boolean arandombool) {
            return arandombool ? SoundEvents.STONE_BUTTON_CLICK_ON : SoundEvents.STONE_BUTTON_CLICK_OFF;
        }
    });

    public static final RegistryObject<Item> TEST_BUTTON_ITEM = ITEMS.register("button_white_bright", () -> new AntiBlockItem(TEST_BUTTON.get()));

}
