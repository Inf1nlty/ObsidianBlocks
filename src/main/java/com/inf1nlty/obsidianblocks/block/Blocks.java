package com.inf1nlty.obsidianblocks.block;

import com.inf1nlty.obsidianblocks.ObsidianBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class Blocks {

    public static final Block OBSIDIAN_SLAB = registerBlock("obsidian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OBSIDIAN)
                    .requiresTool()));

    public static final Block OBSIDIAN_STAIRS = registerBlock("obsidian_stairs",
            new StairsBlock(net.minecraft.block.Blocks.OBSIDIAN.getDefaultState(),
                    FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OBSIDIAN)
                            .requiresTool()));

    public static final Block OBSIDIAN_TRAPDOOR = registerBlock("obsidian_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.OBSIDIAN)
                    .requiresTool()
                    .nonOpaque()
                    .sounds(BlockSoundGroup.STONE)
                    .allowsSpawning((state, world, pos, type) -> false)
                    .solidBlock((state, world, pos) -> false)
                    .suffocates((state, world, pos) -> false)
                    .blockVision((state, world, pos) -> false),
                    BlockSetType.OAK));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(ObsidianBlocks.MOD_ID, name), block);
    }

    public static void initialize() {
        ObsidianBlocks.LOGGER.info("Registering blocks for " + ObsidianBlocks.MOD_ID);
    }
}