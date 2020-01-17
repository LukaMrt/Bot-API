package fr.lukam.bot_api.fakes.guild;

import fr.lukam.bot_api.entities.guild.Permission;
import fr.lukam.bot_api.entities.guild.Role;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class FakeRole implements Role {

    @Override
    public Color getColor() {
        return Color.WHITE;
    }

    @Override
    public boolean isMentionable() {
        return false;
    }

    @Override
    public boolean isUpperThan(Role role) {
        return false;
    }

    @Override
    public void delete() {

    }

    @Override
    public Set<Permission> getPermissions() {
        return new HashSet<>();
    }

    @Override
    public boolean hasPermissions(Permission... permissions) {
        return false;
    }

    @Override
    public void addPermission(Permission permission) {

    }

    @Override
    public void removePermission(Permission permission) {

    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getAsMention() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

}
