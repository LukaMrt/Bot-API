package fr.lukam.bot_api.entities.interfaces.message;

import fr.lukam.bot_api.behaviors.Identifiable;
import fr.lukam.bot_api.entities.interfaces.user.User;
import fr.lukam.bot_api.entities.interfaces.channels.GuildTextChannel;
import fr.lukam.bot_api.entities.interfaces.guild.GuildMember;
import fr.lukam.bot_api.entities.interfaces.guild.Role;
import fr.lukam.bot_api.entities.interfaces.reaction.Emote;
import fr.lukam.bot_api.entities.interfaces.reaction.Reaction;

import java.time.LocalDateTime;
import java.util.List;

public interface Message extends Identifiable {

    String getContent();

    String getLink();

    GuildMember getSender();

    LocalDateTime getDate();

    List<Reaction> getReactions();

    List<User> getMentionedUsers();

    List<GuildTextChannel> getMentionedChannels();

    List<Role> getMentionedRoles();

    List<Emote> getEmotes();

    Reaction getReactionByName();

    User getAuthor();

    void addReaction(Emote emote);

    void removeReaction(Emote emote);

    void pin();

    void unPin();

    void edit(Message newMessage);

    void delete();

}
