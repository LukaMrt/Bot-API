package fr.lukam.bot.api.events.server.member;

public interface MemberNicknameChangedEvent extends ServerMemberEvent {

    String getOldNickName();

    String getNewNickName();

}
