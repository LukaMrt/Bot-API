package fr.lukam.bot.api.entities.interfaces.reaction;

import fr.lukam.bot.api.behaviors.Fakeable;
import fr.lukam.bot.api.behaviors.Mentionable;
import fr.lukam.bot.api.behaviors.Nameable;
import fr.lukam.bot.api.behaviors.Identifiable;

public interface Emote extends Identifiable, Mentionable, Nameable, Fakeable {

    boolean isServerEmote();

}
