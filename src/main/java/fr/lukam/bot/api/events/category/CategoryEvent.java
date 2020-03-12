package fr.lukam.bot.api.events.category;

import fr.lukam.bot.api.entities.interfaces.server.Category;
import fr.lukam.bot.api.events.server.ServerEvent;

public interface CategoryEvent extends ServerEvent {

    Category getCategory();

}
