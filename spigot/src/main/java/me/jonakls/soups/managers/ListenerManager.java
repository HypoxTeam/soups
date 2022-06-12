package me.jonakls.soups.managers;

import com.google.inject.Inject;
import me.jonakls.api.manager.ManagerLoader;
import me.jonakls.soups.SoupsPlugin;
import me.jonakls.soups.listeners.PlayerJoinMessagesListener;
import me.jonakls.soups.listeners.PlayerQuitMessageListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

import java.util.Arrays;
import java.util.List;

public class ListenerManager implements ManagerLoader {

    @Inject
    private SoupsPlugin plugin;

    @Inject
    private PlayerJoinMessagesListener playerJoinMessagesListener;

    @Inject
    private PlayerQuitMessageListener playerQuitMessageListener;

    @Override
    public void start() {
        PluginManager pluginManager = plugin.getServer().getPluginManager();
        List<Listener> listenerList = Arrays.asList(
                playerJoinMessagesListener,
                playerQuitMessageListener
        );

        for (Listener listener : listenerList) {
            pluginManager.registerEvents(listener, plugin);
        }

    }
}
