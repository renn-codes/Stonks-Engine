package xyz.verityrb;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.logging.Logger;

import static org.bukkit.Material.*;

public class VTrade implements CommandExecutor {

    Logger log = Bukkit.getLogger();

    public static Inventory invCat = Bukkit.createInventory(null, 9, "Category");
    public static Inventory invCost_Stone = Bukkit.createInventory(null, 18, "[Stone] Give Resource");
    public static Inventory invCost_Mining = Bukkit.createInventory(null, 18, "[Mining] Give Resource");
    public static Inventory invBuy_Stone = Bukkit.createInventory(null, 18, "[Stone] Get Resource");
    public static Inventory invBuy_Mining = Bukkit.createInventory(null, 18, "[Mining] Get Resource");
    public static Inventory invQty = Bukkit.createInventory(null, 45, "Select Amount");
    // The first parameter, is the inventory owner. I make it null to let everyone use it.
    //The second parameter, is the slots in a inventory. Must be a multiple of 9. Can be up to 54.
    //The third parameter, is the inventory name. This will accept chat colors.

    private ResourceData data = new ResourceData();
    //Declare our market data so we can use it to convert resources
    public static int mat_xx;
    public static int mat_xy;
    public static int mat_xz;
    public static int mat_amt;
    public static short mat_wy;
    public static short mat_wz;
    public static int[] matsMulti = {5, 2}; //Index for exchange multiplier
    // Declaring our variables for storing then selecting which category and materials/type IDs in our resource conversion arrays

    private static void createDisplay(Material material, Inventory inv, int Slot, String name, String lore) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        ArrayList<String> Lore = new ArrayList<String>();
        Lore.add(lore);
        meta.setLore(Lore);
        item.setItemMeta(meta);

