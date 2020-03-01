package fr.lukam.bot.api.entities.fakes.user;

import fr.lukam.bot.api.entities.interfaces.user.Status;

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

    @Override
    public boolean isFake() {
        return true;
    }

}
