package fr.lukam.bot.api.entities.fakes.message;

import fr.lukam.bot.api.entities.interfaces.message.Embed;
import fr.lukam.bot.api.entities.interfaces.message.Field;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FakeEmbed implements Embed {

    @Override
    public String getAuthorName() {
        return "";
    }

    @Override
    public String getAuthorImageUrl() {
        return "";
    }

    @Override
    public List<Field> getFields() {
        return new ArrayList<>();
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public Color getColor() {
        return Color.WHITE;
    }

    @Override
    public String getFooter() {
        return "";
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public String getImageURL() {
        return "";
    }

    @Override
    public String getThumbnailURL() {
        return "";
    }

    @Override
    public boolean isFake() {
        return true;
    }

}
