package org.univ_paris8.iut.montreuil.saemanagerback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.univ_paris8.iut.montreuil.saemanagerback.mapper.GroupeMapper;
import org.univ_paris8.iut.montreuil.saemanagerback.repository.GroupeRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupeService {

    private final GroupeRepository groupeRepository;
    private final GroupeMapper groupeMapper;

    @Autowired
    public GroupeService(GroupeRepository groupeRepository) {
        this.groupeRepository = groupeRepository;
        this.groupeMapper = new GroupeMapper();
    }

}
