package me.jonakls.api.kits;

import org.bukkit.inventory.ItemStack;

public class KitBuilder {

    private String name;
    private String description;
    private String permission;
    private double price;
    private boolean available;
    private ItemStack[] content;

    public KitBuilder(String name, String description, String permission, double price, boolean avilable, ItemStack[] content) {
        this.name = name;
        this.description = description;
        this.permission = permission;
        this.price = price;
        this.available = avilable;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPermission() {
        return permission;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public ItemStack[] getContent() {
        return content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setContent(ItemStack[] content) {
        this.content = content;
    }
}
