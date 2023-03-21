package uk.ac.ed.inf.ilp.data.core;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * defines a place with a name and a geographic position
 */
public class Location {
    public String name;
    public LngLat coordinates;

    @JsonCreator
    public Location(@JsonProperty("name") String name, @JsonProperty("longitude") double longitude, @JsonProperty("latitude") double latitude) {
        this.name = name;
        this.coordinates = new LngLat(longitude, latitude);
    }

    public Location(String name, LngLat coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }
}