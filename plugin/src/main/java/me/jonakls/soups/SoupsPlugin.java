package me.jonakls.soups;

import me.jonakls.api.EnchantmentData;
import me.jonakls.api.builders.ItemBuilder;
import me.jonakls.soups.module.BinderModule;
import me.yushust.inject.Injector;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class SoupsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        setupInjector();
        ItemStack si = new ItemBuilder(Material.DIAMOND_AXE)
                .setName("Espada")
                .setLore("Hello world", "This is a lore of item")
                .addEnchants(
                        new EnchantmentData(Enchantment.DAMAGE_ALL, 4),
                        new EnchantmentData(Enchantment.DURABILITY, 3)
                )
                .addFlags(ItemFlag.HIDE_ATTRIBUTES)
                .setUnbreakable(true)
                .build();



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
