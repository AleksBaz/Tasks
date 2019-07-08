package task10;

import task10.data.Participant;
import task10.data.Sports;
import task10.util.ParticipantInitializer;

import java.util.Set;

/**
 * Известны баллы, набранные каждым из 20 спортсменов-пятиборцев в кажлом из пяти видов спорта.
 * Определить фамилию спортсмена-победителя соревнований.
 */
public class ParticipantRunner {
    private Set<Participant> participants;

    /**
     * Method that determines best participant in each sport.
     */
    public void runParticipants() {
        ParticipantInitializer participantInitializer = new ParticipantInitializer();
        participants = participantInitializer.batchInit(20);

        for (Sports sports : Sports.values()) {
            int maxValue = 0;
            Participant bestParticipant = null;

            for (Participant participant : participants) {
                int grade = participant.getGrade(sports.toString());
                if (grade > maxValue) {
                    maxValue = grade;
                    bestParticipant = participant;
                }
            }

            System.out.println("In " + sports + " best participant is " + bestParticipant);
        }
    }

    public static void main(String[] args) {
        ParticipantRunner participantRunner = new ParticipantRunner();
        participantRunner.runParticipants();
        participantRunner.displayParticipants();
    }

    /**
     * Displays all Participants grades.
     */
    public void displayParticipants() {
        for (Participant participant : participants) {
            System.out.println(participant);
            for (Sports sport : Sports.values()) {
                System.out.println(participant.getGrade(sport.toString()));
            }
            System.out.println("------");
        }
    }
}