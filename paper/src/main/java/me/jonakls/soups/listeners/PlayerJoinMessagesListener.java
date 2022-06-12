package me.jonakls.soups.listeners;

import net.kyori.adventure.title.Title;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.time.Duration;

import static net.kyori.adventure.text.Component.text;

public class PlayerJoinMessagesListener implements Listener {

    @EventHandler
    private void onJoinMessages(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        Title title = Title.title(
                text("Hello world"),
                text("This is a subtitle"),
                Title.Times.times(
                        Duration.ofSeconds(2),
                        Duration.ofSeconds(5),
                        Duration.ofSeconds(2)
                )
        );

        player.showTitle(title);
    }


}
