package fr.lukam.bot.api.entities.fakes.events;

import fr.lukam.bot.api.entities.interfaces.events.Listener;

public class FakeListener implements Listener {

    @Override
    public boolean isListener(String eventName) {
        return true;
    }

    @Override
    public void execute(Object listener) {
        // Empty because it is a null object
    }

}
