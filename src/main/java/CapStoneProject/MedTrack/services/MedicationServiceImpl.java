package CapStoneProject.MedTrack.services;

import CapStoneProject.MedTrack.data.repository.MedicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicationServiceImpl implements MedicationService {
    @Autowired
    private MedicationRepository medicationRepository;
}
