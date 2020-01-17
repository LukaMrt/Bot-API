package fr.lukam.bot_api.entities.fakes.server;

import fr.lukam.bot_api.entities.interfaces.channels.ServerChannel;
import fr.lukam.bot_api.entities.interfaces.channels.ServerVoiceChannel;
import fr.lukam.bot_api.entities.interfaces.channels.TextChannel;
import fr.lukam.bot_api.entities.interfaces.server.Category;
import fr.lukam.bot_api.entities.interfaces.server.Server;
import fr.lukam.bot_api.entities.interfaces.server.ServerMember;
import fr.lukam.bot_api.entities.interfaces.server.Role;
import fr.lukam.bot_api.entities.interfaces.reaction.Emote;
import fr.lukam.bot_api.entities.fakes.channels.FakeServerChannel;
import fr.lukam.bot_api.entities.fakes.reaction.FakeEmote;

import java.util.ArrayList;
import java.util.List;

public class FakeServer implements Server {

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public ServerMember getOwner() {
        return new FakeServerMember();
    }

    @Override
    public ServerMember getSelfMember() {
        return new FakeServerMember();
    }

    @Override
    public ServerChannel getDefaultChannel() {
        return new FakeServerChannel();
    }

    @Override
    public Role getDefaultRole() {
        return new FakeRole();
    }

    @Override
    public List<ServerMember> getMembers() {
        return new ArrayList<>();
    }

    @Override
    public ServerMember getMemberById(String memberId) {
        return new FakeServerMember();
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
    public ServerChannel getChannelById(String channelId) {
        return new FakeServerChannel();
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
    public void addVoiceChannel(ServerVoiceChannel textChannel) {

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
