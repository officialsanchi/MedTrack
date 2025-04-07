package CapStoneProject.MedTrack.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
@Entity
@Data
public class AdherenceRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String medicationName;
    private String notificationId;
    private LocalDateTime scheduleDate;
    private LocalDateTime takenTime;
    private String notes;
    private  Long doctorId;
    private  AdherenceRecordsEnum status;
}
