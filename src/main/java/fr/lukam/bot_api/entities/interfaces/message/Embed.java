package fr.lukam.bot_api.entities.interfaces.message;

import fr.lukam.bot_api.behaviors.Fakeable;

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
