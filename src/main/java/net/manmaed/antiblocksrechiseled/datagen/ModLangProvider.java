package net.manmaed.antiblocksrechiseled.datagen;


import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.datagen.lang.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.manmaed.antiblocksrechiseled.blocks.*;

public class ModLangProvider {
    public static void addTranslations(DataGenerator generator) {
        PackOutput output = generator.getPackOutput();
        /**
         * To Add a new LanguageProvider copy ABRCenustemplate file and call it ABRClocale (eg ABRCenpt for Pirate Speak)
         * then just translate the english strings into the locale
         * and then add to this file: generator.addProvider(true, new ABRClocale(output)); Change ABRClocale to the file name
         */

        generator.addProvider(true, new ABRCenus(output));
        generator.addProvider(true, new ABRCenpt(output));
        generator.addProvider(true, new ABRCenud(output));
        generator.addProvider(true, new ABRClolus(output));
        generator.addProvider(true, new ABRCtlhaa(output));
    }
}
