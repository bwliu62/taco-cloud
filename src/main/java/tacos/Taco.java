package tacos;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {

    private Long id;
    private Date createdAt;

    @NotNull
    @Size(min = 5, message = "ame must be at least 5 characters long")
    private String name;

    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

//    public void addIngredient(Ingredient taco) {
//        this.ingredients.add(new IngredientRef(taco.getId()));
//    }

}
