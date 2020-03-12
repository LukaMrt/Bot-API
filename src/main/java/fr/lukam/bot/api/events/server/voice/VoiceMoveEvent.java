package fr.lukam.bot.api.events.server.voice;

import fr.lukam.bot.api.entities.interfaces.server.ServerMember;
import fr.lukam.bot.api.events.server.member.ServerMemberEvent;

public interface VoiceMoveEvent extends ServerMemberEvent, ServerVoiceChannelEvent {

    ServerMember getMover();

}
