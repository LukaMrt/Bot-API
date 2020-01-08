package fr.lukam.bot_api.entities.channels;

import fr.lukam.bot_api.Identifiable;
import fr.lukam.bot_api.entities.Invite;

public interface GuildChannel extends Channel, Identifiable {

    Invite createInvite();

}
