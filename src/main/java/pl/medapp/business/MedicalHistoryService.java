package pl.medapp.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class MedicalHistoryService {
//    private final MedicalHistoryRepository medicalHistoryRepository;
//
//    public MedicalHistoryService(MedicalHistoryRepository medicalHistoryRepository) {
//        this.medicalHistoryRepository = medicalHistoryRepository;
//    }
//
//    public List<MedicalHistoryEntity> getAllMedicalHistories() {
//        return medicalHistoryRepository.findAll();
//    }
//
//    public MedicalHistoryEntity getMedicalHistoryById(Long id) {
//        return medicalHistoryRepository.findById(id).orElse(null);
//    }
//
//    public MedicalHistoryEntity createMedicalHistory(MedicalHistoryEntity medicalHistory) {
//        return medicalHistoryRepository.save(medicalHistory);
//    }
//
//    public MedicalHistoryEntity updateMedicalHistory(Long id, MedicalHistoryEntity updatedMedicalHistory) {
//        MedicalHistoryEntity medicalHistory = medicalHistoryRepository.findById(id).orElse(null);
//        if (medicalHistory != null) {
//            // Update medical history properties
//            // ...
//            return medicalHistoryRepository.save(medicalHistory);
//        }
//        return null;
//    }
//
//    public void deleteMedicalHistory(Long id) {
//        medicalHistoryRepository.deleteById(id);
//    }
//
//    public List<MedicalHistoryEntity> getPatientMedicalHistory(Long patientId) {
//        return medicalHistoryRepository.findByPatientId(patientId);
//    }
}