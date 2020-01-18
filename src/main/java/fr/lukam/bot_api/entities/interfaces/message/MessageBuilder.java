package fr.lukam.bot_api.entities.interfaces.message;

import fr.lukam.bot_api.behaviors.Fakeable;

public interface MessageBuilder extends Fakeable {

    MessageBuilder aMessage();

    void setText(String text);

    void setEmbed(Embed embed);

    Message build();

}
