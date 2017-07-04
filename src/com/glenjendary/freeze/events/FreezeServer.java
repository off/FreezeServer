package com.glenjendary.freeze.events;

/* Freeze Created by Glenjendary on 4/07/2017. */

import com.glenjendary.freeze.Main;
import com.glenjendary.freeze.commands.Freeze;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.*;

public class FreezeServer implements Listener {

    private Main plugin;
    public FreezeServer(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerChat (AsyncPlayerChatEvent event) {

        if (!(event.getPlayer() instanceof  Player)) {
            return;
        }

        Player player = event.getPlayer();

        if (Freeze.isFrozen) {
            if (!(player.hasPermission("sfreeze.bypass"))){
                player.sendMessage(ChatColor.RED + "The server is currently frozen!");
                event.setCancelled(true);
            } else if (player.hasPermission("sfreeze.bypass")) {
                event.setCancelled(false);
            }
        } else if (!(Freeze.isFrozen)) {
            event.setCancelled(false);
        }

    }

    public void onPlayerMove (PlayerMoveEvent event) {

        if (!(event.getPlayer() instanceof  Player)) {
            return;
        }

        Player player = event.getPlayer();

        if (Freeze.isFrozen) {
            if (!(player.hasPermission("sfreeze.bypass"))){
                player.sendMessage(ChatColor.RED + "The server is currently frozen!");
                event.setCancelled(true);
            } else if (player.hasPermission("sfreeze.bypass")) {
                event.setCancelled(false);
            }
        } else if (!(Freeze.isFrozen)) {
            event.setCancelled(false);
        }

    }

    public void onPlayerDropItem (PlayerDropItemEvent event) {

        if (!(event.getPlayer() instanceof Player)) {
            return;
        }

        Player player = event.getPlayer();

        if (Freeze.isFrozen) {
            if (!(player.hasPermission("sfreeze.bypass"))) {
                player.sendMessage(ChatColor.RED + "The server is currently frozen!");
                event.setCancelled(true);
            } else if (player.hasPermission("sfreeze.bypass")) {
                event.setCancelled(false);
            }
        } else if (!(Freeze.isFrozen)) {
            event.setCancelled(false);
        }

    }

    public void onPlayerBlockBreak (BlockBreakEvent event) {

        if (!(event.getPlayer() instanceof  Player)) {
            return;
        }

        Player player = event.getPlayer();

        if (Freeze.isFrozen) {
            if (!(player.hasPermission("sfreeze.bypass"))){
                player.sendMessage(ChatColor.RED + "The server is currently frozen!");
                event.setCancelled(true);
            } else if (player.hasPermission("sfreeze.bypass")) {
                event.setCancelled(false);
            }
        } else if (!(Freeze.isFrozen)) {
            event.setCancelled(false);
        }

    }

    public void onPlayerInteract (PlayerInteractEvent event) {

        if (!(event.getPlayer() instanceof  Player)) {
            return;
        }

        Player player = event.getPlayer();

        if (Freeze.isFrozen) {
            if (!(player.hasPermission("sfreeze.bypass"))){
                player.sendMessage(ChatColor.RED + "The server is currently frozen!");
                event.setCancelled(true);
            } else if (player.hasPermission("sfreeze.bypass")) {
                event.setCancelled(false);
            }
        } else if (!(Freeze.isFrozen)) {
            event.setCancelled(false);
        }

    }

}
