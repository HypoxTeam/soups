package me.jonakls.soups.module;

import me.jonakls.soups.SoupsPlugin;
import me.yushust.inject.AbstractModule;

public class BinderModule extends AbstractModule {

    private final SoupsPlugin plugin;

    public BinderModule(SoupsPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    protected void configure() {
        bind(SoupsPlugin.class).toInstance(plugin);
    }
}
