
package com.example.recipe;
//  * You can use the following import statements
import org.springframework.web.bind.annotation.*;
import java.util.*;
import  com.example.recipe.RecipeService;
 

// Write your code here

@RestController
public class RecipeController{
    RecipeService recipeService = new RecipeService();



@GetMapping("/recipes")
public ArrayList<Recipe> getRecipe(){
    return recipeService.getRecipe();


    }
@PostMapping("/recipes")
public Recipe addRecipe(@RequestBody Recipe recipe){
    return recipeService.addRecipe(recipe);
}

@GetMapping("/recipes/{recipeId}")
public Recipe getRecipe(@PathVariable("recipeId") int recipeId){
    return recipeService.getRecipe(recipeId);
}

@PutMapping("/recipes/{recipeId}")
public Recipe updateRecipe(@PathVariable("recipeId") int recipeId,@RequestBody Recipe recipe){

    return recipeService.updateRecipe(recipeId,recipe);

}

@DeleteMapping("/recipes/{recipeId}")
public void deleteRecipe(@PathVariable("recipeId") int recipeId){
    recipeService.deleteRecipe(recipeId);

}








    }   