package net.seppuku.event.world;

import net.minecraft.entity.Entity;
import net.seppuku.event.EventCancellable;

/**
 * Author Seth
 * 11/10/2019 @ 3:30 PM.
 */
public class EventAddEntity extends EventCancellable {

    private Entity entity;

    public EventAddEntity(Entity entity) {
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}
