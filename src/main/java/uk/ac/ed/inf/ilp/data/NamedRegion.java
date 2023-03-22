package uk.ac.ed.inf.ilp.data;

/**
 * defines a closed polygon with @vertices as the corner points. See <a href="https://en.wikipedia.org/wiki/Simple_polygon">simple polygon</a>.
 * Usually it is used for defining no-fly zones. The vertices are given in counter-clockwise direction
 * @param name is the name of the region
 * @param vertices is the array of all vertices
 */
public record NamedRegion(String name, LngLat [] vertices) {

}
