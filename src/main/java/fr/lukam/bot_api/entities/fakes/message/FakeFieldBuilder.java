package fr.lukam.bot_api.entities.fakes.message;

import fr.lukam.bot_api.entities.interfaces.message.Field;
import fr.lukam.bot_api.entities.interfaces.message.FieldBuilder;

public class FakeFieldBuilder implements FieldBuilder {

    @Override
    public FieldBuilder aField() {
        return new FakeFieldBuilder();
    }

    @Override
    public FieldBuilder setTitle(String title) {
        return this;
    }

    @Override
    public FieldBuilder setContent(String content) {
        return this;
    }

    @Override
    public Field build() {
        return new FakeField();
    }

}
