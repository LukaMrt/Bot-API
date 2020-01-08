package fr.lukam.bot_api.entities.guild;

import fr.lukam.bot_api.behavior.Identifiable;
import fr.lukam.bot_api.behavior.Mentionable;
import fr.lukam.bot_api.behavior.Nameable;

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
