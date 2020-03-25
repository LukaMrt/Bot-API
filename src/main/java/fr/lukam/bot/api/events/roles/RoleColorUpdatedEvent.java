package fr.lukam.bot.api.events.roles;

import java.awt.*;

public interface RoleColorUpdatedEvent extends RoleEvent {

    Color getOldColor();

    Color getNewColor();

}
