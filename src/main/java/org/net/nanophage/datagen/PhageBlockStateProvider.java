package org.net.nanophage.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.predicate.BlockStatePredicate;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.net.nanophage.Nanophage;
import org.net.nanophage.block.PhageBlocks;

public class PhageBlockStateProvider extends BlockStateProvider {
    public PhageBlockStateProvider(PackOutput pOutput, ExistingFileHelper eFileHelper) {
        super(pOutput, Nanophage.MOD_ID, eFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(PhageBlocks.XENO_METAL_BLOCK);
        blockWithItem(PhageBlocks.PHAGE_HEART);


    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile
                .UncheckedModelFile("nanophage:block/" + ForgeRegistries.BLOCKS
                .getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile
                .UncheckedModelFile("nanophage:block/" + ForgeRegistries.BLOCKS
                .getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
