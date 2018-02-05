/**
 *
 * @author Robert Jackson
 * This class will create the main window for the store inventory demo. It will
 * have three buttons with different inventory search choices the user can utilize,
 * which will then open up further appropriate windows for inventory search.
 */
import javax.swing.*; //swing classes
import java.awt.*; //for border layout class
import java.awt.event.*; //for event listener interfaces

public class Jackson_StoreInventoryDemo extends JFrame
{
    private final int WINDOW_WIDTH = 430; //width of window
    private final int WINDOW_HEIGHT = 175; //height of window
    private JButton fullStoreInventoryCheck;  //button to check all the inventory in one store
    private JButton singleStoreSingleItemCheck; //button to check inventory on one item in a store
    private JButton singleItemAllStoreCheck; //button to check the inventory on one item at all 4 stores
    private JButton quantityComparisonCheck; //button that will list all items below an entered quantity
    private int[][] storeInventory; //will hold the reference variables to the storeInventory object from main method
    
    /**
     * Constructor
     * @param inventoryCopy reference address to array holding store inventory info
     */
    public Jackson_StoreInventoryDemo(int[][] inventoryCopy)
    {
        storeInventory = inventoryCopy; //store reference address to storeInventory
        
        //set the title of demo window
        setTitle("Store Inventory Demo");
        
        //set the size of the demo window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        //set the default operation when the close window button is hit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //set the flow for the layout manager
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        //create the 4 button objects
        fullStoreInventoryCheck = new JButton("Check the entire inventory of one of the stores.");
        singleStoreSingleItemCheck = new JButton("Check the inventory of an item in a chosen store.");
        singleItemAllStoreCheck = new JButton("Check the inventory of an item across all the stores.");
        quantityComparisonCheck = new JButton("Display items whose inventory levels are below a chosen amount.");
        
        //adding action listeners to the buttons
        fullStoreInventoryCheck.addActionListener(new MainMenuListener());
        singleStoreSingleItemCheck.addActionListener(new MainMenuListener());
        singleItemAllStoreCheck.addActionListener(new MainMenuListener());
        quantityComparisonCheck.addActionListener(new MainMenuListener());
        
        //add buttons to the window
        add(fullStoreInventoryCheck);
        add(singleStoreSingleItemCheck);
        add(singleItemAllStoreCheck);
        add(quantityComparisonCheck);
        
        //display the window
        setVisible(true);
    }//end constructor
    
    /**
     * private inner class MainMenuLIstener adds events to the buttons on the
     * main menu
     */
    private class MainMenuListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //string variable to get the action event
            String actionEvent = e.getActionCommand();
            
            //if statement that will call upon different classes to open appropriate
            //windows based on which button was pushed
            
            //CHECKS ENTIRE INVENTORY OF ONE STORE
            if(actionEvent.equals("Check the entire inventory of one of the stores."))
            {
                Jackson_StoreFullInventory button1 = new Jackson_StoreFullInventory(storeInventory);
            }//end action event checking entire inventory of one store
            
            //LETS USER CHOOSE A STORE AND ITEM AND CHECKS INVENTORY OF THAT ONE ITEM
            if(actionEvent.equals("Check the inventory of an item in a chosen store."))
            {
                Jackson_OneStoreOneItem button2 = new Jackson_OneStoreOneItem(storeInventory);
            }//end action event checking inventory of one item in one store
            
            //CHECKS THE INVENTORY OF ONE ITEM IN ALL THE STORES
            if(actionEvent.equals("Check the inventory of an item across all the stores."))
            {
                Jackson_OneItemAllStores button3 = new Jackson_OneItemAllStores(storeInventory);
            }//end action event checking inventory of one item in all the stores
            
            //LETS USER DISPLAY AN AMOUNT AND SHOWS ALL INVENTORY ITEMS UNDER THAT AMOUNT
            //ACROSS ALL STORES
            if(actionEvent.equals("Display items whose inventory levels are below a chosen amount."))
            {
                Jackson_InputNumberShowInventory button4 = new Jackson_InputNumberShowInventory(storeInventory);
            }//end action event displaying all items below an entered inventory amount in all stores
            
        }//end actionPerformed method
    }//end MainMenuListener class
    
}//end Jackson_StoreInventoryDemo class
/*References:
 * Gaddis, Tony; Starting out With Java, From Control Structures Through
 * Objects, 5th ed.; Pearson, Upper Saddle River, NJ; 2005; book */
