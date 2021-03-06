package com.mixer.raw;

import java.util.HashMap;

public final class Index {

    private static Index index;
    //row number, byte position
    private HashMap<Long, Long> rowIndex;
    private long totalRowNumber = 0;

    private Index() {
        this.rowIndex = new HashMap<>();
    }

    public static Index getInstance() {
        if (index == null) {
            index = new Index();
        }
        return index;
    }

    public void add(long bytePosition) {
        this.rowIndex.put(this.totalRowNumber, bytePosition);
        this.totalRowNumber++;
    }

    public Long getBytePosition(long rowNumber) {
       return this.rowIndex.getOrDefault(rowNumber, -1L);
    }
    public void remove(int row) {
        this.rowIndex.remove(row);
        this.totalRowNumber--;
    }

    public long getTotalNumberOfRows() {
        return this.totalRowNumber;
    }
}
