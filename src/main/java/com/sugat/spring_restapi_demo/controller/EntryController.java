package com.sugat.spring_restapi_demo.controller;

import com.sugat.spring_restapi_demo.entity.AppEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/entry")
public class EntryController {

    private Map<Long, AppEntry> entries = new HashMap<>();
    @GetMapping
    public ArrayList<AppEntry> getEntries(){
        return new ArrayList<>(entries.values());
    }

    @PostMapping
    public boolean createEntries(@RequestBody AppEntry entry){
        entries.put(entry.getId(),entry);
        return true;
    }

}
