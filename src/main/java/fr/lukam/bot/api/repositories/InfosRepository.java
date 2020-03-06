package fr.lukam.bot.api.repositories;

public interface InfosRepository {

    void set(String key, String value);

    void set(String key, String[] value);

    void set(String key, int value);

    String getString(String key);

    String[] getStringArray(String key);

    int getInt(String key);

}
