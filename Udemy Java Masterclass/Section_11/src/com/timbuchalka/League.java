package com.timbuchalka;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (leage.contains(team)) {
            return false;
        }
        leage.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(leage);
        for (T t: leage) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}