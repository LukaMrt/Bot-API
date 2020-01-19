package fr.lukam.bot_api.entities.interfaces.user;

import fr.lukam.bot_api.behaviors.Fakeable;
import fr.lukam.bot_api.behaviors.Identifiable;
import fr.lukam.bot_api.behaviors.Mentionable;
import fr.lukam.bot_api.behaviors.Nameable;
import fr.lukam.bot_api.entities.interfaces.channels.TextChannel;
import fr.lukam.bot_api.entities.interfaces.message.Message;

import java.time.LocalDateTime;

public interface User extends Mentionable, Identifiable, Nameable, Fakeable {

    String getAvatarURL();

    String getAsTag();

    TextChannel getPrivateChannel();

    void sendMessage(Message message);

    LocalDateTime getCreateAccountTime();

}
