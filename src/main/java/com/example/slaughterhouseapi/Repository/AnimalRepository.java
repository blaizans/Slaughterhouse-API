package com.example.slaughterhouseapi.Repository;
import com.example.slaughterhouseapi.Models.AnimalO;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AnimalRepository {
    private static final Map<Long, AnimalO> orderMap = new HashMap<>();
    static {
        initDataSource();
    }

    private static void initDataSource(){

    }
}
