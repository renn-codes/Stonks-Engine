package xyz.verityrb;

import org.bukkit.Material;

public class ResourceData {
    private int[][] matsTable = {
            {1, 2, 3, 3, 3, 4, 5, 6}, //Mining
            {1, 2, 3, 3, 2, 3, 3, 4, 6}, //Stone
    };

    public Material[][] matsTypes =
            {
                    {Material.COAL, Material.IRON_INGOT, Material.LAPIS_BLOCK, Material.QUARTZ, Material.EMERALD, Material.REDSTONE, Material.GOLD_INGOT, Material.DIAMOND},
                    {Material.DIRT, Material.SAND, Material.SANDSTONE, Material.RED_SANDSTONE, Material.COBBLESTONE, Material.STONE, Material.STONE, Material.STONE, Material.QUARTZ_BLOCK},
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
