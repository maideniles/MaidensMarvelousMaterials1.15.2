
package com.maideniles.maidensmaterials.init;


import com.maideniles.maidensmaterials.MarvelousMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class ModItemGroups {

    public static class ModItemGroup extends ItemGroup {

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }

    }

    public static final ItemGroup MAIDENS_BLOCKS_GROUP = new ModItemGroup("maidens_blocks_tab", () -> new ItemStack(ModBlocks.dogwoodLeaves.get()));
    public static final ItemGroup MAIDENS_ITEMS_GROUP = new ModItemGroup("maidens_items_tab", () -> new ItemStack(ModItems.DOGWOOD_BLOSSOMS.get()));
}
