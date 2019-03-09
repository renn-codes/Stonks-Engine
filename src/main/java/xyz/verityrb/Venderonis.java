package xyz.verityrb;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


import java.util.logging.Logger;


public class Venderonis extends JavaPlugin {

    private Logger log = Bukkit.getLogger();

    @Override
    public void onEnable() {
        getLogger().info("Venderonis ver. 'beta-1.2' has loaded successfully!");
        this.getCommand("vtrade").setExecutor(new VTrade());
        this.getServer().getPluginManager().registerEvents(new QuantitySelect(), this);
        this.getServer().getPluginManager().registerEvents(new ResourceSelect(), this);
        this.getServer().getPluginManager().registerEvents(new CategorySelect(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("*farts in hexidecimal*");
    }
}
