package pl.medapp.business;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.medapp.api.dto.UserRegistrationDto;
import pl.medapp.business.dao.DoctorDAO;
import pl.medapp.business.dao.PatientDAO;
import pl.medapp.business.dao.UserDAO;
import pl.medapp.commons.enums.AccountType;
import pl.medapp.domain.Doctor;
import pl.medapp.domain.Patient;
import pl.medapp.domain.User;

@Service
@AllArgsConstructor
public class RegistrationService {
    private final UserDAO userDAO;
    private final PatientDAO patientDAO;
    private final DoctorDAO doctorDAO;
    private final BCryptPasswordEncoder passwordEncoder;

    public void registerUser(UserRegistrationDto userRegistrationDto) {
        var encodedPassword = passwordEncoder.encode(userRegistrationDto.getPassword());
        User user = User.builder()
            .email(userRegistrationDto.getEmail())
            .password(encodedPassword)
            .build();
        if (userRegistrationDto.getAccountType() == AccountType.PATIENT) {
            Patient patient = Patient.builder()
                .firstName(userRegistrationDto.getFirstName())
                .lastName(userRegistrationDto.getLastName())
                .pesel(userRegistrationDto.getPesel())
                .gender(userRegistrationDto.getGender())
                .dateOfBirth(userRegistrationDto.getDateOfBirth())
                .user(user)
                .build();

            patientDAO.save(patient);
        } else if (userRegistrationDto.getAccountType() == AccountType.DOCTOR) {
            Doctor doctor = Doctor.builder()
                .firstName(userRegistrationDto.getFirstName())
                .lastName(userRegistrationDto.getLastName())
                .specialization(userRegistrationDto.getSpecialization())
                .user(user)
                .build();
            user = User.builder()
                .email(userRegistrationDto.getEmail())
                .password(encodedPassword)
                .doctor(doctor)
                .build();
            doctorDAO.save(doctor);
        }
//        userDAO.save(user);
    }
}