package fr.lukam.bot.api.entities.interfaces.events;

import fr.lukam.bot.api.events.ReadyEvent;
import fr.lukam.bot.api.events.category.CategoryAddedEvent;
import fr.lukam.bot.api.events.category.CategoryRemovedEvent;
import fr.lukam.bot.api.events.channel.text.TextChannelAddedEvent;
import fr.lukam.bot.api.events.channel.text.TextChannelRemovedEvent;
import fr.lukam.bot.api.events.channel.text.TextChannelNameUpdatedEvent;
import fr.lukam.bot.api.events.channel.voice.VoiceChannelAddedEvent;
import fr.lukam.bot.api.events.channel.voice.VoiceChannelRemovedEvent;
import fr.lukam.bot.api.events.channel.voice.VoiceChannelNameUpdatedEvent;
import fr.lukam.bot.api.events.message.actions.PrivateMessageDeletedEvent;
import fr.lukam.bot.api.events.message.actions.PrivateMessageReceivedEvent;
import fr.lukam.bot.api.events.message.actions.PrivateMessageUpdatedEvent;
import fr.lukam.bot.api.events.message.actions.server.ServerMessageDeletedEvent;
import fr.lukam.bot.api.events.message.actions.server.ServerMessageReceivedEvent;
import fr.lukam.bot.api.events.message.actions.server.ServerMessageUpdatedEvent;
import fr.lukam.bot.api.events.message.reactions.PrivateMessageReactionAddedEvent;
import fr.lukam.bot.api.events.message.reactions.PrivateMessageReactionRemovedEvent;
import fr.lukam.bot.api.events.message.reactions.server.ServerMessageReactionAddedEvent;
import fr.lukam.bot.api.events.message.reactions.server.ServerMessageReactionRemovedEvent;
import fr.lukam.bot.api.events.roles.RoleColorUpdatedEvent;
import fr.lukam.bot.api.events.roles.RoleCreatedEvent;
import fr.lukam.bot.api.events.roles.RoleNameUpdatedEvent;
import fr.lukam.bot.api.events.roles.RoleRemovedEvent;
import fr.lukam.bot.api.events.server.BanEvent;
import fr.lukam.bot.api.events.server.ServerNameUpdatedEvent;
import fr.lukam.bot.api.events.server.ServerOwnerUpdatedEvent;
import fr.lukam.bot.api.events.server.UnBanEvent;
import fr.lukam.bot.api.events.server.emote.EmoteAddedEvent;
import fr.lukam.bot.api.events.server.emote.EmoteRemovedEvent;
import fr.lukam.bot.api.events.server.emote.EmoteNameUpdatedEvent;
import fr.lukam.bot.api.events.server.member.MemberJoinedEvent;
import fr.lukam.bot.api.events.server.member.MemberLeftEvent;
import fr.lukam.bot.api.events.server.member.MemberNicknameChangedEvent;
import fr.lukam.bot.api.events.server.member.MemberTypingEvent;
import fr.lukam.bot.api.events.server.member.MemberRoleAddedEvent;
import fr.lukam.bot.api.events.server.member.MemberRoleRemovedEvent;
import fr.lukam.bot.api.events.server.voice.VoiceMemberConnectedEvent;
import fr.lukam.bot.api.events.server.voice.VoiceMemberDisconnectedEvent;
import fr.lukam.bot.api.events.server.voice.VoiceMemberMovedEvent;
import fr.lukam.bot.api.events.user.UserNameUpdatedEvent;
import fr.lukam.bot.api.events.user.UserTypingEvent;

public abstract class Listener {

    public void onReady(ReadyEvent event) {
        // Empty because of operation of listeners system
    }

    //User Events
    public void onUserUpdateName(UserNameUpdatedEvent event) {
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

    public void onPrivateMessageReceived(PrivateMessageReceivedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onPrivateMessageUpdate(PrivateMessageUpdatedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onPrivateMessageDelete(PrivateMessageDeletedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onPrivateMessageEmbed(ServerMessageReceivedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onPrivateMessageReactionAdd(PrivateMessageReactionAddedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onPrivateMessageReactionRemove(PrivateMessageReactionRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    //TextChannel Events
    public void onTextChannelDelete(TextChannelRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onTextChannelUpdateName(TextChannelNameUpdatedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onTextChannelCreate(TextChannelAddedEvent event) {
        // Empty because of operation of listeners system
    }

    //VoiceChannel Events
    public void onVoiceChannelDelete(VoiceChannelRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onVoiceChannelUpdateName(VoiceChannelNameUpdatedEvent event) {
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

    public void onServerUpdateName(ServerNameUpdatedEvent event){
        // Empty because of operation of listeners system
    }

    public void onServerUpdateOwner(ServerOwnerUpdatedEvent event) {
        // Empty because of operation of listeners system
    }

    //Server Member Events
    public void onServerMemberJoin(MemberJoinedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerMemberLeave(MemberLeftEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerMemberRoleAdd(MemberRoleAddedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerMemberRoleRemove(MemberRoleRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerMemberUpdateNickname(MemberNicknameChangedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onMemberTyping(MemberTypingEvent event) {
        // Empty because of operation of listeners system
    }

    //Server Voice Events
    public void onServerVoiceJoin(VoiceMemberConnectedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerVoiceMove(VoiceMemberMovedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onServerVoiceLeave(VoiceMemberDisconnectedEvent event) {
        // Empty because of operation of listeners system
    }

    //Role events
    public void onRoleCreate(RoleCreatedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onRoleDelete(RoleRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onRoleUpdateColor(RoleColorUpdatedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onRoleUpdateName(RoleNameUpdatedEvent event) {
        // Empty because of operation of listeners system
    }

    //Emote Events
    public void onEmoteAdded(EmoteAddedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onEmoteRemoved(EmoteRemovedEvent event) {
        // Empty because of operation of listeners system
    }

    public void onEmoteUpdateName(EmoteNameUpdatedEvent event) {
        // Empty because of operation of listeners system
    }

}
