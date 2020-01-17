package fr.lukam.bot_api.entities.reaction;

import fr.lukam.bot_api.entities.user.User;

import java.util.List;

public interface Reaction {

    Emote getEmote();

    int getCount();

    List<User> getUsers();

    void removeAll();

    void removeFromUser(User user);

}
