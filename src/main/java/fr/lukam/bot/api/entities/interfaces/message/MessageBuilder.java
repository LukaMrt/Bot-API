package fr.lukam.bot.api.entities.interfaces.message;

import fr.lukam.bot.api.behaviors.Fakeable;

public interface MessageBuilder extends Fakeable {

    MessageBuilder aMessage();

    MessageBuilder setText(String text);

    MessageBuilder setEmbed(Embed embed);

    Message build();

}
