package fr.lukam.bot_api.entities.interfaces.server;

import fr.lukam.bot_api.entities.interfaces.user.User;
import fr.lukam.bot_api.entities.interfaces.channels.ServerVoiceChannel;

import java.time.LocalDateTime;
import java.util.Set;

public interface ServerMember extends User {

    String getNickName();

    Set<Role> getRoles();

    LocalDateTime getJoinTime();

    boolean isOwner();

    boolean hashPermissions(Permission... permissions);

    void kick(String reason);

    void ban(String reason);

    void mute();

    void addRoles(Role... roles);

    void removeRoles(Role... roles);

    void setNickName(String newNickName);

    void addPermission(Permission permission);

    void removePermission(Permission permission);

    void connectToVoiceChannel(ServerVoiceChannel channel);

}