package org.net.nanophage.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import org.net.nanophage.Nanophage;

@JeiPlugin
public class JEINanophagePlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Nanophage.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration reg) {

    }

    @Override
    public void registerRecipes(IRecipeRegistration reg) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration reg) {

    }
}
