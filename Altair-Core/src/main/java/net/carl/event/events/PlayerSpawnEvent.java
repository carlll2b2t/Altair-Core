package net.carl.event.events;

import net.carl.event.CancelEvent;
import net.minecraft.client.network.OtherClientPlayerEntity;

// fetch additional players currently in-game entities

public class PlayerSpawnEvent extends CancelEvent {

    private  OtherClientPlayerEntity otherPlayer;

    public PlayerSpawnEvent(OtherClientPlayerEntity otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public OtherClientPlayerEntity getEntity() {
        return otherPlayer;
    }

    public void setEntity(OtherClientPlayerEntity otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

}
