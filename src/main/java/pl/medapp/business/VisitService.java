package pl.medapp.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class VisitService {
//    private final VisitRepository visitRepository;
//
//    public VisitService(VisitRepository visitRepository) {
//        this.visitRepository = visitRepository;
//    }
//
//    public List<VisitEntity> getAllVisits() {
//        return visitRepository.findAll();
//    }
//
//    public VisitEntity getVisitById(Long id) {
//        return visitRepository.findById(id).orElse(null);
//    }
//
//    public VisitEntity createVisit(VisitEntity visit) {
//        return visitRepository.save(visit);
//    }
//
//    public VisitEntity updateVisit(Long id, VisitEntity updatedVisit) {
//        VisitEntity visit = visitRepository.findById(id).orElse(null);
//        if (visit != null) {
//            // Update visit properties
//            // ...
//            return visitRepository.save(visit);
//        }
//        return null;
//    }
//
//    public void deleteVisit(Long id) {
//        visitRepository.deleteById(id);
//    }
//
//    public List<VisitEntity> getDoctorVisits(Long doctorId) {
//        return visitRepository.findByDoctorId(doctorId);
//    }
//
//    public List<VisitEntity> getPatientVisits(Long patientId) {
//        return visitRepository.findByPatientId(patientId);
//    }
}