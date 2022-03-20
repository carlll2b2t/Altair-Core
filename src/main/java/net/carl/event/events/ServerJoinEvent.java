package net.carl.event.events;

import net.carl.event.Event;
import net.minecraft.client.network.ServerInfo;

//load server information into client on join

public class ServerJoinEvent extends Event {

    private final ServerInfo serverInfo;

    public ServerJoinEvent(final ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
    }

    public ServerInfo getServerInfo() {
        return serverInfo;
    }

}
