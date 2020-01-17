package fr.lukam.bot_api.fakes.reaction;

import fr.lukam.bot_api.entities.user.User;
import fr.lukam.bot_api.entities.reaction.Emote;
import fr.lukam.bot_api.entities.reaction.Reaction;

import java.util.ArrayList;
import java.util.List;

public class FakeReaction implements Reaction {

    @Override
    public Emote getEmote() {
        return new FakeEmote();
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>();
    }

    @Override
    public void removeAll() {

    }

    @Override
    public void removeFromUser(User user) {

    }

}
