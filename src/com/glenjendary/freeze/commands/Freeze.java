package com.glenjendary.freeze.commands;

/* Freeze Created by Glenjendary on 4/07/2017. */

import com.glenjendary.freeze.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Freeze implements CommandExecutor {

    private Main plugin;

    public Freeze(Main plugin) {
        this.plugin = plugin;
    }

    public static boolean isFrozen = false;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("You must be a player to use this command!");
        }

        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("sfreeze") && player.hasPermission("sfreeze.all")) {

            if (!(isFrozen)) {
                isFrozen = true;
                Bukkit.broadcastMessage(ChatColor.RED + "The server has been locked, please be patient!");
            } else if (isFrozen) {
                isFrozen = false;
                Bukkit.broadcastMessage(ChatColor.RED + "The server has been unlocked, have a good day!");
            }

        } else {
            player.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            return false;
        }
        return true;
    }


    }

