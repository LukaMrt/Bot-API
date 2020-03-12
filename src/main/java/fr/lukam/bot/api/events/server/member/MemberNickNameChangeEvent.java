package fr.lukam.bot.api.events.member;

public interface MemberNickNameChangeEvent extends ServerMemberEvent {

    String getOldNickName();

    String getNewNickName();

}
