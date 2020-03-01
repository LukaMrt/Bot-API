package fr.lukam.bot.api.entities.interfaces.server;

import fr.lukam.bot.api.behaviors.Fakeable;

public interface Invite extends Fakeable {

    String getURL();

    ServerMember getInviter();

}
