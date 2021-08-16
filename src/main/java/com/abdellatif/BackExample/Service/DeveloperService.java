package com.abdellatif.BackExample.Service;

import com.abdellatif.BackExample.Access.DeveloperAccess;
import com.abdellatif.BackExample.Data.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperService {

    private final DeveloperAccess developerAccess;

    @Autowired
    public DeveloperService(@Qualifier("defaultAccess") DeveloperAccess developerAccess) {
        this.developerAccess = developerAccess;
    }

    public List<Developer> GetAll(){
        return this.developerAccess.GetAll();
    }

}