
import java.util.Collections;
import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */

    private final HashMap<Furniture, Integer> furnitures;   // declared as an instance variable furnitures

    /**
     * Initialize a new mapping of Furniture types to order quantities.
    */

    FurnitureOrder() {
        // TODO: Complete the constructor
        furnitures = new HashMap<Furniture, Integer>(); // initialised the variable furnitures
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method

        Integer count = 0;

        if(furnitures.containsKey(type)){
            count = furnitures.get(type);
        }

        furnitures.put(type, count + furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return furnitures;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method

        float totalCost = 0.0f;
        var typeSet = furnitures.keySet();

        if(!furnitures.isEmpty()){
            for(var f : typeSet) {
                totalCost += getTypeCost(f);
            }
            return totalCost;
        }
        return 0.0f;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method

        if(furnitures.containsKey(type)){
            return furnitures.get(type);
        }
        return 0;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method

        if(furnitures.containsKey(type)){
            return furnitures.get(type) * type.cost();
        }
        return 0.0f;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method

        Integer countTypes = 0;

        var entrySet = furnitures.values();

        if(!furnitures.isEmpty()){
            for(var f : entrySet){
                countTypes += f;
            }
            return countTypes;
        }
        return 0;
    }
}

// edge cases could be the following (that have been implemented):
// if type does not exist in enum
// if type is ordered more than once
// if the furnitures map is empty