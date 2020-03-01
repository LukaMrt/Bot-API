package fr.lukam.bot.api.entities.fakes.message;

import fr.lukam.bot.api.entities.interfaces.message.Field;

public class FakeField implements Field {

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public String getContent() {
        return "";
    }

}
