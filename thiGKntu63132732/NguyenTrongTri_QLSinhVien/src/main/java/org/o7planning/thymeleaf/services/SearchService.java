package org.o7planning.thymeleaf.services;

import org.o7planning.thymeleaf.models.SinhVien;
import java.util.List;
public interface SearchService {
    List<SinhVien> searchStudents(String keyword);
}
