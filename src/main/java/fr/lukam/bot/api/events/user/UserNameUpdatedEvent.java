package fr.lukam.bot.api.events.user;

public interface UserNameUpdatedEvent extends UserEvent {

    String getOldName();

    String getNewName();

}
