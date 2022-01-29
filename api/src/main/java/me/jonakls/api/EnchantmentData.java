package me.jonakls.api;

import org.bukkit.enchantments.Enchantment;

public class EnchantmentSerializer {

    private Enchantment enchantment;
    private int level;

    public EnchantmentSerializer(Enchantment enchantment, int level) {
        this.enchantment = enchantment;
        this.level = level;
    }

    public EnchantmentSerializer(String...id) {
        this.enchantment = Enchantment.getByName(id[0].equals(null) ? "LUCK" : id[0]);
        this.level = Integer.parseInt(id[1] == null ? "1" : id[1]);
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }

    public int getLevel() {
        return level;
    }
}
