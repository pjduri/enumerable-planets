package org.launchcode.enumerableplanets.controllers;

import org.launchcode.enumerableplanets.data.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PlanetController {

    @GetMapping
    public String displayIndex(@ModelAttribute Model model) {
        model.addAttribute("planets", Planets.values());
        return "index";
    }
}
