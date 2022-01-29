package me.jonakls.api;

import me.jonakls.api.kits.Kit;

import java.util.List;
import java.util.UUID;

public class SoupUser {

    private final String name;
    private final UUID id;
    private GameStatus gameStatus;
    private List<Kit> kits;
    private int kills;
    private int deaths;
    private double kdr;
    private double coins;
    private double xp;

    public SoupUser(String name, UUID id, GameStatus gameStatus, List<Kit> kits,
                    int kills, int deaths, double kdr, double coins, double xp
    ) {
        this.name = name;
        this.id = id;
        this.gameStatus = gameStatus;
        this.kits = kits;
        this.kills = kills;
        this.deaths = deaths;
        this.kdr = kdr;
        this.coins = coins;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public List<Kit> getKits() {
        return kits;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public double getKdr() {
        return kdr;
    }

    public double getCoins() {
        return coins;
    }

    public double getXp() {
        return xp;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void setKits(List<Kit> kits) {
        this.kits = kits;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public void setKdr(double kdr) {
        this.kdr = kdr;
    }

    public void setCoins(double coins) {
        this.coins = coins;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }
}
