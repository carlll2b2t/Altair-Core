package net.seppuku.event.world;

import net.minecraft.client.multiplayer.WorldClient;
import net.seppuku.event.EventCancellable;

/**
 * created by noil on 11/6/19 at 5:27 PM
 */
public class EventLoadWorld extends EventCancellable {

    private final WorldClient world;

    public EventLoadWorld(WorldClient world) {
        this.world = world;
    }

    public WorldClient getWorld() {
        return world;
    }
}

