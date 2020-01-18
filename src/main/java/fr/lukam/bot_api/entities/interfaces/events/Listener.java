package fr.lukam.bot_api.entities.interfaces.events;

public interface Listener {

    boolean isListener(String eventName);

    void execute(Object listener);

}
