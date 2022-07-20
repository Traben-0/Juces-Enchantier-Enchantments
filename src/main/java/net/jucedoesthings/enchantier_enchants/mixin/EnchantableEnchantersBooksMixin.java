package net.jucedoesthings.enchantier_enchants.mixin;

import net.jucedoesthings.enchantier_enchants.EnchantierEnchants;
import net.jucedoesthings.enchantier_enchants.item.ModItems;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.awt.print.Printable;

@Mixin(EnchantmentHelper.class)
abstract class EnchantableEnchantersBooksMixin {


    @Redirect(method = "enchant(Lnet/minecraft/util/math/random/Random;Lnet/minecraft/item/ItemStack;IZ)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    private static boolean returnEnchantedBookNull(ItemStack target, Item item) {
        EnchantierEnchants.LOGGER.info("This is just a test");
        return target.isOf(ModItems.ENCHANTERS_BOOK);
    }


    @Redirect(method = "getPossibleEntries", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    private static boolean returnBookNull(ItemStack stack, Item item) {
        return stack.isOf(ModItems.ENCHANTERS_BOOK);
    }
}