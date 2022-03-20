package net.seppuku.event.player;

import net.seppuku.event.EventCancellable;

/**
 * @author Seth
 */
public class EventPlayerReach extends EventCancellable {

    private float reach;

    public float getReach() {
        return reach;
    }

    public void setReach(float reach) {
        this.reach = reach;
    }
}