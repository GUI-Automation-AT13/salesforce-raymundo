package core.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public final class ObjectToMap {

    private ObjectToMap() {
    }

    /**
     * Converts an object to a Map.
     *
     * @param object the object to convert
     * @return a map with all the object's attributes and values
     */
    public static Map convertObjectToMap(final Object object) throws IllegalAccessException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(object, Map.class);
    }
}
