package com.example.FizzBuzz;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzController {

    // FizzBuzzController wird über den Endpoint /fizzbuzz erreichbar gemacht
    @RequestMapping(value ="/fizzbuzz", produces = "application/json")
    public ResponseEntity<String> getFizzBuzzNumbers(@RequestParam(value="targetNum")Integer targetNum){
        String alleZahlen = FizzBuzzService.getFizzBuzzNumbers(targetNum);
        return new ResponseEntity<>(alleZahlen, HttpStatus.OK);
    }
}
