package fr.lukam.bot_api.entities;

import java.util.List;

public interface Reaction {

    Emote getEmote();

    int getCount();

    List<User> getUsers();

    void removeAll();

    void removeFromUser(User user);

}
