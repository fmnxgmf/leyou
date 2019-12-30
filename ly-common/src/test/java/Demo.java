import com.fasterxml.jackson.core.type.TypeReference;
import com.leyou.common.utils.JsonUtils;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/24 14:29
 * @version:
 * @modified By:
 */
public class Demo {
    public static void main(String[] args) {
        JsonUtils jsonUtils = new JsonUtils();
//        User user = new User("jack",21);
//        //toString
//
//        String json = jsonUtils.serialize(user);
//        System.out.println(json);
//        //反序列化
//        User user1 = jsonUtils.parse(json, User.class);
//        System.out.println(user1);
//        //tolist
//        json = "[20,-10,5,13]";
//        List<Integer> integers = jsonUtils.parseList(json, Integer.class);
//        System.out.println("list = "+integers);
        //tomap
        //language=JSON
//        String json = "{\"name\": \"jack\",\"age\": \"22\"}";
//        Map<String, String> stringStringMap = jsonUtils.parseMap(json, String.class, String.class);
//        System.out.println(stringStringMap);

        String json = "[{\"name\": \"jack\",\"age\": \"22\"},{\"name\": \"jack2\",\"age\": \"22\"},{\"name\": \"jack3\",\"age\": \"22\"}]";
        List<Map<String, String>> maps = jsonUtils.nativeRead(json, new TypeReference<List<Map<String, String>>>() {
        });
        System.out.println(maps);
    }
}
