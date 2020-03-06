package fr.lukam.bot.api.entities.fakes.commands;

import fr.lukam.bot.api.entities.interfaces.commands.Command;
import fr.lukam.bot.api.entities.interfaces.events.CommandEvent;

public class FakeCommand extends Command {

    @Override
    public void execute(CommandEvent event) {
        // Empty because it is a null object
    }

}
