package tests;
import org.junit.jupiter.api.Test;
import pojo.Cats;
import pojo.Item;
import tools.jackson.databind.ObjectMapper;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonParse {

    @Test
    void testParseCatsJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Cats cats = mapper.readValue(new File("src/test/resources/cat.json"), Cats.class);


        assertEquals("cats", cats.getTypeOfCats());
        assertEquals("Kirill", cats.getOwnerName());
        assertEquals(2, cats.getQuantityOfCats());

        Item firstCat = cats.getListOfCats().get(0);
        assertEquals("Gella", firstCat.getName());
        assertEquals("black", firstCat.getColor());
    }
}
