package org.net.nanophage.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.net.nanophage.block.PhageBlocks;


public class PhageCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "minecraft");

    public static final RegistryObject<CreativeModeTab> NANOPHAGE_TAB = TABS.register("nanophage_tab",
            ()-> CreativeModeTab.builder().icon(()->new ItemStack(PhageItems.SCRAP_INGOT.get()))
                    .title(Component.translatable("creativetab.nanophage.nanophage_tab"))
                    .displayItems((pParam, pOutput) -> {
                        pOutput.accept(PhageItems.SCRAP_INGOT.get());
                        pOutput.accept(PhageItems.SCRAP_NUGGET.get());

                        pOutput.accept(PhageBlocks.SCRAP_BLOCK.get());
                        pOutput.accept(PhageBlocks.PHAGE_HEART.get());

                    }).build());

    public static void register(IEventBus eventbus) {
        TABS.register(eventbus);
    }



}



