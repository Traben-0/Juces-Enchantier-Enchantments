package net.jucedoesthings.enchantier_enchants.mixin;

import net.jucedoesthings.enchantier_enchants.item.ModItems;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.EnchantmentScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(EnchantmentScreenHandler.class)
abstract class EnchantmentScreenHandlerMixin {




    @ModifyArg(
            method = "method_17410",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z")
    )
    private Item mixin(Item item) {
        return ModItems.ENCHANTERS_BOOK;
    }




}