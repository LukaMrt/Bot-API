package fr.lukam.bot_api.entities.fakes.channels;

import fr.lukam.bot_api.entities.interfaces.channels.ChannelType;
import fr.lukam.bot_api.entities.interfaces.channels.GuildChannel;
import fr.lukam.bot_api.entities.interfaces.guild.Invite;
import fr.lukam.bot_api.entities.fakes.guild.FakeInvite;

public class FakeGuildChannel implements GuildChannel {
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

}
