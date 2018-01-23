package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Bootcamp;

import java.util.List;

public interface BootcampService {

    void addBootcamp(Bootcamp bootcamp);
    void removeBootcamp(Bootcamp bootcamp);
    List<Bootcamp> findAll();
    Bootcamp findById(int   id);
}
