package fr.lukam.bot.api.entities.interfaces.message;

import fr.lukam.bot.api.behaviors.Fakeable;
import fr.lukam.bot.api.behaviors.Identifiable;
import fr.lukam.bot.api.entities.interfaces.channels.ServerTextChannel;
import fr.lukam.bot.api.entities.interfaces.reaction.Emote;
import fr.lukam.bot.api.entities.interfaces.reaction.Reaction;
import fr.lukam.bot.api.entities.interfaces.server.Role;
import fr.lukam.bot.api.entities.interfaces.user.User;

import java.time.LocalDateTime;
import java.util.List;

public interface Message extends Identifiable, Fakeable {

    String getContent();

    Embed getEmbed();

    String getLink();

    LocalDateTime getDate();

    List<Reaction> getReactions();

    List<User> getMentionedUsers();

    List<ServerTextChannel> getMentionedChannels();

    List<Role> getMentionedRoles();

    List<Emote> getEmotes();

    Reaction getReactionById(String emoteId);

    User getAuthor();

    void addReaction(Emote emote);

    void removeReaction(Emote emote);

    void pin();

    void unPin();

    void edit(Message newMessage);

    void delete();

}
