package se.lexicon.g34.bl.recipedatabase.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity (name="recipes")
public class Recipe {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(unique = true,updatable = false,nullable = false )
    private int recipeId;
    @Column (nullable = false )
    private String recipeName;
    @OneToMany (cascade = CascadeType.ALL,orphanRemoval = true, mappedBy="recipe")
    private List<RecipeIngredient> recipeIngredients;
    @OneToOne(cascade=CascadeType.ALL )
    private RecipeInstruction instructions;
    @ManyToMany
    private List<RecipeCategory> categories;

//Constructors

    public Recipe() {
    }

    public Recipe(int recipeId, String recipeName,  RecipeInstruction instruction) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.instructions = instruction;
    }

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
    }
    //Getters and Setters

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return this.recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
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
        return recipeId == recipe.recipeId && Objects.equals(this.recipeName, recipe.recipeName) && Objects.equals(recipeIngredients, recipe.recipeIngredients) && Objects.equals(instructions, recipe.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeId, recipeName, recipeIngredients, recipeIngredients);
    }
}
