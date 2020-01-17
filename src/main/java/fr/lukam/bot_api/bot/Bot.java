package fr.lukam.bot_api.bot;

import fr.lukam.bot_api.entities.user.User;
import fr.lukam.bot_api.entities.guild.Guild;

public interface Bot {

    Guild getGuild(String guildId);

    User getSelfUser();

    User getUser(String userId);

}
