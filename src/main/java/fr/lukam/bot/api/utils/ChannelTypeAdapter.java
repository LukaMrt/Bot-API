package fr.lukam.bot.api.utils;

import fr.lukam.bot.api.entities.interfaces.channels.ChannelType;

public interface ChannelTypeAdapter {

    ChannelType fromChannelTypeName(String channelTypeName);

}
