package net.carl.event.events;

import net.carl.event.CancelEvent;

//fetch message recieved

public class MessageRecievedEvent extends CancelEvent {

    private String message;

    public MessageRecievedEvent(String message, boolean fromMinecraft) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String setMessage (String message) {
        return this.message = message;
    }

}
