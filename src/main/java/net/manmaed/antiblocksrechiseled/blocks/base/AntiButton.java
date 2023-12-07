package net.manmaed.antiblocksrechiseled.blocks.base;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.PushReaction;

public class AntiButton extends ButtonBlock {
    public AntiButton() {
        super(BlockSetType.STONE, 20,Properties.of().noCollission().strength(3.0F).pushReaction(PushReaction.DESTROY).requiresCorrectToolForDrops().lightLevel((light) -> {
            return 15;
        }));
    }

    @Override
    protected SoundEvent getSound(boolean loneztar) {
        return loneztar ? SoundEvents.STONE_BUTTON_CLICK_ON : SoundEvents.STONE_BUTTON_CLICK_OFF;
    }
}
