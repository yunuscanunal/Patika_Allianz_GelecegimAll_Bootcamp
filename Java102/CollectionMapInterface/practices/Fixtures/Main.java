package com.mypackage;

import java.util.ArrayList;
import java.util.List;
import com.mypackage.FixtureGenerator;

public class Main {
    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Galatasaray"));
        teams.add(new Team("Bursaspor"));
        teams.add(new Team("Fenerbahçe"));
        teams.add(new Team("Beşiktaş"));
        teams.add(new Team("Başakşehir"));
        teams.add(new Team("Trabzonspor"));
        teams.add(new Team("Boluspor")); // Only for odd team count scenario

        FixtureGenerator generator = new FixtureGenerator(teams);

        generator.generateFixtures();
        generator.printFixtures();
    }
}
