package fr.lukam.bot.api.events.server.voice;

import fr.lukam.bot.api.entities.interfaces.channels.ServerVoiceChannel;

public interface ServerVoiceChannelEvent {

    ServerVoiceChannel getChannel();

}
