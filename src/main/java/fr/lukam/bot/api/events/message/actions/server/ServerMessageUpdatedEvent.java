package fr.lukam.bot.api.events.message.actions.server;

import fr.lukam.bot.api.events.message.MessageEvent;
import fr.lukam.bot.api.events.message.actions.PrivateMessageUpdatedEvent;
import fr.lukam.bot.api.events.server.ServerEvent;

public interface ServerMessageUpdatedEvent extends ServerEvent, MessageEvent {
}
