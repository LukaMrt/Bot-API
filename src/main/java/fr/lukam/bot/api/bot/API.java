package fr.lukam.bot.api.bot;

import fr.lukam.bot.api.entities.fakes.FakeBot;
import fr.lukam.bot.api.entities.fakes.message.FakeEmbedBuilder;
import fr.lukam.bot.api.entities.fakes.message.FakeFieldBuilder;
import fr.lukam.bot.api.entities.fakes.message.FakeMessageBuilder;
import fr.lukam.bot.api.entities.interfaces.channels.ChannelType;
import fr.lukam.bot.api.entities.interfaces.message.EmbedBuilder;
import fr.lukam.bot.api.entities.interfaces.message.FieldBuilder;
import fr.lukam.bot.api.entities.interfaces.message.MessageBuilder;
import fr.lukam.bot.api.entities.interfaces.server.Permission;
import fr.lukam.bot.api.entities.interfaces.server.Server;
import fr.lukam.bot.api.entities.interfaces.user.Status;
import fr.lukam.bot.api.entities.interfaces.user.User;
import fr.lukam.bot.api.repositories.CommandsRepository;
import fr.lukam.bot.api.repositories.InfosRepository;
import fr.lukam.bot.api.repositories.ListenersRepository;
import fr.lukam.bot.api.repositories.PluginsRepository;
import fr.lukam.bot.api.utils.ChannelTypeAdapter;
import fr.lukam.bot.api.utils.PermissionAdapter;
import fr.lukam.bot.api.utils.StatusAdapter;

public abstract class API {

    private static Bot bot = new FakeBot();
    private static EmbedBuilder embedBuilder = new FakeEmbedBuilder();
    private static MessageBuilder messageBuilder = new FakeMessageBuilder();
    private static FieldBuilder fieldBuilder = new FakeFieldBuilder();

    private static InfosRepository infosRepository;
    private static CommandsRepository commandsRepository;
    private static ListenersRepository listenersRepository;
    private static PluginsRepository pluginsRepository;

    private static PermissionAdapter permissionAdapter;
    private static StatusAdapter statusAdapter;
    private static ChannelTypeAdapter channelTypeAdapter;

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

    public static void setInfosRepository(InfosRepository infosRepository) {
        API.infosRepository = infosRepository;
    }

    public static void setCommandsRepository(CommandsRepository commandsRepository) {
        API.commandsRepository = commandsRepository;
    }

    public static void setListenersRepository(ListenersRepository listenersRepository) {
        API.listenersRepository = listenersRepository;
    }

    public static void setPluginsRepository(PluginsRepository pluginsRepository) {
        API.pluginsRepository = pluginsRepository;
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

    public static User getUserByName(String userName) {
        return bot.getUserByName(userName);
    }

    public static EmbedBuilder createEmbed() {
        return embedBuilder.anEmbed();
    }

    public static MessageBuilder createMessage() {

        return messageBuilder.aMessage();
    }

    public static FieldBuilder createField() {
        return fieldBuilder.aField();
    }

    public static InfosRepository getInfosRepository() {
        return infosRepository;
    }

    public static CommandsRepository getCommandsRepository() {
        return commandsRepository;
    }

    public static ListenersRepository getListenersRepository() {
        return listenersRepository;
    }

    public static PluginsRepository getPluginsRepository() {
        return pluginsRepository;
    }

    public static void setPermissionAdapter(PermissionAdapter permissionAdapter) {
        API.permissionAdapter = permissionAdapter;
    }

    public static Permission getPermission(String permissionName) {
        return permissionAdapter.fromPermissionName(permissionName);
    }

    public static void setStatusAdapter(StatusAdapter statusAdapter) {
        API.statusAdapter = statusAdapter;
    }

    public static Status getStatus(String statusName) {
        return statusAdapter.fromStatusName(statusName);
    }

    public static void setChannelTypeAdapter(ChannelTypeAdapter channelTypeAdapter) {
        API.channelTypeAdapter = channelTypeAdapter;
    }

    public static ChannelType getChannelType(String channelTypeName) {
        return channelTypeAdapter.fromChannelTypeName(channelTypeName);
    }

}
