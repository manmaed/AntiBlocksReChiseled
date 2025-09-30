package net.manmaed.antiblocksrechiseled.datagen;


import net.manmaed.antiblocksrechiseled.datagen.lang.ABRCenpt;
import net.manmaed.antiblocksrechiseled.datagen.lang.ABRCenud;
import net.manmaed.antiblocksrechiseled.datagen.lang.ABRCenus;
import net.manmaed.antiblocksrechiseled.datagen.lang.ABRClolus;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;

public class ModLangProvider {
    public static void addTranslations(DataGenerator generator){
        PackOutput output = generator.getPackOutput();

        /**
         * To Add a new LanguageProvider copy ABRCenus file and call it ABRClocale (eg ABRCenpt for Pirate Speak)
         * then just translate the english strings into the locale
         * and then add to this file: generator.addProvider(true, new ABRClocale(output)); Change ABRClocale to the file name
         */
        generator.addProvider(true, new ABRCenus(output));
        generator.addProvider(true, new ABRCenpt(output));
        generator.addProvider(true, new ABRCenud(output));
        generator.addProvider(true, new ABRClolus(output));
    }
}
