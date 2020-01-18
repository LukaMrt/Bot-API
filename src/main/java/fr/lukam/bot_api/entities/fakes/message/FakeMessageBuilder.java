package fr.lukam.bot_api.entities.fakes.message;

import fr.lukam.bot_api.entities.interfaces.message.Embed;
import fr.lukam.bot_api.entities.interfaces.message.Message;
import fr.lukam.bot_api.entities.interfaces.message.MessageBuilder;

public class FakeMessageBuilder implements MessageBuilder {

    @Override
    public MessageBuilder aMessage() {
        return new FakeMessageBuilder();
    }

    @Override
    public void setText(String text) {
        // Empty because it is a null object
    }

    @Override
    public void setEmbed(Embed embed) {
        // Empty because it is a null object
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
