package fr.lukam.bot.api.events.message;

import fr.lukam.bot.api.entities.interfaces.message.Message;
import fr.lukam.bot.api.events.channel.generic.TextChannelEvent;

public interface MessageEvent extends TextChannelEvent {

    Message getMessage();

}
