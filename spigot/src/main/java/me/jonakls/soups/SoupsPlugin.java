package me.jonakls.soups;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import me.jonakls.api.manager.ManagerLoader;
import me.jonakls.soups.managers.ListenerManager;
import me.jonakls.soups.module.BinderModule;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.List;

public class SoupsPlugin extends JavaPlugin {

    @Inject
    private ListenerManager listenerManager;

    @Override
    public void onEnable() {
        setupInjector();
        setupManagers();
    }



    @Override
    public void onDisable() {
        // On disable logic plugin
    }

    private void setupManagers() {
        List<ManagerLoader> managers = Arrays.asList(listenerManager);
        for (ManagerLoader managerLoader : managers) {
            managerLoader.start();
        }
    }

    private void setupInjector() {
        Injector injector = Guice.createInjector(new BinderModule(this));
        injector.injectMembers(this);
    }

}
