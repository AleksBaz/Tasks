package task10.data.impl;

import task10.data.Participant;

import java.util.Map;

/**
 * Provides a way to get instance of Participant.
 */
public class ParticipantFactory {
    public static Participant getParticipant(String name, Map<String, Integer> grades) {
        return new SportParticipant(name, grades);
    }
}
