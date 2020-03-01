package fr.lukam.bot.api.entities.fakes.server;

import fr.lukam.bot.api.entities.interfaces.server.Invite;
import fr.lukam.bot.api.entities.interfaces.server.ServerMember;

public class FakeInvite implements Invite {

    @Override
    public String getURL() {
        return "";
    }

    @Override
    public ServerMember getInviter() {
        return new FakeServerMember();
    }

    @Override
    public boolean isFake() {
        return true;
    }

}
