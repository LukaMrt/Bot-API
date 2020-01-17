package fr.lukam.bot_api.bot;

import fr.lukam.bot_api.entities.interfaces.user.User;
import fr.lukam.bot_api.entities.interfaces.guild.Guild;

public interface Bot {

    Guild getGuild(String guildId);

    User getSelfUser();

    User getUser(String userId);

}
