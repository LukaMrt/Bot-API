package fr.lukam.bot_api.entities.interfaces.reaction;

import fr.lukam.bot_api.entities.interfaces.user.User;

import java.util.List;

public interface Reaction {

    Emote getEmote();

    int getCount();

    List<User> getUsers();

    void removeAll();

    void removeFromUser(User user);

}
