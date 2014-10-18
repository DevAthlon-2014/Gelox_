package de.gelox.effects;

import de.gelox.effects.effects.superthunder;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Marco_2 on 18.10.2014.
 */
public class MainC extends JavaPlugin {

    public String prefix = "§7[§6Effects§7] §3";

    private static MainC instance;

    public void onEnable() {

        new superthunder();
        instance = this;
        loadCmd();
        loadEvents();
        loadCfg();



    }

    public void onDisable() {
        instance = null;
    }

    public void loadCmd() {
        //TODO
    }

    public void loadCfg() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public void loadEvents() {
        getServer().getPluginManager().registerEvents(new superthunder(getInstance()), this);
    }

    public static MainC getInstance() {
        return instance;
    }
}
