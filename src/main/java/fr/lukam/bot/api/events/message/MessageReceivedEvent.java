package fr.lukam.bot.api.events.message;

import fr.lukam.bot.api.entities.interfaces.message.Message;
import fr.lukam.bot.api.events.member.ServerMemberEvent;

public interface MessageReceivedEvent extends ServerMemberEvent {

    Message getMessage();

}
