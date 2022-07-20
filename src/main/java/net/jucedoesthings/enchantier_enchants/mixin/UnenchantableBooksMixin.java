package net.jucedoesthings.enchantier_enchants.mixin;

import net.minecraft.item.BookItem;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(BookItem.class)
public abstract class UnenchantableBooksMixin {
    public int getEnchantability() {
        return 0;
    }
}