package spark.examples.transformer;

import spark.ResponseTransformer;

import static spark.Spark.get;
import static spark.Spark.defaultResponseTransformer;

public class DefaultTransformerExample {

    public static void main(String args[]) {

        defaultResponseTransformer(json);

        get("/hello", "application/json", (request, response) -> {
        });

        }, model -> "custom transformer");
    }

    private static final ResponseTransformer json = new JsonTransformer();

}