package me.jonakls.soups.managers;

import com.google.inject.Inject;
import me.jonakls.api.manager.ManagerLoader;

import java.util.Arrays;

public class ManagerRegister implements ManagerLoader {

    @Inject
    private ListenerManager listenerManager;

    @Override
    public void start() {
        for (ManagerLoader loader : Arrays.asList(listenerManager)) {
            loader.start();
        }
    }
}
