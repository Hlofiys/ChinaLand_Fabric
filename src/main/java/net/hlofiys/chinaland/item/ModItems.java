package net.hlofiys.chinaland.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hlofiys.chinaland.ChinaLand;
import net.hlofiys.chinaland.block.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RICE = registerItem("rice",
            new Item(new FabricItemSettings().group(ModItemGroup.CHINALAND_TAB).food(new FoodComponent.Builder().hunger(1).snack().saturationModifier(0.2f).build())));

    public static final Item RICE_BOWL = registerItem("rice_bowl",
            new Item(new FabricItemSettings().group(ModItemGroup.CHINALAND_TAB).food(new FoodComponent.Builder().hunger(5).snack().saturationModifier(1.2f).build())));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ChinaLand.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ChinaLand.LOGGER.debug("Registring Mod Items for " + ChinaLand.MOD_ID);
    }
}
