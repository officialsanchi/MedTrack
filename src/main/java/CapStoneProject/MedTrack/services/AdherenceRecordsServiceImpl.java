package CapStoneProject.MedTrack.services;

import CapStoneProject.MedTrack.data.repository.AdherenceRecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdherenceRecordsServiceImpl implements AdherenceRecordsService {
    @Autowired
    private AdherenceRecordsRepository adherenceRecordsRepository;
}
