package com.mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator(List<Team> teams){
        this.teams = new ArrayList<>(teams);
        this.weeks = new ArrayList<>();
    }

    public void generateFixtures() {
        if (teams.size() % 2 != 0) {
            teams.add(new Team("Bay"));
        }

        int numWeeks = (teams.size() - 1) * 2;
        for (int week = 1; week <= numWeeks; week++) {
            Collections.shuffle(teams);

            for (int i = 0; i < teams.size() / 2; i++) {
                String match = teams.get(i) + " vs " + teams.get(teams.size() - i - 1);
                weeks.add("Round " + week + "\n" + match);
            }
        }
    }

    public void printFixtures() {
        for (String week : weeks) {
            System.out.println(week);
        }
    }
}