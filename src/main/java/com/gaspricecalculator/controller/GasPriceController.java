package com.gaspricecalculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static com.gaspricecalculator.GasCalculator.calculateTotalCost;

@RestController
public class GasPriceController {

    @PostMapping("/calculate")
    public ResponseEntity<Map<String, Double>> calculateGasPrice(
            @RequestParam double gallons,
            @RequestParam double pricePerGallon
    ) {
        double totalCost = calculateTotalCost(gallons, pricePerGallon);

        Map<String, Double> response = new HashMap<>();
        response.put("totalCost", totalCost);

        return ResponseEntity.ok(response);
    }
}
