package fr.lukam.bot_api.bot;

import fr.lukam.bot_api.entities.interfaces.user.User;
import fr.lukam.bot_api.entities.interfaces.server.Server;
import fr.lukam.bot_api.entities.fakes.NullBot;

public abstract class API {

    private static Bot bot = new NullBot();

    public static void setAPI(Bot bot) {
        API.bot = bot;
    }

    public static Server getServer(String serverId) {
        return bot.getServer(serverId);
    }

    public static User getSelfUser() {
        return bot.getSelfUser();
    }

    public static User getUser(String userId) {
        return bot.getUser(userId);
    }

}
