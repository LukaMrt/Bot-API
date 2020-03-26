package fr.lukam.bot.api.entities.fakes;

import fr.lukam.bot.api.entities.fakes.server.FakeServer;
import fr.lukam.bot.api.entities.fakes.user.FakeUser;
import fr.lukam.bot.api.entities.interfaces.server.Server;
import fr.lukam.bot.api.entities.interfaces.user.User;
import fr.lukam.bot.api.bot.Bot;

public class FakeBot implements Bot {

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

    @Override
    public User getUserByName(String userName) {
        return new FakeUser();
    }

    @Override
    public boolean isFake() {
        return true;
    }

}
