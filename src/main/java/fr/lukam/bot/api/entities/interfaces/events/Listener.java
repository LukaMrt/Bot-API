package fr.lukam.bot.api.entities.interfaces.events;

import fr.lukam.bot.api.events.ReadyEvent;
import fr.lukam.bot.api.events.category.CategoryAddedEvent;
import fr.lukam.bot.api.events.category.CategoryRemovedEvent;
import fr.lukam.bot.api.events.channel.text.TextChannelAddedEvent;
import fr.lukam.bot.api.events.channel.text.TextChannelRemovedEvent;
import fr.lukam.bot.api.events.channel.text.TextChannelUpdateNameEvent;
import fr.lukam.bot.api.events.channel.voice.VoiceChannelAddedEvent;
import fr.lukam.bot.api.events.channel.voice.VoiceChannelRemovedEvent;
import fr.lukam.bot.api.events.channel.voice.VoiceChannelUpdateNameEvent;
import fr.lukam.bot.api.events.message.actions.MessageDeletedEvent;
import fr.lukam.bot.api.events.message.actions.MessageReceivedEvent;
import fr.lukam.bot.api.events.message.actions.MessageUpdatedEvent;
import fr.lukam.bot.api.events.message.actions.server.ServerMessageDeletedEvent;
import fr.lukam.bot.api.events.message.actions.server.ServerMessageReceivedEvent;
import fr.lukam.bot.api.events.message.actions.server.ServerMessageUpdatedEvent;
import fr.lukam.bot.api.events.message.reactions.server.ServerMessageReactionAddedEvent;
import fr.lukam.bot.api.events.message.reactions.server.ServerMessageReactionRemovedEvent;
import fr.lukam.bot.api.events.roles.RoleColorUpdateColor;
import fr.lukam.bot.api.events.roles.RoleCreateEvent;
import fr.lukam.bot.api.events.roles.RoleNameUpdateEvent;
import fr.lukam.bot.api.events.roles.RoleRemovedEvent;
import fr.lukam.bot.api.events.server.BanEvent;
import fr.lukam.bot.api.events.server.ServerNameUpdateEvent;
import fr.lukam.bot.api.events.server.ServerOwnerUpdateEvent;
import fr.lukam.bot.api.events.server.UnBanEvent;
import fr.lukam.bot.api.events.server.emote.EmoteAddedEvent;
import fr.lukam.bot.api.events.server.emote.EmoteRemovedEvent;
import fr.lukam.bot.api.events.server.emote.EmoteUpdateNameEvent;
import fr.lukam.bot.api.events.server.member.MemberJoinEvent;
import fr.lukam.bot.api.events.server.member.MemberQuitEvent;
import fr.lukam.bot.api.events.server.member.MemberNickNameChangeEvent;
import fr.lukam.bot.api.events.server.member.MemberTypingEvent;
import fr.lukam.bot.api.events.server.member.MemberRoleAddedEvent;
import fr.lukam.bot.api.events.server.member.MemberRoleRemoveEvent;
import fr.lukam.bot.api.events.server.voice.VoiceConnectEvent;
import fr.lukam.bot.api.events.server.voice.VoiceDisconnectEvent;
import fr.lukam.bot.api.events.server.voice.VoiceMoveEvent;
import fr.lukam.bot.api.events.user.UserNameChangeEvent;
import fr.lukam.bot.api.events.user.UserTypingEvent;

public abstract class Listener {

    public void onReady(ReadyEvent event) {
        // Empty because of operation of listeners system
    }

    //User Events
    public void onUserUpdateName(UserNameChangeEvent event) {
        // Empty because of operation of listeners system
    }

    public void onUserTyping(UserTypingEvent event) {
        // Empty because of operation of listeners system
    }

    //Message Events
    public void onServerMessageReceived(ServerMessageReceivedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerMessageUpdate(ServerMessageUpdatedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerMessageDelete(ServerMessageDeletedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerMessageReactionAdd(ServerMessageReactionAddedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerMessageReactionRemove(ServerMessageReactionRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onPrivateMessageReceived(MessageReceivedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onPrivateMessageUpdate(MessageUpdatedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onPrivateMessageDelete(MessageDeletedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onPrivateMessageEmbed(ServerMessageReceivedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onPrivateMessageReactionAdd(ServerMessageReactionAddedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onPrivateMessageReactionRemove(ServerMessageReactionRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    //TextChannel Events
    public void onTextChannelDelete(TextChannelRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onTextChannelUpdateName(TextChannelUpdateNameEvent event) {
        // Empty because of operation of listeners system
    }

    public void onTextChannelCreate(TextChannelAddedEvent event) {
        // Empty because of operation of listeners system
    }

    //VoiceChannel Events
    public void onVoiceChannelDelete(VoiceChannelRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onVoiceChannelUpdateName(VoiceChannelUpdateNameEvent event) {
        // Empty because of operation of listeners system
    }

    public void onVoiceChannelCreate(VoiceChannelAddedEvent event) {
        // Empty because of operation of listeners system
    }

    //Category Events
    public void onCategoryCreate(CategoryAddedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onCategoryDelete(CategoryRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    //Server Events
    public void onServerBan(BanEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerUnban(UnBanEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerUpdateName(ServerNameUpdateEvent event){
        // Empty because of operation of listeners system
    }

    public void onServerUpdateOwner(ServerOwnerUpdateEvent event) {
        // Empty because of operation of listeners system
    }

    //Server Member Events
    public void onServerMemberJoin(MemberJoinEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerMemberLeave(MemberQuitEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerMemberRoleAdd(MemberRoleAddedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerMemberRoleRemove(MemberRoleRemoveEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerMemberUpdateNickname(MemberNickNameChangeEvent event) {
        // Empty because of operation of listeners system
    }

    public void onMemberTyping(MemberTypingEvent event) {
        // Empty because of operation of listeners system
    }

    //Server Voice Events
    public void onServerVoiceJoin(VoiceConnectEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerVoiceMove(VoiceMoveEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerVoiceLeave(VoiceDisconnectEvent event) {
        // Empty because of operation of listeners system
    }

    //Role events
    public void onRoleCreate(RoleCreateEvent event) {
        // Empty because of operation of listeners system
    }

    public void onRoleDelete(RoleRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onRoleUpdateColor(RoleColorUpdateColor event) {
        // Empty because of operation of listeners system
    }

    public void onRoleUpdateName(RoleNameUpdateEvent event) {
        // Empty because of operation of listeners system
    }

    //Emote Events
    public void onEmoteAdded(EmoteAddedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onEmoteRemoved(EmoteRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onEmoteUpdateName(EmoteUpdateNameEvent event) {
        // Empty because of operation of listeners system
    }

}
