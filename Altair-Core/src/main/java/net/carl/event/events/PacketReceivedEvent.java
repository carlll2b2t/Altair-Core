package net.carl.event.events;

import net.carl.event.CancelEvent;
import net.minecraft.network.Packet;

//fetch packetrecieved from server

public class PacketReceivedEvent extends CancelEvent {

    private Packet<?> packet;

    public PacketReceivedEvent(Packet<?> packet) {
        this.packet = packet;
    }

    public Packet<?> getPacket() {
        return packet;
    }

    public void setPacket(Packet<?> packet) {
        this.packet = packet;
    }

}
