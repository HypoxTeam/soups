package me.jonakls.api;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public interface Skill {

    String getName();
    Material activationMaterial();
    EntityType entityTypeActivator();
    int cooldown();
    void getConfigValues(YamlConfiguration config);
    void execute(Player player, Event event);

}
