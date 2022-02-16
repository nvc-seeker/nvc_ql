package vns.nvc.nvcql.ql;

import lombok.Getter;
import lombok.Setter;

public enum ComparisonWord {
    EQUAL("="),
    GREATER_THEN(">"),
    LESS_THEN("<"),
    GREATER_THEN_OR_EQUAL(">="),
    LESS_THEN_OR_EQUAL("<="),
    NO_EQUAL("<>")
    ;


    @Getter
    private final String value;

    ComparisonWord(String value) {
        this.value = value;
    }
}
