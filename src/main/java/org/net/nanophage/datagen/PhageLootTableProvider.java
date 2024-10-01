package org.net.nanophage.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.net.nanophage.datagen.loot.PhageBlockLootTables;

import java.util.List;
import java.util.Set;

public class PhageLootTableProvider {
    public static LootTableProvider create(PackOutput pOutput) {
        return new LootTableProvider(pOutput, Set.of(), List.of(new LootTableProvider.SubProviderEntry(PhageBlockLootTables::new, LootContextParamSets.BLOCK)));
    }
}
