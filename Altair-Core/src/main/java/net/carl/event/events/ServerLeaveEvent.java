package net.carl.event.events;

import net.carl.event.Event;
import net.minecraft.client.network.ServerInfo;


public class ServerLeaveEvent {

    private final ServerInfo serverInfo;

    public ServerLeaveEvent(final ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
    }

    public ServerInfo getServerInfo() {
        return serverInfo;
    }
}

