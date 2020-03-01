package fr.lukam.bot.api.entities.interfaces.channels;

import fr.lukam.bot.api.behaviors.Fakeable;
import fr.lukam.bot.api.behaviors.Nameable;
import fr.lukam.bot.api.entities.interfaces.message.Message;

import java.util.List;

public interface TextChannel extends Channel, Nameable, Fakeable {

    void sendMessage(Message message);

    Message getMessageById(String messageId);

    List<Message> getHistoryBefore(Message message, boolean include, int count);

    List<Message> getHistoryAfter(Message message, boolean include, int count);

    List<Message> getPinnedMessages();

}
