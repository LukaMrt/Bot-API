package fr.lukam.bot.api.events.server;

import fr.lukam.bot.api.entities.interfaces.server.ServerMember;

public interface ServerOwnerUpdateEvent extends ServerEvent {

    ServerMember getOldOwner();

    ServerMember getNewOwner();

}
