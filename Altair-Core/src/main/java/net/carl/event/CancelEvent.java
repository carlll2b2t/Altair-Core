package net.carl.event;

public class CancelEvent extends Event {

    private boolean cancelled = false;

    public void CancellableEvent() {
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public boolean setCancelled(boolean cancelled) {
        return this.cancelled = cancelled;
    }


}
