package fr.lukam.bot.api.events.roles;

public interface RoleNameUpdatedEvent extends RoleEvent {

    String getOldName();

    String getNewName();

}