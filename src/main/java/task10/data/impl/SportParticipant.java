package task10.data.impl;

import task10.data.Participant;

import java.util.Map;

/**
 * Represents participant with grades in different sports.
 */
public class SportParticipant implements Participant {
    private String name;
    private Map<String, Integer> grades;

    SportParticipant(String name, Map<String, Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getGrade(String sportName) {
        return grades.get(sportName);
    }

    @Override
    public String toString() {
        return name;
    }
}
