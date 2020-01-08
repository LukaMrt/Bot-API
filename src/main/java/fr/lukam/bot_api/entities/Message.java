package fr.lukam.bot_api.entities;

import fr.lukam.bot_api.Identifiable;
import fr.lukam.bot_api.entities.channels.GuildTextChannel;

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
