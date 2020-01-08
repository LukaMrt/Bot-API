package fr.lukam.bot_api.entities;

import fr.lukam.bot_api.Field;

import java.awt.*;
import java.util.List;

public interface Embed {

    User getAuthor();

    void setAuthor(User user);

    List<Field> getFields();

    void addField(Field field);

    void setFields(Field... fields);

    void clearFields();

    String getDescription();

    void setDescription(String description);

    Color getColor();

    void setColor(Color color);

    String getFooter();

    void setFooter(String footer);

    String getTitle();

    void setTitle(String title);

    String getImageURL();

    void setImageURL(String url);

}
