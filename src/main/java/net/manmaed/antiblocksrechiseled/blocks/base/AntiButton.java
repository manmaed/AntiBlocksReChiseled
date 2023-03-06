package net.manmaed.antiblocksrechiseled.blocks.base;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.material.Material;

public class AntiButton extends ButtonBlock {
    public AntiButton() {
        super(false, Properties.of(Material.STONE).strength(3.0F, 5.0F).requiresCorrectToolForDrops().lightLevel((light) -> {
            return 15;
        }));
    }

    @Override
    protected SoundEvent getSound(boolean loneztar) {
        return loneztar ? SoundEvents.STONE_BUTTON_CLICK_ON : SoundEvents.STONE_BUTTON_CLICK_OFF;
    }
}
