package task10.util;

import task10.data.Participant;
import task10.data.Sports;
import task10.data.impl.ParticipantFactory;

import java.util.*;

/**
 * Helper class to initialize Participants with random grades.
 */
public class ParticipantInitializer {
    /**
     * Initializes one participant with random grades.
     *
     * @param name - name of Participant.
     * @return - returns Participant with random grades.
     */
    public Participant init(String name) {
        Map<String, Integer> grades = new HashMap<>();
        for (Sports sports : Sports.values()) {
            grades.put(sports.toString(), (int) (Math.random() * 10) + 1);
        }
        return ParticipantFactory.getParticipant(name, grades);
    }

    /**
     * Provides a way to initialize several participants with random grades at once.
     *
     * @param number - number of participants.
     * @return - Set of Participants with random grades.
     */
    public Set<Participant> batchInit(int number) {
        Set<Participant> participants = new HashSet<>();
        for (int i = 0; i < number; i++) {
            participants.add(init("Participant" + i));
        }
        return participants;
    }
}