package me.jonakls.soups.utils;

import org.bukkit.ChatColor;

public class ChatUtils {

    public static String toLegacyColors(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

}
