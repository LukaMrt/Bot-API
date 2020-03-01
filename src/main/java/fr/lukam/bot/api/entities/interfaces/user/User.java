package fr.lukam.bot.api.entities.interfaces.user;

import fr.lukam.bot.api.behaviors.Fakeable;
import fr.lukam.bot.api.behaviors.Identifiable;
import fr.lukam.bot.api.behaviors.Mentionable;
import fr.lukam.bot.api.behaviors.Nameable;
import fr.lukam.bot.api.entities.interfaces.channels.TextChannel;
import fr.lukam.bot.api.entities.interfaces.message.Message;

import java.time.LocalDateTime;

public interface User extends Mentionable, Identifiable, Nameable, Fakeable {

    String getAvatarURL();

    String getAsTag();

    TextChannel getPrivateChannel();

    void sendMessage(Message message);

    LocalDateTime getCreateAccountTime();

}
