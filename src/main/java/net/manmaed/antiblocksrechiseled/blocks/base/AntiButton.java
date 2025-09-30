package net.manmaed.antiblocksrechiseled.blocks.base;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.PushReaction;

public class AntiButton extends ButtonBlock {
    public AntiButton(String name) {
        super(BlockSetType.STONE, 20,Properties.of().noCollision().strength(3.0F).pushReaction(PushReaction.DESTROY).requiresCorrectToolForDrops().lightLevel((light) -> {
            return 15;
        }).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(AntiBlocksReChiseled.MOD_ID, name))));
    }

    @Override
    protected SoundEvent getSound(boolean loneztar) {
        return loneztar ? SoundEvents.STONE_BUTTON_CLICK_ON : SoundEvents.STONE_BUTTON_CLICK_OFF;
    }
}
