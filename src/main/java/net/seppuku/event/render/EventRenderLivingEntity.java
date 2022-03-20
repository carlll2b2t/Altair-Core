package net.seppuku.event.render;

import net.minecraft.entity.EntityLivingBase;
import net.seppuku.event.EventCancellable;

/**
 * Author Seth
 * 4/23/2019 @ 12:41 PM.
 */
public class EventRenderLivingEntity extends EventCancellable {

    private EntityLivingBase entity;

    public EventRenderLivingEntity(EventStage stage, EntityLivingBase entity) {
        super(stage);
        this.entity = entity;
    }

    public EntityLivingBase getEntity() {
        return entity;
    }

    public void setEntity(EntityLivingBase entity) {
        this.entity = entity;
    }
}
