package fr.lukam.bot.api.entities.interfaces.server;

import fr.lukam.bot.api.behaviors.Fakeable;
import fr.lukam.bot.api.behaviors.Identifiable;
import fr.lukam.bot.api.behaviors.Mentionable;
import fr.lukam.bot.api.behaviors.Nameable;

import java.awt.*;
import java.util.Set;

public interface Role extends Identifiable, Mentionable, Nameable, Fakeable {

    Color getColor();

    boolean isMentionable();

    boolean isUpperThan(Role role);

    void delete();

    Set<Permission> getPermissions();

    boolean hasPermissions(Permission... permissions);

    void addPermission(Permission permission);

    void removePermission(Permission permission);

}
