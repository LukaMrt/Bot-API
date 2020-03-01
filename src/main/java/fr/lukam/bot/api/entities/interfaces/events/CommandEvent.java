package fr.lukam.bot.api.entities.interfaces.events;

import fr.lukam.bot.api.entities.interfaces.channels.TextChannel;
import fr.lukam.bot.api.entities.interfaces.message.Embed;
import fr.lukam.bot.api.entities.interfaces.server.Server;
import fr.lukam.bot.api.entities.interfaces.user.User;

public interface CommandEvent {

    char getPrefix();

    String[] getArgs();

    User getUser();

    TextChannel getChannel();

    Server getServer();

    void reply(String message);

    void replyInDm(Embed embed);

    boolean isOwner();

}
