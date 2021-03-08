package se.lexicon.g34.bl.recipedatabase.entity;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Recipe {
    int ID;
    String recipe;
    List<Ingredient> ingredients;
    RecipeInstruction instructions;
    List<RecipeCategory> categories;

//Constructors

    public Recipe() {
    }

    public Recipe(int ID, String recipe, List<Ingredient> ingredients, RecipeInstruction instruction) {
        this.ID = ID;
        this.recipe = recipe;
        this.ingredients = ingredients;
        this.instructions = instruction;
    }

    public Recipe(String recipe) {
        this.recipe = recipe;
    }
    //Getters and Setters

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRecipe() {
        return this.recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public RecipeInstruction getInstruction() {
        return instructions;
    }

    public void setInstruction(RecipeInstruction instruction) {
        this.instructions = instruction;
    }

//Overrides

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return ID == recipe.ID && Objects.equals(this.recipe, recipe.recipe) && Objects.equals(ingredients, recipe.ingredients) && Objects.equals(instructions, recipe.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, recipe, ingredients, ingredients);
    }
}
