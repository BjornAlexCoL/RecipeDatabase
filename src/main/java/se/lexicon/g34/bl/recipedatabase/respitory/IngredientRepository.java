package se.lexicon.g34.bl.recipedatabase.respitory;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.g34.bl.recipedatabase.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient,Integer> {
}
