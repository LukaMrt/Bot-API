package fr.lukam.bot_api.entities;

import fr.lukam.bot_api.Permission;
import fr.lukam.bot_api.entities.channels.GuildVoiceChannel;

import java.util.Calendar;
import java.util.Set;

public interface GuildMember extends User {

    String getNickName();

    Set<Role> getRoles();

    Calendar getJoinTime();

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

    void connectToVoiceChannel(GuildVoiceChannel channel);

}
