package fr.lukam.bot.api.entities.fakes;

import fr.lukam.bot.api.bot.Plugin;
import fr.lukam.bot.api.entities.interfaces.commands.Command;
import fr.lukam.bot.api.entities.interfaces.events.Listener;

import java.util.ArrayList;
import java.util.List;

public class FakePlugin implements Plugin {

    @Override
    public String getName() {
        return "null";
    }

    @Override
    public boolean onEnable() {
        return true;
    }

    @Override
    public boolean onDisable() {
        return true;
    }

    @Override
    public List<Command> getCommands() {
        return new ArrayList<>();
    }

    @Override
    public List<Listener> getListeners() {
        return new ArrayList<>();
    }

}
