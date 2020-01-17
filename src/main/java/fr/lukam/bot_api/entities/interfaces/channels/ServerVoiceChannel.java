package fr.lukam.bot_api.entities.interfaces.channels;

import fr.lukam.bot_api.entities.interfaces.server.ServerMember;

import java.util.List;

public interface ServerVoiceChannel extends ServerChannel {

    int getUserLimit();

    void setUserLimit(int newLimit);

    List<ServerMember> getConnectedMembers();

    void kick(ServerMember member);

}
