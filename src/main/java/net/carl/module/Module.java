package net.carl.module;

import net.minecraft.client.MinecraftClient;
import net.carl.event.events.MessageSentEvent;

public class Module {

    //default module enable set to false, add config reading/saving from json in the future
    boolean toggled = false;
    String moduleName = "DEFAULTNAME";
    int modID = 0;

    public enum Category {
        CUSTOM, PLAYER, RENDER, WORLD

    }

    //initialize module
    public static void modInit(){
    }

    //enable/disable functions to be used on module input/console message
    public void toggle() {
        toggled = true;
    }

    public void untoggle() {
        toggled = false;
    }

    public boolean getToggleStatus() {
        return toggled;
    }

    public String getName(){
        return moduleName;
    }

    public int getModID(){
        return modID;
    }



    //get module name from sent message sent
}
