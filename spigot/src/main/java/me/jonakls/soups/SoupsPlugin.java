package me.jonakls.soups;

import com.google.inject.Injector;
import me.jonakls.soups.module.BinderModule;
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
        BinderModule binderModule = new BinderModule(this);
        Injector injector = binderModule.createInjector();
        injector.injectMembers(this);
    }

}
