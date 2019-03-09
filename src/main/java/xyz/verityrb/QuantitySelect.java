package xyz.verityrb;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.logging.Logger;

public class QuantitySelect extends VTrade implements Listener {

    private Logger log = Bukkit.getLogger();
    private ResourceData data = new ResourceData();

    @EventHandler
    private void onQuantitySelect(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        ItemStack clicked = e.getCurrentItem();
        Inventory inventory = e.getClickedInventory();
        if (clicked != null) {
            if (inventory.getName().equals(invQty.getName()) || inventory.getName().equals(invQty.getName())) {
                switch (clicked.getItemMeta().getDisplayName()) {
                    case "Qty: 1":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 1;
                        break;
                    case "Qty: 2":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 2;
                        break;
                    case "Qty: 3":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 3;
                        break;
                    case "Qty: 4":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 4;
                        break;
                    case "Qty: 5":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 5;
                        break;
                    case "Qty: 6":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 6;
                        break;
                    case "Qty: 7":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 7;
                        break;
                    case "Qty: 8":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 8;
                        break;
                    case "Qty: 9":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 9;
                        break;
                    case "Qty: 10":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 10;
                        break;
                    case "Qty: 11":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 11;
                        break;
                    case "Qty: 12":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 12;
                        break;
                    case "Qty: 13":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 13;
                        break;
                    case "Qty: 14":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 14;
                        break;
                    case "Qty: 15":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 15;
                        break;
                    case "Qty: 16":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 16;
                        break;
                    case "Qty: 17":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 17;
                        break;
                    case "Qty: 18":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 18;
                        break;
                    case "Qty: 19":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 19;
                        break;
                    case "Qty: 20":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 20;
                        break;
                    case "Qty: 21":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 21;
                        break;
                    case "Qty: 22":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 22;
                        break;
                    case "Qty: 23":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 23;
                        break;
                    case "Qty: 24":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 24;
                        break;
                    case "Qty: 25":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 25;
                        break;
                    case "Qty: 26":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 26;
                        break;
                    case "Qty: 27":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 27;
                        break;
                    case "Qty: 28":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 28;
                        break;
                    case "Qty: 29":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 29;
                        break;
                    case "Qty: 30":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 30;
                        break;
                    case "Qty: 31":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 31;
                        break;
                    case "Qty: 32":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 32;
                        break;
                    case "Qty: 33":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 33;
                        break;
                    case "Qty: 34":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 34;
                        break;
                    case "Qty: 35":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 35;
                        break;
                    case "Qty: 36":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        mat_amt = 36;
                        break;
                    case "Exit":
                        e.setCancelled(true); // Make it so the selected item is back in its original spot
                        player.closeInventory(); // Closes the inventory
                        break;
                    default:
                        e.setCancelled(true);
                        player.closeInventory();
                        break;
                }

                // Setup our ItemStack for comparison with player inventory
                ItemStack item = new ItemStack(data.matsTypes[mat_xx][mat_xy], 1, mat_wy);


                if (data.matsNames[mat_xx][mat_xy] != data.matsNames[mat_xx][mat_xz]) {
                    if (data.getFromRate(mat_xx, mat_xy) <= data.getToRate(mat_xx, mat_xz)) {
                        // Trading up
                        int convAmt = mat_amt * matsMulti[mat_xx] * data.getRateByCat(mat_xx, mat_xy, mat_xz);
                        // log.info("wy " + mat_wy + " wz " + mat_wz +  " xx " + mat_xx + " xy " + mat_xy + " xz " + mat_xz + " convAmt " + convAmt);
                        if (convAmt != 0) {
                            if (player.getInventory().containsAtLeast(item, convAmt)) {
                                player.getInventory().removeItem(new ItemStack(data.matsTypes[mat_xx][mat_xy], convAmt, mat_wy));
                                player.getInventory().addItem(new ItemStack(data.matsTypes[mat_xx][mat_xz], mat_amt, mat_wz));
                                log.info("Gave " + player.getDisplayName() + " " + mat_amt + " " + data.matsNames[mat_xx][mat_xz] + ", took " + convAmt + " " + data.matsNames[mat_xx][mat_xy]);
                            } else {
                                player.sendMessage("You don't have enough resources to pay for this, " + player.getDisplayName() + ".");
                            }
                        }
                    } else if(data.getFromRate(mat_xx, mat_xy) >= data.getToRate(mat_xx, mat_xz)){
                        // Trading down
                        int convAmt = mat_amt * matsMulti[mat_xx] * data.getRateByCat(mat_xx, mat_xy, mat_xz);
                        // log.info("wy " + mat_wy + " wz " + mat_wz +  " xx " + mat_xx + " xy " + mat_xy + " xz " + mat_xz + " convAmt " + convAmt);
                        if (convAmt != 0) {
                            if (player.getInventory().containsAtLeast(item, mat_amt)) {
                                player.getInventory().removeItem(new ItemStack(data.matsTypes[mat_xx][mat_xy], mat_amt, mat_wy));
                                player.getInventory().addItem(new ItemStack(data.matsTypes[mat_xx][mat_xz], convAmt, mat_wz));
                                log.info("Gave " + player.getDisplayName() + " " + mat_amt + " " + data.matsNames[mat_xx][mat_xy] + ", took " + convAmt + " " + data.matsNames[mat_xx][mat_xz]);
                            } else {
                                player.sendMessage("You don't have enough resources to pay for this, " + player.getDisplayName() + ".");
                            }
                        }
                    } else if(data.matsTypes[mat_xx][mat_xy] == data.matsTypes[mat_xx][mat_xz]){
                        if (player.getInventory().containsAtLeast(item, mat_amt)) {
                            player.getInventory().removeItem(new ItemStack(data.matsTypes[mat_xx][mat_xy], mat_amt, mat_wy));
                            player.getInventory().addItem(new ItemStack(data.matsTypes[mat_xx][mat_xz], mat_amt, mat_wz));
                            log.info("Gave " + player.getDisplayName() + " " + mat_amt + " " + data.matsNames[mat_xx][mat_xy] + ", took " + mat_amt + " " + data.matsNames[mat_xx][mat_xz]);
                        } else {
                            player.sendMessage("You don't have enough resources to pay for this, " + player.getDisplayName() + ".");
                        }
                    }
                } else {
                    if (player.getInventory().containsAtLeast(item, mat_amt)) {
                        player.getInventory().removeItem(new ItemStack(data.matsTypes[mat_xx][mat_xy], mat_amt, mat_wy));
                        player.getInventory().addItem(new ItemStack(data.matsTypes[mat_xx][mat_xz], mat_amt, mat_wz));
                        log.info("Gave " + player.getDisplayName() + " " + mat_amt + " " + data.matsNames[mat_xx][mat_xy] + ", took " + mat_amt + " " + data.matsNames[mat_xx][mat_xz]);
                    } else {
                        player.sendMessage("You don't have enough resources to pay for this, " + player.getDisplayName() + ".");
                    }
                }
            }
        } else {
            e.setCancelled(true);
        }
    }
}

