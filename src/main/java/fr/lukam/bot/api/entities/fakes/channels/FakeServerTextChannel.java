package fr.lukam.bot.api.entities.fakes.channels;

import fr.lukam.bot.api.entities.fakes.message.FakeMessage;
import fr.lukam.bot.api.entities.interfaces.channels.ChannelType;
import fr.lukam.bot.api.entities.interfaces.channels.ServerTextChannel;
import fr.lukam.bot.api.entities.interfaces.message.Message;
import fr.lukam.bot.api.entities.interfaces.server.Invite;
import fr.lukam.bot.api.entities.fakes.server.FakeInvite;

import java.util.ArrayList;
import java.util.List;

public class FakeServerTextChannel implements ServerTextChannel {
    @Override
    public Invite createInvite() {
        return new FakeInvite();
    }

    @Override
    public boolean isFake() {
        return true;
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public void sendMessage(Message message) {
        // Empty because it is a null object
    }

    @Override
    public Message getMessageById(String messageId) {
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

}
