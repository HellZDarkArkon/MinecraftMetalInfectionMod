package org.net.nanophage.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.net.nanophage.Nanophage;
import org.net.nanophage.block.PhageBlocks;
import org.net.nanophage.util.PhageTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class PhageBlockTagGen extends BlockTagsProvider {
    public PhageBlockTagGen(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> lookupProvider,
                            @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, lookupProvider, Nanophage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(PhageBlocks.XENO_METAL_BLOCK.get());
        this.tag(PhageTags.Blocks.NEEDS_XENO_METAL_TOOL)
                .add(PhageBlocks.XENO_METAL_BLOCK.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
