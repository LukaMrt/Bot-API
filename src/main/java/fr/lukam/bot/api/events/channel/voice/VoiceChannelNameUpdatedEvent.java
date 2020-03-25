package fr.lukam.bot.api.events.channel.voice;

import fr.lukam.bot.api.events.channel.generic.ServerVoiceChannelEvent;

public interface VoiceChannelNameUpdatedEvent extends ServerVoiceChannelEvent {

    String getOldName();

    String getNewName();

}
