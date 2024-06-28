package libs.utils;

import java.io.File;

import io.restassured.path.json.JsonPath;

public class JsonPathUtils {
    
    String filePath;
    
    public JsonPathUtils(String filePath) {
        this.filePath = filePath;
    }

    public int getSize(String... pathParams) {
        JsonPath jsonPath = new JsonPath(new File(filePath));
        return jsonPath.getInt(String.join(".", pathParams) + ".size()");
    }

    public JsonPath getJsonPath(String... pathParams) {
        JsonPath jsonPath = new JsonPath(new File(filePath));
        return jsonPath.setRootPath(String.join(".", pathParams));
    }
}
