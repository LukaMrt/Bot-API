package fr.lukam.bot_api.entities;

import fr.lukam.bot_api.Identifiable;
import fr.lukam.bot_api.Mentionable;
import fr.lukam.bot_api.Nameable;

public interface Emote extends Identifiable, Mentionable, Nameable {

    boolean isGuildEmote();

}
