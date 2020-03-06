package fr.lukam.bot.api.entities.fakes.message;

import fr.lukam.bot.api.entities.interfaces.message.Embed;
import fr.lukam.bot.api.entities.interfaces.message.EmbedBuilder;
import fr.lukam.bot.api.entities.interfaces.message.Field;
import fr.lukam.bot.api.entities.interfaces.user.User;

import java.awt.*;

public class FakeEmbedBuilder implements EmbedBuilder {

    @Override
    public EmbedBuilder anEmbed() {
        return new FakeEmbedBuilder();
    }

    @Override
    public EmbedBuilder setImageURL(String url) {
        return this;
    }

    @Override
    public EmbedBuilder setAuthor(User user) {
        return this;
    }

    @Override
    public EmbedBuilder addField(Field field) {
        return this;
    }

    @Override
    public EmbedBuilder setFields(Field... fields) {
        return this;
    }

    @Override
    public EmbedBuilder clearFields() {
        return this;
    }

    @Override
    public EmbedBuilder setDescription(String description) {
        return this;
    }

    @Override
    public EmbedBuilder setColor(Color color) {
        return this;
    }

    @Override
    public EmbedBuilder setFooter(String footer) {
        return this;
    }

    @Override
    public EmbedBuilder setTitle(String title) {
        return this;
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
