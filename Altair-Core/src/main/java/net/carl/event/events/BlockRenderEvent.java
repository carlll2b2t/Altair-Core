package net.carl.event.events;

import net.carl.event.CancelEvent;
import net.minecraft.block.Block;

public class BlockRenderEvent extends CancelEvent {

    private Block block;

    private boolean forceDraw;

    public Block getBlock() {
        return block;
    }

    public void setForceDraw(boolean forceDraw) {
        this.forceDraw = forceDraw;
    }

    public boolean shouldForceDraw() {
        return forceDraw;
    }

}
