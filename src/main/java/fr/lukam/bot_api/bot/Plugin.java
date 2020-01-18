package fr.lukam.bot_api.bot;

import fr.lukam.bot_api.entities.interfaces.commands.Command;
import fr.lukam.bot_api.entities.interfaces.events.Listener;

import java.util.List;

public interface Plugin {

    String getName();

    boolean onEnable();

    boolean onDisable();

    List<Command> getCommands();

    List<Listener> getListeners();

}
