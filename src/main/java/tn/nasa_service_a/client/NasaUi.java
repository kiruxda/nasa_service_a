package tn.nasa_service_a.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.nasa_service_a.model.Apod;

import java.sql.Date;

@FeignClient(name = "nasaUi", url = "http://localhost:8081")
public interface NasaUi {

    @GetMapping("/api/apod")
    ResponseEntity<Apod> getApod();
    @GetMapping("/api/apod/{date}")
    ResponseEntity<Apod> getApodByDate(@PathVariable("date") Date date);
}
