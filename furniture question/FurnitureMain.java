

public class FurnitureMain {

    public static void main(String [] args) {
        
        FurnitureOrder orderFurniture  = new FurnitureOrder();

        orderFurniture.addToOrder(Furniture.CHAIR, 4);
        orderFurniture.addToOrder(Furniture.TABLE, 2);
        orderFurniture.addToOrder(Furniture.COUCH, 3);
        orderFurniture.addToOrder(Furniture.COUCH, 7);
        System.out.println("type count: " + orderFurniture.getTypeCount(Furniture.COUCH));
        System.out.println("type cost: " + orderFurniture.getTypeCost(Furniture.COUCH));
        System.out.println("list of ordered furnitures: " + orderFurniture.getOrderedFurniture());
        System.out.println("total order quantity:  " + orderFurniture.getTotalOrderQuantity());
        System.out.println("total cost of all furnitures: " + orderFurniture.getTotalOrderCost());

    }
}


// sample java file to test my code
