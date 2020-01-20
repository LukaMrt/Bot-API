package fr.lukam.bot_api.entities.interfaces.message;

import fr.lukam.bot_api.behaviors.Fakeable;
import fr.lukam.bot_api.entities.interfaces.user.User;

import java.awt.Color;

public interface EmbedBuilder extends Fakeable {

    EmbedBuilder anEmbed();

    EmbedBuilder setImageURL(String url);

    EmbedBuilder setAuthor(User user);

    EmbedBuilder addField(Field field);

    EmbedBuilder setFields(Field... fields);

    EmbedBuilder clearFields();

    EmbedBuilder setDescription(String description);

    EmbedBuilder setColor(Color color);

    EmbedBuilder setFooter(String footer);

    EmbedBuilder setTitle(String title);

    Embed build();

}
