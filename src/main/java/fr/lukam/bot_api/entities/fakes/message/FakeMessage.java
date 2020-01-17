package fr.lukam.bot_api.entities.fakes.message;

import fr.lukam.bot_api.entities.interfaces.user.User;
import fr.lukam.bot_api.entities.interfaces.channels.ServerTextChannel;
import fr.lukam.bot_api.entities.interfaces.server.ServerMember;
import fr.lukam.bot_api.entities.interfaces.server.Role;
import fr.lukam.bot_api.entities.interfaces.message.Message;
import fr.lukam.bot_api.entities.interfaces.reaction.Emote;
import fr.lukam.bot_api.entities.interfaces.reaction.Reaction;
import fr.lukam.bot_api.entities.fakes.user.FakeUser;
import fr.lukam.bot_api.entities.fakes.reaction.FakeReaction;

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
    public ServerMember getSender() {
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
    public List<ServerTextChannel> getMentionedChannels() {
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
        // Empty because it is a null object
    }

    @Override
    public void removeReaction(Emote emote) {
        // Empty because it is a null object
    }

    @Override
    public void pin() {
        // Empty because it is a null object
    }

    @Override
    public void unPin() {
        // Empty because it is a null object
    }

    @Override
    public void edit(Message newMessage) {
        // Empty because it is a null object
    }

    @Override
    public void delete() {
        // Empty because it is a null object
    }

    @Override
    public String getId() {
        return "";
    }

}
