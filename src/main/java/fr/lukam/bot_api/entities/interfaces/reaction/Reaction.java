package fr.lukam.bot_api.entities.interfaces.reaction;

import fr.lukam.bot_api.behaviors.Fakeable;
import fr.lukam.bot_api.entities.interfaces.user.User;

import java.util.List;

public interface Reaction extends Fakeable {

    Emote getEmote();

    int getCount();

    List<User> getUsers();

    void removeAll();

    void removeFromUser(User user);

}
