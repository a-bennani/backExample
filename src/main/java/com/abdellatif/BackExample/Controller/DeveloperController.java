package com.abdellatif.BackExample.Controller;

import com.abdellatif.BackExample.Data.Developer;
import com.abdellatif.BackExample.Service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("developer")
@RestController
public class DeveloperController {

    private final DeveloperService developerService;

    @Autowired
    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @GetMapping
    public List<Developer> GetAll()
    {
        return developerService.GetAll();
    }
}
