package org2.NuyenTrongTri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org2.NuyenTrongTri.model.NXB;
import org2.NuyenTrongTri.repository.NXBRepository;



@Service
public class NXBService {
    @Autowired
    private NXBRepository nxbRepository;

    public Iterable<NXB> getAllNXBs() {
        return nxbRepository.findAll();
    }

    public NXB findById(Long id) {
        return nxbRepository.findById(id).orElse(null);
    }
    
    public NXB getNXBById(Long id) {
        return nxbRepository.findById(id).orElse(null);
    }

    public void saveNXB(NXB nxb) {
        nxbRepository.save(nxb);
    }

    public void deleteNXB(Long id) {
        nxbRepository.deleteById(id);
    }
}
