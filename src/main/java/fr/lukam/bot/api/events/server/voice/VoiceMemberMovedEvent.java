package fr.lukam.bot.api.events.server.voice;

import fr.lukam.bot.api.entities.interfaces.channels.ServerVoiceChannel;
import fr.lukam.bot.api.events.server.member.ServerMemberEvent;

public interface VoiceMemberMovedEvent extends ServerMemberEvent, ServerVoiceChannelEvent {

    ServerVoiceChannel getOldChannel();

    ServerVoiceChannel getNewChannel();

}
