package net.hlofiys.chinaland.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.hlofiys.chinaland.ChinaLand;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CHINALAND_TAB = FabricItemGroupBuilder.build(new Identifier(ChinaLand.MOD_ID, "chinalandtab"), () -> new ItemStack(ModItems.RICE));
}
