package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.time.LocalDateTime;

public class Tachograph {

    private Table<LocalDateTime, Integer, Integer> tacho
            = HashBasedTable.create();

    public int getSize() {
        return tacho.size();
    }

    public void add (int position, int speed) {
        tacho.put(LocalDateTime.now(), position, speed);
    }

}


