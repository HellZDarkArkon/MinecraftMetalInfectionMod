package org.net.nanophage.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;
import org.net.nanophage.Nanophage;

public class PhageItems {
    public static final DeferredRegister<Item> ITEM_REGISTER =
            DeferredRegister.create(ForgeRegistries.ITEMS, Nanophage.MOD_ID);

    public static final RegistryObject<Item> XENO_METAL_INGOT = ITEM_REGISTER.register("xeno_metal_ingot",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> XENO_METAL_NUGGET = ITEM_REGISTER.register("xeno_metal_nugget",
            ()->new Item(new Item.Properties()));



    public static void register(IEventBus eventbus) {
        ITEM_REGISTER.register(eventbus);
    }
}
