package fr.lukam.bot_api.entities.guild;

public interface Invite {

    String getURL();

    GuildMember getInviter();

}
