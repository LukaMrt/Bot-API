package fr.lukam.bot_api.entities.reaction;

import fr.lukam.bot_api.behavior.Identifiable;
import fr.lukam.bot_api.behavior.Mentionable;
import fr.lukam.bot_api.behavior.Nameable;

public interface Emote extends Identifiable, Mentionable, Nameable {

    boolean isGuildEmote();

}
