package net.manmaed.antiblocksrechiseled.datagen.lang;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ABRCenud extends LanguageProvider {

    public ABRCenud(PackOutput output) {
        super(output, AntiBlocksReChiseled.MOD_ID, "en_ud");
    }

    @Override
    protected void addTranslations() {
        add("a.lang.file.name", "ɥsᴉꞁᵷuƎ (uʍoᗡ ǝpᴉsd∩)");
        add("a.lang.author.name", "ChatGPT");
        add("itemGroup.antiblocksrechiseled", "pǝlǝsᴉɥɔǝɹ sʞɔןoꞁʇᴉ∀");

        //Bright
        add(ABRCBrightColors.BRIGHT_WHITE.get(), "ʞɔןoqʇ∀ ǝᴉʇɥM ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_ORANGE.get(), "ʞɔןoqʇ∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_MAGENTA.get(), "ʞɔןoqʇ∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_YELLOW.get(), "ʞɔןoqʇ∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_CYAN.get(), "ʞɔןoqʇ∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_BLUE.get(), "ʞɔןoqʇ∀ ǝǝןq ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_GREEN.get(), "ʞɔןoqʇ∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_RED.get(), "ʞɔןoqʇ∀ pǝɹ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_BLACK.get(), "ʞɔןoqʇ∀ ʞɔɐןq ʇɥƃᴉɹꞁ");
        //Borders
        add(ABRCBrightColors.BRIGHT_WHITE_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ǝʇɥW ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_CYAN_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_BLUE_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ǝǝןq ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_GREEN_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq uǝǝɹƃ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_RED_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq pǝɹ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_BLACK_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ʞɔɐןq ʇɥƃᴉɹꞁ");

        //WOOL
        add(ABRCWoolColors.WOOL_WHITE.get(), "ʞɔןoqʇ∀ ǝʇɥM llooʍ");
        add(ABRCWoolColors.WOOL_ORANGE.get(), "ʞɔןoqʇ∀ ǝƃuɐɹO llooʍ");
        add(ABRCWoolColors.WOOL_MAGENTA.get(), "ʞɔןoqʇ∀ ɐʇuǝƃɐW llooʍ");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE.get(), "ʞɔןoqʇ∀ ǝʎןƃᴉ⅃ ǝǝןq llooʍ");
        add(ABRCWoolColors.WOOL_YELLOW.get(), "ʞɔןoqʇ∀ ʍollǝ⅄ llooʍ");
        add(ABRCWoolColors.WOOL_LIME.get(), "ʞɔןoqʇ∀ ǝɯᴉ⅃ llooʍ");
        add(ABRCWoolColors.WOOL_PINK.get(), "ʞɔןoqʇ∀ ʞuᴉԀ llooʍ");
        add(ABRCWoolColors.WOOL_GRAY.get(), "ʞɔןoqʇ∀ ʎɐɹƃ llooʍ");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY.get(), "ʞɔןoqʇ∀ ʎɐɹƃ ʇɥƃᴉ⅃ llooʍ");
        add(ABRCWoolColors.WOOL_CYAN.get(), "ʞɔןoqʇ∀ uɐ⅄ɔ llooʍ");
        add(ABRCWoolColors.WOOL_PURPLE.get(), "ʞɔןoqʇ∀ ǝןԀɹn⅄ llooʍ");
        add(ABRCWoolColors.WOOL_BLUE.get(), "ʞɔןoqʇ∀ ǝǝןq llooʍ");
        add(ABRCWoolColors.WOOL_BROWN.get(), "ʞɔןoqʇ∀ uʍɹo⅃ llooʍ");
        add(ABRCWoolColors.WOOL_GREEN.get(), "ʞɔןoqʇ∀ uǝǝɹƃ llooʍ");
        add(ABRCWoolColors.WOOL_RED.get(), "ʞɔןoqʇ∀ pǝɹ llooʍ");

        //Borders
        add(ABRCWoolColors.WOOL_WHITE_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝʇɥM looʍ");
        add(ABRCWoolColors.WOOL_ORANGE_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝƃuɐɹO looʍ");
        add(ABRCWoolColors.WOOL_MAGENTA_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ɐʇuǝƃɐW looʍ");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝǝןq ʇɥƃᴉ⅃ looʍ");
        add(ABRCWoolColors.WOOL_YELLOW_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ʍollǝ⅄ looʍ");
        add(ABRCWoolColors.WOOL_LIME_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝɯᴉ⅃ looʍ");
        add(ABRCWoolColors.WOOL_PINK_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ʞuᴉԀ looʍ");
        add(ABRCWoolColors.WOOL_GRAY_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ʎɐɹƃ looʍ");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ʎɐɹƃ ʇɥƃᴉ⅃ looʍ");
        add(ABRCWoolColors.WOOL_CYAN_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ uɐ⅄ɔ looʍ");
        add(ABRCWoolColors.WOOL_PURPLE_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝןԀɹn⅄ looʍ");
        add(ABRCWoolColors.WOOL_BLUE_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝǝןq looʍ");
        add(ABRCWoolColors.WOOL_BROWN_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ uʍɹo⅃ looʍ");
        add(ABRCWoolColors.WOOL_GREEN_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ uǝǝɹƃ looʍ");
        add(ABRCWoolColors.WOOL_RED_BORDER.get(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ pǝɹ looʍ");


        //SLABS
        add(ABRCSlabs.SLAB_WHITE_BRIGHT.get(), "qɐ⅃s ʞɔןoqʇ∀ ᴉʇɥM ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_BLACK.get(), "qɐ⅃s ʞɔןoqʇ∀ ʞɔɐןq ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_ORANGE_BRIGHT.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_MAGENTA_BRIGHT.get(), "qɐ⅃s ʞɔןoqʇ∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_YELLOW_BRIGHT.get(), "qɐ⅃s ʞɔןoqʇ∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_CYAN_BRIGHT.get(), "qɐ⅃s ʞɔןoqʇ∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_BLUE_BRIGHT.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝǝןq ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_GREEN_BRIGHT.get(), "qɐ⅃s ʞɔןoqʇ∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_RED_BRIGHT.get(), "qɐ⅃s ʞɔןoqʇ∀ pǝɹ ʇɥƃᴉɹꞁ");

        add(ABRCSlabs.SLAB_WHITE_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝᴉʇɥM");
        add(ABRCSlabs.SLAB_ORANGE_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝƃuɐɹO");
        add(ABRCSlabs.SLAB_MAGENTA_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ɐʇuǝƃɐW");
        add(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝǝןq ʇɥƃᴉ⅃");
        add(ABRCSlabs.SLAB_YELLOW_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ʍollǝ⅄");
        add(ABRCSlabs.SLAB_LIME_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝɯᴉ⅃");
        add(ABRCSlabs.SLAB_PINK_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ʞuᴉԀ");
        add(ABRCSlabs.SLAB_GRAY_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ʎɐɹƃ");
        add(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ʎɐɹƃ ʇɥƃᴉ⅃");
        add(ABRCSlabs.SLAB_CYAN_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ uɐ⅄ɔ");
        add(ABRCSlabs.SLAB_PURPLE_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝןԀɹn⅄");
        add(ABRCSlabs.SLAB_BLUE_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝǝןq");
        add(ABRCSlabs.SLAB_BROWN_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ uʍɹo⅃");
        add(ABRCSlabs.SLAB_GREEN_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ uǝǝɹƃ");
        add(ABRCSlabs.SLAB_RED_WOOL.get(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ pǝɹ");


        //Starirs
        add(ABRCStairs.STAIR_WHITE_BRIGHT.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʇɥM ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_BLACK.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ʞɔɐןq ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_ORANGE_BRIGHT.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_MAGENTA_BRIGHT.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_YELLOW_BRIGHT.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_CYAN_BRIGHT.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_BLUE_BRIGHT.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝǝןq ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_GREEN_BRIGHT.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_RED_BRIGHT.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ pǝɹ ʇɥƃᴉɹꞁ");

        add(ABRCStairs.STAIR_WHITE_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝʇɥM");
        add(ABRCStairs.STAIR_ORANGE_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝƃuɐɹO");
        add(ABRCStairs.STAIR_MAGENTA_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ɐʇuǝƃɐW");
        add(ABRCStairs.STAIR_LIGHT_BLUE_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝǝןq ʇɥƃᴉ⅃");
        add(ABRCStairs.STAIR_YELLOW_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ʍollǝ⅄");
        add(ABRCStairs.STAIR_LIME_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝɯᴉ⅃");
        add(ABRCStairs.STAIR_PINK_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ʞuᴉԀ");
        add(ABRCStairs.STAIR_GRAY_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ʎɐɹƃ");
        add(ABRCStairs.STAIR_LIGHT_GRAY_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ʎɐɹƃ ʇɥƃᴉ⅃");
        add(ABRCStairs.STAIR_CYAN_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ uɐ⅄ɔ");
        add(ABRCStairs.STAIR_PURPLE_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝןԀɹn⅄");
        add(ABRCStairs.STAIR_BLUE_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝǝןq");
        add(ABRCStairs.STAIR_BROWN_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ uʍɹo⅃");
        add(ABRCStairs.STAIR_GREEN_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ uǝǝɹƃ");
        add(ABRCStairs.STAIR_RED_WOOL.get(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ pǝɹ");

        //Buttons
        add(ABRCButtons.BUTTON_BRIGHT_WHITE.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʇɥM ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_ORANGE.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_YELLOW.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_CYAN.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_BLUE.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝǝןq ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_GREEN.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_RED.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ pǝɹ ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_BLACK.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ʞɔɐןq ʇɥƃᴉɹꞁ");

        add(ABRCButtons.BUTTON_WOOL_WHITE.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝʇɥM");
        add(ABRCButtons.BUTTON_WOOL_ORANGE.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝƃuɐɹO");
        add(ABRCButtons.BUTTON_WOOL_MAGENTA.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ɐʇuǝƃɐW");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝǝןq ʇɥƃᴉ⅃");
        add(ABRCButtons.BUTTON_WOOL_YELLOW.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ʍollǝ⅄");
        add(ABRCButtons.BUTTON_WOOL_LIME.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝɯᴉ⅃");
        add(ABRCButtons.BUTTON_WOOL_PINK.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ʞuᴉԀ");
        add(ABRCButtons.BUTTON_WOOL_GRAY.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ʎɐɹƃ");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ʎɐɹƃ ʇɥƃᴉ⅃");
        add(ABRCButtons.BUTTON_WOOL_CYAN.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ uɐ⅄ɔ");
        add(ABRCButtons.BUTTON_WOOL_PURPLE.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝןԀɹn⅄");
        add(ABRCButtons.BUTTON_WOOL_BLUE.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝǝןq");
        add(ABRCButtons.BUTTON_WOOL_BROWN.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ uʍɹo⅃");
        add(ABRCButtons.BUTTON_WOOL_GREEN.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ uǝǝɹƃ");
        add(ABRCButtons.BUTTON_WOOL_RED.get(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ pǝɹ");

        //Plates
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝɥ┴ ǝʇɥM ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝǝןq ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ pǝɹ ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ʞɔɐןq ʇɥƃᴉɹꞁ");

        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝɥ┴ ǝʇɥM");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝƃuɐɹO");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ɐʇuǝƃɐW");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝǝןq ʇɥƃᴉ⅃");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ʍollǝ⅄");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝɯᴉ⅃");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ʞuᴉԀ");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ʎɐɹƃ");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ʎɐɹƃ ʇɥƃᴉ⅃");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ uɐ⅄ɔ");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝןԀɹn⅄");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝǝןq");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ uʍɹo⅃");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ uǝǝɹƃ");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ pǝɹ");
    }
}
