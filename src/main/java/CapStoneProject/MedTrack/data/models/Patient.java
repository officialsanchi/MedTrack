package CapStoneProject.MedTrack.data.models;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Data;

@Data
public class Patient {

    private String id;
    private String name;
    private String surname;
    private String gender;
    private int age;
    private String phoneNumber;
    private String email;
    private String address;
    private String password;

}
