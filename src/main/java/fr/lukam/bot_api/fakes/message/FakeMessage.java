package fr.lukam.bot_api.fakes.message;

import fr.lukam.bot_api.entities.user.User;
import fr.lukam.bot_api.entities.channels.GuildTextChannel;
import fr.lukam.bot_api.entities.guild.GuildMember;
import fr.lukam.bot_api.entities.guild.Role;
import fr.lukam.bot_api.entities.message.Message;
import fr.lukam.bot_api.entities.reaction.Emote;
import fr.lukam.bot_api.entities.reaction.Reaction;
import fr.lukam.bot_api.fakes.user.FakeUser;
import fr.lukam.bot_api.fakes.reaction.FakeReaction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FakeMessage implements Message {

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public String getLink() {
        return null;
    }

    @Override
    public GuildMember getSender() {
        return null;
    }

    @Override
    public LocalDateTime getDate() {
        return LocalDateTime.now();
    }

    @Override
    public List<Reaction> getReactions() {
        return new ArrayList<>();
    }

    @Override
    public List<User> getMentionedUsers() {
        return new ArrayList<>();
    }

    @Override
    public List<GuildTextChannel> getMentionedChannels() {
        return new ArrayList<>();
    }

    @Override
    public List<Role> getMentionedRoles() {
        return new ArrayList<>();
    }

    @Override
    public List<Emote> getEmotes() {
        return new ArrayList<>();
    }

    @Override
    public Reaction getReactionByName() {
        return new FakeReaction();
    }

    @Override
    public User getAuthor() {
        return new FakeUser();
    }

    @Override
    public void addReaction(Emote emote) {

    }

    @Override
    public void removeReaction(Emote emote) {

    }

    @Override
    public void pin() {

    }

    @Override
    public void unPin() {

    }

    @Override
    public void edit(Message newMessage) {

    }

    @Override
    public void delete() {

    }

    @Override
    public String getId() {
        return "";
    }

}
