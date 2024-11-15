package com.example.demo.service;

//import com.example.demo.dto.DuenioMascotaDTOModel;
import com.example.demo.model.DuenioModel;
import com.example.demo.repository.IDuenioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DuenioService implements IDuenioService{

    @Autowired
    private IDuenioRepo duenio_repo;
//    @Autowired
//    private IDuenioService duenio_serv_dao;



    @Override
    public List<DuenioModel> getDuenio() {
        List<DuenioModel> get_duenio = duenio_repo.findAll();
        return get_duenio;
    }



    @Override
    public void postDuenio(DuenioModel e) {
        duenio_repo.save(e);
    }

    @Override
    public void deleteDuenio(Long id) {
        duenio_repo.deleteById(id);
    }

    @Override
    public DuenioModel findDuenio(Long id) {
        DuenioModel find_due = duenio_repo.findById(id).orElse(null);

        return find_due;
    }

    @Override
    public void putDuenio(DuenioModel due) {
            this.postDuenio(due);
    }
}