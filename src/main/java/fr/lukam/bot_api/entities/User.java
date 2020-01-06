package fr.lukam.bot_api.entities;

import fr.lukam.bot_api.Status;

import java.util.Calendar;

public interface User {

    String getName();

    String getAvatarURL();

    String getAsTag();

    // TODO : refactor in Mentionable
    String getAsMention();

    void sendMessage();

    Status getStatus();

    String getId();

    Calendar getCreateAccountTime();

}
