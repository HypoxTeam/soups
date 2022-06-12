package me.jonakls.soups.listeners;

import com.google.inject.Inject;
import me.jonakls.soups.SoupsPlugin;
import me.jonakls.soups.reflect.TitleReflect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinMessagesListener implements Listener {

    @Inject
    private SoupsPlugin plugin;

    @EventHandler
    private void onJoinMessages(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        TitleReflect.sendTitle(player, "&aThis is a test", "&cSubtitle test");
        TitleReflect.sendActionBar(player, "Test actionbar");
    }
}
