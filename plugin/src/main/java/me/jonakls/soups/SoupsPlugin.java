package me.jonakls.soups;

import me.jonakls.soups.module.BinderModule;
import me.yushust.inject.Injector;
import org.bukkit.plugin.java.JavaPlugin;

public class SoupsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        setupInjector();



    }

    @Override
    public void onDisable() {
        // On disable logic plugin
    }


    private void setupInjector() {
        Injector injector = Injector.create(new BinderModule(this));
        injector.injectMembers(this);
    }

}
