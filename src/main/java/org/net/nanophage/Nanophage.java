package org.net.nanophage;


import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.net.nanophage.block.PhageBlocks;
import org.net.nanophage.item.PhageCreativeModeTab;
import org.net.nanophage.item.PhageItems;
import org.slf4j.Logger;

@Mod(Nanophage.MOD_ID)
public class Nanophage {
    public static final String MOD_ID = "minecraft";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Nanophage() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        PhageCreativeModeTab.register(modEventBus);
        PhageBlocks.register(modEventBus);
        PhageItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    public void commonSetup(final FMLCommonSetupEvent event) {

    }

    public void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}