package tn.nasa_service_a.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Schema(name="Container for APoD data", description = "Данные APoD")
public class Apod {
    @Schema(name="Date", description = "Дата, в которую было сделано фото")
    private Date date;

    @Schema(name="Title", description = "Название фото")
    private String title;

    @Schema(name="URL", description = "Ссылка на фото")
    private String hdurl;

    @Schema(name="Explanation", description = "Объяснение фото")
    private String explanation;
}
