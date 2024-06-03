package com.lian.supplierandwholesalerlian.infrastructure.rest;

import com.lian.supplierandwholesalerlian.application.dto.SubcategoryRequest;
import com.lian.supplierandwholesalerlian.application.dto.SubcategoryResponse;
import com.lian.supplierandwholesalerlian.application.handler.ISubcategoryHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subcategory/")
@RequiredArgsConstructor
public class SubcategoryRestController {

    private final ISubcategoryHandler subcategoryHandler;

    @PostMapping()
    public ResponseEntity<Void> saveSubcategoryInDb(@RequestBody SubcategoryRequest subcategoryRequest){
        subcategoryHandler.saveSubcategoryInDb(subcategoryRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping()
    public ResponseEntity<List<SubcategoryResponse>> getAllSubcategoryFromDb(){
        return ResponseEntity.ok(subcategoryHandler.getAllSubcategoriesFromDb());
    }

    @GetMapping("{subcategoryId}")
    public ResponseEntity<SubcategoryResponse> getSubcategoryFromDb(@PathVariable Long subcategoryId){
        return ResponseEntity.ok(subcategoryHandler.getSubcategoryFromDb(subcategoryId));
    }

    @PutMapping()
    public ResponseEntity<Void> updateSubcategoryInDb(@RequestBody SubcategoryRequest subcategoryRequest){
        subcategoryHandler.updateSubcategoryInDb(subcategoryRequest);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{subcategoryId}")
    public ResponseEntity<Void> deleteSubcategoryFromDb(@PathVariable Long subcategoryId){
        subcategoryHandler.deleteSubcategoryInDb(subcategoryId);
        return ResponseEntity.noContent().build();
    }

}
