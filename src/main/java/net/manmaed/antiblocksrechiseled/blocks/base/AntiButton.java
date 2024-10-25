package net.manmaed.antiblocksrechiseled.blocks.base;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;


public class AntiButton extends ButtonBlock {
    public AntiButton(String name) {
        super(BlockSetType.STONE,20,Settings.create()
                .noCollision()
                .strength(3.0F)
                .pistonBehavior(PistonBehavior.DESTROY)
                .requiresTool()
                .luminance(light -> 15)
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(AntiBlocksReChiseled.MOD_ID, name))));
    }

    @Override
    protected SoundEvent getClickSound(boolean powered) {
        return powered ? SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON : SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF;
    }
}
