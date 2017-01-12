package com.cyzicus.singleton;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserOfDatabase {

    private Database database = Database.getInstance();
    private Database oldWayDatabase = Database.getOldWayInstance();

    @GetMapping("/singleton")
    public String getSingleton() {
        String newDatabase = database.connect() + database.disconnect();
        String oldDatabase = oldWayDatabase.connect() + oldWayDatabase.disconnect();
        return newDatabase + oldDatabase;
    }

}
