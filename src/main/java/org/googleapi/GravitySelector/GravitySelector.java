package org.googleapi.GravitySelector;

import static org.googleapi.MechanicsConstants.*;

public class GravitySelector {

    public double getGravityConstant(Gravity gravity) {
        switch(gravity) {
            case MERCURY:
                GRAVITY = 3.7;
                break;

            case VENUS, URANUS:
                GRAVITY = 8.87;
                break;

            case EARTH:
                GRAVITY = 9.81;
                break;

            case MARS:
                GRAVITY = 3.73;
                break;

            case JUPITER:
                GRAVITY = 24.79;
                break;

            case SATURN:
                GRAVITY = 10.44;
                break;

            case NEPTUNE:
                GRAVITY = 11.15;
                break;

                default:
                    gravity = Gravity.EARTH;
        }
        return GRAVITY;
    }

    public double getGravityConstant(double customGravity) {
       GRAVITY = customGravity;
       return GRAVITY;
    }
}
