package fr.lukam.bot.api.events.roles;

import java.awt.*;

public interface RoleNameUpdateEvent extends RoleEvent {

    Color getOldName();

    Color getNewName();

}