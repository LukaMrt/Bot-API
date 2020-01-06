package fr.lukam.bot_api.entities;

import fr.lukam.bot_api.Status;

public interface User {

    String getName();

    String getAvatarURL();

    String getAsTag();

    String getAsMention();

    void sendMessage();

    Status getStatus();

    String getId();

}
