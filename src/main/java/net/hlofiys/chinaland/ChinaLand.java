package net.hlofiys.chinaland;

import net.fabricmc.api.ModInitializer;
import net.hlofiys.chinaland.block.ModBlocks;
import net.hlofiys.chinaland.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChinaLand implements ModInitializer {
	public static final String MOD_ID = "chinaland";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.RegisterModBlocks();
	}
}
