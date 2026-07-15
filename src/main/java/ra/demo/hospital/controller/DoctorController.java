package ra.demo.hospital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.demo.hospital.model.dto.response.ApiResponse;
import ra.demo.hospital.model.entity.Doctor;
import ra.demo.hospital.model.entity.Meta;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @GetMapping
    public ApiResponse<List<Doctor>> getAllDoctors() {
        List<Doctor> doctors = new ArrayList<>();

        doctors.add(new Doctor(
                1L,
                "Nguyễn Văn A",
                "Tim mạch"
        ));
        doctors.add(new Doctor(
                2L,
                "Trần Thị B",
                "Nhi khoa"
        ));
        Meta meta = new Meta(
                doctors.size(),
                1
        );
        return new ApiResponse<>(
                "success",
                200,
                doctors,
                meta
        );
    }
}
