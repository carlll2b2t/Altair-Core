package net.carl.module;

import java.util.ArrayList;
import java.util.List;

import net.carl.init.Init;
import net.carl.event.EventListener;

import static net.carl.init.Init.*;

//import all modules to here eventually

public class ModuleManager extends EventListener {

    private List<Module> modules;
    private List<Module> toggledModules;

    public ModuleManager() {
        this.modules = new ArrayList<Module>();
        Init.instance.getEventManager().registerListener(this);
        startModules();
    }

    //initialize modules, do this for all modules by default
    public void startModules() {

    }

    public void registerModule(Module module) {
        modules.add(module);
    }

    // fetch module by string, use via console with alternate id parsing option
    public Module getModule(String name) {
        for(int i=0; i<modules.size(); i++) {
            if(modules.get(i).getName().equalsIgnoreCase(name)) {
                return modules.get(i);
            }
        }
        return null;
    }

    // fetch module by id, faster so use this with clickGUI
    public Module getModule(int modID) {
        for(int i=0; i<modules.size(); i++) {
            if(modules.get(i).getModID() == modID) {
                return modules.get(i);
            }
        }
        return null;
    }

    //fetch toggled mods
    public List<Module> getToggledModule(int modID) {
        List<Module> modules = new ArrayList<Module>();
        for(int i=0; i<this.modules.size(); i++) {
            Module tmpModule = this.modules.get(i);
            if(tmpModule.getToggleStatus()==true) {
                modules.add(tmpModule);
            };
        }
        return modules;
    }

}
