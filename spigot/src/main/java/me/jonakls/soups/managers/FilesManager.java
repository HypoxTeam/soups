package me.jonakls.soups.managers;

import com.google.inject.Inject;
import me.jonakls.api.manager.ManagerLoader;
import me.jonakls.soups.SoupsPlugin;

import java.util.HashMap;
import java.util.Map;

public class FilesManager implements ManagerLoader {

    @Inject
    private SoupsPlugin plugin;

    private Map<String, String> files = new HashMap<>();

    @Override
    public void start() {

    }
}
