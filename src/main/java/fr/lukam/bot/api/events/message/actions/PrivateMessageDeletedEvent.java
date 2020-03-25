package fr.lukam.bot.api.events.message.actions;

import fr.lukam.bot.api.events.channel.generic.TextChannelEvent;

public interface PrivateMessageDeletedEvent extends TextChannelEvent {

    String getMessageId();

}
