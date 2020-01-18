package fr.lukam.bot_api.entities.fakes.channels;

import fr.lukam.bot_api.entities.interfaces.channels.ChannelType;
import fr.lukam.bot_api.entities.interfaces.channels.TextChannel;
import fr.lukam.bot_api.entities.interfaces.message.Message;
import fr.lukam.bot_api.entities.fakes.message.FakeMessage;

import java.util.ArrayList;
import java.util.List;

public class FakeTextChannel implements TextChannel {

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public void setDescription() {
        // Empty because it is a null object
    }

    @Override
    public void sendMessage(Message message) {
        // Empty because it is a null object
    }

    @Override
    public Message getMessageById() {
        return new FakeMessage();
    }

    @Override
    public List<Message> getHistoryBefore(Message message, boolean include, int count) {
        return new ArrayList<>();
    }

    @Override
    public List<Message> getHistoryAfter(Message message, boolean include, int count) {
        return new ArrayList<>();
    }

    @Override
    public List<Message> getPinnedMessages() {
        return new ArrayList<>();
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public ChannelType getChannelType() {
        return new FakeChannelType();
    }

    @Override
    public boolean isFake() {
        return true;
    }
}
