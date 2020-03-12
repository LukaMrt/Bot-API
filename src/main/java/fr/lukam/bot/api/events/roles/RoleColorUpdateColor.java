package fr.lukam.bot.api.events.roles;

import java.awt.*;

public interface RoleColorUpdateColor extends RoleEvent {

    Color getOldColor();

    Color getNewColor();

}
