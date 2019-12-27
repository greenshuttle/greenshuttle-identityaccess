package io.greenshuttle.identityaccess.infrastructure.datascope;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yangzifeng
 */
public class ModelStore {

    private static Map<String, Model> store = new ConcurrentHashMap<>();

    static boolean store(Model model) {
        return true;
    }

    static boolean refresh(String resourceCode) {
        return true;
    }
}
