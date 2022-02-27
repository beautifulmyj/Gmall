import com.alibaba.fastjson.JSONObject;

public class Play001 {
    public static void main(String[] args) {
        JSONObject jsObj = new JSONObject();
        jsObj.put("name", "myj");
        jsObj.put("age", 18);
        jsObj.put("city", "beijing");
        System.out.println(jsObj.toJSONString());

        System.out.println(jsObj.getIntValue("age"));
    }
}
