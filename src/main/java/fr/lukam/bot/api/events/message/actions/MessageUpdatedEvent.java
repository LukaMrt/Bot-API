package fr.lukam.bot.api.events.message.actions;

import fr.lukam.bot.api.entities.interfaces.message.Message;
import fr.lukam.bot.api.events.message.MessageEvent;

public interface MessageUpdatedEvent extends MessageEvent {

    Message getOldMessage();

    Message getNewMessage();

}
