package fr.lukam.bot.api.bot;

import fr.lukam.bot.api.behaviors.Fakeable;
import fr.lukam.bot.api.entities.interfaces.server.Server;
import fr.lukam.bot.api.entities.interfaces.user.User;

public interface Bot extends Fakeable {

    Server getServer(String serverId);

    User getSelfUser();

    User getUser(String userId);

    User getUserByName(String userName);

}
