package net.seppuku.event.render;

import net.minecraft.client.particle.Particle;
import net.seppuku.event.EventCancellable;

/**
 * @author noil
 */
public class EventAddEffect extends EventCancellable {

    private Particle particle;

    public EventAddEffect(Particle particle) {
        this.particle = particle;
    }

    public Particle getParticle() {
        return particle;
    }

    public void setParticle(Particle particle) {
        this.particle = particle;
    }
}
