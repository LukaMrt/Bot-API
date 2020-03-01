package fr.lukam.bot.api.entities.fakes.reaction;

import fr.lukam.bot.api.entities.interfaces.reaction.Emote;

public class FakeEmote implements Emote {

    @Override
    public boolean isServerEmote() {
        return false;
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getAsMention() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean isFake() {
        return true;
    }

}
