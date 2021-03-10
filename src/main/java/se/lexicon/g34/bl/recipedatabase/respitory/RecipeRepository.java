package se.lexicon.g34.bl.recipedatabase.respitory;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.g34.bl.recipedatabase.entity.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,String> {
}
