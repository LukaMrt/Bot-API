package fr.lukam.bot.api.events.channel.text;

import fr.lukam.bot.api.events.channel.generic.ServerTextChannelEvent;

public interface TextChannelUpdateNameEvent extends ServerTextChannelEvent {

    String getOldName();

    String getNewName();

}
