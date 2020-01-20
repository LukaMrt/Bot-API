package fr.lukam.bot_api.entities.fakes.channels;

import fr.lukam.bot_api.entities.interfaces.channels.ChannelType;
import fr.lukam.bot_api.entities.interfaces.channels.ServerChannel;
import fr.lukam.bot_api.entities.interfaces.server.Invite;
import fr.lukam.bot_api.entities.fakes.server.FakeInvite;

public class FakeServerChannel implements ServerChannel {

    @Override
    public Invite createInvite() {
        return new FakeInvite();
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public ChannelType getChannelType() {
        return new FakeChannelType();
    }

    @Override
    public boolean isFake() {
        return true;
    }

    @Override
    public String getName() {
        return "";
    }

}
