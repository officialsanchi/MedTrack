package CapStoneProject.MedTrack.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Data
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String medicationName;
    private String dosage;
    private LocalDateTime reminderTime;
    private String frequency;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isRecurring;
    private String recurrencePattern;
    private LocalDateTime lastNotifiedAt;
    private boolean isTaken;
    private LocalDateTime snoozedUntil;
    private String notes;
    private Long userId;

}
