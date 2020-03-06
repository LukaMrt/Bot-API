package fr.lukam.bot.api.repositories;

import fr.lukam.bot.api.bot.Plugin;

import java.util.List;

public interface PluginsRepository {

    List<Plugin> getPlugins();

    Plugin getPluginByName(String name);

}
