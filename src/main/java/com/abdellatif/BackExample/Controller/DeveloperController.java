package com.abdellatif.BackExample.Controller;

import com.abdellatif.BackExample.Data.Developer;
import com.abdellatif.BackExample.Service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("developers")
@RestController
public class DeveloperController {

    private final DeveloperService developerService;

    @Autowired
    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @PostMapping
    public void  AddDeveloper(@RequestBody Developer developer)
    {
        developerService.AddDeveloper(developer);
    }

    @GetMapping
    public List<Developer> GetAll()
    {
        return developerService.GetAll();
    }

    @GetMapping(path = "{id}")
    public Developer GetDeveloperByID(@PathVariable("id") UUID id)
    {
        return developerService.GetDeveloperByID(id).orElse(null);
    }

    @PutMapping(path = "{id}")
    public void UpdateDeveloper(@PathVariable("id") UUID id, @RequestBody Developer developer) {
        developerService.UpdateDeveloper(id, developer);
    }

}
