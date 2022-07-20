package net.jucedoesthings.enchantier_enchants;

import net.fabricmc.api.ModInitializer;
import net.jucedoesthings.enchantier_enchants.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnchantierEnchants implements ModInitializer {
	public static final String MOD_ID = "enchantier_enchants";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
