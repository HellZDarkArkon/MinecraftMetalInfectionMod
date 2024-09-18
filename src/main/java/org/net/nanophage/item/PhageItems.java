package org.net.nanophage.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;
import org.net.nanophage.Nanophage;

public class PhageItems {
    public static final DeferredRegister<Item> ITEM_REGISTER =
            DeferredRegister.create(ForgeRegistries.ITEMS, Nanophage.MOD_ID);

    public static final RegistryObject<Item> SCRAP_INGOT = ITEM_REGISTER.register("scrap_ingot",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCRAP_NUGGET = ITEM_REGISTER.register("scrap_nugget",
            ()->new Item(new Item.Properties()));



    public static void register(IEventBus eventbus) {
        ITEM_REGISTER.register(eventbus);
    }
}
