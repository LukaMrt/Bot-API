package fr.lukam.bot_api.entities.fakes.guild;

import fr.lukam.bot_api.entities.interfaces.channels.GuildChannel;
import fr.lukam.bot_api.entities.interfaces.guild.Category;
import fr.lukam.bot_api.entities.interfaces.guild.GuildMember;
import fr.lukam.bot_api.entities.interfaces.guild.Permission;
import fr.lukam.bot_api.entities.interfaces.guild.Role;

import java.util.ArrayList;
import java.util.List;

public class FakeCategory implements Category {

    @Override
    public List<GuildChannel> getChannels() {
        return new ArrayList<>();
    }

    @Override
    public List<GuildMember> getAuthorizedMembers() {
        return new ArrayList<>();
    }

    @Override
    public void addPermissionToRole(Role role, Permission permission) {

    }

    @Override
    public void removePermissionFromRole(Role role, Permission permission) {

    }

    @Override
    public void addPermissionToMember(GuildMember member, Permission permission) {

    }

    @Override
    public void removePermissionFromMember(GuildMember member, Permission permission) {

    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

}
