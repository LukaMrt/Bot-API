package fr.lukam.bot_api.entities;

import fr.lukam.bot_api.Permission;

import java.util.Calendar;
import java.util.Set;

public interface GuildMember extends User {

    String getNickName();

    Set<Role> getRoles();

    Calendar getJoinTime();

    boolean isOwner();

    boolean hashPermissions(Permission... permissions);

    void kick(String message);

    void ban(String message);

    void addRoles(Role... roles);

    void removeRoles(Role... roles);

    void setNickName(String newNickName);

}
