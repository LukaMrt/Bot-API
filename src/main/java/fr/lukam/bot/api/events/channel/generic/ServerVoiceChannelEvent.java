package fr.lukam.bot.api.events.channel.generic;

import fr.lukam.bot.api.entities.interfaces.channels.ServerVoiceChannel;

public interface ServerVoiceChannelEvent {

    ServerVoiceChannel getChannel();

}
