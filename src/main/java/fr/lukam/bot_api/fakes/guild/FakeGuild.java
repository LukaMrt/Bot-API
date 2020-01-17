package fr.lukam.bot_api.fakes.guild;

import fr.lukam.bot_api.entities.channels.GuildChannel;
import fr.lukam.bot_api.entities.channels.GuildVoiceChannel;
import fr.lukam.bot_api.entities.channels.TextChannel;
import fr.lukam.bot_api.entities.guild.Category;
import fr.lukam.bot_api.entities.guild.Guild;
import fr.lukam.bot_api.entities.guild.GuildMember;
import fr.lukam.bot_api.entities.guild.Role;
import fr.lukam.bot_api.entities.reaction.Emote;
import fr.lukam.bot_api.fakes.channels.FakeGuildChannel;
import fr.lukam.bot_api.fakes.reaction.FakeEmote;

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
