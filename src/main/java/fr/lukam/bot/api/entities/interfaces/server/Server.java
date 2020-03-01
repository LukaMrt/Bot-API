package fr.lukam.bot.api.entities.interfaces.server;

import fr.lukam.bot.api.behaviors.Fakeable;
import fr.lukam.bot.api.behaviors.Identifiable;
import fr.lukam.bot.api.behaviors.Nameable;
import fr.lukam.bot.api.entities.interfaces.channels.ServerChannel;
import fr.lukam.bot.api.entities.interfaces.channels.ServerTextChannel;
import fr.lukam.bot.api.entities.interfaces.channels.ServerVoiceChannel;
import fr.lukam.bot.api.entities.interfaces.reaction.Emote;

import java.util.List;

public interface Server extends Identifiable, Nameable, Fakeable {

    String getDescription();

    ServerMember getOwner();

    ServerMember getSelfMember();

    ServerTextChannel getDefaultChannel();

    Role getDefaultRole();

    List<ServerMember> getMembers();

    ServerMember getMemberById(String memberId);

    String getIconURLl();

    List<Role> getRoles();

    Role getRoleById(String roleId);

    List<Emote> getCustomEmotes();

    Emote getEmoteById(String emoteId);

    List<ServerTextChannel> getTextChannels();

    List<ServerVoiceChannel> getVoiceChannels();

    ServerTextChannel getTextChannel(String channelId);

    ServerVoiceChannel getVoiceChannel(String channelId);

    List<Category> getCategories();

    Category getCategoryById(String categoryId);

    void addCategory(Category category);

    void addTextChannel(ServerTextChannel channel);

    void addVoiceChannel(ServerVoiceChannel channel);

    void removeChannel(ServerChannel channel);

    void addRole(Role role);

    void unBan(String userId);

}
