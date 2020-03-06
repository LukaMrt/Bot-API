package fr.lukam.bot.api.entities.interfaces.channels;

import fr.lukam.bot.api.entities.interfaces.server.ServerMember;

import java.util.List;

public interface ServerVoiceChannel extends ServerChannel {

    int getUserLimit();

    void setUserLimit(int newLimit);

    List<ServerMember> getConnectedMembers();

    void kick(ServerMember member);

}
