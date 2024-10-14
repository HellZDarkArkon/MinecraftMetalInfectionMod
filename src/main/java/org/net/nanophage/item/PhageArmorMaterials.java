package org.net.nanophage.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.net.nanophage.Nanophage;

import java.util.function.Supplier;



public enum PhageArmorMaterials implements ArmorMaterial {

    XENO_METAL_INGOT("xeno_metal_ingot", 26, new int[]{5,7,5,4}, 25, SoundEvents.ARMOR_EQUIP_NETHERITE,
            1f, 0f, ()->Ingredient.of(PhageItems.XENO_METAL_INGOT.get()));
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmount;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 16, 13 };

    PhageArmorMaterials(String name, int durMult, int[] protAmt, int enchantVal, SoundEvent equipSound,
            float toughness, float kbResist, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durMult;
        this.protectionAmount = protAmt;
        this.enchantmentValue = enchantVal;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = kbResist;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()]*durabilityMultiplier;
    }

    @Override
    public  int getDefenseForType(ArmorItem.Type pType) {
        return protectionAmount[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Nanophage.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
