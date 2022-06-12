package me.jonakls.soups.configuration;

import me.jonakls.soups.SoupsPlugin;
import me.jonakls.soups.utils.TextUtil;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class YamlFile extends YamlConfiguration {

    private final File file;
    private final String fileName;
    private final SoupsPlugin plugin;

    private YamlFile(SoupsPlugin plugin, String fileName, String fileExtension, File folder) {
        this.plugin = plugin;
        this.fileName = fileName + (fileName.endsWith(fileExtension) ? "" : fileExtension);
        this.file = new File(folder, fileName);
        createFile();
    }

    private YamlFile(SoupsPlugin plugin, String fileName, String fileExtension) {
        this(plugin, fileName, fileExtension, plugin.getDataFolder());
    }

    public YamlFile(SoupsPlugin plugin, String fileName) {
        this(plugin, fileName, ".yml");
    }

    private void createFile() {
        try {
            if (!file.exists()) {
                if (plugin.getResource(fileName) != null) {
                    plugin.saveResource(fileName, false);
                } else {
                    save(file);
                }
                load(file);
                return;
            }
            save(file);
            load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveFile() throws IOException {
        save(file);
    }

    public void reloadFile() throws IOException, InvalidConfigurationException {
        save(file);
        load(file);
    }

    // Getters
    @Override
    public String getString(String path) {
        if (super.getString(path) != null) {
            return TextUtil.colorize(super.getString(path));
        }
        return TextUtil.colorize("&8[&cx&8]: &cError, path (" + path + ") is null, please review your configuration files.");
    }
}
