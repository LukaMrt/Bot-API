package fr.lukam.bot.api.entities.interfaces.message;

public interface FieldBuilder {

    FieldBuilder aField();

    FieldBuilder setTitle(String title);

    FieldBuilder setContent(String content);

    FieldBuilder setInline(boolean inline);

    Field build();

}
