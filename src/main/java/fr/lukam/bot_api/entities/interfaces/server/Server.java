package fr.lukam.bot_api.entities.interfaces.server;

import fr.lukam.bot_api.behaviors.Fakeable;
import fr.lukam.bot_api.behaviors.Identifiable;
import fr.lukam.bot_api.behaviors.Nameable;
import fr.lukam.bot_api.entities.interfaces.channels.ServerTextChannel;
import fr.lukam.bot_api.entities.interfaces.reaction.Emote;
import fr.lukam.bot_api.entities.interfaces.channels.ServerChannel;
import fr.lukam.bot_api.entities.interfaces.channels.TextChannel;
import fr.lukam.bot_api.entities.interfaces.channels.ServerVoiceChannel;

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

    void addRole(Role role);

    void unBan(String userId);

}
