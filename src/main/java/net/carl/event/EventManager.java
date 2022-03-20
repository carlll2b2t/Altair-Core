package net.carl.event;

//EVENT MANAGER TAKEN FROM https://github.com/OxideWaveLength/Minecraft-Hack-BaseClient/blob/master/minecraft/me/wavelength/baseclient/event/EventManager.java
//AS I DO NOT HAVE A STRONG ENOUGH UNDERSTANDING OF HASHMAPS TO FIGURE OUT MINECRAFT'S EVENT SYSTEM IN ITS ENTIRETY.
//ILL TRY AND FIGURE THIS OUT MYSELF EVENTUALLY BUT FOR NOW THIS SHOULD WORK.

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {

    private List<EventListener> eventListeners;

    private HashMap<String, Method> listenerMethods;

    public EventManager() {
        this.eventListeners = new ArrayList<EventListener>();
        this.listenerMethods = new HashMap<String, Method>();

        Method[] methods = EventListener.class.getMethods();
        for (Method method : methods) {
            this.listenerMethods.put(method.getName().substring(2), method);
        }
    }

    @Deprecated
    public void registerEvent(EventListener eventListener) {
        registerListener(eventListener);
    }

    @Deprecated
    public void unregisterEvent(EventListener eventListener) {
        unregisterListener(eventListener);
    }

    public void registerListener(EventListener eventListener) {
        this.eventListeners.add(eventListener);
    }

    public void unregisterListener(EventListener eventListener) {
        if (eventListeners.contains(eventListener))
            eventListeners.remove(eventListener);
    }

    public void unregisterListener(Class<? extends EventListener> clasz) {
        for (int i = 0; i < eventListeners.size(); i++)
            if (eventListeners.get(i).getClass().equals(clasz))
                eventListeners.remove(i);
    }

    public Event call(Event event) {
        List<EventListener> eventListeners = new ArrayList<EventListener>(this.eventListeners);

        String eventName = event.getClass().getSimpleName();
        eventName = eventName.substring(0, eventName.toLowerCase().lastIndexOf("event"));

        for (EventListener listener : eventListeners) {
            if (event instanceof CancelEvent)
                if (((CancelEvent) event).isCancelled())
                    return event;
            try {
                if (!(listenerMethods.containsKey(eventName)))
                    listenerMethods.put(eventName, EventListener.class.getMethod("on" + eventName, event.getClass()));

                Method method = listenerMethods.get(eventName);
                method.invoke(listener, event);
            } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return event;
    }

}
