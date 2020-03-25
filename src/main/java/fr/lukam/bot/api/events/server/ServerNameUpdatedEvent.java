package fr.lukam.bot.api.events.server;

public interface ServerNameUpdatedEvent extends ServerEvent {

    String getOldName();

    String getNewName();

}
