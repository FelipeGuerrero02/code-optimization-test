public class Store {
    static final int total_productos=3;
    static final int [] precios ={15,10,5};
    static final int [] cantidad ={2,3,4};
    static final int venta_estable=50;
    public static void main(String[] args) {
       int totalSales=0;
        int totalSales = total1 + total2 + total3;

        for(int i=0; i<total_productos; i++) {totalSales += precios [i]*cantidad [i];
        } if (totalSales>venta_estable) {
            System.out.println("good sales perfomarence");
        } else {
            System.out.println("low ales perfomarence");
        }
    }
}
