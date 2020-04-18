package guru.springframework.dsmbrewery.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

        private UUID id;
        private String beerName;
        private String beerStyle;
        private Long upc;

        private Timestamp createBeer;
        private Timestamp lastUpdatedBeer;
}
