package fr.lukam.bot_api.entities.channels;

import fr.lukam.bot_api.behavior.Nameable;
import fr.lukam.bot_api.entities.message.Message;

import java.util.List;

public interface TextChannel extends Channel, Nameable {

    String getDescription();

    void setDescription();

    void sendMessage(Message message);

    Message getMessageById();

    List<Message> getHistoryBefore(Message message, boolean include, int count);

    List<Message> getHistoryAfter(Message message, boolean include, int count);

    List<Message> getPinnedMessages();

}
