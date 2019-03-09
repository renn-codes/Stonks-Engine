package xyz.verityrb;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventException;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.logging.Logger;

public class ResourceSelect extends VTrade implements Listener {

    Logger log = Bukkit.getLogger();

    private void clickedStone(Player player, ItemStack clicked, Inventory inventory) {
        switch (clicked.getType()) {
            case DIRT:

                if (inventory.getName().equals(invCost_Stone.getName())) {
                    mat_xy = 0;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Stone);
                } else if (inventory.getName().equals(invBuy_Stone.getName())) {
                    mat_xz = 0;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            case SAND:

                if (inventory.getName().equals(invCost_Stone.getName())) {
                    mat_xy = 1;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Stone);

                } else if (inventory.getName().equals(invBuy_Stone.getName())) {
                    mat_xz = 1;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            case SANDSTONE:

                if (inventory.getName().equals(invCost_Stone.getName())) {
                    mat_xy = 2;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Stone);

                } else if (inventory.getName().equals(invBuy_Stone.getName())) {
                    mat_xz = 2;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            case RED_SANDSTONE:

                if (inventory.getName().equals(invCost_Stone.getName())) {
                    mat_xy = 3;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Stone);

                } else if (inventory.getName().equals(invBuy_Stone.getName())) {
                    mat_xz = 3;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            case COBBLESTONE:

                if (inventory.getName().equals(invCost_Stone.getName())) {
                    mat_xy = 4;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Stone);

                } else if (inventory.getName().equals(invBuy_Stone.getName())) {
                    mat_xz = 4;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            case STONE:
                log.info("Stone");
                switch (clicked.getDurability()) {
                    case 3:
                        if (inventory.getName().equals(invCost_Stone.getName())) {
                            mat_xy = 5;
                            mat_wy = (short) 3;
                            player.openInventory(invBuy_Stone);

                        } else if (inventory.getName().equals(invBuy_Stone.getName())) {
                            mat_xz = 5;
                            mat_wz = (short) 3;
                            setPriceData(mat_xx, mat_xy, mat_xz);
                            player.openInventory(invQty);
                        }
                        break;
                    case 5:
                        if (inventory.getName().equals(invCost_Stone.getName())) {
                            mat_xy = 6;
                            mat_wy = (short) 5;
                            player.openInventory(invBuy_Stone);

                        } else if (inventory.getName().equals(invBuy_Stone.getName())) {
                            mat_xz = 6;
                            mat_wz = (short) 5;
                            setPriceData(mat_xx, mat_xy, mat_xz);
                            player.openInventory(invQty);
                        }
                        break;
                    case 1:
                        if (inventory.getName().equals(invCost_Stone.getName())) {
                            mat_xy = 7;
                            mat_wy = (short) 1;
                            player.openInventory(invBuy_Stone);

                        } else if (inventory.getName().equals(invBuy_Stone.getName())) {
                            mat_xz = 7;
                            mat_wz = (short) 1;
                            setPriceData(mat_xx, mat_xy, mat_xz);
                            player.openInventory(invQty);
                        }
                        break;
                }
                break;
            case QUARTZ_BLOCK:
                if (inventory.getName().equals(invCost_Stone.getName())) {
                    mat_xy = 8;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Stone);

                } else if (inventory.getName().equals(invBuy_Stone.getName())) {
                    mat_xz = 8;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            default:
                player.closeInventory();
                break;
        }
    }

    private void clickedMining(Player player, ItemStack clicked, Inventory inventory) {
        switch (clicked.getType()) {
            case COAL:

                if (inventory.getName().equals(invCost_Mining.getName())) {
                    mat_xy = 0;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Mining);

                } else if (inventory.getName().equals(invBuy_Mining.getName())) {
                    mat_xz = 0;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            case IRON_INGOT:
                if (inventory.getName().equals(invCost_Mining.getName())) {
                    mat_xy = 1;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Mining);

                } else if (inventory.getName().equals(invBuy_Mining.getName())) {
                    mat_xz = 1;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            case LAPIS_BLOCK:

                if (inventory.getName().equals(invCost_Mining.getName())) {
                    mat_xy = 2;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Mining);

                } else if (inventory.getName().equals(invBuy_Mining.getName())) {
                    mat_xz = 2;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            case QUARTZ:

                if (inventory.getName().equals(invCost_Mining.getName())) {
                    mat_xy = 3;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Mining);

                } else if (inventory.getName().equals(invBuy_Mining.getName())) {
                    mat_xz = 3;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            case EMERALD:

                if (inventory.getName().equals(invCost_Mining.getName())) {
                    mat_xy = 4;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Mining);

                } else if (inventory.getName().equals(invBuy_Mining.getName())) {
                    mat_xz = 4;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            case REDSTONE:

                if (inventory.getName().equals(invCost_Mining.getName())) {
                    mat_xy = 5;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Mining);

                } else if (inventory.getName().equals(invBuy_Mining.getName())) {
                    mat_xz = 5;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            case GOLD_INGOT:

                if (inventory.getName().equals(invCost_Mining.getName())) {
                    mat_xy = 6;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Mining);

                } else if (inventory.getName().equals(invBuy_Mining.getName())) {
                    mat_xz = 6;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            case DIAMOND:

                if (inventory.getName().equals(invCost_Mining.getName())) {
                    mat_xy = 7;
                    mat_wy = (short)0;
                    player.openInventory(invBuy_Mining);

                } else if (inventory.getName().equals(invBuy_Mining.getName())) {
                    mat_xz = 7;
                    mat_wz = (short)0;
                    setPriceData(mat_xx, mat_xy, mat_xz);
                    player.openInventory(invQty);
                }
                break;
            default:
                break;
        }
    }

    @EventHandler
    private void onInventorySelect(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        ItemStack clicked = e.getCurrentItem();
        Inventory inventory = e.getClickedInventory();
        if(clicked != null) {
            switch (inventory.getName()) {
                case "[Mining] Get Resource":
                    e.setCancelled(true); // Make it so the selected item is back in its original spot
                    player.closeInventory(); // Closes the inventory
                    clickedMining(player, clicked, inventory);
                    break;
                case "[Stone] Get Resource":
                    e.setCancelled(true); // Make it so the selected item is back in its original spot
                    player.closeInventory(); // Closes the inventory
                    clickedStone(player, clicked, inventory);
                    break;
                case "[Mining] Give Resource":
                    e.setCancelled(true); // Make it so the selected item is back in its original spot
                    player.closeInventory(); // Closes the inventory
                    clickedMining(player, clicked, inventory);
                    break;
                case "[Stone] Give Resource":
                    e.setCancelled(true); // Make it so the selected item is back in its original spot
                    player.closeInventory(); // Closes the inventory
                    clickedStone(player, clicked, inventory);
                    break;
                default:
                    break;
            }
        } else {
            e.setCancelled(true);
        }
    }
}
