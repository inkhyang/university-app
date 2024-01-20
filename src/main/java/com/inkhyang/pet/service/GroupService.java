package com.inkhyang.pet.service;

import com.inkhyang.pet.domain.classroom.Group;
import com.inkhyang.pet.repository.GroupRepository;

import java.util.List;
import java.util.UUID;

public class GroupService {
    private final GroupRepository groupRepository = new GroupRepository();

    public Group getById(UUID id) {
        return groupRepository.findById(id);
    }
    public List<Group> getAll(){
        return groupRepository.findAll();
    }
    public Group add(Group group) {
        return groupRepository.save(group);
    }

    public void remove(Group group){
        groupRepository.remove(group);
    }
}
