package fr.lukam.bot.api.events.member;

import fr.lukam.bot.api.entities.interfaces.server.ServerMember;
import fr.lukam.bot.api.events.user.UserEvent;

public interface ServerMemberEvent extends UserEvent {

    ServerMember getMember();

}
