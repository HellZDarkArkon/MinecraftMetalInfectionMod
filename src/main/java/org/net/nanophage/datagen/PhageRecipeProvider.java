package org.net.nanophage.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.net.nanophage.Nanophage;
import org.net.nanophage.block.PhageBlocks;
import org.net.nanophage.item.PhageItems;

import java.util.List;
import java.util.function.Consumer;

public class PhageRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public PhageRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes (Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                PhageBlocks.XENO_METAL_BLOCK.get()) //Xeno Metal Block
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', PhageItems.XENO_METAL_INGOT.get())
                .unlockedBy("has_xeno_metal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(PhageItems.XENO_METAL_INGOT.get()).build())).save(pWriter,
                        "xeno_metal_block_from_xeno_metal_ingot");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,
                PhageItems.XENO_METAL_INGOT.get())
                        .pattern("###").pattern("###").pattern("###")
                        .define('#', PhageItems.XENO_METAL_NUGGET.get())
                                .unlockedBy("has_xeno_metal", inventoryTrigger(ItemPredicate.Builder.item()
                                        .of(PhageItems.XENO_METAL_NUGGET.get()).build())).save(pWriter,
                        "xeno_metal_ingot_from_xeno_metal_nuggets");
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,
                PhageItems.XENO_METAL_PICKAXE.get()) //Xeno Metal Pickaxe
                        .pattern("###")
                                .pattern(" @ ").pattern(" @ ")
                        .define('#',PhageItems.XENO_METAL_INGOT.get()).define('@', Items.STICK)
                                .unlockedBy("has_xeno_metal", inventoryTrigger(ItemPredicate.Builder.item()
                                        .of(PhageItems.XENO_METAL_PICKAXE.get()).build())).save(pWriter,
                        "xeno_metal_pickaxe");
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,
                PhageItems.XENO_METAL_AXE.get()) //Xeno Metal Axe
                        .pattern(" ##").pattern(" @#").pattern(" @ ")
                        .define('#', PhageItems.XENO_METAL_INGOT.get()).define('@', Items.STICK)
                .unlockedBy("has_xeno_metal", inventoryTrigger(ItemPredicate.Builder.item().of(PhageItems.XENO_METAL_AXE.get()).build())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT,
                PhageItems.XENO_METAL_SWORD.get()) //Xeno Metal Sword
                        .pattern(" # ").pattern(" # ").pattern(" @ ")
                        .define('#', PhageItems.XENO_METAL_INGOT.get()).define('@', Items.STICK)
                        .unlockedBy("has_xeno_metal", inventoryTrigger(ItemPredicate.Builder.item().of(PhageItems.XENO_METAL_SWORD.get())
                                .build())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,
                        PhageItems.XENO_METAL_SHOVEL.get()) //Xeno Metal Shovel
                .pattern(" # ").pattern(" @ ").pattern(" @ ")
                .define('#', PhageItems.XENO_METAL_INGOT.get()).define('@', Items.STICK)
                .unlockedBy("has_xeno_metal", inventoryTrigger(ItemPredicate.Builder.item().of(PhageItems.XENO_METAL_SWORD.get())
                        .build())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS,
                        PhageItems.XENO_METAL_HOE.get()) //Xeno Metal Hoe
                .pattern("## ").pattern(" @ ").pattern(" @ ")
                .define('#', PhageItems.XENO_METAL_INGOT.get()).define('@', Items.STICK)
                .unlockedBy("has_xeno_metal", inventoryTrigger(ItemPredicate.Builder.item().of(PhageItems.XENO_METAL_SWORD.get())
                        .build())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT,
                        PhageItems.XENO_METAL_HELMET.get())
                .pattern("###").pattern("# #")
                .define('#', PhageItems.XENO_METAL_INGOT.get())
                .unlockedBy("has_xeno_metal", inventoryTrigger(ItemPredicate.Builder.item().of(PhageItems.XENO_METAL_SWORD.get())
                        .build())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT,
                        PhageItems.XENO_METAL_CHESTPLATE.get())
                .pattern("# #").pattern("###").pattern("###")
                .define('#', PhageItems.XENO_METAL_INGOT.get())
                .unlockedBy("has_xeno_metal", inventoryTrigger(ItemPredicate.Builder.item().of(PhageItems.XENO_METAL_SWORD.get())
                        .build())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT,
                        PhageItems.XENO_METAL_LEGGINGS.get())
                .pattern("###").pattern("# #").pattern("# #")
                .define('#', PhageItems.XENO_METAL_INGOT.get())
                .unlockedBy("has_xeno_metal", inventoryTrigger(ItemPredicate.Builder.item().of(PhageItems.XENO_METAL_SWORD.get())
                        .build())).save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT,
                        PhageItems.XENO_METAL_BOOTS.get())
                .pattern("# #").pattern("# #")
                .define('#', PhageItems.XENO_METAL_INGOT.get())
                .unlockedBy("has_xeno_metal", inventoryTrigger(ItemPredicate.Builder.item().of(PhageItems.XENO_METAL_SWORD.get())
                        .build())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                PhageItems.XENO_METAL_INGOT.get(), 9)
                .requires(PhageBlocks.XENO_METAL_BLOCK.get())
                .unlockedBy("has_xeno_metal_block",
                        inventoryTrigger(ItemPredicate.Builder.item()
                                .of(PhageBlocks.XENO_METAL_BLOCK.get()).build())).save(pWriter,
                        "xeno_metal_ingots_from_xeno_metal_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,
                PhageItems.XENO_METAL_NUGGET.get(), 9)
                .requires(PhageItems.XENO_METAL_INGOT.get())
                .unlockedBy("has_xeno_metal_ingot",
                        inventoryTrigger(ItemPredicate.Builder.item()
                                .of(PhageItems.XENO_METAL_INGOT.get()).build())).save(pWriter,
                        "xeno_metal_nuggets_from_xeno_metal_ingot");

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCat, ItemLike pResult, float pExp, int pCookTime, String pGroup)
    {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCat, pResult, pExp, pCookTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCat, ItemLike pResult, float pExp, int pCookTime, String pGroup)
    {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCat
        , pResult, pExp, pCookTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCat, ItemLike pResult, float pExp, int pCookTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCat, pResult, pExp, pCookTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer,
                            Nanophage.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}