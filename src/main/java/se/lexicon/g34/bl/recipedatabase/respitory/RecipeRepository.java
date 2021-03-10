package se.lexicon.g34.bl.recipedatabase.respitory;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.g34.bl.recipedatabase.entity.Ingredient;
import se.lexicon.g34.bl.recipedatabase.entity.Recipe;
import se.lexicon.g34.bl.recipedatabase.entity.RecipeCategory;
import se.lexicon.g34.bl.recipedatabase.entity.RecipeIngredient;

import java.util.List;
import java.util.Locale;

public interface RecipeRepository extends CrudRepository<Recipe, String> {
    List<Recipe> findRecipesByRecipeNameContains(String recipe);
    List<RecipeIngredient> findRecipeByRecipeIngredients(String Ingredient);
    List<RecipeCategory> findRecipeByCategories(String Category);
    List<RecipeCategory> findRecipeByCategories(String[] Categories);

}
