package fr.lukam.bot.api.events.server.emote;

public interface EmoteUpdateNameEvent extends EmoteEvent {

    String getOldName();

    String getNewName();

}
