package com.inf1nlty.obsidianblocks;

import com.inf1nlty.obsidianblocks.block.Blocks;
import com.inf1nlty.obsidianblocks.item.Items;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObsidianBlocks implements ModInitializer {
    public static final String MOD_ID = "obsidian_blocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        Blocks.initialize();
        Items.initialize();

    }
}