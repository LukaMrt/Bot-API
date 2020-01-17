package fr.lukam.bot_api.entities.fakes.server;

import fr.lukam.bot_api.entities.interfaces.channels.ServerChannel;
import fr.lukam.bot_api.entities.interfaces.server.Category;
import fr.lukam.bot_api.entities.interfaces.server.ServerMember;
import fr.lukam.bot_api.entities.interfaces.server.Permission;
import fr.lukam.bot_api.entities.interfaces.server.Role;

import java.util.ArrayList;
import java.util.List;

public class FakeCategory implements Category {

    @Override
    public List<ServerChannel> getChannels() {
        return new ArrayList<>();
    }

    @Override
    public List<ServerMember> getAuthorizedMembers() {
        return new ArrayList<>();
    }

    @Override
    public void addPermissionToRole(Role role, Permission permission) {

    }

    @Override
    public void removePermissionFromRole(Role role, Permission permission) {

    }

    @Override
    public void addPermissionToMember(ServerMember member, Permission permission) {

    }

    @Override
    public void removePermissionFromMember(ServerMember member, Permission permission) {

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
