package fr.lukam.bot.api.entities.fakes.commands;

import fr.lukam.bot.api.entities.interfaces.commands.CommandCategory;

public class FakeCommandCategory implements CommandCategory {

    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean isFake() {
        return true;
    }

}
