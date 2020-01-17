package fr.lukam.bot_api.entities.user;

import fr.lukam.bot_api.behaviors.Identifiable;
import fr.lukam.bot_api.behaviors.Mentionable;
import fr.lukam.bot_api.behaviors.Nameable;
import fr.lukam.bot_api.entities.channels.TextChannel;

import java.time.LocalDateTime;

public interface User extends Mentionable, Identifiable, Nameable {

    String getAvatarURL();

    String getAsTag();

    TextChannel getPrivateChannel();

    void sendMessage();

    Status getStatus();

    LocalDateTime getCreateAccountTime();

}
