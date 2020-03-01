package fr.lukam.bot.api.entities.fakes.reaction;

import fr.lukam.bot.api.entities.interfaces.reaction.Emote;
import fr.lukam.bot.api.entities.interfaces.reaction.Reaction;
import fr.lukam.bot.api.entities.interfaces.user.User;

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
        // Empty because it is a null object
    }

    @Override
    public void removeFromUser(User user) {
        // Empty because it is a null object
    }

    @Override
    public boolean isFake() {
        return true;
    }

}
