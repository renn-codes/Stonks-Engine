package xyz.verityrb;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.logging.Logger;

public class CategorySelect extends VTrade implements Listener {

    Logger log = Bukkit.getLogger();

    @EventHandler
    private void onCategorySelect(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        ItemStack clicked = e.getCurrentItem();
        Inventory inventory = e.getClickedInventory();
        if (clicked != null) {
            if (inventory.getName().equals(invCat.getName())) {
                switch (clicked.getItemMeta().getDisplayName()) {
                    case "Mining":
                        e.setCancelled(true);
                        player.closeInventory();
                        mat_xx = 0;
                        player.openInventory(invCost_Mining);
                        break;
                    case "Stone":
                        e.setCancelled(true);
                        player.closeInventory();
                        mat_xx = 1;
                        player.openInventory(invCost_Stone);
                        break;
                    case "Exit":
                        e.setCancelled(true);
                        player.closeInventory();
                        break;
                    default:
                        e.setCancelled(true);
                        player.closeInventory();
                        break;
                }
            }
        } else {
            e.setCancelled(true);
        }
    }
}
