package net.seppuku.event.player;

import net.seppuku.event.EventCancellable;

/**
 * Author Seth
 * 12/15/2019 @ 4:27 PM.
 */
public class EventFovModifier extends EventCancellable {

    private float fov;

    public EventFovModifier() {
    }

    public float getFov() {
        return fov;
    }

    public void setFov(float fov) {
        this.fov = fov;
    }
}