        inv.setItem(Slot, item);

    }
    //For assigning custom itemstacks to inventories

    static {
        createDisplay(COMPASS, invCat, 0, "Mining", "Includes:\n ~ Coal\n ~ Iron Ingot\n ~ Lapis Lazuli (Block)\n ~ Nether Quartz\n ~ Emerald\n ~ Redstone\n ~ Gold Ingot\n ~ Diamond");
        createDisplay(COMPASS, invCat, 1, "Stone", "Includes:\n ~ Dirt\n ~ Sand\n ~ Sandstone\n ~ Red Sandstone\n ~ Cobblestone\n ~ Diorite\n ~ Andesite\n ~ Quartz Block\n ~ Granite");
        createDisplay(BARRIER, invCat, 8, "Exit", "~ Exit Venderonis ~");
    }

    static {
        invCost_Stone.setItem(0, new ItemStack(Material.DIRT, 1, (short) 0));
        invCost_Stone.setItem(1, new ItemStack(Material.SAND, 1, (short) 0));
        invCost_Stone.setItem(2, new ItemStack(Material.SANDSTONE, 1, (short) 0));
        invCost_Stone.setItem(3, new ItemStack(Material.RED_SANDSTONE, 1, (short) 0));
        invCost_Stone.setItem(4, new ItemStack(Material.COBBLESTONE, 1, (short) 0));
        invCost_Stone.setItem(5, new ItemStack(Material.STONE, 1, (short) 3));
        invCost_Stone.setItem(6, new ItemStack(Material.STONE, 1, (short) 5));
        invCost_Stone.setItem(7, new ItemStack(Material.STONE, 1, (short) 1));
        invCost_Stone.setItem(8, new ItemStack(Material.QUARTZ_BLOCK, 1, (short) 0));
        createDisplay(BARRIER, invCost_Stone, 17, "Exit", "~ Exit Venderonis ~");
    }

    static {
        invBuy_Stone.setItem(0, new ItemStack(Material.DIRT, 1, (short) 0));
        invBuy_Stone.setItem(1, new ItemStack(Material.SAND, 1, (short) 0));
        invBuy_Stone.setItem(2, new ItemStack(Material.SANDSTONE, 1, (short) 0));
        invBuy_Stone.setItem(3, new ItemStack(Material.RED_SANDSTONE, 1, (short) 0));
        invBuy_Stone.setItem(4, new ItemStack(Material.COBBLESTONE, 1, (short) 0));
        invBuy_Stone.setItem(5, new ItemStack(Material.STONE, 1, (short) 3));
        invBuy_Stone.setItem(6, new ItemStack(Material.STONE, 1, (short) 5));
        invBuy_Stone.setItem(7, new ItemStack(Material.STONE, 1, (short) 1));
        invBuy_Stone.setItem(8, new ItemStack(Material.QUARTZ_BLOCK, 1, (short) 0));
        createDisplay(BARRIER, invBuy_Stone, 17, "Exit", "~ Exit Venderonis ~");
    }

    static {
        invCost_Mining.setItem(0, new ItemStack(Material.COAL, 1, (short) 0));
        invCost_Mining.setItem(1, new ItemStack(Material.IRON_INGOT, 1, (short) 0));
        invCost_Mining.setItem(2, new ItemStack(Material.LAPIS_BLOCK, 1, (short) 0));
        invCost_Mining.setItem(3, new ItemStack(Material.QUARTZ, 1, (short) 0));
        invCost_Mining.setItem(4, new ItemStack(Material.EMERALD, 1, (short) 0));
        invCost_Mining.setItem(5, new ItemStack(Material.REDSTONE, 1, (short) 0));
        invCost_Mining.setItem(6, new ItemStack(Material.GOLD_INGOT, 1, (short) 0));
        invCost_Mining.setItem(7, new ItemStack(Material.DIAMOND, 1, (short) 0));
        createDisplay(BARRIER, invCost_Mining, 17, "Exit", "~ Exit Venderonis ~");
    }

    static {
        invBuy_Mining.setItem(0, new ItemStack(Material.COAL, 1));
        invBuy_Mining.setItem(1, new ItemStack(Material.IRON_INGOT, 1));
        invBuy_Mining.setItem(2, new ItemStack(Material.LAPIS_BLOCK, 1));
        invBuy_Mining.setItem(3, new ItemStack(Material.QUARTZ, 1));
        invBuy_Mining.setItem(4, new ItemStack(Material.EMERALD, 1));
        invBuy_Mining.setItem(5, new ItemStack(Material.REDSTONE, 1));
        invBuy_Mining.setItem(6, new ItemStack(Material.GOLD_INGOT, 1));
        invBuy_Mining.setItem(7, new ItemStack(Material.DIAMOND, 1));
        createDisplay(BARRIER, invBuy_Mining, 17, "Exit", "~ Exit Venderonis ~");
    }
    //Populate the inventory menus
    //The first parameter, is the slot that is assigned to.
    //Starts counting at 0

    public void setPriceData(int category, int from, int to) {
        int a = 0; //Menu index
        int b = 1; //Qty given to player / Qty given AND taken from player (for third condition)
        int c; //Qty taken from player
        if (data.getFromRate(category, from) <= data.getToRate(category, to)) {
            while (a <= 35) {
                c = b * matsMulti[mat_xx] * data.getRateByCat(category, from, to);
                createDisplay(GLASS, invQty, a, "Qty: " + b, "Gimme " + b + " " + data.matsNames[category][to] + " for " + c + " " + data.matsNames[category][from] + ", pls! :)");
                b++;
                a++;
            }
        } else if(data.getFromRate(category, from) >= data.getToRate(category, to)) {
            while (a <= 35) {
                c = b * matsMulti[mat_xx] * data.getRateByCat(category, from, to);
                createDisplay(GLASS, invQty, a, "Qty: " + b, "Gimme " + c + " " + data.matsNames[category][to] + " for " + b + " " + data.matsNames[category][from] + ", pls! :)");
                b++;
                a++;
            }
        } else if(data.getFromRate(category, from) == data.getToRate(category, to)) {
            //Menu cat 3
            while (a <= 35) {
                createDisplay(GLASS, invQty, a, "Qty: " + b, "Gimme " + b + " " + data.matsNames[category][to] + " for " + b + " " + data.matsNames[category][from] + ", pls! :)");
                b++;
                a++;
            }
        }
        createDisplay(BARRIER, invQty, 44, "Exit", "~ Exit Venderonis ~");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.openInventory(invCat);
        }
        return false;
    }
}
