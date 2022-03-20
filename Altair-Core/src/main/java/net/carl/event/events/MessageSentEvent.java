package net.carl.event.events;

import net.carl.event.CancelEvent;

//fetch message sent

public class MessageSentEvent extends CancelEvent {

    private String message;

    public MessageSentEvent(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public String setMessage(String message) {
        return this.message = message;
    }

}
