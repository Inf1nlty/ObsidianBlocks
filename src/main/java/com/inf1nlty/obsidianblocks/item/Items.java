package com.inf1nlty.obsidianblocks.item;

import com.inf1nlty.obsidianblocks.ObsidianBlocks;
import com.inf1nlty.obsidianblocks.block.Blocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {

    public static final Item OBSIDIAN_SLAB = registerBlockItem("obsidian_slab", Blocks.OBSIDIAN_SLAB);
    public static final Item OBSIDIAN_STAIRS = registerBlockItem("obsidian_stairs", Blocks.OBSIDIAN_STAIRS);
    public static final Item OBSIDIAN_TRAPDOOR = registerBlockItem("obsidian_trapdoor", Blocks.OBSIDIAN_TRAPDOOR);

    private static Item registerBlockItem(String name, net.minecraft.block.Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ObsidianBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void initialize() {
        ObsidianBlocks.LOGGER.info("Registering items for " + ObsidianBlocks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.add(OBSIDIAN_SLAB);
            content.add(OBSIDIAN_STAIRS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(content -> {
            content.add(OBSIDIAN_TRAPDOOR);
        });
    }
}