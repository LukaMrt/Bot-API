package fr.lukam.bot_api.entities.fakes.server;

import fr.lukam.bot_api.entities.fakes.channels.FakeServerTextChannel;
import fr.lukam.bot_api.entities.interfaces.channels.ServerTextChannel;
import fr.lukam.bot_api.entities.interfaces.channels.ServerVoiceChannel;
import fr.lukam.bot_api.entities.interfaces.server.Category;
import fr.lukam.bot_api.entities.interfaces.server.Server;
import fr.lukam.bot_api.entities.interfaces.server.ServerMember;
import fr.lukam.bot_api.entities.interfaces.server.Role;
import fr.lukam.bot_api.entities.interfaces.reaction.Emote;

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
    public ServerTextChannel getDefaultChannel() {
        return new FakeServerTextChannel();
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
    public Emote getEmoteById(String emoteId) {
        return null;
    }

    @Override
    public List<ServerTextChannel> getTextChannels() {
        return null;
    }

    @Override
    public List<ServerVoiceChannel> getVoiceChannels() {
        return null;
    }

    @Override
    public ServerTextChannel getTextChannel(String channelId) {
        return null;
    }

    @Override
    public ServerVoiceChannel getVoiceChannel(String channelId) {
        return null;
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
        // Empty because it is a null object
    }

    @Override
    public void addTextChannel(ServerTextChannel channel) {
        // Empty because it is a null object
    }

    @Override
    public void addVoiceChannel(ServerVoiceChannel textChannel) {
        // Empty because it is a null object
    }

    @Override
    public void addRole(Role role) {
        // Empty because it is a null object
    }

    @Override
    public void unBan(String userId) {
        // Empty because it is a null object
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean isFake() {
        return true;
    }

}
