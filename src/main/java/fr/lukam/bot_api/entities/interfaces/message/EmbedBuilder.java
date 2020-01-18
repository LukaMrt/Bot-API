package fr.lukam.bot_api.entities.interfaces.message;

import fr.lukam.bot_api.behaviors.Fakeable;
import fr.lukam.bot_api.entities.interfaces.user.User;

import java.awt.Color;

public interface EmbedBuilder extends Fakeable {

    EmbedBuilder anEmbed();

    void setImageURL(String url);

    void setAuthor(User user);

    void addField(Field field);

    void setFields(Field... fields);

    void clearFields();

    void setDescription(String description);

    void setColor(Color color);

    void setFooter(String footer);

    void setTitle(String title);

    Embed build();

}
