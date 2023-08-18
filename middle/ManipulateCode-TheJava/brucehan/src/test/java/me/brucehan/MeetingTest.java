package me.brucehan;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class MeetingTest {

    @Test
    public void isFull() {
        Meeting meeting = new Meeting();
        meeting.maxNumberOfAttendees = 100;
        meeting.numberOfEnrollment = 10;
        assertFalse(meeting.isEnrollmentFull());
    }
}