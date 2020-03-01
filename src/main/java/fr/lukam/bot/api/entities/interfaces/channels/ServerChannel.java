package fr.lukam.bot.api.entities.interfaces.channels;

import fr.lukam.bot.api.behaviors.Fakeable;
import fr.lukam.bot.api.behaviors.Identifiable;
import fr.lukam.bot.api.behaviors.Nameable;
import fr.lukam.bot.api.entities.interfaces.server.Invite;

public interface ServerChannel extends Channel, Identifiable, Fakeable, Nameable {

    Invite createInvite();

}
