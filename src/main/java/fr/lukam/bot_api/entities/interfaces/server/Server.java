package fr.lukam.bot_api.entities.interfaces.server;

import fr.lukam.bot_api.behaviors.Fakeable;
import fr.lukam.bot_api.behaviors.Identifiable;
import fr.lukam.bot_api.behaviors.Nameable;
import fr.lukam.bot_api.entities.interfaces.reaction.Emote;
import fr.lukam.bot_api.entities.interfaces.channels.ServerChannel;
import fr.lukam.bot_api.entities.interfaces.channels.TextChannel;
import fr.lukam.bot_api.entities.interfaces.channels.ServerVoiceChannel;

import java.util.List;

public interface Server extends Identifiable, Nameable, Fakeable {

    String getDescription();

    ServerMember getOwner();

    ServerMember getSelfMember();

    ServerChannel getDefaultChannel();

    Role getDefaultRole();

    List<ServerMember> getMembers();

    ServerMember getMemberById(String memberId);

    String getIconURLl();

    List<Role> getRoles();

    Role getRoleById(String roleId);

    List<Emote> getCustomEmotes();

    Emote getMemberByName(String emoteName);

    List<TextChannel> getChannels();

    ServerChannel getChannelById(String channelId);

    List<Category> getCategories();

    Category getCategoryById(String categoryId);

    void addCategory(Category category);

    void addTextChannel(TextChannel channel);

    void addVoiceChannel(ServerVoiceChannel textChannel);

    void addRole(Role role);

    void unBan(String userId);

}
