package fr.lukam.bot.api.entities.interfaces.user;

import fr.lukam.bot.api.behaviors.Fakeable;
import fr.lukam.bot.api.behaviors.Nameable;

import java.awt.*;

public interface Status extends Nameable, Fakeable {

    Color getColor();

}
