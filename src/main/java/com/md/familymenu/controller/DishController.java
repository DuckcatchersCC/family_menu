package com.md.familymenu.controller;

import com.md.familymenu.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author md
 * @version 1.0.0
 * @description TODO
 * @date 2023-04-25 7:12 PM
 */
@RestController
public class DishController {
    @Autowired
    DishService dishService;

}
