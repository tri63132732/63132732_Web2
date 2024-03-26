package org.o7planning.thymeleaf.services;

import org.springframework.stereotype.Service;

import org.o7planning.thymeleaf.models.SinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
@Service
public class SinhVienServiceImpl implements SinhVienService {

	static List<SinhVien> dsSinhVien=  new ArrayList<SinhVien>();
	static {
					dsSinhVien.add(new SinhVien("0001", "Ngô THanh Đạt","85"));
					dsSinhVien.add(new SinhVien("0002", "Nguyễn Trọng Trí","81"));
					dsSinhVien.add(new SinhVien("0003", "Dương Nhaasrt Duy","75"));
	}

	@Override
	public Page<SinhVien> findPaginated(Pageable pageable) {
		int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<SinhVien> list;

        if (dsSinhVien.size() < startItem) {
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, dsSinhVien.size());
            list = dsSinhVien.subList(startItem, toIndex);
        }
        Page<SinhVien> sinhvienPage = new PageImpl<SinhVien>(list, PageRequest.of(currentPage, pageSize), dsSinhVien.size());
        return sinhvienPage;
	}

}
