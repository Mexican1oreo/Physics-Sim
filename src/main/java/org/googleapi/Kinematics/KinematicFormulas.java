package org.googleapi.Kinematics;

import static org.googleapi.MechanicsConstants.*;

public class KinematicFormulas {
    public double finalVelocityEq = INITIAL_VELOCITY + (CURRENT_ACCELERATION * TIME);
    public double displacementEq = (INITIAL_VELOCITY * TIME) + (((double) 1 /2) * CURRENT_ACCELERATION * Math.pow(TIME, 2));
    public double velocityFinalEq = Math.sqrt(INITIAL_VELOCITY + (2 * CURRENT_ACCELERATION * (FINAL_POSITION - INITIAL_POSITION)));
    public double acceleration = (FINAL_VELOCITY - INITIAL_VELOCITY) / TIME;


}
