package org.net.nanophage.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.net.nanophage.Nanophage;

public class PhageTags {
    public static class Items {
        protected static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Nanophage.MOD_ID, name));
        }
        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
    public class Blocks {
        public static final TagKey<Block> NEEDS_XENO_METAL_TOOL =
                tag("needs_xeno_metal_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Nanophage.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
