package vns.nvc.nvcql.ql;

import lombok.Getter;

public enum OperatorWord {
    CALS("cals"),
    IN("in"),
    BY("by");

    @Getter
    private final String value;

    OperatorWord(String value) {
        this.value = value;
    }
}
