package fr.lukam.bot.api.events.message.actions.server;

import fr.lukam.bot.api.events.message.actions.MessageDeletedEvent;
import fr.lukam.bot.api.events.server.ServerEvent;

public interface ServerMessageDeletedEvent extends ServerEvent, MessageDeletedEvent {
}
