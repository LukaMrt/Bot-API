package fr.lukam.bot_api.fakes.channels;

import fr.lukam.bot_api.entities.channels.ChannelType;
import fr.lukam.bot_api.entities.channels.GuildChannel;
import fr.lukam.bot_api.entities.guild.Invite;
import fr.lukam.bot_api.fakes.guild.FakeInvite;

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
