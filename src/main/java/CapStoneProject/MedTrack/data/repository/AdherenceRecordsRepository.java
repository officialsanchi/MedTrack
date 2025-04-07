package CapStoneProject.MedTrack.data.repository;

import CapStoneProject.MedTrack.data.models.AdherenceRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AdherenceRecordsRepository extends JpaRepository<AdherenceRecords, UUID> {

}
