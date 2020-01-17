package fr.lukam.bot_api.entities.fakes;

import fr.lukam.bot_api.bot.Bot;
import fr.lukam.bot_api.entities.interfaces.user.User;
import fr.lukam.bot_api.entities.interfaces.server.Server;
import fr.lukam.bot_api.entities.fakes.server.FakeServer;
import fr.lukam.bot_api.entities.fakes.user.FakeUser;

public class NullBot implements Bot {

    @Override
    public Server getServer(String serverId) {
        return new FakeServer();
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
