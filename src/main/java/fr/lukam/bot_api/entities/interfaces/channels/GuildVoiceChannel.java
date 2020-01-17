package fr.lukam.bot_api.entities.interfaces.channels;

import fr.lukam.bot_api.entities.interfaces.guild.GuildMember;

import java.util.List;

public interface GuildVoiceChannel extends GuildChannel {

    int getUserLimit();

    void setUserLimit(int newLimit);

    List<GuildMember> getConnectedMembers();

    void kick(GuildMember member);

}
