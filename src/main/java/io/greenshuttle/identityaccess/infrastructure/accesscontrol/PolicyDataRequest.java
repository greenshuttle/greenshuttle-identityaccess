package io.greenshuttle.identityaccess.infrastructure.accesscontrol;

import java.util.Map;

/**
 * @author yangzifeng
 */
public class PolicyDataRequest {

    Map<String, Object> input;

    public PolicyDataRequest(Map<String, Object> input) {
        this.input = input;
    }

    public Map<String, Object> getInput() {
        return this.input;
    }
}
