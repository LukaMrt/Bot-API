package fr.lukam.bot_api.entities.fakes.user;

import fr.lukam.bot_api.entities.interfaces.user.Status;

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
