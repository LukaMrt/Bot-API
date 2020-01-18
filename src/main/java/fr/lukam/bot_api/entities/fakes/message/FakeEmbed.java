package fr.lukam.bot_api.entities.fakes.message;

import fr.lukam.bot_api.entities.fakes.user.FakeUser;
import fr.lukam.bot_api.entities.interfaces.message.Embed;
import fr.lukam.bot_api.entities.interfaces.message.Field;
import fr.lukam.bot_api.entities.interfaces.user.User;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FakeEmbed implements Embed {

    @Override
    public User getAuthor() {
        return new FakeUser();
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
    public boolean isFake() {
        return true;
    }

}
