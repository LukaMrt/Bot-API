package fr.lukam.bot.api.events.message.reactions;

import fr.lukam.bot.api.entities.interfaces.reaction.Reaction;
import fr.lukam.bot.api.events.user.UserEvent;

public interface MessageReactionEvent extends UserEvent {

    Reaction getReaction();

}
