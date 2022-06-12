package me.jonakls.soups.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuitMessageListener implements Listener {

    @EventHandler
    private void onQuitMessage(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        player.sendMessage("Nothing");

    }

}
