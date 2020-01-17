package fr.lukam.bot_api.bot;

import fr.lukam.bot_api.entities.interfaces.user.User;
import fr.lukam.bot_api.entities.interfaces.server.Server;

public interface Bot {

    Server getServer(String serverId);

    User getSelfUser();

    User getUser(String userId);

}
