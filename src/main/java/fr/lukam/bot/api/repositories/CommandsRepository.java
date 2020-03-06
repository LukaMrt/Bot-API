package fr.lukam.bot.api.repositories;

import fr.lukam.bot.api.entities.interfaces.commands.Command;

import java.util.List;

public interface CommandsRepository {

    List<Command> getCommands();

    Command getCommandByName(String name);

}
