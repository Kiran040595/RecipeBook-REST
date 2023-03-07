// Write your code here

package com.example.recipe;

import java.util.*;



public class Recipe{
    int recipeId;
    String recipeName;
    String recipeType;
    List ingredients;


    public Recipe(int recipeId, String recipeName, String recipeType, List ingredients){
        this.recipeId=recipeId;
        this.recipeName=recipeName;
        this.recipeType=recipeType;
        this.ingredients = ingredients;

    }

    public int getrecipeId(){
        return  recipeId;
    }
    public void setRecipeId(int recipeId){
        this.recipeId=recipeId;
    }

    public String getRecipeName(){
        return recipeName;
    }

    public void setRecipeName( String recipeName){
        this.recipeName= recipeName;
    }


    public String getRecipeType(){
        return recipeType;
    }

    public void setRecipeType(String recipeType){
        this.recipeType=recipeType;
    }

    public List getIngredients(){
        return ingredients;
    }
    
    public void setIngredients(List ingredients){
        this.ingredients=ingredients;
    }







}