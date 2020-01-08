package fr.lukam.bot_api.entities;

import fr.lukam.bot_api.Identifiable;
import fr.lukam.bot_api.Nameable;
import fr.lukam.bot_api.entities.channels.GuildChannel;
import fr.lukam.bot_api.entities.channels.TextChannel;
import fr.lukam.bot_api.entities.channels.GuildVoiceChannel;

import java.util.List;
import java.util.Optional;

public interface Guild extends Identifiable, Nameable {

    String getDescription();

    GuildMember getOwner();

    GuildMember getSelfMember();

    Optional<GuildChannel> getDefaultChannel();

    Role getDefaultRole();

    List<GuildMember> getMembers();

    Optional<GuildMember> getMemberById(String memberId);

    String getIconURLl();

    List<Role> getRoles();

    Optional<Role> getRoleById(String roleId);

    List<Emote> getCustomEmotes();

    Optional<Emote> getMemberByName(String emoteName);

    List<TextChannel> getChannels();

    Optional<GuildChannel> getChannelById(String channelId);

    List<Category> getCategories();

    Optional<Category> getCategoryById(String categoryId);

    void addCategory(Category category);

    void addTextChannel(TextChannel channel);

    void addVoiceChannel(GuildVoiceChannel textChannel);

    void addRole(Role role);

    void unBan(String userId);

}
