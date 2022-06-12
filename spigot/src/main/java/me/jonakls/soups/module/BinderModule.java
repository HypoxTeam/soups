package me.jonakls.soups.module;

import com.google.inject.AbstractModule;
import me.jonakls.soups.SoupsPlugin;
import me.jonakls.soups.module.files.FileModule;

public class BinderModule extends AbstractModule {

    private SoupsPlugin plugin;

    public BinderModule(SoupsPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    protected void configure() {
        this.bind(SoupsPlugin.class).toInstance(plugin);

        this.binder().install(new FileModule(plugin));
    }
}
