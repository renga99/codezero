package com.codezero.app.service;

import com.codezero.app.beans.RailwayStation;

import java.util.List;


public interface RailwayStationService {
	
    public List<RailwayStation> getAllRailwayStations();

    public RailwayStation getRailwayStationById(Long id);

    public void addRailwayStation(RailwayStation RailwayStation);

    public void deleteRailwayStationById(Long id);

    public void deleteAll();

    public void updateRailwayStation(RailwayStation RailwayStation);
}
