package me.jonakls.api.abstractions;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public class Kit {

    private String name;
    private String kitId;
    private String description;
    private String permission;
    private double price;
    private boolean available;
    private List<ItemStack> content;
    private List<ItemStack> equipment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKitId() {
        return kitId;
    }

    public void setKitId(String kitId) {
        this.kitId = kitId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public List<ItemStack> getContent() {
        return content;
    }

    public void setContent(List<ItemStack> content) {
        this.content = content;
    }

    public List<ItemStack> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<ItemStack> equipment) {
        this.equipment = equipment;
    }
}
