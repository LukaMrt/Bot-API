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
import fr.lukam.bot.api.events.server.member.*;
import fr.lukam.bot.api.events.server.voice.VoiceConnectEvent;
import fr.lukam.bot.api.events.server.voice.VoiceDisconnectEvent;
import fr.lukam.bot.api.events.server.voice.VoiceMoveEvent;
import fr.lukam.bot.api.events.user.UserNameChangeEvent;
import fr.lukam.bot.api.events.user.UserTypingEvent;

public abstract class Listener {

    public void onReady(ReadyEvent event) {}

    //User Events
    public void onUserUpdateName(UserNameChangeEvent event) {}
    public void onUserTyping(UserTypingEvent event) {}

    //Message Events
    public void onServerMessageReceived(ServerMessageReceivedEvent event) {}
    public void onServerMessageUpdate(ServerMessageUpdatedEvent event) {}
    public void onServerMessageDelete(ServerMessageDeletedEvent event) {}
    public void onServerMessageReactionAdd(ServerMessageReactionAddedEvent event) {}
    public void onServerMessageReactionRemove(ServerMessageReactionRemovedEvent event) {}

    public void onPrivateMessageReceived(MessageReceivedEvent event) {}
    public void onPrivateMessageUpdate(MessageUpdatedEvent event) {}
    public void onPrivateMessageDelete(MessageDeletedEvent event) {}
    public void onPrivateMessageEmbed(ServerMessageReceivedEvent event) {}
    public void onPrivateMessageReactionAdd(ServerMessageReactionAddedEvent event) {}
    public void onPrivateMessageReactionRemove(ServerMessageReactionRemovedEvent event) {}

    //TextChannel Events
    public void onTextChannelDelete(TextChannelRemovedEvent event) {}
    public void onTextChannelUpdateName(TextChannelUpdateNameEvent event) {}
    public void onTextChannelCreate(TextChannelAddedEvent event) {}

    //VoiceChannel Events
    public void onVoiceChannelDelete(VoiceChannelRemovedEvent event) {}
    public void onVoiceChannelUpdateName(VoiceChannelUpdateNameEvent event) {}
    public void onVoiceChannelCreate(VoiceChannelAddedEvent event) {}

    //Category Events
    public void onCategoryCreate(CategoryAddedEvent event) {}
    public void onCategoryDelete(CategoryRemovedEvent event) {}

    //Server Events
    public void onServerBan(BanEvent event) {}
    public void onServerUnban(UnBanEvent event) {}
    public void onServerUpdateName(ServerNameUpdateEvent event){}
    public void onServerUpdateOwner(ServerOwnerUpdateEvent event) {}

    //Server Member Events
    public void onServerMemberJoin(MemberJoinEvent event) {}
    public void onServerMemberLeave(MemberQuitEvent event) {}
    public void onServerMemberRoleAdd(MemberRoleAddedEvent event) {}
    public void onServerMemberRoleRemove(MemberRoleRemoveEvent event) {}
    public void onServerMemberUpdateNickname(MemberNickNameChangeEvent event) {}
    public void onMemberTyping(MemberTypingEvent event) {}

    //Server Voice Events
    public void onServerVoiceJoin(VoiceConnectEvent event) {}
    public void onServerVoiceMove(VoiceMoveEvent event) {}
    public void onServerVoiceLeave(VoiceDisconnectEvent event) {}

    //Role events
    public void onRoleCreate(RoleCreateEvent event) {}
    public void onRoleDelete(RoleRemovedEvent event) {}
    public void onRoleUpdateColor(RoleColorUpdateColor event) {}
    public void onRoleUpdateName(RoleNameUpdateEvent event) {}

    //Emote Events
    public void onEmoteAdded(EmoteAddedEvent event) {}
    public void onEmoteRemoved(EmoteRemovedEvent event) {}
    public void onEmoteUpdateName(EmoteUpdateNameEvent event) {}

}
