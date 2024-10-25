package org.googleapi;

import org.googleapi.GravitySelector.Gravity;
import org.googleapi.GravitySelector.GravitySelector;

public class Main {
    public static void main(String[] args) {
        GravitySelector selector = new GravitySelector();

        double gravityConstan = selector.getGravityConstant(10000);
        System.out.println("GravityConstan: " + gravityConstan);
    }
}