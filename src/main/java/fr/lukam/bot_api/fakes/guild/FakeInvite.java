package fr.lukam.bot_api.fakes.guild;

import fr.lukam.bot_api.entities.guild.GuildMember;
import fr.lukam.bot_api.entities.guild.Invite;

public class FakeInvite implements Invite {

    @Override
    public String getURL() {
        return "";
    }

    @Override
    public GuildMember getInviter() {
        return new FakeGuildMember();
    }

}
