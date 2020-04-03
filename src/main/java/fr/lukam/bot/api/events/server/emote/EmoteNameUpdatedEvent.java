package fr.lukam.bot.api.events.server.emote;

public interface EmoteNameUpdatedEvent extends EmoteEvent {

    String getOldName();

    String getNewName();

}
