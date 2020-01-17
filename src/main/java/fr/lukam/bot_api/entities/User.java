package fr.lukam.bot_api.entities;

import fr.lukam.bot_api.behaviors.Identifiable;
import fr.lukam.bot_api.behaviors.Mentionable;
import fr.lukam.bot_api.behaviors.Nameable;
import fr.lukam.bot_api.Status;
import fr.lukam.bot_api.entities.channels.TextChannel;

import java.util.Calendar;

public interface User extends Mentionable, Identifiable, Nameable {

    String getAvatarURL();

    String getAsTag();

    TextChannel getPrivateChannel();

    void sendMessage();

    Status getStatus();

    Calendar getCreateAccountTime();

}
