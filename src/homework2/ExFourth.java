/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;
import static java.lang.System.out;
/**
 *
 * @author makst
 */
public class ExFourth {
    public static final double VENUS   = 4.81068 * Math.pow(10, 24);
    public static final double EARTH   = 5.97600 * Math.pow(10, 24);
    public static final double MARS    = 0.63345 * Math.pow(10, 24);
    public static final double MERCURY = 0.32868 * Math.pow(10, 24);
    public static final double NEPTUNE = 101.59200 * Math.pow(10, 24);
    public static final double SATURN  = 561.80376 * Math.pow(10, 24);
    public static final double URANUS  = 86.05440 * Math.pow(10, 24);
    public static final double JUPITER = 1876.64328 * Math.pow(10, 24);
    public static final double PLUTO   = 0.01195 * Math.pow(10, 24);

    public static double getMassMeasuredRelativeToEarth(double mass){
        return mass / EARTH;
    }

    public static double[] getPlanetsMass(){
        double[] planets = new double[9];
        planets[0] = getMassMeasuredRelativeToEarth(MERCURY);
        planets[1] = getMassMeasuredRelativeToEarth(VENUS);
        planets[2] = getMassMeasuredRelativeToEarth(EARTH);
        planets[3] = getMassMeasuredRelativeToEarth(MARS);
        planets[4] = getMassMeasuredRelativeToEarth(JUPITER);
        planets[5] = getMassMeasuredRelativeToEarth(SATURN);
        planets[6] = getMassMeasuredRelativeToEarth(URANUS);
        planets[7] = getMassMeasuredRelativeToEarth(NEPTUNE);
        planets[8] = getMassMeasuredRelativeToEarth(PLUTO);
        return planets;
    }

    public static void main(String[] args) {
        double[] planetsMass = getPlanetsMass();
        for (double p: planetsMass) {
            out.println(p);
        }
    }
    
}
