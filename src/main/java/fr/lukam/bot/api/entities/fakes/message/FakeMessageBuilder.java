package fr.lukam.bot.api.entities.fakes.message;

import fr.lukam.bot.api.entities.interfaces.message.Embed;
import fr.lukam.bot.api.entities.interfaces.message.Message;
import fr.lukam.bot.api.entities.interfaces.message.MessageBuilder;

public class FakeMessageBuilder implements MessageBuilder {

    @Override
    public MessageBuilder aMessage() {
        return new FakeMessageBuilder();
    }

    @Override
    public MessageBuilder setText(String text) {
        return this;
    }

    @Override
    public MessageBuilder setEmbed(Embed embed) {
        return this;
    }

    @Override
    public Message build() {
        return new FakeMessage();
    }

    @Override
    public boolean isFake() {
        return true;
    }

}
