package net.beyondredemption2122.voidascension.setup.worldgen;

import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;
import net.beyondredemption2122.voidascension.setup.customblocks.ModBlocks;

public enum OreType {

    RIFT_CRYSTAL_ORE(Lazy.of(ModBlocks.RIFT_CRYSTAL_ORE_BLOCK), 4, 24, 40, 5);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;



    private final int veinsPerChunk;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;

    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
