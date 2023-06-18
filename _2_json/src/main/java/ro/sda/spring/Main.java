package ro.sda.spring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Main {
    static ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) throws JsonProcessingException {
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        serializeAndPrint(new User("Catalin", 25));
        deserializeAndPrint("{\"name\":\"Ionut\",\"age\":36}");
    }
    private static void serializeAndPrint(User u) throws JsonProcessingException {
        // serializing an object means to transform it from a java object to json format
        String serialized = mapper.writeValueAsString(u);
        System.out.println(serialized);
    }
    private static void deserializeAndPrint(String jsonObject) throws JsonProcessingException {
        // deserializing an json means to transform from json format to a java object (POJO - plain old java object)
        User user = mapper.readValue(jsonObject, User.class);
        System.out.println(user);
    }
}