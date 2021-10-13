import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

String jsoon = "{\n" +
        "  \"tree\": {\n" +
        "    \"nodes\": [\n" +
        "      {\"id\": \"1\", \"left\": \"2\", \"right\": \"3\", \"value\": 1},\n" +
        "      {\"id\": \"2\", \"left\": \"4\", \"right\": \"5\", \"value\": 2},\n" +
        "      {\"id\": \"3\", \"left\": \"6\", \"right\": \"7\", \"value\": 3},\n" +
        "      {\"id\": \"4\", \"left\": \"8\", \"right\": \"9\", \"value\": 4},\n" +
        "      {\"id\": \"5\", \"left\": \"10\", \"right\": null, \"value\": 5},\n" +
        "      {\"id\": \"6\", \"left\": null, \"right\": null, \"value\": 6},\n" +
        "      {\"id\": \"7\", \"left\": null, \"right\": null, \"value\": 7},\n" +
        "      {\"id\": \"8\", \"left\": null, \"right\": null, \"value\": 8},\n" +
        "      {\"id\": \"9\", \"left\": null, \"right\": null, \"value\": 9},\n" +
        "      {\"id\": \"10\", \"left\": null, \"right\": null, \"value\": 10}\n" +
        "    ],\n" +
        "    \"root\": \"1\"\n" +
        "  }\n" +
        "}";
        ObjectMapper objectMapper = new ObjectMapper();
        TreeObject treeObject = objectMapper.readValue(jsoon,TreeObject.class);

    }
}


