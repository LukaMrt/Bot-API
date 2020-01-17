package fr.lukam.bot_api.fakes.guild;

import fr.lukam.bot_api.entities.channels.GuildChannel;
import fr.lukam.bot_api.entities.guild.Category;
import fr.lukam.bot_api.entities.guild.GuildMember;
import fr.lukam.bot_api.entities.guild.Permission;
import fr.lukam.bot_api.entities.guild.Role;

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
