package xyz.verityrb;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;


import java.io.File;
import java.util.logging.Logger;


public class Venderonis extends JavaPlugin {

    private Logger log = Bukkit.getLogger();

    private File cfgCheck;
    private FileConfiguration vtradeCfg;

    public FileConfiguration getMarketCfg() {
        return this.vtradeCfg;
    }

    private void getCfgs() {
        cfgCheck = new File(getDataFolder(), "market_config.yml");
        if (!cfgCheck.exists()) {
            //Market Defaults
            this.getMarketCfg().set("market.numMarkets", 4);
            this.getMarketCfg().set("market.seedHigh", 2);
            this.getMarketCfg().set("market.seedLow", 0.25);
            //Resource Defaults
            //Mining
            this.getMarketCfg().set("resource.mining.coal", 1);
            this.getMarketCfg().set("resource.mining.iron_ignot", 2);
            this.getMarketCfg().set("resource.mining.lapis_block", 3);
            this.getMarketCfg().set("resource.mining.quartz", 3);
            this.getMarketCfg().set("resource.mining.emerald", 3);
            this.getMarketCfg().set("resource.mining.redstone", 4);
            this.getMarketCfg().set("resource.mining.gold_ignot", 5);
            this.getMarketCfg().set("resource.mining.diamond", 6);
            //Stone
            this.getMarketCfg().set("resource.stone.dirt", 1);
            this.getMarketCfg().set("resource.stone.sand", 2);
            this.getMarketCfg().set("resource.stone.sandstone", 3);
            this.getMarketCfg().set("resource.stone.red_sandstone", 3);
            this.getMarketCfg().set("resource.stone.cobblestone", 2);
            this.getMarketCfg().set("resource.stone.diorite", 3);
            this.getMarketCfg().set("resource.stone.andesite", 3);
            this.getMarketCfg().set("resource.stone.granite", 4);
            this.getMarketCfg().set("resource.stone.sponge", 6);

            cfgCheck.getParentFile().mkdirs();
            saveResource("market_config.yml", false);
        }
    }

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
