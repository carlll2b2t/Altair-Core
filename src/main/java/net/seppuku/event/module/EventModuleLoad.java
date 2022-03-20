package net.seppuku.event.module;

/**
 * Author Seth
 * 6/10/2019 @ 2:36 PM.
 */
public class EventModuleLoad {

    private Module mod;

    public EventModuleLoad(Module mod) {
        this.mod = mod;
    }

    public Module getMod() {
        return mod;
    }

    public void setMod(Module mod) {
        this.mod = mod;
    }
}
