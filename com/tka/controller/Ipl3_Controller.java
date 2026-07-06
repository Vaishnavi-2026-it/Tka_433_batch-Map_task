package com.tka.controller;

import java.util.List;
import java.util.Map;

import com.tka.entity.IplPlayer;
import com.tka.service.Ipl3_Service;

public class Ipl3_Controller {

    public static void main(String[] args) {

        Ipl3_Service service = new Ipl3_Service();

        // 1. Print Complete Map
        System.out.println("========== COMPLETE IPL DATABASE ==========");
        System.out.println(service.getIPLDB());

        // 2. keySet()
        System.out.println("\n========== TEAM NAMES ==========");

        for (String team : service.getAllTeams()) {
            System.out.println(team);
        }

        // 3. values()
        System.out.println("\n========== ALL PLAYERS ==========");

        for (List<IplPlayer> list : service.getAllPlayers()) {

            for (IplPlayer player : list) {
                System.out.println(player);
            }
        }

        // 4. entrySet()
        System.out.println("\n========== ENTRY SET ==========");

        for (Map.Entry<String, List<IplPlayer>> entry : service.getEntrySet()) {

            System.out.println("Team : " + entry.getKey());

            for (IplPlayer player : entry.getValue()) {
                System.out.println(player);
            }

            System.out.println();
        }

        // 5. get()
        System.out.println("\n========== RCB PLAYERS ==========");

        List<IplPlayer> rcb = service.getPlayersByTeam("RCB");

        for (IplPlayer player : rcb) {
            System.out.println(player);
        }

        

    }

}