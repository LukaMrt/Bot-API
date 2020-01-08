package fr.lukam.bot_api.entities;

import fr.lukam.bot_api.Identifiable;
import fr.lukam.bot_api.Mentionable;
import fr.lukam.bot_api.Nameable;
import fr.lukam.bot_api.Permission;

import java.awt.*;
import java.util.Set;

public interface Role extends Identifiable, Mentionable, Nameable {

    Color getColor();

    boolean isMentionable();

    boolean isUpperThan(Role role);

    void delete();

    Set<Permission> getPermissions();

    boolean hasPermissions(Permission... permissions);

    void addPermission(Permission permission);

    void removePermission(Permission permission);

}
