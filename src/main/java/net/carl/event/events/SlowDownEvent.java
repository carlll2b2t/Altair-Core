package net.carl.event.events;

import net.carl.event.CancelEvent;

public class SlowDownEvent extends CancelEvent {

    private float slowDownMultiplier;

    public SlowDownEvent(float slowDownMultiplier) {
        this.slowDownMultiplier = slowDownMultiplier;
    }

    public float getSlowDownMultiplier() {
        return slowDownMultiplier;
    }

    public void setSlowDownMultiplier(float slowDownMultiplier) {
        this.slowDownMultiplier = slowDownMultiplier;
    }

}