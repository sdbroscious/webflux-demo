package sdb.webfluxdemo;

import java.time.LocalDate;

public class GreetingBob {

    private String greeting;
    private LocalDate today;

    public GreetingBob(String greeting) {
        this.greeting = greeting;
        this.today = LocalDate.now();
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }
}
