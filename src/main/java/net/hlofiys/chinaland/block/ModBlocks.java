package net.hlofiys.chinaland.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hlofiys.chinaland.ChinaLand;
import net.hlofiys.chinaland.item.ModItemGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block FAKE_GOLD = registerBlock("fake_gold",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4F).requiresTool()), ModItemGroup.CHINALAND_TAB);

    public static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(ChinaLand.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(ChinaLand.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void RegisterModBlocks() { ChinaLand.LOGGER.debug("Registring Mod Blocks for " + ChinaLand.MOD_ID);}
}
