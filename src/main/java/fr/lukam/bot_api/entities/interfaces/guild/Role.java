package fr.lukam.bot_api.entities.interfaces.guild;

import fr.lukam.bot_api.behaviors.Identifiable;
import fr.lukam.bot_api.behaviors.Mentionable;
import fr.lukam.bot_api.behaviors.Nameable;

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
