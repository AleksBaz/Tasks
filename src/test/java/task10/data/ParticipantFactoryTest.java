package task10.data;

import org.junit.Test;
import task10.data.impl.ParticipantFactory;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class ParticipantFactoryTest {
    @Test
    public void testGetParticipant() {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Flying", 10);
        Participant participant = ParticipantFactory.getParticipant("Barsik", grades);
        assertThat(participant, instanceOf(Participant.class));
    }
}
