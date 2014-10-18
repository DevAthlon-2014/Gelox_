package de.gelox.effects;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Marco_2 on 18.10.2014.
 */
public class MainC extends JavaPlugin {

    @Getter
    @Setter

    public String prefix = "§7[§6Effects§7] §3";

    public void onEnable() {
        loadCmd();
        loadEvents();
        loadCfg();
    }

    public void loadCmd() {
        //TODO
    }

    public void loadCfg() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}
