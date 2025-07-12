package com.inf1nlty.obsidianblocks.client;

import com.inf1nlty.obsidianblocks.block.Blocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ObsidianBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.OBSIDIAN_TRAPDOOR, RenderLayer.getCutout());
    }
}