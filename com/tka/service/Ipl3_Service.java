package com.tka.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.tka.dao.Ipl3_Dao;
import com.tka.entity.IplPlayer;

public class Ipl3_Service {

    Ipl3_Dao dao = new Ipl3_Dao();

    // Get Complete Map
    public Map<String, List<IplPlayer>> getIPLDB() {
        return dao.getIPLDB();
    }

    // keySet()
    public Set<String> getAllTeams() {
        return dao.getIPLDB().keySet();
    }

    // values()
    public Collection<List<IplPlayer>> getAllPlayers() {
        return dao.getIPLDB().values();
    }

    // entrySet()
    public Set<Map.Entry<String, List<IplPlayer>>> getEntrySet() {
        return dao.getIPLDB().entrySet();
    }

    // get()
    public List<IplPlayer> getPlayersByTeam(String teamName) {
        return dao.getIPLDB().get(teamName);
    }

    
}