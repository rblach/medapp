package pl.medapp.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class DoctorService {
//    private final DoctorRepository doctorRepository;
//
//    public DoctorService(DoctorRepository doctorRepository) {
//        this.doctorRepository = doctorRepository;
//    }
//
//    public List<DoctorEntity> getAllDoctors() {
//        return doctorRepository.findAll();
//    }
//
//    public DoctorEntity getDoctorById(Long id) {
//        return doctorRepository.findById(id).orElse(null);
//    }
//
//    public DoctorEntity createDoctor(DoctorEntity doctor) {
//        return doctorRepository.save(doctor);
//    }
//
//    public DoctorEntity updateDoctor(Long id, DoctorEntity updatedDoctor) {
//        DoctorEntity doctor = doctorRepository.findById(id).orElse(null);
//        if (doctor != null) {
//            // Update doctor properties
//            doctor.setFirstName(updatedDoctor.getFirstName());
//            doctor.setLastName(updatedDoctor.getLastName());
//            // Update other properties
//            // ...
//
//            return doctorRepository.save(doctor);
//        }
//        return null;
//    }
//
//    public void deleteDoctor(Long id) {
//        doctorRepository.deleteById(id);
//    }
//
//    public List<VisitEntity> getDoctorVisits(Long doctorId) {
//        DoctorEntity doctor = doctorRepository.findById(doctorId).orElse(null);
//        if (doctor != null) {
//            return doctor.getVisits();
//        }
//        return Collections.emptyList();
//    }
}