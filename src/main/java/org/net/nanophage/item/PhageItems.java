package org.net.nanophage.item;

import net.minecraft.world.item.*;
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

    //Tools
    public static final RegistryObject<Item> XENO_METAL_SWORD = ITEM_REGISTER.register("xeno_metal_sword",
            ()->new SwordItem(PhageToolTiers.XENO_METAL, 2,3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> XENO_METAL_PICKAXE = ITEM_REGISTER.register("xeno_metal_pickaxe",
            ()->new PickaxeItem(PhageToolTiers.XENO_METAL, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> XENO_METAL_SHOVEL = ITEM_REGISTER.register("xeno_metal_shovel",
            ()->new ShovelItem(PhageToolTiers.XENO_METAL, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> XENO_METAL_AXE = ITEM_REGISTER.register("xeno_metal_axe",
            ()->new AxeItem(PhageToolTiers.XENO_METAL, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> XENO_METAL_HOE = ITEM_REGISTER.register("xeno_metal_hoe",
            ()->new HoeItem(PhageToolTiers.XENO_METAL, 2, 3, new Item.Properties().durability(256)));

    public static final RegistryObject<Item> XENO_METAL_HELM = ITEM_REGISTER.register("xeno_metal_helm",
            ()->new ArmorItem(PhageArmorMaterials.XENO_METAL_INGOT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> XENO_METAL_CHESTPLATE = ITEM_REGISTER.register("xeno_metal_chestplate",
            ()->new ArmorItem(PhageArmorMaterials.XENO_METAL_INGOT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> XENO_METAL_LEGGINGS = ITEM_REGISTER.register("xeno_metal_leggings",
            ()->new ArmorItem(PhageArmorMaterials.XENO_METAL_INGOT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> XENO_METAL_BOOTS = ITEM_REGISTER.register("xeno_metal_boots",
            ()->new ArmorItem(PhageArmorMaterials.XENO_METAL_INGOT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventbus) {
        ITEM_REGISTER.register(eventbus);
    }
}
