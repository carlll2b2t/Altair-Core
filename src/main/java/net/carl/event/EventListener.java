package net.carl.event;

import net.carl.event.events.*;
import net.minecraft.client.MinecraftClient;

public class EventListener {

    protected MinecraftClient client;

    public EventListener() {
        this.client = MinecraftClient.getInstance();
    }

    public void onPacketSent(PacketSentEvent event) { }
    public void onPacketRecieved(PacketReceivedEvent event) { }
    public void onMessageSent(MessageSentEvent event) { }
    public void onPacketReceived(PacketReceivedEvent event) { }
    public void onServerJoin(ServerJoinEvent event) { }
    public void onServerLeave(ServerLeaveEvent event) { }
    public void onPlayerSpawn(PlayerSpawnEvent event) { }
    public void onKeyPress(KeyPressEvent event) { }
    public void onMouseClick(MouseClickEvent event) { }
    public void onUpdate(UpdateEvent event) { }
    public void onRender2D(Render2DEvent event) { }
    public void onRender3D(Render3DEvent event) { }
    public void onRenderLivingLabel(RenderLivingLabelEvent event) { }
    public void onServerConnecting(ServerConnectingEvent event) { }
    public void onSlowDown(SlowDownEvent event) { }

}
