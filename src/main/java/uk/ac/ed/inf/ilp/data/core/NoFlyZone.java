package uk.ac.ed.inf.ilp.data.core;


import uk.ac.ed.inf.ilp.data.core.LngLat;

public class NoFlyZone {
    public String name;
    public double [][] coordinates;

    private LngLat[] points;

    public LngLat[] toLngLatArray(){
        if (points == null){
            points = new LngLat[coordinates.length];
            for (int i = 0; i < coordinates.length; i++){
                points[i] = new LngLat(coordinates[i][0], coordinates[i][1]);
            }
        }
        return points;
    }
}
