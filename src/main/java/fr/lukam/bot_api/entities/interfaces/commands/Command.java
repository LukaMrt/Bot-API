package fr.lukam.bot_api.entities.interfaces.commands;

import fr.lukam.bot_api.entities.fakes.commands.FakeCommandCategory;
import fr.lukam.bot_api.entities.interfaces.events.CommandEvent;
import fr.lukam.bot_api.entities.interfaces.server.Permission;
import fr.lukam.bot_api.entities.interfaces.server.Role;
import fr.lukam.bot_api.entities.interfaces.server.Server;
import fr.lukam.bot_api.entities.interfaces.server.ServerMember;

import java.util.Arrays;
import java.util.function.Predicate;

public abstract class Command {

    protected String commandName = "";
    protected String help = "";
    protected CommandCategory commandCategory = new FakeCommandCategory();
    protected String arguments = "";
    protected boolean serverOnly = false;
    protected boolean ownerCommand = false;
    protected Role[] requiredRoles = new Role[]{};
    protected Permission[] requiredUserPermissions = new Permission[]{};
    protected Permission[] requiredBotPermissions = new Permission[]{};
    protected Command[] subCommands = new Command[]{};
    protected Command[] parents = new Command[]{};

    public abstract void execute(CommandEvent event);

    public boolean canExecute(CommandEvent event) {

        if (!Arrays.stream(this.parents).allMatch(command -> command.canExecute(event))) {
            return false;
        }

        Predicate<ServerMember> canMemberExecute = serverMember -> serverMember.hashPermissions(requiredUserPermissions)
                && serverMember.hasRoles(requiredRoles);

        Predicate<Server> canBotExecute = server -> !server.isFake()
                && server.getSelfMember().hashPermissions(requiredBotPermissions);

        if (serverOnly && (!canBotExecute.test(event.getServer()) || !canMemberExecute.test((ServerMember) event.getUser()))) {
            return false;
        }

        return !ownerCommand || event.isOwner();

    }

    public boolean isCommand(String commandName) {
        return this.commandName.equalsIgnoreCase(commandName);
    }

    public Command getSubCommand(String subCommandName) {
        return Arrays.stream(this.subCommands)
                .filter(subCommand -> subCommand.isCommand(subCommandName))
                .findAny()
                .orElse(this);
    }

    public CommandCategory getCommandCategory() {
        return this.commandCategory;
    }

    public String getHelp() {
        return "``" + this.commandName + " " + this.arguments + "`` : " + this.help;
    }

}
