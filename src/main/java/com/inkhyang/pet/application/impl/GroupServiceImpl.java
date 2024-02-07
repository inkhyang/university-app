package com.inkhyang.pet.application.impl;

import com.inkhyang.pet.application.GroupService;
import com.inkhyang.pet.domain.classroom.Group;
import com.inkhyang.pet.domain.repository.impl.GroupRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {
    private final GroupRepositoryImpl groupRepository;

    public GroupServiceImpl(GroupRepositoryImpl groupRepository) {
        this.groupRepository = groupRepository;
    }

    public Optional<Group> getById(Group.GroupId id) {
        return groupRepository.findById(id);
    }

    public List<Group> getAll() {
        return groupRepository.findAll();
    }

    public Group create(Group group) {
        return groupRepository.save(group);
    }

    public void remove(Group.GroupId id) {
        groupRepository.remove(id);
    }
}
