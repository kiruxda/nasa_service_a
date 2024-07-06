package tn.nasa_service_a.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.nasa_service_a.client.NasaUi;
import tn.nasa_service_a.model.Apod;

import java.sql.Date;

@Controller
public class ApodController {

    @Autowired
    private NasaUi nasaUi;

    @RequestMapping("/apod")
    @Tag(name="Controller for work with APoD", description="API для управления APoD")
    @Operation(summary="получает информацию APoD", description = "APoD для сегодняшнего дня")
    public String showApodData(Model model) {
        Apod apod = nasaUi.getApod().getBody();
        model.addAttribute("date", apod.getDate());
        model.addAttribute("title", apod.getTitle());
        model.addAttribute("hdurl", apod.getHdurl());
        model.addAttribute("explanation", apod.getExplanation());
        return "apod_page";
    }
    @RequestMapping("/apod/{date}")
    @Operation(summary="получает информацию APoD", description = "APoD для определенного дня")
    public String showApodDataByDate(@PathVariable Date date, Model model) {
        Apod apod = nasaUi.getApodByDate(date).getBody();
        model.addAttribute("date", apod.getDate());
        model.addAttribute("title", apod.getTitle());
        model.addAttribute("hdurl", apod.getHdurl());
        model.addAttribute("explanation", apod.getExplanation());
        return "apod_page";
    }

}