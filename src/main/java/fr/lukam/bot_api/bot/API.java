package fr.lukam.bot_api.bot;

import fr.lukam.bot_api.entities.fakes.message.FakeEmbedBuilder;
import fr.lukam.bot_api.entities.fakes.message.FakeFieldBuilder;
import fr.lukam.bot_api.entities.fakes.message.FakeMessageBuilder;
import fr.lukam.bot_api.entities.interfaces.message.EmbedBuilder;
import fr.lukam.bot_api.entities.interfaces.message.FieldBuilder;
import fr.lukam.bot_api.entities.interfaces.message.MessageBuilder;
import fr.lukam.bot_api.entities.interfaces.user.User;
import fr.lukam.bot_api.entities.interfaces.server.Server;
import fr.lukam.bot_api.entities.fakes.FakeBot;

public abstract class API {

    private static Bot bot = new FakeBot();
    private static EmbedBuilder embedBuilder = new FakeEmbedBuilder();
    private static MessageBuilder messageBuilder = new FakeMessageBuilder();
    private static FieldBuilder fieldBuilder = new FakeFieldBuilder();

    public static void setBot(Bot bot) {
        API.bot = bot;
    }

    public static void setEmbedBuilder(EmbedBuilder embedBuilder) {
        API.embedBuilder = embedBuilder;
    }

    public static void setMessageBuilder(MessageBuilder messageBuilder) {
        API.messageBuilder = messageBuilder;
    }

    public static void setFieldBuilder(FieldBuilder fieldBuilder) {
        API.fieldBuilder = fieldBuilder;
    }

    public static Server getServer(String serverId) {
        return bot.getServer(serverId);
    }

    public static User getSelfUser() {
        return bot.getSelfUser();
    }

    public static User getUser(String userId) {
        return bot.getUser(userId);
    }

    public static EmbedBuilder createEmbed() {
        return embedBuilder.anEmbed();
    }

    public static MessageBuilder createMessage() {
        return messageBuilder.aMessage();
    }

}
