package fr.lukam.bot.api.events.user;

import fr.lukam.bot.api.entities.interfaces.channels.TextChannel;

public interface UserTypingEvent extends UserEvent {

    TextChannel getChannel();

}
