package umiworld.logic;

import java.util.concurrent.atomic.AtomicInteger;

public
class IdManager {
    static private AtomicInteger id = new AtomicInteger(0);


    public static Integer generateNewId() {
        return id.incrementAndGet();
    }


}
