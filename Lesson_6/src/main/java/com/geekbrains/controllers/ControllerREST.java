package com.geekbrains.controllers;

import com.geekbrains.entites.Equipment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/items")
public class ControllerREST {
    Equipment equipment = new Equipment("no data", "no data");

    @GetMapping("/")
    public Equipment get() {
        equipment.setId("22222222222222222");
        equipment.setContent("222222222222222222222");
        return equipment;
    }

    @PostMapping("/")
    public Equipment post(@RequestBody Equipment newEquipment) {
        equipment.setId(newEquipment.getId());
        equipment.setContent(newEquipment.getContent());
        return equipment;
    }
}
