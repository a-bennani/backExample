package com.abdellatif.BackExample.Access;

import com.abdellatif.BackExample.Data.Developer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface DeveloperAccess {

    List<Developer> GetAll();

    Optional<Developer> GetDeveloperByID(UUID id);

}
