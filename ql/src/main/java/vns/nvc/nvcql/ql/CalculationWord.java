package vns.nvc.nvcql.ql;

import lombok.Getter;

public enum CalculationWord {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    ;

    @Getter
    private final String value;

    CalculationWord(String value) {
        this.value = value;
    }
}
