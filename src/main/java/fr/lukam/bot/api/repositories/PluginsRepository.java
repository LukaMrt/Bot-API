package fr.lukam.bot.api.repositories;

import fr.lukam.bot.api.bot.Plugin;

import java.util.List;

public interface PluginsRepository {

    void loadPlugins();

    void startPlugins();

    void stopPlugins();

    void registerCommands(CommandsRepository commandsRepository);

    void registerListeners(ListenersRepository listenersRepository);

    List<Plugin> getPlugins();

    Plugin getPluginByName(String name);

}
