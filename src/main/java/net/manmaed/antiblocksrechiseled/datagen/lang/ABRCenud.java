package net.manmaed.antiblocksrechiseled.datagen.lang;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ABRCenud extends FabricLanguageProvider {

    public ABRCenud(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput,"en_ud", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, FabricLanguageProvider.TranslationBuilder translation) {
        translation.add("a.lang.file.name", "ɥsᴉꞁᵷuƎ (uʍoᗡ ǝpᴉsd∩)");
        translation.add("a.lang.author.name", "ChatGPT");
        translation.add("itemGroup.antiblocksrechiseled", "pǝlǝsᴉɥɔǝɹ sʞɔןoꞁʇᴉ∀");

        //Bright
        translation.add(ABRCBrightColors.BRIGHT_WHITE.asItem(), "ʞɔןoqʇ∀ ǝᴉʇɥM ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_ORANGE.asItem(), "ʞɔןoqʇ∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_MAGENTA.asItem(), "ʞɔןoqʇ∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_YELLOW.asItem(), "ʞɔןoqʇ∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_CYAN.asItem(), "ʞɔןoqʇ∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_BLUE.asItem(), "ʞɔןoqʇ∀ ǝǝןq ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_GREEN.asItem(), "ʞɔןoqʇ∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_RED.asItem(), "ʞɔןoqʇ∀ pǝɹ ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_BLACK.asItem(), "ʞɔןoqʇ∀ ʞɔɐןq ʇɥƃᴉɹꞁ");

        //Borders
        translation.add(ABRCBrightColors.BRIGHT_WHITE_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ǝʇɥW ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_CYAN_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_BLUE_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ǝǝןq ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_GREEN_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq uǝǝɹƃ ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_RED_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq pǝɹ ʇɥƃᴉɹꞁ");
        translation.add(ABRCBrightColors.BRIGHT_BLACK_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ʞɔɐןq ʇɥƃᴉɹꞁ");

        //WOOL
        translation.add(ABRCWoolColors.WOOL_WHITE.asItem(), "ʞɔןoqʇ∀ ǝʇɥM llooʍ");
        translation.add(ABRCWoolColors.WOOL_ORANGE.asItem(), "ʞɔןoqʇ∀ ǝƃuɐɹO llooʍ");
        translation.add(ABRCWoolColors.WOOL_MAGENTA.asItem(), "ʞɔןoqʇ∀ ɐʇuǝƃɐW llooʍ");
        translation.add(ABRCWoolColors.WOOL_LIGHT_BLUE.asItem(), "ʞɔןoqʇ∀ ǝʎןƃᴉ⅃ ǝǝןq llooʍ");
        translation.add(ABRCWoolColors.WOOL_YELLOW.asItem(), "ʞɔןoqʇ∀ ʍollǝ⅄ llooʍ");
        translation.add(ABRCWoolColors.WOOL_LIME.asItem(), "ʞɔןoqʇ∀ ǝɯᴉ⅃ llooʍ");
        translation.add(ABRCWoolColors.WOOL_PINK.asItem(), "ʞɔןoqʇ∀ ʞuᴉԀ llooʍ");
        translation.add(ABRCWoolColors.WOOL_GRAY.asItem(), "ʞɔןoqʇ∀ ʎɐɹƃ llooʍ");
        translation.add(ABRCWoolColors.WOOL_LIGHT_GRAY.asItem(), "ʞɔןoqʇ∀ ʎɐɹƃ ʇɥƃᴉ⅃ llooʍ");
        translation.add(ABRCWoolColors.WOOL_CYAN.asItem(), "ʞɔןoqʇ∀ uɐ⅄ɔ llooʍ");
        translation.add(ABRCWoolColors.WOOL_PURPLE.asItem(), "ʞɔןoqʇ∀ ǝןԀɹn⅄ llooʍ");
        translation.add(ABRCWoolColors.WOOL_BLUE.asItem(), "ʞɔןoqʇ∀ ǝǝןq llooʍ");
        translation.add(ABRCWoolColors.WOOL_BROWN.asItem(), "ʞɔןoqʇ∀ uʍɹo⅃ llooʍ");
        translation.add(ABRCWoolColors.WOOL_GREEN.asItem(), "ʞɔןoqʇ∀ uǝǝɹƃ llooʍ");
        translation.add(ABRCWoolColors.WOOL_RED.asItem(), "ʞɔןoqʇ∀ pǝɹ llooʍ");

        //Borders
        translation.add(ABRCWoolColors.WOOL_WHITE_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝʇɥM looʍ");
        translation.add(ABRCWoolColors.WOOL_ORANGE_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝƃuɐɹO looʍ");
        translation.add(ABRCWoolColors.WOOL_MAGENTA_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ɐʇuǝƃɐW looʍ");
        translation.add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝǝןq ʇɥƃᴉ⅃ looʍ");
        translation.add(ABRCWoolColors.WOOL_YELLOW_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ʍollǝ⅄ looʍ");
        translation.add(ABRCWoolColors.WOOL_LIME_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝɯᴉ⅃ looʍ");
        translation.add(ABRCWoolColors.WOOL_PINK_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ʞuᴉԀ looʍ");
        translation.add(ABRCWoolColors.WOOL_GRAY_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ʎɐɹƃ looʍ");
        translation.add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ʎɐɹƃ ʇɥƃᴉ⅃ looʍ");
        translation.add(ABRCWoolColors.WOOL_CYAN_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ uɐ⅄ɔ looʍ");
        translation.add(ABRCWoolColors.WOOL_PURPLE_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝןԀɹn⅄ looʍ");
        translation.add(ABRCWoolColors.WOOL_BLUE_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝǝןq looʍ");
        translation.add(ABRCWoolColors.WOOL_BROWN_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ uʍɹo⅃ looʍ");
        translation.add(ABRCWoolColors.WOOL_GREEN_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ uǝǝɹƃ looʍ");
        translation.add(ABRCWoolColors.WOOL_RED_BORDER.asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ pǝɹ looʍ");


        //SLABS
        translation.add(ABRCSlabs.SLAB_BRIGHT_WHITE.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ᴉʇɥM ʇɥƃᴉɹꞁ");
        translation.add(ABRCSlabs.SLAB_BRIGHT_BLACK.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ʞɔɐןq ʇɥƃᴉɹꞁ");
        translation.add(ABRCSlabs.SLAB_BRIGHT_ORANGE.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        translation.add(ABRCSlabs.SLAB_BRIGHT_MAGENTA.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        translation.add(ABRCSlabs.SLAB_BRIGHT_YELLOW.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        translation.add(ABRCSlabs.SLAB_BRIGHT_CYAN.asItem(), "qɐ⅃s ʞɔןoqʇ∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        translation.add(ABRCSlabs.SLAB_BRIGHT_BLUE.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝǝןq ʇɥƃᴉɹꞁ");
        translation.add(ABRCSlabs.SLAB_BRIGHT_GREEN.asItem(), "qɐ⅃s ʞɔןoqʇ∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        translation.add(ABRCSlabs.SLAB_BRIGHT_RED.asItem(), "qɐ⅃s ʞɔןoqʇ∀ pǝɹ ʇɥƃᴉɹꞁ");

        translation.add(ABRCSlabs.SLAB_WOOL_WHITE.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝᴉʇɥM");
        translation.add(ABRCSlabs.SLAB_WOOL_ORANGE.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝƃuɐɹO");
        translation.add(ABRCSlabs.SLAB_WOOL_MAGENTA.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ɐʇuǝƃɐW");
        translation.add(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝǝןq ʇɥƃᴉ⅃");
        translation.add(ABRCSlabs.SLAB_WOOL_YELLOW.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ʍollǝ⅄");
        translation.add(ABRCSlabs.SLAB_WOOL_LIME.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝɯᴉ⅃");
        translation.add(ABRCSlabs.SLAB_WOOL_PINK.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ʞuᴉԀ");
        translation.add(ABRCSlabs.SLAB_WOOL_GRAY.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ʎɐɹƃ");
        translation.add(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ʎɐɹƃ ʇɥƃᴉ⅃");
        translation.add(ABRCSlabs.SLAB_WOOL_CYAN.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ uɐ⅄ɔ");
        translation.add(ABRCSlabs.SLAB_WOOL_PURPLE.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝןԀɹn⅄");
        translation.add(ABRCSlabs.SLAB_WOOL_BLUE.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝǝןq");
        translation.add(ABRCSlabs.SLAB_WOOL_BROWN.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ uʍɹo⅃");
        translation.add(ABRCSlabs.SLAB_WOOL_GREEN.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ uǝǝɹƃ");
        translation.add(ABRCSlabs.SLAB_WOOL_RED.asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ pǝɹ");


        //Starirs
        translation.add(ABRCStairs.STAIR_BRIGHT_WHITE.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʇɥM ʇɥƃᴉɹꞁ");
        translation.add(ABRCStairs.STAIR_BRIGHT_BLACK.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ʞɔɐןq ʇɥƃᴉɹꞁ");
        translation.add(ABRCStairs.STAIR_BRIGHT_ORANGE.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        translation.add(ABRCStairs.STAIR_BRIGHT_MAGENTA.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        translation.add(ABRCStairs.STAIR_BRIGHT_YELLOW.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        translation.add(ABRCStairs.STAIR_BRIGHT_CYAN.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        translation.add(ABRCStairs.STAIR_BRIGHT_BLUE.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝǝןq ʇɥƃᴉɹꞁ");
        translation.add(ABRCStairs.STAIR_BRIGHT_GREEN.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        translation.add(ABRCStairs.STAIR_BRIGHT_RED.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ pǝɹ ʇɥƃᴉɹꞁ");

        translation.add(ABRCStairs.STAIR_WOOL_WHITE.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝʇɥM");
        translation.add(ABRCStairs.STAIR_WOOL_ORANGE.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝƃuɐɹO");
        translation.add(ABRCStairs.STAIR_WOOL_MAGENTA.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ɐʇuǝƃɐW");
        translation.add(ABRCStairs.STAIR_WOOL_LIGHT_BLUE.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝǝןq ʇɥƃᴉ⅃");
        translation.add(ABRCStairs.STAIR_WOOL_YELLOW.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ʍollǝ⅄");
        translation.add(ABRCStairs.STAIR_WOOL_LIME.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝɯᴉ⅃");
        translation.add(ABRCStairs.STAIR_WOOL_PINK.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ʞuᴉԀ");
        translation.add(ABRCStairs.STAIR_WOOL_GRAY.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ʎɐɹƃ");
        translation.add(ABRCStairs.STAIR_WOOL_LIGHT_GRAY.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ʎɐɹƃ ʇɥƃᴉ⅃");
        translation.add(ABRCStairs.STAIR_WOOL_CYAN.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ uɐ⅄ɔ");
        translation.add(ABRCStairs.STAIR_WOOL_PURPLE.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝןԀɹn⅄");
        translation.add(ABRCStairs.STAIR_WOOL_BLUE.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝǝןq");
        translation.add(ABRCStairs.STAIR_WOOL_BROWN.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ uʍɹo⅃");
        translation.add(ABRCStairs.STAIR_WOOL_GREEN.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ uǝǝɹƃ");
        translation.add(ABRCStairs.STAIR_WOOL_RED.asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ pǝɹ");

        //Buttons
        translation.add(ABRCButtons.BUTTON_BRIGHT_WHITE.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʇɥM ʇɥƃᴉɹꞁ");
        translation.add(ABRCButtons.BUTTON_BRIGHT_ORANGE.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        translation.add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        translation.add(ABRCButtons.BUTTON_BRIGHT_YELLOW.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        translation.add(ABRCButtons.BUTTON_BRIGHT_CYAN.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        translation.add(ABRCButtons.BUTTON_BRIGHT_BLUE.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝǝןq ʇɥƃᴉɹꞁ");
        translation.add(ABRCButtons.BUTTON_BRIGHT_GREEN.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        translation.add(ABRCButtons.BUTTON_BRIGHT_RED.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ pǝɹ ʇɥƃᴉɹꞁ");
        translation.add(ABRCButtons.BUTTON_BRIGHT_BLACK.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ʞɔɐןq ʇɥƃᴉɹꞁ");

        translation.add(ABRCButtons.BUTTON_WOOL_WHITE.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝʇɥM");
        translation.add(ABRCButtons.BUTTON_WOOL_ORANGE.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝƃuɐɹO");
        translation.add(ABRCButtons.BUTTON_WOOL_MAGENTA.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ɐʇuǝƃɐW");
        translation.add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝǝןq ʇɥƃᴉ⅃");
        translation.add(ABRCButtons.BUTTON_WOOL_YELLOW.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ʍollǝ⅄");
        translation.add(ABRCButtons.BUTTON_WOOL_LIME.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝɯᴉ⅃");
        translation.add(ABRCButtons.BUTTON_WOOL_PINK.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ʞuᴉԀ");
        translation.add(ABRCButtons.BUTTON_WOOL_GRAY.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ʎɐɹƃ");
        translation.add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ʎɐɹƃ ʇɥƃᴉ⅃");
        translation.add(ABRCButtons.BUTTON_WOOL_CYAN.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ uɐ⅄ɔ");
        translation.add(ABRCButtons.BUTTON_WOOL_PURPLE.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝןԀɹn⅄");
        translation.add(ABRCButtons.BUTTON_WOOL_BLUE.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝǝןq");
        translation.add(ABRCButtons.BUTTON_WOOL_BROWN.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ uʍɹo⅃");
        translation.add(ABRCButtons.BUTTON_WOOL_GREEN.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ uǝǝɹƃ");
        translation.add(ABRCButtons.BUTTON_WOOL_RED.asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ pǝɹ");

        //Plates
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝɥ┴ ǝʇɥM ʇɥƃᴉɹꞁ");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝǝןq ʇɥƃᴉɹꞁ");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ pǝɹ ʇɥƃᴉɹꞁ");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ʞɔɐןq ʇɥƃᴉɹꞁ");

        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝɥ┴ ǝʇɥM");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝƃuɐɹO");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ɐʇuǝƃɐW");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝǝןq ʇɥƃᴉ⅃");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ʍollǝ⅄");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝɯᴉ⅃");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ʞuᴉԀ");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ʎɐɹƃ");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ʎɐɹƃ ʇɥƃᴉ⅃");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ uɐ⅄ɔ");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝןԀɹn⅄");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝǝןq");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ uʍɹo⅃");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ uǝǝɹƃ");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ pǝɹ");
    }
}
