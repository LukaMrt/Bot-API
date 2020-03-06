package fr.lukam.bot.api.entities.interfaces.events;

public interface Listener {

    boolean isListener(String eventName);

    void execute(Object listener);

}
