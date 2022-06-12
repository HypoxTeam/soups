package me.jonakls.soups.module.files;

import com.google.inject.AbstractModule;
import me.jonakls.soups.SoupsPlugin;
import me.jonakls.soups.configuration.YamlFile;

import static com.google.inject.name.Names.named;

public class FileModule extends AbstractModule {

    private SoupsPlugin plugin;

    public FileModule(SoupsPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    protected void configure() {
        bind(YamlFile.class)
                .annotatedWith(named("config"))
                .toInstance(new YamlFile(plugin, "config.yml"));

        bind(YamlFile.class)
                .annotatedWith(named("lang"))
                .toInstance(new YamlFile(plugin, "lang.yml"));
    }
}
