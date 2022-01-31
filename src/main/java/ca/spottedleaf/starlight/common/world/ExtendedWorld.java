package ca.spottedleaf.starlight.common.world;

import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.chunk.ImposterProtoChunk;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.chunk.LightChunkGetter;
import net.minecraft.world.level.chunk.PalettedContainer;

public interface ExtendedWorld {

    // rets full chunk without blocking
    default public LevelChunk getChunkAtImmediately(final int chunkX, final int chunkZ) {
        return null;
    }

    // rets chunk at any stage, if it exists, immediately
    default public ChunkAccess getAnyChunkImmediately(final int chunkX, final int chunkZ) {
        return null;
    }

}
