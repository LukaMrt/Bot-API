package fr.lukam.bot.api.events.server.emote;

import fr.lukam.bot.api.entities.interfaces.reaction.Emote;
import fr.lukam.bot.api.events.server.ServerEvent;

public interface EmoteEvent extends ServerEvent {

    Emote getEmote();

}
