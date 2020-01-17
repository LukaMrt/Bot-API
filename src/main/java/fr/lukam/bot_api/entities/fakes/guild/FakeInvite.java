package fr.lukam.bot_api.entities.fakes.guild;

import fr.lukam.bot_api.entities.interfaces.guild.GuildMember;
import fr.lukam.bot_api.entities.interfaces.guild.Invite;

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
