package fr.lukam.bot.api.bot;

import fr.lukam.bot.api.entities.interfaces.commands.Command;
import fr.lukam.bot.api.entities.interfaces.events.Listener;

import java.util.List;

public interface Plugin {

    String getName();

    boolean onEnable();

    boolean onDisable();

    List<Command> getCommands();

    List<Listener> getListeners();

}
