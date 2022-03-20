package net.seppuku.event.render;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.seppuku.event.EventCancellable;

/**
 * Author Seth
 * 4/9/2019 @ 12:21 PM.
 */
public class EventRenderBlockSide extends EventCancellable {

    private Block block;
    private BlockPos pos;
    private boolean renderable;

    public EventRenderBlockSide(Block block, BlockPos pos) {
        this.block = block;
        this.pos = pos;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public BlockPos getPos() {
        return pos;
    }

    public void setPos(BlockPos pos) {
        this.pos = pos;
    }

    public boolean isRenderable() {
        return renderable;
    }

    public void setRenderable(boolean renderable) {
        this.renderable = renderable;
    }
}
