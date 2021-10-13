import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String json = "{" +
                "  \"tree\": {" +
                "    \"nodes\": [" +
                "      {\"id\": \"1\", \"left\": \"2\", \"right\": \"3\", \"value\": 1}," +
                "      {\"id\": \"2\", \"left\": \"4\", \"right\": \"5\", \"value\": 2}," +
                "      {\"id\": \"3\", \"left\": \"6\", \"right\": \"7\", \"value\": 3}," +
                "      {\"id\": \"4\", \"left\": \"8\", \"right\": \"9\", \"value\": 4}," +
                "      {\"id\": \"5\", \"left\": \"10\", \"right\": null, \"value\": 5}," +
                "      {\"id\": \"6\", \"left\": null, \"right\": null, \"value\": 6}," +
                "      {\"id\": \"7\", \"left\": null, \"right\": null, \"value\": 7}," +
                "      {\"id\": \"8\", \"left\": null, \"right\": null, \"value\": 8}," +
                "      {\"id\": \"9\", \"left\": null, \"right\": null, \"value\": 9}," +
                "      {\"id\": \"10\", \"left\": null, \"right\": null, \"value\": 10}" +
                "    ]," +
                "    \"root\": \"1\"" +
                "  }" +
                "}";




        ObjectMapper objectMapper = new ObjectMapper();
        TreeObject treeObject = objectMapper.readValue(json,TreeObject.class);

    }
}


