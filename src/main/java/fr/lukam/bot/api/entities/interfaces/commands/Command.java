package fr.lukam.bot.api.entities.interfaces.commands;

import fr.lukam.bot.api.entities.fakes.commands.FakeCommandCategory;
import fr.lukam.bot.api.entities.interfaces.events.CommandEvent;
import fr.lukam.bot.api.entities.interfaces.server.Permission;
import fr.lukam.bot.api.entities.interfaces.server.Role;
import fr.lukam.bot.api.entities.interfaces.server.Server;
import fr.lukam.bot.api.entities.interfaces.server.ServerMember;

import java.util.Arrays;
import java.util.function.Predicate;

public abstract class Command {

    private final Predicate<Server> BOT_REQUIREMENTS = server ->
            !server.isFake() && server.getSelfMember().hasPermissions(this.requiredBotPermissions);

    private final Predicate<ServerMember> MEMBER_REQUIREMENTS = serverMember ->
            serverMember.hasPermissions(this.requiredUserPermissions) && serverMember.hasRoles(this.requiredRoles);

    protected String commandName;
    protected String help;
    protected CommandCategory commandCategory;
    protected String arguments;
    protected boolean serverOnly;
    protected boolean ownerCommand;
    protected Role[] requiredRoles;
    protected Permission[] requiredUserPermissions;
    protected Permission[] requiredBotPermissions;
    protected Command[] subCommands;
    protected Command[] parents;

    public Command() {
        this.commandName = "";
        this.help = "";
        this.commandCategory = new FakeCommandCategory();
        this.arguments = "";
        this.serverOnly = false;
        this.ownerCommand = false;
        this.requiredRoles = new Role[]{};
        this.requiredUserPermissions = new Permission[]{};
        this.requiredBotPermissions = new Permission[]{};
        this.subCommands = new Command[]{};
        this.parents = new Command[]{};
    }

    public abstract void execute(CommandEvent event);

    public boolean canExecute(CommandEvent event) {

        boolean parentsRequirements = Arrays.stream(this.parents).allMatch(command -> command.canExecute(event));
        boolean botRequirements = BOT_REQUIREMENTS.test(event.getServer());
        boolean memberRequirements = MEMBER_REQUIREMENTS.test((ServerMember) event.getUser());

        if (!parentsRequirements || serverOnly && (!botRequirements || !memberRequirements)) {
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

    public String getName() {
        return this.commandName;
    }

}