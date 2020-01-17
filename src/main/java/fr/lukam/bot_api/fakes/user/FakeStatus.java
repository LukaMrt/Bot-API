package fr.lukam.bot_api.fakes.user;

import fr.lukam.bot_api.entities.user.Status;

import java.awt.*;

public class FakeStatus implements Status {

    @Override
    public Color getColor() {
        return Color.WHITE;
    }

    @Override
    public String getName() {
        return "";
    }

}
