package net.zorayume.sorafi;

import net.fabricmc.api.ModInitializer;

import net.zorayume.sorafi.item.ModItemGroups;
import net.zorayume.sorafi.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sorafi implements ModInitializer {
	public static final String MOD_ID = "sorafi";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerItem();
	}
}