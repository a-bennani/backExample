package com.abdellatif.BackExample.Access;

import com.abdellatif.BackExample.Data.Developer;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("defaultAccess")
public class DeveloperAccessService implements DeveloperAccess{
    private static List<Developer> DB = new ArrayList<>( Arrays.asList(
            new Developer(UUID.randomUUID(), "Romain", "Guy"),
            new Developer(UUID.randomUUID(), "Francois", "Beaufort"),
            new Developer(UUID.randomUUID(), "Ludovic", "Champenois")
            )
    );

    @Override
    public List<Developer> GetAll() {
        return DB;
    }

    @Override
    public Optional<Developer> GetDeveloperByID(UUID id) {
        return DB.stream().filter(developer -> developer.getId().equals(id)).findFirst();
    }

    @Override
    public int InsertDeveloper(UUID id, Developer developer) {
        DB.add(new Developer(id, developer.getfName(), developer.getlName()));
        return 1;
    }

    @Override
    public int UpdateDeveloper(UUID id, Developer developer) {
        return GetDeveloperByID(id)
                .map(d -> {
                    int iDel = DB.indexOf(d);
                    if(iDel >= 0)
                    {
                        DB.set(iDel, new Developer(d.getId(), developer.getfName(), developer.getlName()));
                        return 1;
                    }
                    return 0;
                }).orElse(0);
    }
}
