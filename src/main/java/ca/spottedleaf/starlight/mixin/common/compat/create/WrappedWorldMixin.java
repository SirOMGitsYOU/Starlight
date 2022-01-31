package ca.spottedleaf.starlight.mixin.common.compat.create;

import ca.spottedleaf.starlight.common.world.ExtendedWorld;
import ca.spottedleaf.starlight.common.chunk.ExtendedChunk;
import com.simibubi.create.foundation.utility.worldWrappers.WrappedWorld;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.chunk.ImposterProtoChunk;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import net.minecraft.world.level.chunk.LightChunkGetter;
import net.minecraft.world.level.chunk.PalettedContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

/**
 * @author AeiouEnigma
 */
@Mixin(value = WrappedWorld.class, remap = false)
public class WrappedWorldMixin implements ExtendedWorld {

    @Override
    public final LevelChunk getChunkAtImmediately(final int chunkX, final int chunkZ) {
        return null;
    }

    @Override
    public final ChunkAccess getAnyChunkImmediately(final int chunkX, final int chunkZ) {
        return null;
    }
}