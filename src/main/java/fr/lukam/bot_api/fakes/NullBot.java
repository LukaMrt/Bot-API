package fr.lukam.bot_api.fakes;

import fr.lukam.bot_api.bot.Bot;
import fr.lukam.bot_api.entities.user.User;
import fr.lukam.bot_api.entities.guild.Guild;
import fr.lukam.bot_api.fakes.guild.FakeGuild;
import fr.lukam.bot_api.fakes.user.FakeUser;

public class NullBot implements Bot {

    @Override
    public Guild getGuild(String guildId) {
        return new FakeGuild();
    }

    @Override
    public User getSelfUser() {
        return new FakeUser();
    }

    @Override
    public User getUser(String userId) {
        return new FakeUser();
    }

}
