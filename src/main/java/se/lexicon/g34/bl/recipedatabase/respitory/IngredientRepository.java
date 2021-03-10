package se.lexicon.g34.bl.recipedatabase.respitory;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.g34.bl.recipedatabase.entity.Ingredient;

import java.util.List;

public interface IngredientRepository extends CrudRepository<Ingredient,Integer> {

    List<Ingredient> findIngredientsByIngredientName(String ingredient);
    List<Ingredient> findIngredientsByIngredientNameContains(String ingridient);

}
