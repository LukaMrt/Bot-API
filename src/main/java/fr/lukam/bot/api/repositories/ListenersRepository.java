package fr.lukam.bot.api.repositories;

import fr.lukam.bot.api.entities.interfaces.events.Listener;

import java.util.List;

public interface ListenersRepository {

    void registerListeners(List<Listener> listeners);

    List<Listener> getListeners();

    Listener getListenerByName(String name);

}
