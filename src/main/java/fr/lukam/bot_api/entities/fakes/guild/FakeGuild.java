package fr.lukam.bot_api.entities.fakes.guild;

import fr.lukam.bot_api.entities.interfaces.channels.GuildChannel;
import fr.lukam.bot_api.entities.interfaces.channels.GuildVoiceChannel;
import fr.lukam.bot_api.entities.interfaces.channels.TextChannel;
import fr.lukam.bot_api.entities.interfaces.guild.Category;
import fr.lukam.bot_api.entities.interfaces.guild.Guild;
import fr.lukam.bot_api.entities.interfaces.guild.GuildMember;
import fr.lukam.bot_api.entities.interfaces.guild.Role;
import fr.lukam.bot_api.entities.interfaces.reaction.Emote;
import fr.lukam.bot_api.entities.fakes.channels.FakeGuildChannel;
import fr.lukam.bot_api.entities.fakes.reaction.FakeEmote;

import java.util.ArrayList;
import java.util.List;

public class FakeGuild implements Guild {

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public GuildMember getOwner() {
        return new FakeGuildMember();
    }

    @Override
    public GuildMember getSelfMember() {
        return new FakeGuildMember();
    }

    @Override
    public GuildChannel getDefaultChannel() {
        return new FakeGuildChannel();
    }

    @Override
    public Role getDefaultRole() {
        return new FakeRole();
    }

    @Override
    public List<GuildMember> getMembers() {
        return new ArrayList<>();
    }

    @Override
    public GuildMember getMemberById(String memberId) {
        return new FakeGuildMember();
    }

    @Override
    public String getIconURLl() {
        return "";
    }

    @Override
    public List<Role> getRoles() {
        return new ArrayList<>();
    }

    @Override
    public Role getRoleById(String roleId) {
        return new FakeRole();
    }

    @Override
    public List<Emote> getCustomEmotes() {
        return new ArrayList<>();
    }

    @Override
    public Emote getMemberByName(String emoteName) {
        return new FakeEmote();
    }

    @Override
    public List<TextChannel> getChannels() {
        return new ArrayList<>();
    }

    @Override
    public GuildChannel getChannelById(String channelId) {
        return new FakeGuildChannel();
    }

    @Override
    public List<Category> getCategories() {
        return new ArrayList<>();
    }

    @Override
    public Category getCategoryById(String categoryId) {
        return new FakeCategory();
    }

    @Override
    public void addCategory(Category category) {

    }

    @Override
    public void addTextChannel(TextChannel channel) {

    }

    @Override
    public void addVoiceChannel(GuildVoiceChannel textChannel) {

    }

    @Override
    public void addRole(Role role) {

    }

    @Override
    public void unBan(String userId) {

    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

}
