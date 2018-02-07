package com.ramchaudhary;

import java.util.HashMap;
import java.util.Map;

public class MapPopulation {

    public static void main(String[] args) {
        {
            Map<String, String> languages = new HashMap<String, String>();

            languages.put("AL", "1000");
            languages.put("GA", "4033");
            languages.put("TX", "9092");
            languages.put("NY", "8034");

            if (languages.containsKey("TX"))

            {
                System.out.println("The population of Texas is:9092");

            } else  {

                System.out.println("The population of Texas is not displayed.");
            }

        }

    }
}