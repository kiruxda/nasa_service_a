package tn.nasa_service_a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.nasa_service_a.client.NasaUi;
import tn.nasa_service_a.model.Apod;

import java.sql.Date;

@RestController
@RequestMapping("/api/ui")
public class SwaggerController {

    @Autowired
    private NasaUi nasaUi;

    @GetMapping("/apod")
    public ResponseEntity<Apod> getApod() {
        return nasaUi.getApod();
    }
    @GetMapping("/apod/{date}")
    public ResponseEntity<Apod> getApodByDate(@PathVariable Date date) {
        return nasaUi.getApodByDate(date);
    }

}
