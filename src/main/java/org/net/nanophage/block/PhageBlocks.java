package org.net.nanophage.block;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.net.nanophage.Nanophage;
import org.net.nanophage.item.PhageItems;

import java.util.function.Supplier;

public class PhageBlocks {
    public static final DeferredRegister<Block> PHAGE_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Nanophage.MOD_ID);

    public static final RegistryObject<Block> XENO_METAL_BLOCK = registerBlock("xeno_metal_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2,1).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> XENO_METAL_STAIRS = registerBlock("xeno_metal_stairs",
            ()->new StairBlock(()->PhageBlocks.XENO_METAL_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).sound(SoundType.METAL)));
    public static final RegistryObject<Block> XENO_METAL_SLAB = registerBlock("xeno_metal_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB).sound(SoundType.METAL)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = PHAGE_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return PhageItems.ITEM_REGISTER.register(name, ()->new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus) {
        PHAGE_BLOCKS.register(eventbus);
    }

}
