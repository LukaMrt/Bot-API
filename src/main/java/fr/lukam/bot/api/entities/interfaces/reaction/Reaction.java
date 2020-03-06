package fr.lukam.bot.api.entities.interfaces.reaction;

import fr.lukam.bot.api.behaviors.Fakeable;
import fr.lukam.bot.api.entities.interfaces.user.User;

import java.util.List;

public interface Reaction extends Fakeable {

    Emote getEmote();

    int getCount();

    List<User> getUsers();

    void removeAll();

    void removeFromUser(User user);

}
