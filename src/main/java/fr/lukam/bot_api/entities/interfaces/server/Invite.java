package fr.lukam.bot_api.entities.interfaces.server;

import fr.lukam.bot_api.behaviors.Fakeable;

public interface Invite extends Fakeable {

    String getURL();

    ServerMember getInviter();

}
