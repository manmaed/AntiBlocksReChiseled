package net.manmaed.antiblocksrechiseled.blocks.base;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.ToIntFunction;


public class AntiButton extends ButtonBlock {
    public AntiButton() {
        super(Settings.create()
                .noCollision()
                .strength(3.0F)
                .pistonBehavior(PistonBehavior.DESTROY)
                .requiresTool()
                .luminance(light -> 15), BlockSetType.STONE, 20, false);
    }

    @Override
    protected SoundEvent getClickSound(boolean powered) {
        return powered ? SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON : SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF;
    }
}
