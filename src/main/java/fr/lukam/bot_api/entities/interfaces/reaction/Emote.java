package fr.lukam.bot_api.entities.interfaces.reaction;

import fr.lukam.bot_api.behaviors.Identifiable;
import fr.lukam.bot_api.behaviors.Mentionable;
import fr.lukam.bot_api.behaviors.Nameable;

public interface Emote extends Identifiable, Mentionable, Nameable {

    boolean isGuildEmote();

}
