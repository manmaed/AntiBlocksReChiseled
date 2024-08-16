package net.manmaed.antiblocksrechiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    private Identifier getLoc(String loc) {
        return Identifier.of(AntiBlocksReChiseled.MOD_ID, "block/" + loc);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        /*itemModelGenerator.register();
        ModItemModel.makeBlock("a" ,"b");
        itemModelGenerator.register();
        itemModelGenerator*/
    }


    private class ModItemModel {
        public void makeBlock(String type, String name) {

        }
    }

    private class ModBlockModel {
    }
}
