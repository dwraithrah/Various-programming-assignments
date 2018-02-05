/**
 *
 * @author Robert Jackson
 * Programming Project 3 is a demo of an inventory program that will create a
 * GUI window allowing a user to decide how to search through the inventory of
 * four stores and pop up appropriate windows based on those decisions
 */
public class Jackson_PP3 
{
    public static void main(String[] args) 
    {
       /*the array object that will hold the inventory for the four stores to
        * be used in this demo.  The first row is the inventory will represent
        * Tennis Shoes, followed by sweaters, jeans, shorts and jackets. Each
        * column will represent store numbers 101, 102, 103 and 104 respectively*/
      int[][] storeInventory = {  {102, 54, 20, 78},
                                  {45, 25, 35, 75},
                                  {12, 35, 45, 65},
                                  {54, 25, 34, 45},
                                  {15, 35, 50, 25} };
      //main method will now call the Jackson_StoreInventoryDemo constructor and
      //pass the reference to the storeInventory object to it to get this program
      //rolling
      Jackson_StoreInventoryDemo runDemo = new Jackson_StoreInventoryDemo(storeInventory);
         
    }//end main method  
}//END PROGRAM
/*References:
         * Gaddis, Tony; Starting out With Java, From Control Structures Through
         * Objects, 5th ed.; Pearson, Upper Saddle River, NJ; 2005; book */