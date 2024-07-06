package tn.nasa_service_a.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import tn.nasa_service_a.client.NasaUi;
import tn.nasa_service_a.model.Apod;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class ApodControllerTest {
    @Mock
    private NasaUi nasaUi;

    @InjectMocks
    private SwaggerController swaggerController;

    @Test
    public void testGetApodData() {
        Apod expectedApod = new Apod();
        expectedApod.setTitle("Astronomy Picture of the Day");
        expectedApod.setHdurl("http://example.com/image.jpg");
        expectedApod.setExplanation("Explanation of the picture.");

        when(nasaUi.getApod()).thenReturn(ResponseEntity.ok(expectedApod));

        ResponseEntity<Apod> response = swaggerController.getApod();

        assertEquals("Astronomy Picture of the Day", response.getBody().getTitle());
        assertEquals("http://example.com/image.jpg", response.getBody().getHdurl());
        assertEquals("Explanation of the picture.", response.getBody().getExplanation());
    }
}
