package xyz.verityrb;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;

public class ResourceData extends Venderonis{
    private int[][] matsTable = {
            {this.getMarketCfg().getInt("resource.mining.coal"), this.getMarketCfg().getInt("resource.mining.iron_ignot"), this.getMarketCfg().getInt("resource.mining.lapis_lazuli"), this.getMarketCfg().getInt("resource.mining.quartz"), this.getMarketCfg().getInt("resource.mining.emerald"), this.getMarketCfg().getInt("resource.mining.redstone"), this.getMarketCfg().getInt("resource.mining.gold_ignot"), this.getMarketCfg().getInt("resource.mining.diamond")}, //Mining
            {this.getMarketCfg().getInt("resource.stone.dirt"), this.getMarketCfg().getInt("resource.stone.sand"), this.getMarketCfg().getInt("resource.stone.sandstone"), this.getMarketCfg().getInt("resource.stone.red_sandstone"), this.getMarketCfg().getInt("resource.stone.cobblestone"), this.getMarketCfg().getInt("resource.stone.diorite"), this.getMarketCfg().getInt("resource.stone.andesite"), this.getMarketCfg().getInt("resource.stone.granite"), this.getMarketCfg().getInt("resource.stone.sponge")}, //Stone
    };

    public Material[][] matsTypes =
            {
                    {Material.COAL, Material.IRON_INGOT, Material.LAPIS_BLOCK, Material.QUARTZ, Material.EMERALD, Material.REDSTONE, Material.GOLD_INGOT, Material.DIAMOND},
                    {Material.DIRT, Material.SAND, Material.SANDSTONE, Material.RED_SANDSTONE, Material.COBBLESTONE, Material.STONE, Material.STONE, Material.STONE, Material.SPONGE},
            };

    public String[][] matsNames =
            {
                    {"Coal", "Iron Ingot", "Lapis Lazuli Block", "Nether Quartz", "Emerald", "Redstone", "Gold Ingot", "Diamond"},
                    {"Dirt", "Sand", "Sandstone", "Red Sandstone", "Cobblestone", "Diorite", "Andesite", "Granite", "Quartz Block"},
            };

    //

    public int getFromRate(int category, int from) {
        int fromRate = matsTable[category][from];
        return fromRate;
    }

    public int getToRate(int category, int to) {
        int toRate = matsTable[category][to];
        return toRate;
    }

    public int getRateByCat(int category, int from, int to) {
        int fromRate = matsTable[category][from];
        int toRate = matsTable[category][to];
        int marketRate = fromRate - toRate;
        marketRate = Math.abs(marketRate);
        return marketRate;
    }
}
