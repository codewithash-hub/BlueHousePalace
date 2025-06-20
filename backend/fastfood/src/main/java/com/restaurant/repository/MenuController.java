package com.restaurant.repository;

import com.restaurant.model.MenuItem;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/menu")
@CrossOrigin(origins = "*")
public class MenuController {

    private final MenuItemRepository repository;

    public MenuController(MenuItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<MenuItem> getMenuItems() {
        return repository.findAll();
    }

    @PostMapping
    public MenuItem addMenuItem(@RequestBody MenuItem item) {
        return repository.save(item);
    }
}

// @RestController
// public class HelloController {
//     @GetMapping("/")
//     public String home() {
//         return "FastFood API is running!";
//     }
// }

