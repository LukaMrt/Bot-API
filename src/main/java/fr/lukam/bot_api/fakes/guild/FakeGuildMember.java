package fr.lukam.bot_api.fakes.guild;

import fr.lukam.bot_api.entities.user.Status;
import fr.lukam.bot_api.entities.channels.GuildVoiceChannel;
import fr.lukam.bot_api.entities.channels.TextChannel;
import fr.lukam.bot_api.entities.guild.GuildMember;
import fr.lukam.bot_api.entities.guild.Permission;
import fr.lukam.bot_api.entities.guild.Role;
import fr.lukam.bot_api.fakes.user.FakeStatus;
import fr.lukam.bot_api.fakes.channels.FakeTextChannel;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class FakeGuildMember implements GuildMember {

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
    public void kick(String reason) {

    }

    @Override
    public void ban(String reason) {

    }

    @Override
    public void mute() {

    }

    @Override
    public void addRoles(Role... roles) {

    }

    @Override
    public void removeRoles(Role... roles) {

    }

    @Override
    public void setNickName(String newNickName) {

    }

    @Override
    public void addPermission(Permission permission) {

    }

    @Override
    public void removePermission(Permission permission) {

    }

    @Override
    public void connectToVoiceChannel(GuildVoiceChannel channel) {

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

}
