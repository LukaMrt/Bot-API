package fr.lukam.bot.api.entities.interfaces.events;

import fr.lukam.bot.api.entities.interfaces.channels.TextChannel;
import fr.lukam.bot.api.entities.interfaces.message.Message;
import fr.lukam.bot.api.entities.interfaces.server.Server;
import fr.lukam.bot.api.entities.interfaces.user.User;

public interface CommandEvent {

    char getPrefix();

    String[] getArgs();

    User getUser();

    Message getMessage();

    TextChannel getChannel();

    Server getServer();

    void reply(Message message);

    void replyInDm(Message embed);

    boolean isOwner();

}
