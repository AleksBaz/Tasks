package task10.util;

import org.junit.Before;
import org.junit.Test;
import task10.data.Participant;

import java.util.Set;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class ParticipantInitializerTest {
    private ParticipantInitializer participantInitializer;

    @Before
    public void setUp(){
        participantInitializer = new ParticipantInitializer();
    }

    @Test
    public void testInit() {
        Participant participant = participantInitializer.init("Barsik");
        assertThat(participant, instanceOf(Participant.class));
    }

    @Test
    public void testBatchInit() {
        Set<Participant> participants = participantInitializer.batchInit(5);
        assertTrue(participants.size() == 5);
    }
}
