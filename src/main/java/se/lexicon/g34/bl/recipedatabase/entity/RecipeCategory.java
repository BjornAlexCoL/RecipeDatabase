package se.lexicon.g34.bl.recipedatabase.entity;

import java.util.List;
import java.util.Objects;

public class RecipeCategory {
    int ID;
    String category;
    List<Recipe> recipes;
//Constructors

    public RecipeCategory() {
    }

    public RecipeCategory(int ID, String category, List<Recipe> recipes) {
        this.ID = ID;
        this.category = category;
        this.recipes = recipes;
    }

    public RecipeCategory(String category) {
        this.category = category;
    }
    //Getters and Setters

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

//Overrides


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCategory that = (RecipeCategory) o;
        return ID == that.ID && Objects.equals(category, that.category) && Objects.equals(recipes, that.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, category, recipes);
    }
}
