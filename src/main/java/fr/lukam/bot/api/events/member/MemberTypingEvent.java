package fr.lukam.bot.api.events.member;

import fr.lukam.bot.api.entities.interfaces.server.Server;
import fr.lukam.bot.api.events.user.UserTypingEvent;

public interface MemberTypingEvent extends ServerMemberEvent, UserTypingEvent {

    Server getServer();

}
