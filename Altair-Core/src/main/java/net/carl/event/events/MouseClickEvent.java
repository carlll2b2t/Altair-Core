package net.carl.event.events;

import net.carl.event.Event;

public class MouseClickEvent extends Event {

    private int button;

    public MouseClickEvent(int button) {
        this.button = button;
    }

    public int getButton() {
        return button;
    }

}
