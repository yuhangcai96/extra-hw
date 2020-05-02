/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class batsman {
    public class Batsman {
    private String name;
    private int age;
    private int runsScored;
    private int matchesPlayed;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }
    public int getAverage() {
        if (matchesPlayed == 0) {
            return 0;
        }
        else {
            return runsScored / matchesPlayed;
        }
    }
    public Batsman() {
    }
    public Batsman(String name, int age, int runsScored, int matchesPlayed) {
        this.name = name;
        this.age = age;
        this.runsScored = runsScored;
        this.matchesPlayed = matchesPlayed;
    }
    }
}
    


