package fr.lukam.bot.api.entities.interfaces.message;

import fr.lukam.bot.api.behaviors.Fakeable;

import java.awt.Color;
import java.util.List;

public interface Embed extends Fakeable {

    String getAuthorName();

    String getAuthorImageUrl();

    String getTitle();

    String getDescription();

    Color getColor();

    List<Field> getFields();

    String getFooter();

    String getImageURL();

}
