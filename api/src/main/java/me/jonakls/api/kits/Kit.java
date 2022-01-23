package me.jonakls.api.kits;

import org.bukkit.inventory.ItemStack;

public class Kit {

    private String name;
    private String description;
    private String permission;
    private double price;
    private boolean status;
    private ItemStack[] content;

    public Kit(String name, String description, String permission, double price, boolean status, ItemStack[] content) {
        this.name = name;
        this.description = description;
        this.permission = permission;
        this.price = price;
        this.status = status;
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

    public boolean isStatus() {
        return status;
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

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setContent(ItemStack[] content) {
        this.content = content;
    }
}
