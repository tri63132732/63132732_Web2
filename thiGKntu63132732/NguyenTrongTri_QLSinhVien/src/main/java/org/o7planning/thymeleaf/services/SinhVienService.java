package org.o7planning.thymeleaf.services;

import org.springframework.stereotype.Service;
import org.o7planning.thymeleaf.models.SinhVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
@Service
public interface SinhVienService {
	public Page<SinhVien> findPaginated(Pageable pageable);
     
   
}
