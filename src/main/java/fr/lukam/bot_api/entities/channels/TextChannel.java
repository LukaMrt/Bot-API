package fr.lukam.bot_api.entities.channels;

import fr.lukam.bot_api.Nameable;
import fr.lukam.bot_api.entities.Message;

import java.util.List;
import java.util.Optional;

public interface TextChannel extends Channel, Nameable {

    String getDescription();

    void setDescription();

    void sendMessage(Message message);

    Optional<Message> getMessageById();

    List<Message> getHistoryBefore(Message message, boolean include, int count);

    List<Message> getHistoryAfter(Message message, boolean include, int count);

    List<Message> getPinnedMessages();

}
