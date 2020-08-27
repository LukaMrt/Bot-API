package fr.lukam.bot.api.repositories;

import fr.lukam.bot.api.entities.interfaces.commands.Command;

import java.util.List;

public interface CommandsRepository {

    void registerCommands(List<Command> commands);

    List<Command> getCommands();

    Command getCommandByName(String name);

}
