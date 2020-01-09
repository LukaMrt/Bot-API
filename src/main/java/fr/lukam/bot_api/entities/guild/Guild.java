package fr.lukam.bot_api.entities.guild;

import fr.lukam.bot_api.behavior.Identifiable;
import fr.lukam.bot_api.behavior.Nameable;
import fr.lukam.bot_api.entities.reaction.Emote;
import fr.lukam.bot_api.entities.channels.GuildChannel;
import fr.lukam.bot_api.entities.channels.TextChannel;
import fr.lukam.bot_api.entities.channels.GuildVoiceChannel;

import java.util.List;

public interface Guild extends Identifiable, Nameable {

    String getDescription();

    GuildMember getOwner();

    GuildMember getSelfMember();

    GuildChannel getDefaultChannel();

    Role getDefaultRole();

    List<GuildMember> getMembers();

    GuildMember getMemberById(String memberId);

    String getIconURLl();

    List<Role> getRoles();

    Role getRoleById(String roleId);

    List<Emote> getCustomEmotes();

    Emote getMemberByName(String emoteName);

    List<TextChannel> getChannels();

    GuildChannel getChannelById(String channelId);

    List<Category> getCategories();

    Category getCategoryById(String categoryId);

    void addCategory(Category category);

    void addTextChannel(TextChannel channel);

    void addVoiceChannel(GuildVoiceChannel textChannel);

    void addRole(Role role);

    void unBan(String userId);

}
