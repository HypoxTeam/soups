package me.jonakls.soups.command;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import me.jonakls.soups.configuration.YamlFile;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.List;

public class MainCommand implements CommandExecutor, TabCompleter {

    @Inject @Named("config")
    private YamlFile config;

    @Inject @Named("lang")
    private YamlFile lang;

    @Override
    public boolean onCommand(CommandSender sender,Command command, String s, String[] args) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return null;
    }
}