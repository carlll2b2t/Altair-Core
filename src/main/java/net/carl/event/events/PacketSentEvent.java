package net.carl.event.events;

import net.carl.event.CancelEvent;
import net.minecraft.network.Packet;

// fetch packet sent from client

public class PacketSentEvent extends CancelEvent {

    private Packet<?> packet;

    public PacketSentEvent(Packet<?> packet) {
        this.packet = packet;
    }

    public Packet<?> getPacket() {
        return packet;
    }

    public void setPacket(Packet<?> packet) {
        this.packet = packet;
    }

}
