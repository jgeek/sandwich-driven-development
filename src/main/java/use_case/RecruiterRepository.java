package use_case;

import model.Recruiter;

import java.time.LocalDate;
import java.util.List;

public interface RecruiterRepository {
    List<Recruiter> getAllRecruiters();
}
