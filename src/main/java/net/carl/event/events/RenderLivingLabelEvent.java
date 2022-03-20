package net.carl.event.events;

import net.minecraft.entity.Entity;
import net.carl.event.CancelEvent;

public class RenderLivingLabelEvent extends CancelEvent {

    private Entity entity;
    private String label;

    public RenderLivingLabelEvent(Entity entity, String label) {
        this.entity = entity;
        this.label = label;
    }

    public Entity getEntity() {
        return entity;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}