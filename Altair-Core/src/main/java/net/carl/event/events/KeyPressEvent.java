package net.carl.event.events;

import net.carl.event.CancelEvent;

public class KeyPressEvent extends CancelEvent {

    private int key;

    public KeyPressEvent(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

}
