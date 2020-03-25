package fr.lukam.bot.api.utils;

import fr.lukam.bot.api.entities.interfaces.user.Status;

public interface StatusAdapter {

    Status fromStatusName(String statusName);

}
