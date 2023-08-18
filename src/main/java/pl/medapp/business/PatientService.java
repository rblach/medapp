package pl.medapp.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PatientService {
//    private final PatientRepository patientRepository;
//
//    public PatientService(PatientRepository patientRepository) {
//        this.patientRepository = patientRepository;
//    }
//
//    @Transactional
//    public List<PatientEntity> getAllPatients() {
//        return patientRepository.findAll();
//    }
//
//    @Transactional
//    public PatientEntity getPatientById(Long id) {
//        return patientRepository.findById(id).orElse(null);
//    }
//
//    @Transactional
//    public PatientEntity createPatient(PatientEntity patient) {
//        return patientRepository.save(patient);
//    }
//
//    @Transactional
//    public PatientEntity updatePatient(Long id, PatientEntity updatedPatient) {
//        PatientEntity patient = patientRepository.findById(id).orElse(null);
//        if (patient != null) {
//            // Update patient properties
//            patient.setFirstName(updatedPatient.getFirstName());
//            patient.setLastName(updatedPatient.getLastName());
//            // Update other properties
//            // ...
//
//            return patientRepository.save(patient);
//        }
//        return null;
//    }
//
//    @Transactional
//    public void deletePatient(Long id) {
//        patientRepository.deleteById(id);
//    }
//
//    @Transactional
//    public List<VisitEntity> getPatientVisits(Long patientId) {
//        PatientEntity patient = patientRepository.findById(patientId).orElse(null);
//        if (patient != null) {
//            return patient.getVisits();
//        }
//        return Collections.emptyList();
//    }
//
//    @Transactional
//    public List<MedicalHistoryEntity> getPatientMedicalHistory(Long patientId) {
//        PatientEntity patient = patientRepository.findById(patientId).orElse(null);
//        if (patient != null) {
//            return patient.getMedicalHistory();
//        }
//        return Collections.emptyList();
//    }
}