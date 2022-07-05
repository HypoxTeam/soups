package me.jonakls.soups.skills;

import me.jonakls.api.Skill;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public class BombermanSkill implements Skill {


    @Override
    public String getName() {
        return null;
    }

    @Override
    public Material activationMaterial() {
        return null;
    }

    @Override
    public EntityType entityTypeActivator() {
        return null;
    }

    @Override
    public int cooldown() {
        return 0;
    }

    @Override
    public void getConfigValues(YamlConfiguration config) {

    }

    @Override
    public void execute(Player player, Event event) {

    }
}
