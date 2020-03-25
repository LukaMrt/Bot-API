package fr.lukam.bot.api.utils;

import fr.lukam.bot.api.entities.interfaces.server.Permission;

public interface PermissionAdapter {

    Permission fromPermissionName(String permissionName);
    
}
