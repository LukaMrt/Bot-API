package fr.lukam.bot_api.entities.fakes.message;

import fr.lukam.bot_api.entities.interfaces.message.Embed;
import fr.lukam.bot_api.entities.interfaces.message.EmbedBuilder;
import fr.lukam.bot_api.entities.interfaces.message.Field;
import fr.lukam.bot_api.entities.interfaces.user.User;

import java.awt.*;

public class FakeEmbedBuilder implements EmbedBuilder {

    @Override
    public EmbedBuilder anEmbed() {
        return new FakeEmbedBuilder();
    }

    @Override
    public void setImageURL(String url) {
        // Empty because it is a null object
    }

    @Override
    public void setAuthor(User user) {
        // Empty because it is a null object
    }

    @Override
    public void addField(Field field) {
        // Empty because it is a null object
    }

    @Override
    public void setFields(Field... fields) {
        // Empty because it is a null object
    }

    @Override
    public void clearFields() {
        // Empty because it is a null object
    }

    @Override
    public void setDescription(String description) {
        // Empty because it is a null object
    }

    @Override
    public void setColor(Color color) {
        // Empty because it is a null object
    }

    @Override
    public void setFooter(String footer) {
        // Empty because it is a null object
    }

    @Override
    public void setTitle(String title) {
        // Empty because it is a null object
    }

    @Override
    public Embed build() {
        return new FakeEmbed();
    }

    @Override
    public boolean isFake() {
        return true;
    }

}
