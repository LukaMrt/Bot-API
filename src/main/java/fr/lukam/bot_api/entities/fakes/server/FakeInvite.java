package fr.lukam.bot_api.entities.fakes.server;

import fr.lukam.bot_api.entities.interfaces.server.ServerMember;
import fr.lukam.bot_api.entities.interfaces.server.Invite;

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
