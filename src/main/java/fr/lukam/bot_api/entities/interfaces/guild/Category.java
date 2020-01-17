package fr.lukam.bot_api.entities.interfaces.guild;

import fr.lukam.bot_api.behaviors.Identifiable;
import fr.lukam.bot_api.behaviors.Nameable;
import fr.lukam.bot_api.entities.interfaces.channels.GuildChannel;

import java.util.List;

public interface Category extends Identifiable, Nameable {

    List<GuildChannel> getChannels();

    List<GuildMember> getAuthorizedMembers();

    void addPermissionToRole(Role role, Permission permission);

    void removePermissionFromRole(Role role, Permission permission);

    void addPermissionToMember(GuildMember member, Permission permission);

    void removePermissionFromMember(GuildMember member, Permission permission);

}
