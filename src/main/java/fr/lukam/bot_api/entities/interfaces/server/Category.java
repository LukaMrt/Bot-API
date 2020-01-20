package fr.lukam.bot_api.entities.interfaces.server;

import fr.lukam.bot_api.behaviors.Fakeable;
import fr.lukam.bot_api.behaviors.Identifiable;
import fr.lukam.bot_api.behaviors.Nameable;
import fr.lukam.bot_api.entities.interfaces.channels.ServerChannel;
import fr.lukam.bot_api.entities.interfaces.channels.ServerTextChannel;
import fr.lukam.bot_api.entities.interfaces.channels.ServerVoiceChannel;

import java.util.List;

public interface Category extends Identifiable, Nameable, Fakeable {

    List<ServerChannel> getChannels();

    List<ServerMember> getAuthorizedMembers();

    void addPermissionToRole(Role role, Permission permission);

    void removePermissionFromRole(Role role, Permission permission);

    void addChannel(ServerTextChannel serverChannel);

    void addChannel(ServerVoiceChannel serverChannel);

    void removeChannel(ServerTextChannel serverChannel);

    void removeChannel(ServerVoiceChannel serverChannel);

}
