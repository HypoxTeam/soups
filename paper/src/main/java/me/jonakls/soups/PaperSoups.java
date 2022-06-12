package me.jonakls.soups;

import me.jonakls.soups.listeners.PlayerJoinMessagesListener;
import org.bukkit.plugin.java.JavaPlugin;

public class PaperSoups extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoinMessagesListener(), this);
        getLogger().info("Hi");
    }

}
