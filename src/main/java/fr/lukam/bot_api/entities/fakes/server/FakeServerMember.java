package fr.lukam.bot_api.entities.fakes.server;

import fr.lukam.bot_api.entities.interfaces.user.Status;
import fr.lukam.bot_api.entities.interfaces.channels.ServerVoiceChannel;
import fr.lukam.bot_api.entities.interfaces.channels.TextChannel;
import fr.lukam.bot_api.entities.interfaces.server.ServerMember;
import fr.lukam.bot_api.entities.interfaces.server.Permission;
import fr.lukam.bot_api.entities.interfaces.server.Role;
import fr.lukam.bot_api.entities.fakes.user.FakeStatus;
import fr.lukam.bot_api.entities.fakes.channels.FakeTextChannel;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class FakeServerMember implements ServerMember {

    @Override
    public String getNickName() {
        return "";
    }

    @Override
    public Set<Role> getRoles() {
        return new HashSet<>();
    }

    @Override
    public LocalDateTime getJoinTime() {
        return LocalDateTime.now();
    }

    @Override
    public boolean isOwner() {
        return false;
    }

    @Override
    public boolean hashPermissions(Permission... permissions) {
        return false;
    }

    @Override
    public boolean hasRoles(Role... roles) {
        return false;
    }

    @Override
    public void kick(String reason) {
        // Empty because it is a null object
    }

    @Override
    public void ban(String reason) {
        // Empty because it is a null object
    }

    @Override
    public void mute() {
        // Empty because it is a null object
    }

    @Override
    public void addRoles(Role... roles) {
        // Empty because it is a null object
    }

    @Override
    public void removeRoles(Role... roles) {
        // Empty because it is a null object
    }

    @Override
    public void setNickName(String newNickName) {
        // Empty because it is a null object
    }

    @Override
    public void addPermission(Permission permission) {
        // Empty because it is a null object
    }

    @Override
    public void removePermission(Permission permission) {
        // Empty because it is a null object
    }

    @Override
    public void connectToVoiceChannel(ServerVoiceChannel channel) {
        // Empty because it is a null object
    }

    @Override
    public String getAvatarURL() {
        return "";
    }

    @Override
    public String getAsTag() {
        return "";
    }

    @Override
    public TextChannel getPrivateChannel() {
        return new FakeTextChannel();
    }

    @Override
    public void sendMessage() {
        // Empty because it is a null object
    }

    @Override
    public Status getStatus() {
        return new FakeStatus();
    }

    @Override
    public LocalDateTime getCreateAccountTime() {
        return LocalDateTime.now();
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getAsMention() {
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
