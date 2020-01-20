package fr.lukam.bot_api.entities.fakes.channels;

import fr.lukam.bot_api.entities.fakes.server.FakeInvite;
import fr.lukam.bot_api.entities.interfaces.channels.ChannelType;
import fr.lukam.bot_api.entities.interfaces.channels.ServerVoiceChannel;
import fr.lukam.bot_api.entities.interfaces.server.Invite;
import fr.lukam.bot_api.entities.interfaces.server.ServerMember;

import java.util.ArrayList;
import java.util.List;

public class FakeServerVoiceChannel implements ServerVoiceChannel {

    @Override
    public int getUserLimit() {
        return 0;
    }

    @Override
    public void setUserLimit(int newLimit) {
        // Empty because it is a null object
    }

    @Override
    public List<ServerMember> getConnectedMembers() {
        return new ArrayList<>();
    }

    @Override
    public void kick(ServerMember member) {
        // Empty because it is a null object
    }

    @Override
    public Invite createInvite() {
        return new FakeInvite();
    }

    @Override
    public boolean isFake() {
        return true;
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
    public String getName() {
        return "";
    }
}
