package CapStoneProject.MedTrack.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    private LocalDateTime reminderTime;
    private boolean isRecurring;
    private String recurrencePattern;
    private int repeatInterval;
    private boolean isActive;
    private boolean hasBeenTriggered;
    private LocalDateTime snoozedUntil;
    private String channel;
    private String priority;
    private Long userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
