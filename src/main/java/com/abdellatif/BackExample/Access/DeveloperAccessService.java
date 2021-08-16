package com.abdellatif.BackExample.Access;

import com.abdellatif.BackExample.Data.Developer;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository("defaultAccess")
public class DeveloperAccessService implements DeveloperAccess{
    private static List<Developer> DB = Arrays.asList(
            new Developer(UUID.randomUUID(), "Romain", "Guy"),
            new Developer(UUID.randomUUID(), "Francois", "Beaufort"),
            new Developer(UUID.randomUUID(), "Ludovic", "Champenois")
    ) ;

    @Override
    public List<Developer> GetAll() {
        return DB;
    }
}
