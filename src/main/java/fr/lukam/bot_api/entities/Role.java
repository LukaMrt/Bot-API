package fr.lukam.bot_api.entities;

import fr.lukam.bot_api.Permission;

import java.awt.*;
import java.util.Set;

public interface Role {

    String getName();

    Color getColor();

    String getAsMention();

    String getGuildId();

    boolean isMentionable();

    boolean isUpperThan(Role role);

    void delete();

    Set<Permission> getPermissions();

    boolean hasPermissions(Permission... permissions);

}
