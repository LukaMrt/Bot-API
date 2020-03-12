package fr.lukam.bot.api.events.server.member;

public interface MemberNickNameChangeEvent extends ServerMemberEvent {

    String getOldNickName();

    String getNewNickName();

}
