package org.net.nanophage.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.net.nanophage.Nanophage;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Nanophage.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        gen.addProvider(event.includeServer(), new PhageRecipeProvider(packOutput));
        gen.addProvider(event.includeServer(), PhageLootTableProvider.create(packOutput));
        gen.addProvider(event.includeServer(), new PhageBlockTagGen(packOutput, lookupProvider, fileHelper));

        gen.addProvider(event.includeClient(), new PhageItemModelProvider(packOutput, fileHelper));
        gen.addProvider(event.includeClient(), new PhageBlockStateProvider(packOutput, fileHelper));
    }
}
