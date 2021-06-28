package com.cakefactory.controller;

import com.cakefactory.catalog.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class CatalogController {

    private final CatalogService service;

    CatalogController(CatalogService service) {
        this.service = service;
    }

    @GetMapping("/")
    ModelAndView index() {
        return new ModelAndView("catalog", Map.of("items", this.service.getItems()));
    }
}
