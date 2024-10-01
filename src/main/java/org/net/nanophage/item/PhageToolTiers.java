package org.net.nanophage.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import org.net.nanophage.Nanophage;
import org.net.nanophage.util.PhageTags;

import java.util.List;

public class PhageToolTiers {
    public static final Tier XENO_METAL = TierSortingRegistry
            .registerTier(new ForgeTier(5, 1400, 11f,
                    3f, 26,
                    PhageTags.Blocks.NEEDS_XENO_METAL_TOOL,
                    ()-> Ingredient.of(PhageItems.XENO_METAL_INGOT.get())),
                    new ResourceLocation(Nanophage.MOD_ID, "xeno_metal"), List.of(Tiers.NETHERITE),
                    List.of());
}
