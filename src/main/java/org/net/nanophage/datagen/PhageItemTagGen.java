package org.net.nanophage.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.net.nanophage.Nanophage;
import org.net.nanophage.item.PhageItems;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class PhageItemTagGen extends ItemTagsProvider {
    public PhageItemTagGen(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> future,
                           CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, future, completableFuture, Nanophage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.PICKAXES)
                .add(PhageItems.XENO_METAL_PICKAXE.get());
        this.tag(ItemTags.AXES)
                .add(PhageItems.XENO_METAL_AXE.get());
        this.tag(ItemTags.SHOVELS)
                .add(PhageItems.XENO_METAL_SHOVEL.get());
        this.tag(ItemTags.SWORDS)
                .add(PhageItems.XENO_METAL_SWORD.get());
        this.tag(ItemTags.HOES)
                .add(PhageItems.XENO_METAL_HOE.get());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
