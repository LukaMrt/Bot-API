package fr.lukam.bot.api.events.roles;

import fr.lukam.bot.api.entities.interfaces.server.Role;
import fr.lukam.bot.api.events.server.ServerEvent;

public interface RoleEvent extends ServerEvent {

    Role getRole();

}
