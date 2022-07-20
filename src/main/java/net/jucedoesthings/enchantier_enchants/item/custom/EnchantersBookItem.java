package net.jucedoesthings.enchantier_enchants.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.BookItem;


public class EnchantersBookItem
        extends BookItem {
    public EnchantersBookItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return stack.getCount() == 1;
    }

    @Override
    public int getEnchantability() {
        return 1;
    }
}