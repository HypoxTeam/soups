package me.jonakls.soups.module;

import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.Guice;
import me.jonakls.soups.SoupsPlugin;

public class BinderModule extends AbstractModule {

    private final SoupsPlugin plugin;

    public BinderModule(SoupsPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    protected void configure() {
        bind(SoupsPlugin.class).toInstance(plugin);
    }

    public Injector createInjector() {
        return Guice.createInjector(this);
    }
}
