package fr.lukam.bot_api.entities.fakes.user;

import fr.lukam.bot_api.entities.interfaces.message.Message;
import fr.lukam.bot_api.entities.interfaces.user.Status;
import fr.lukam.bot_api.entities.interfaces.user.User;
import fr.lukam.bot_api.entities.interfaces.channels.TextChannel;
import fr.lukam.bot_api.entities.fakes.channels.FakeTextChannel;

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
    public void sendMessage(Message message) {
        // Empty because it is a null object
    }

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

    @Override
    public boolean isFake() {
        return true;
    }

}
