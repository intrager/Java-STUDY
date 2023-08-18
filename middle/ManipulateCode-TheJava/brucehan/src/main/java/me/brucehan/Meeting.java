package me.brucehan;

public class Meeting {

    int maxNumberOfAttendees;

    int numberOfEnrollment;

    public boolean isEnrollmentFull() {
        if(maxNumberOfAttendees == 0) {
            return false;
        }

        if(numberOfEnrollment < maxNumberOfAttendees) {
            return false;
        }
        return true;
    }
}
