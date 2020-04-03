package fr.lukam.bot.api.events.message.actions.server;

import fr.lukam.bot.api.events.channel.generic.TextChannelEvent;
import fr.lukam.bot.api.events.server.ServerEvent;

public interface ServerMessageDeletedEvent extends ServerEvent, TextChannelEvent {

    String getMessageId();

}
