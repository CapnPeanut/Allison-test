package com.captainpeanutgames.hey_allison;

import java.util.Random;

public class FactBook {

    public String getFact(){
        String[] facts = {
                "Batchley is better than Allison at everything",
                "Allison is the worst BA",
                "Allison is terrible at finding bugs",
                "Batchley is my favorite developer",
                "Learning C# isn't as fun as apps"
        };
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];

    }


}
