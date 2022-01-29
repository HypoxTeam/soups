package me.jonakls.api.builders;

import me.jonakls.api.EnchantmentData;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder {

    private ItemStack item;
    private ItemMeta meta;

    public ItemBuilder(Material material) {
        this.item = new ItemStack(material);
        this.meta = item.getItemMeta();
    }

    public ItemBuilder setName(String name) {
        meta.setDisplayName(name);
        return this;
    }

    public ItemBuilder setLore(List<String> lore) {
        meta.setLore(lore);
        return this;
    }

    public ItemBuilder setLore(String...strings) {
        List<String> lore = new ArrayList<>();
        for (String line : strings) {
            lore.add(line);
        }
        meta.setLore(lore);
        return this;
    }

    public ItemBuilder setAmount(int amount) {
        item.setAmount(amount);
        return this;
    }

    public ItemBuilder setType(Material material) {
        item.setType(material);
        return this;
    }

    public ItemBuilder addEnchants(Enchantment...enchantments) {
        for (Enchantment enchant : enchantments) {
            meta.addEnchant(enchant, 1, false);
        }
        return this;
    }

    public ItemBuilder addEnchants(EnchantmentData...enchantments) {
        for (EnchantmentData enchant : enchantments) {
            meta.addEnchant(enchant.getEnchantment(), enchant.getLevel(), false);
        }
        return this;
    }

    public ItemBuilder addFlags(ItemFlag... flags) {
        meta.addItemFlags(flags);
        return this;
    }

    public ItemBuilder setUnbreakable(boolean unbreakable) {
        meta.spigot().setUnbreakable(unbreakable);
        return this;
    }

    public ItemStack build() {
        item.setItemMeta(meta);
        return item;
    }






























}
