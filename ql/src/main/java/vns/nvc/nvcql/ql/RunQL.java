package vns.nvc.nvcql.ql;

public class RunQL {

    private static final String QL_STRING = "cals (planning.num - store_data.current_num) " +
            "in (planning.id='P001')" +
            "by (planning.product_id=store_data.product_id and planning.product_item=store_data.product_item)";

    public static void run() {

    }


}
