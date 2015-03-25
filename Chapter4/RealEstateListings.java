
// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

package realestatelistings;

public class RealEstateListings {
    
    public static void main(String[] args) {
        
        Property land = new Property(10000, "Land", 2.1);
        Property estate = new Property(250000, "Estate", 1.5, 3, 4);
        
        System.out.println(land.toString());
        System.out.println(estate.toString());
        
        estate.setAskingPrice(230000);
        
        System.out.println(estate.toString());
    }
}
