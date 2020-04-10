package guru.springframework.dsmbrewery.web.controller;

import guru.springframework.dsmbrewery.services.CostumerService;
import guru.springframework.dsmbrewery.web.model.CostumerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.UUID;


@RequestMapping("/api/v1/costumer")
@RestController
public class CostumerController {


    private final CostumerService costumerService;

    public CostumerController(CostumerService costumerService) {
        this.costumerService = costumerService;
    }

    @GetMapping({"/{costumerId}"})
    public ResponseEntity<CostumerDto> getCostumer(@PathVariable("costumerId") UUID costumerId){

        return new ResponseEntity<>(costumerService.getCostumerById(costumerId), HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody CostumerDto costumerDto){

        CostumerDto saveDto = costumerService.saveNewCostumer(costumerDto);

        HttpHeaders headers = new HttpHeaders();

        headers.add("Location", "/api/v1/costumer/" + saveDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);

    }

    @PutMapping({"/{costumerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCostumer(@PathVariable("costumerId")  UUID costumerId, @RequestBody CostumerDto costumerDto){
        costumerService.updateCostumer(costumerId, costumerDto);
    }

    @DeleteMapping({"/{costumerId}"})
    public void deleteCostumer(@PathVariable("costumerId") UUID costumerId){
        costumerService.deleteCostumerId(costumerId);
    }

}
