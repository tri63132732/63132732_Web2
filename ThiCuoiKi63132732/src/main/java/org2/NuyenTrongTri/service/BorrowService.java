package org2.NuyenTrongTri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org2.NuyenTrongTri.model.Borrow;
import org2.NuyenTrongTri.repository.BorrowRepository;

@Service
public class BorrowService {
    @Autowired
    private BorrowRepository borrowRepository;

    public Iterable<Borrow> getAllBorrows() {
        return borrowRepository.findAll();
    }
    public Borrow findById(Long id) {
        return borrowRepository.findById(id).orElse(null);
    }
    public Borrow getBorrowById(Long id) {
        return borrowRepository.findById(id).orElse(null);
    }

    public void saveBorrow(Borrow borrow) {
        borrowRepository.save(borrow);
    }

    public void deleteBorrow(Long id) {
        borrowRepository.deleteById(id);
    }
}
