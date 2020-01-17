package fr.lukam.bot_api.entities.interfaces.channels;

import fr.lukam.bot_api.behaviors.Identifiable;
import fr.lukam.bot_api.entities.interfaces.server.Invite;

public interface ServerChannel extends Channel, Identifiable {

    Invite createInvite();

}
