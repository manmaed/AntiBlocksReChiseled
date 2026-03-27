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
        /*add(ABRCBrightColors.BRIGHT_WHITE.get().asItem(), "ʞɔןoqʇ∀ ǝᴉʇɥM ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_ORANGE.get().asItem(), "ʞɔןoqʇ∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_MAGENTA.get().asItem(), "ʞɔןoqʇ∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_YELLOW.get().asItem(), "ʞɔןoqʇ∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_CYAN.get().asItem(), "ʞɔןoqʇ∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_BLUE.get().asItem(), "ʞɔןoqʇ∀ ǝǝןq ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_GREEN.get().asItem(), "ʞɔןoqʇ∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_RED.get().asItem(), "ʞɔןoqʇ∀ pǝɹ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_BLACK.get().asItem(), "ʞɔןoqʇ∀ ʞɔɐןq ʇɥƃᴉɹꞁ");*/
        add(ABRCBrightColors.BRIGHT_WHITE.get().asItem(), "Bright White AntiBlock2");
        add(ABRCBrightColors.BRIGHT_ORANGE.get().asItem(), "Bright Orange AntiBlock2");
        add(ABRCBrightColors.BRIGHT_MAGENTA.get().asItem(), "Bright Magenta AntiBlock2");
        add(ABRCBrightColors.BRIGHT_YELLOW.get().asItem(), "Bright Yellow AntiBlock2");
        add(ABRCBrightColors.BRIGHT_CYAN.get().asItem(), "Bright Cyan AntiBlock2");
        add(ABRCBrightColors.BRIGHT_BLUE.get().asItem(), "Bright Blue AntiBlock2");
        add(ABRCBrightColors.BRIGHT_GREEN.get().asItem(), "Bright Green AntiBlock2");
        add(ABRCBrightColors.BRIGHT_RED.get().asItem(), "Bright Red AntiBlock2");
        add(ABRCBrightColors.BRIGHT_BLACK.get().asItem(), "Bright Black AntiBlock2");
        //Borders
        add(ABRCBrightColors.BRIGHT_WHITE_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ǝʇɥW ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_CYAN_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_BLUE_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ǝǝןq ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_GREEN_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq uǝǝɹƃ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_RED_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq pǝɹ ʇɥƃᴉɹꞁ");
        add(ABRCBrightColors.BRIGHT_BLACK_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoq ʞɔɐןq ʇɥƃᴉɹꞁ");

        //WOOL
        add(ABRCWoolColors.WOOL_WHITE.get().asItem(), "ʞɔןoqʇ∀ ǝʇɥM llooʍ");
        add(ABRCWoolColors.WOOL_ORANGE.get().asItem(), "ʞɔןoqʇ∀ ǝƃuɐɹO llooʍ");
        add(ABRCWoolColors.WOOL_MAGENTA.get().asItem(), "ʞɔןoqʇ∀ ɐʇuǝƃɐW llooʍ");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE.get().asItem(), "ʞɔןoqʇ∀ ǝʎןƃᴉ⅃ ǝǝןq llooʍ");
        add(ABRCWoolColors.WOOL_YELLOW.get().asItem(), "ʞɔןoqʇ∀ ʍollǝ⅄ llooʍ");
        add(ABRCWoolColors.WOOL_LIME.get().asItem(), "ʞɔןoqʇ∀ ǝɯᴉ⅃ llooʍ");
        add(ABRCWoolColors.WOOL_PINK.get().asItem(), "ʞɔןoqʇ∀ ʞuᴉԀ llooʍ");
        add(ABRCWoolColors.WOOL_GRAY.get().asItem(), "ʞɔןoqʇ∀ ʎɐɹƃ llooʍ");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY.get().asItem(), "ʞɔןoqʇ∀ ʎɐɹƃ ʇɥƃᴉ⅃ llooʍ");
        add(ABRCWoolColors.WOOL_CYAN.get().asItem(), "ʞɔןoqʇ∀ uɐ⅄ɔ llooʍ");
        add(ABRCWoolColors.WOOL_PURPLE.get().asItem(), "ʞɔןoqʇ∀ ǝןԀɹn⅄ llooʍ");
        add(ABRCWoolColors.WOOL_BLUE.get().asItem(), "ʞɔןoqʇ∀ ǝǝןq llooʍ");
        add(ABRCWoolColors.WOOL_BROWN.get().asItem(), "ʞɔןoqʇ∀ uʍɹo⅃ llooʍ");
        add(ABRCWoolColors.WOOL_GREEN.get().asItem(), "ʞɔןoqʇ∀ uǝǝɹƃ llooʍ");
        add(ABRCWoolColors.WOOL_RED.get().asItem(), "ʞɔןoqʇ∀ pǝɹ llooʍ");

        //Borders
        add(ABRCWoolColors.WOOL_WHITE_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝʇɥM looʍ");
        add(ABRCWoolColors.WOOL_ORANGE_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝƃuɐɹO looʍ");
        add(ABRCWoolColors.WOOL_MAGENTA_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ɐʇuǝƃɐW looʍ");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝǝןq ʇɥƃᴉ⅃ looʍ");
        add(ABRCWoolColors.WOOL_YELLOW_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ʍollǝ⅄ looʍ");
        add(ABRCWoolColors.WOOL_LIME_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝɯᴉ⅃ looʍ");
        add(ABRCWoolColors.WOOL_PINK_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ʞuᴉԀ looʍ");
        add(ABRCWoolColors.WOOL_GRAY_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ʎɐɹƃ looʍ");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ʎɐɹƃ ʇɥƃᴉ⅃ looʍ");
        add(ABRCWoolColors.WOOL_CYAN_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ uɐ⅄ɔ looʍ");
        add(ABRCWoolColors.WOOL_PURPLE_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝןԀɹn⅄ looʍ");
        add(ABRCWoolColors.WOOL_BLUE_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ ǝǝןq looʍ");
        add(ABRCWoolColors.WOOL_BROWN_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ uʍɹo⅃ looʍ");
        add(ABRCWoolColors.WOOL_GREEN_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ uǝǝɹƃ looʍ");
        add(ABRCWoolColors.WOOL_RED_BORDER.get().asItem(), "ʞɔןoqʇ∀ pǝɹɹǝɹoɃ pǝɹ looʍ");


        //SLABS
        add(ABRCSlabs.SLAB_BRIGHT_WHITE.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ᴉʇɥM ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_BRIGHT_BLACK.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ʞɔɐןq ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_BRIGHT_ORANGE.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_BRIGHT_MAGENTA.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_BRIGHT_YELLOW.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_BRIGHT_CYAN.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_BRIGHT_BLUE.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝǝןq ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_BRIGHT_GREEN.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        add(ABRCSlabs.SLAB_BRIGHT_RED.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ pǝɹ ʇɥƃᴉɹꞁ");

        add(ABRCSlabs.SLAB_WOOL_WHITE.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝᴉʇɥM");
        add(ABRCSlabs.SLAB_WOOL_ORANGE.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝƃuɐɹO");
        add(ABRCSlabs.SLAB_WOOL_MAGENTA.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ɐʇuǝƃɐW");
        add(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝǝןq ʇɥƃᴉ⅃");
        add(ABRCSlabs.SLAB_WOOL_YELLOW.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ʍollǝ⅄");
        add(ABRCSlabs.SLAB_WOOL_LIME.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝɯᴉ⅃");
        add(ABRCSlabs.SLAB_WOOL_PINK.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ʞuᴉԀ");
        add(ABRCSlabs.SLAB_WOOL_GRAY.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ʎɐɹƃ");
        add(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ʎɐɹƃ ʇɥƃᴉ⅃");
        add(ABRCSlabs.SLAB_WOOL_CYAN.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ uɐ⅄ɔ");
        add(ABRCSlabs.SLAB_WOOL_PURPLE.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝןԀɹn⅄");
        add(ABRCSlabs.SLAB_WOOL_BLUE.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ ǝǝןq");
        add(ABRCSlabs.SLAB_WOOL_BROWN.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ uʍɹo⅃");
        add(ABRCSlabs.SLAB_WOOL_GREEN.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ uǝǝɹƃ");
        add(ABRCSlabs.SLAB_WOOL_RED.get().asItem(), "qɐ⅃s ʞɔןoqʇ∀ ǝʃlooʍ pǝɹ");


        //Starirs
        add(ABRCStairs.STAIR_BRIGHT_WHITE.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʇɥM ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_BRIGHT_BLACK.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ʞɔɐןq ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_BRIGHT_ORANGE.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_BRIGHT_MAGENTA.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_BRIGHT_YELLOW.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_BRIGHT_CYAN.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_BRIGHT_BLUE.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝǝןq ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_BRIGHT_GREEN.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        add(ABRCStairs.STAIR_BRIGHT_RED.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ pǝɹ ʇɥƃᴉɹꞁ");

        add(ABRCStairs.STAIR_WOOL_WHITE.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝʇɥM");
        add(ABRCStairs.STAIR_WOOL_ORANGE.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝƃuɐɹO");
        add(ABRCStairs.STAIR_WOOL_MAGENTA.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ɐʇuǝƃɐW");
        add(ABRCStairs.STAIR_WOOL_LIGHT_BLUE.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝǝןq ʇɥƃᴉ⅃");
        add(ABRCStairs.STAIR_WOOL_YELLOW.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ʍollǝ⅄");
        add(ABRCStairs.STAIR_WOOL_LIME.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝɯᴉ⅃");
        add(ABRCStairs.STAIR_WOOL_PINK.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ʞuᴉԀ");
        add(ABRCStairs.STAIR_WOOL_GRAY.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ʎɐɹƃ");
        add(ABRCStairs.STAIR_WOOL_LIGHT_GRAY.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ʎɐɹƃ ʇɥƃᴉ⅃");
        add(ABRCStairs.STAIR_WOOL_CYAN.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ uɐ⅄ɔ");
        add(ABRCStairs.STAIR_WOOL_PURPLE.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝןԀɹn⅄");
        add(ABRCStairs.STAIR_WOOL_BLUE.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ ǝǝןq");
        add(ABRCStairs.STAIR_WOOL_BROWN.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ uʍɹo⅃");
        add(ABRCStairs.STAIR_WOOL_GREEN.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ uǝǝɹƃ");
        add(ABRCStairs.STAIR_WOOL_RED.get().asItem(), "sɹᴉɐɹʇS ʞɔןoqʇ∀ ʇɔןᴉq∀ ǝʃlooʍ pǝɹ");

        //Buttons
        add(ABRCButtons.BUTTON_BRIGHT_WHITE.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʇɥM ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_ORANGE.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_YELLOW.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_CYAN.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_BLUE.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝǝןq ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_GREEN.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_RED.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ pǝɹ ʇɥƃᴉɹꞁ");
        add(ABRCButtons.BUTTON_BRIGHT_BLACK.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ʞɔɐןq ʇɥƃᴉɹꞁ");

        add(ABRCButtons.BUTTON_WOOL_WHITE.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝʇɥM");
        add(ABRCButtons.BUTTON_WOOL_ORANGE.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝƃuɐɹO");
        add(ABRCButtons.BUTTON_WOOL_MAGENTA.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ɐʇuǝƃɐW");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝǝןq ʇɥƃᴉ⅃");
        add(ABRCButtons.BUTTON_WOOL_YELLOW.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ʍollǝ⅄");
        add(ABRCButtons.BUTTON_WOOL_LIME.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝɯᴉ⅃");
        add(ABRCButtons.BUTTON_WOOL_PINK.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ʞuᴉԀ");
        add(ABRCButtons.BUTTON_WOOL_GRAY.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ʎɐɹƃ");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ʎɐɹƃ ʇɥƃᴉ⅃");
        add(ABRCButtons.BUTTON_WOOL_CYAN.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ uɐ⅄ɔ");
        add(ABRCButtons.BUTTON_WOOL_PURPLE.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝןԀɹn⅄");
        add(ABRCButtons.BUTTON_WOOL_BLUE.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ ǝǝןq");
        add(ABRCButtons.BUTTON_WOOL_BROWN.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ uʍɹo⅃");
        add(ABRCButtons.BUTTON_WOOL_GREEN.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ uǝǝɹƃ");
        add(ABRCButtons.BUTTON_WOOL_RED.get().asItem(), "uʇʇoqƃ ʞɔןoqʇ∀ ʎʇᴉN∀ ǝʃlooʍ pǝɹ");

        //Plates
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝɥ┴ ǝʇɥM ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝƃuɐɹO ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ɐʇuǝƃɐW ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ʍollǝ⅄ ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ uɐ⅄ɔ ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝǝןq ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ uǝǝɹƃ ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ pǝɹ ʇɥƃᴉɹꞁ");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ʞɔɐןq ʇɥƃᴉɹꞁ");

        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝɥ┴ ǝʇɥM");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝƃuɐɹO");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ɐʇuǝƃɐW");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝǝןq ʇɥƃᴉ⅃");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ʍollǝ⅄");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝɯᴉ⅃");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ʞuᴉԀ");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ʎɐɹƃ");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ʎɐɹƃ ʇɥƃᴉ⅃");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ uɐ⅄ɔ");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝןԀɹn⅄");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ ǝǝןq");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ uʍɹo⅃");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ uǝǝɹƃ");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get().asItem(), "ǝʇɐʃԀ ǝɹnssǝɹԀ ʞɔןoɓʇ∀ ʇɔᴉu∀ ǝʃlooʍ pǝɹ");
    }
}
