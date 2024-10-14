package org.net.nanophage.datagen;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.net.nanophage.Nanophage;
import org.net.nanophage.item.PhageItems;

public class PhageItemModelProvider extends ItemModelProvider {
    public PhageItemModelProvider(PackOutput pOutput, ExistingFileHelper eFileHelper) {
        super(pOutput, Nanophage.MOD_ID, eFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(PhageItems.XENO_METAL_INGOT);
        simpleItem(PhageItems.XENO_METAL_NUGGET);

        handheldItem(PhageItems.XENO_METAL_PICKAXE);
        handheldItem(PhageItems.XENO_METAL_AXE);
        handheldItem(PhageItems.XENO_METAL_SHOVEL);
        handheldItem(PhageItems.XENO_METAL_HOE);
        handheldItem(PhageItems.XENO_METAL_SWORD);


    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(Nanophage.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get())
                        .getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(Nanophage.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(Nanophage.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get())
                        .getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld"))
                .texture("layer0", new ResourceLocation(Nanophage.MOD_ID, "item/" + item.getId()
                        .getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(Nanophage.MOD_ID,
                        "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(Nanophage.MOD_ID, "item/"
                + item.getId().getPath()));
    }

//    private void generateArmorTrim(ArmorItem pArmor) {
//        ResourceLocation resourceLocation = ModelLocationUtils.getModelLocation(pArmor);
//        ResourceLocation resourceLocation1 = TextureMapping.getItemTexture(pArmor);
//        ResourceLocation resourceLocation2 = TextureMapping.getItemTexture(pArmor, "_overlay");
//
//        if(pArmor.getMaterial() == ArmorMaterials.LEATHER) {
//            ModelTemplates.TWO_LAYERED_ITEM.create(resourceLocation, TextureMapping.layered(resourceLocation1, resourceLocation2),
//                    this.output, (x, y) -> {
//                        return this.generateBaseArmorTrimTemplate(x, y, pArmor.getMaterial());
//                    });
//        } else {
//            ModelTemplates.FLAT_ITEM.create(resourceLocation, TextureMapping.layer0(resourceLocation1), this.output,
//                    (x,y)->{
//                return this.generateBaseArmorTrimTemplate(x,y, pArmor.getMaterial());
//                    });
//        }
//
//        for(ItemModelGenerators.TrimModelData itemmodelgenerators$trimmodeldata : GENERATED_TRIM_MODELS) {
//            String s =
//        }
//    }
}