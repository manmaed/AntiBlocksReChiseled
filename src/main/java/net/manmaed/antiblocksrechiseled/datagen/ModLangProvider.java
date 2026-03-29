package net.manmaed.antiblocksrechiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.manmaed.antiblocksrechiseled.datagen.lang.*;

public class ModLangProvider {

    public static void addTranslations(FabricDataGenerator.Pack generator) {
        generator.addProvider(ABRCenus::new);
        generator.addProvider(ABRCenud::new);
        generator.addProvider(ABRCenpt::new);
        generator.addProvider(ABRClolus::new);
        generator.addProvider(ABRCtlhaa::new);

    }

}
