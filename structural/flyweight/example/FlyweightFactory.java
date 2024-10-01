package designpatterns.structural.flyweight.example;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> flyweightPool = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if(!flyweightPool.containsKey(key)) {
            flyweightPool.put(key, new ConcreteFlyweight(key));
        }
        return flyweightPool.get(key);
    }
}
