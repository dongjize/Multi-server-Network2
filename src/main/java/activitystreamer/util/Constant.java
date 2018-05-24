package activitystreamer.util;

import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Constant {

    public static Integer serverID = 10000;
    public static Integer clientID = 10001;

    public static Map<String, ConcurrentLinkedQueue<JsonObject>> messageQueue = new HashMap<>();
}
