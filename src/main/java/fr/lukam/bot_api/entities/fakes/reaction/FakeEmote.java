package fr.lukam.bot_api.entities.fakes.reaction;

import fr.lukam.bot_api.entities.interfaces.reaction.Emote;

public class FakeEmote implements Emote {

    @Override
    public boolean isGuildEmote() {
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

}
