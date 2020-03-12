package fr.lukam.bot.api.events.server.member;

import fr.lukam.bot.api.entities.interfaces.server.ServerMember;
import fr.lukam.bot.api.events.server.ServerEvent;
import fr.lukam.bot.api.events.user.UserEvent;

public interface ServerMemberEvent extends UserEvent, ServerEvent {

    ServerMember getMember();

}
