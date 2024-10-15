package org.net.nanophage.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.net.nanophage.block.PhageBlocks;

import java.util.Set;

public class PhageBlockLootTables extends BlockLootSubProvider {
    public PhageBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(PhageBlocks.XENO_METAL_BLOCK.get());
        this.dropSelf(PhageBlocks.XENO_METAL_SLAB.get());
        this.dropSelf(PhageBlocks.XENO_METAL_STAIRS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return PhageBlocks.PHAGE_BLOCKS.getEntries().stream()
                .map(RegistryObject::get)::iterator;
    }
}
