package fr.lukam.bot.api.events.roles;

import java.awt.*;

public interface RoleNameUpdatedEvent extends RoleEvent {

    String getOldName();

    String getNewName();

}