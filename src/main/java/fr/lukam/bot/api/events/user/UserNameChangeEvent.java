package fr.lukam.bot.api.events.user;

public interface UserNameChangeEvent extends UserEvent {

    String getOldName();

    String getNewName();

}
