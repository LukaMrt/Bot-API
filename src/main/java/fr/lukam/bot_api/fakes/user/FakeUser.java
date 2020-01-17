package fr.lukam.bot_api.fakes.user;

import fr.lukam.bot_api.entities.user.Status;
import fr.lukam.bot_api.entities.user.User;
import fr.lukam.bot_api.entities.channels.TextChannel;
import fr.lukam.bot_api.fakes.channels.FakeTextChannel;

import java.time.LocalDateTime;

public class FakeUser implements User {

    @Override
    public String getAvatarURL() {
        return "";
    }

    @Override
    public String getAsTag() {
        return "";
    }

    @Override
    public TextChannel getPrivateChannel() {
        return new FakeTextChannel();
    }

    @Override
    public void sendMessage() {

    }

    @Override
    public Status getStatus() {
        return new FakeStatus();
    }

    @Override
    public LocalDateTime getCreateAccountTime() {
        return LocalDateTime.now();
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getAsMention() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

}
