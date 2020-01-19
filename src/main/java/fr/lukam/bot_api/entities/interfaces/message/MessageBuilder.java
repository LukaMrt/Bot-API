package fr.lukam.bot_api.entities.interfaces.message;

import fr.lukam.bot_api.behaviors.Fakeable;

public interface MessageBuilder extends Fakeable {

    MessageBuilder aMessage();

    MessageBuilder setText(String text);

    MessageBuilder setEmbed(Embed embed);

    Message build();

}
