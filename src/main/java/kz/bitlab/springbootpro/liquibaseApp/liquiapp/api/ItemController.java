package kz.bitlab.springbootpro.liquibaseApp.liquiapp.api;

import kz.bitlab.springbootpro.liquibaseApp.liquiapp.dto.ItemDto;
import kz.bitlab.springbootpro.liquibaseApp.liquiapp.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping
    public ResponseEntity<List<ItemDto>> getItems(){
        return new ResponseEntity<>(itemService.getItems(), HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<ItemDto> getItem(@PathVariable(name = "id") Long id){
        return new ResponseEntity<>(itemService.getItem(id), HttpStatus.OK);
    }

}
