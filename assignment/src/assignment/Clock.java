package assignment;

public class Clock {

	private int hours;
	private int minutes;
	private int seconds;
	
    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    public Clock(int secondsSinceMidnight) {
        setClock(secondsSinceMidnight);
    }

    public void setClock(int secondsSinceMidnight) {
        this.hours = (secondsSinceMidnight / 3600) % 24;
        this.minutes = (secondsSinceMidnight / 60) % 60;
        this.seconds = secondsSinceMidnight % 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        }
    }

    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours++;
                if (hours >= 24) {
                    hours = 0;
                }
            }
        }
    }

    // Method to decrement the time by one second
    public void tickDown() {
        seconds--;
        if (seconds < 0) {
            seconds = 59;
            minutes--;
            if (minutes < 0) {
                minutes = 59;
                hours--;
                if (hours < 0) {
                    hours = 23;
                }
            }
        }
    }

    public void addClock(Clock other) {
        this.seconds += other.seconds;
        this.minutes += other.minutes + this.seconds / 60;
        this.hours += other.hours + this.minutes / 60;
        this.seconds %= 60;
        this.minutes %= 60;
        this.hours %= 24;
    }

    public Clock subtractClock(Clock other) {
        int totalSeconds = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int otherTotalSeconds = other.hours * 3600 + other.minutes * 60 + other.seconds;
        int difference = totalSeconds - otherTotalSeconds;
        if (difference < 0) {
            difference += 24 * 3600;
        }
        return new Clock(difference);
    }

    public String toString() {
        return String.format("(%02d:%02d:%02d)", hours, minutes, seconds);
    }
	
}
