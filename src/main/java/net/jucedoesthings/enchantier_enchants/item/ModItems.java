package net.jucedoesthings.enchantier_enchants.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jucedoesthings.enchantier_enchants.EnchantierEnchants;
import net.jucedoesthings.enchantier_enchants.item.custom.EnchantersBookItem;
import net.minecraft.item.BookItem;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ENCHANTERS_BOOK = registerItem("enchanters_book", new EnchantersBookItem(new FabricItemSettings().fireproof().maxCount(1).group(ItemGroup.MISC).rarity(Rarity.EPIC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EnchantierEnchants.MOD_ID, name), item);
    }
    public static void registerModItems() {
        EnchantierEnchants.LOGGER.info("Registering " + EnchantierEnchants.MOD_ID + " Mod Items");
    }
}
