package fr.lukam.bot_api.entities.fakes;

import fr.lukam.bot_api.bot.Bot;
import fr.lukam.bot_api.entities.interfaces.user.User;
import fr.lukam.bot_api.entities.interfaces.guild.Guild;
import fr.lukam.bot_api.entities.fakes.guild.FakeGuild;
import fr.lukam.bot_api.entities.fakes.user.FakeUser;

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
