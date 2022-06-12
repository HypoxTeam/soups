package me.jonakls.soups;

import org.bukkit.enchantments.Enchantment;

public class EnchantmentData {

    private Enchantment enchantment;
    private int level;

    public EnchantmentData(Enchantment enchantment, int level) {
        this.enchantment = enchantment;
        this.level = level;
    }

    public static EnchantmentData from(Enchantment enchantment, int level) {
        return new EnchantmentData(enchantment, level);
    }

    public static EnchantmentData from(String... id) {
        if (id.length < 2) {
            return from(Enchantment.LUCK, 1);
        }
        return from(Enchantment.getByName(id[0]), Integer.parseInt(id[1]));
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }

    public int getLevel() {
        return level;
    }
}
