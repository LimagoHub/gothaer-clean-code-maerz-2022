package de.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;


public class Kreditantrag implements Serializable {


    public enum StatusWechsel{NO_CHANGE, STORNO, ACCEPTED, DENIED}
    private String creditApplicationId = UUID.randomUUID().toString();

    private String firstName;

    private String lastName;

    private String city;
    private LocalDateTime applicationDate = LocalDateTime.now();

    private double monthlyIncome;
    private double monthlyExpenditure;
    private double creditSum;



    private KreditantragStatus kreditantragState = KreditantragStatus.IN_PROGRESS;

    public StatusWechsel behandlePositivesScoring() {
        return null;
    }
    public StatusWechsel behandleNegativesScoring() {
        return null;
    }

    public StatusWechsel behandlePositivesCityScoring() {
        return null;
    }
    public StatusWechsel behandleNegativesCityScoring() {
        return null;
    }

    public String getCreditApplicationId() {
        return creditApplicationId;
    }
}
