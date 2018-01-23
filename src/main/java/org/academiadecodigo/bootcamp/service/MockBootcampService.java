package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Bootcamp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MockBootcampService implements BootcampService{
    Map<Integer, Bootcamp> bootcampList = new HashMap<>();
    @Override
    public void addBootcamp(Bootcamp bootcamp) {
        bootcampList.put(bootcamp.getId(), bootcamp);
    }

    @Override
    public void removeBootcamp(Bootcamp bootcamp) {
        bootcampList.remove(bootcamp);

    }

    @Override
    public List<Bootcamp> findAll() {
        return new LinkedList<>(bootcampList.values());
    }

    @Override
    public Bootcamp findById(int id) {
       return bootcampList.get(id);
    }
}
