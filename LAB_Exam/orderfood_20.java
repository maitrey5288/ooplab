// 20.Create a new class Order in the Java project with the instance variables
//  and methods mentioned below. orderId: int , orderedFoods: String, 
//  totalPrice: double, status: String  , calculateTotalPrice(int unitPrice): double. 
//   Calculate the total price by applying a service charge of 5% on the food item ordered and store 
//   it in the instance variable totalPrice. Return the calculated total price. 
//   Create an object of the Order class, initialize the instance variables using parameterized constructor,
//    invoke the calculateTotalPrice() method and display the values of the instance variables  in the main() 
//    method of the Tester class. Use static block to print status "Ordered". 
class Order1{
    private int orderId;
    private String orderedFoods;
    private double totalPrice;
    private String status;
 
    public Order1(int orderId, String orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
    }
 
    public int getOrderId() {
        return orderId;
    }
 
    public String getOrderedFoods() {
        return orderedFoods;
    }
 
    double calculateTotalPrice(int unitPrice){
        totalPrice = (unitPrice+(0.05*unitPrice));
        return totalPrice;
    }
    static {
        System.out.println("Order Status: Ordered");
    }
 }
 
 public class orderfood_20 {
    public static void main(String[] args) {
        System.out.println("Order Details");
        Order1 order1=new Order1(101,"Burger");
        System.out.println("Order ID:" + order1.getOrderId());
        System.out.println("Ordered Food: "+order1.getOrderedFoods());
        System.out.println("Total Price "+order1.calculateTotalPrice(33));
 
    }
 }
 