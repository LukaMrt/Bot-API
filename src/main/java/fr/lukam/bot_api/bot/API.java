package fr.lukam.bot_api.bot;

import fr.lukam.bot_api.entities.interfaces.user.User;
import fr.lukam.bot_api.entities.interfaces.guild.Guild;
import fr.lukam.bot_api.entities.fakes.NullBot;

public abstract class API {

    private static Bot bot = new NullBot();

    public static void setAPI(Bot bot) {
        API.bot = bot;
    }

    public static Guild getGuild(String guildId) {
        return bot.getGuild(guildId);
    }

    public static User getSelfUser() {
        return bot.getSelfUser();
    }

    public static User getUser(String userId) {
        return bot.getUser(userId);
    }

}
