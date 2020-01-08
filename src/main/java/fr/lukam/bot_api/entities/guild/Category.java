package fr.lukam.bot_api.entities.guild;

import fr.lukam.bot_api.behavior.Identifiable;
import fr.lukam.bot_api.behavior.Nameable;
import fr.lukam.bot_api.entities.channels.GuildChannel;

import java.util.List;

public interface Category extends Identifiable, Nameable {

    List<GuildChannel> getChannels();

    List<GuildMember> getAuthorizedMembers();

    void addPermissionToRole(Role role, Permission permission);

    void removePermissionFromRole(Role role, Permission permission);

    void addPermissionToMember(GuildMember member, Permission permission);

    void removePermissionFromMember(GuildMember member, Permission permission);

}
