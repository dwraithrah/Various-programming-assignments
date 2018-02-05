/**
 *
 * @author Robert Jackson
 * This class will create a window that will allow user to pick which store
 * and will in turn display the entire inventory for that store
 */

import javax.swing.*; //swing classes
import java.awt.*; //for border layout class
import java.awt.event.*; //for event listener interfaces

public class Jackson_StoreFullInventory extends JFrame
{
    private final int WINDOW_WIDTH = 220; //width of window frame
    private final int WINDOW_HEIGHT = 110; //height of window frame
    private JButton store101; //button for store 101
    private JButton store102; //button for store 102
    private JButton store103; //button for store 103
    private JButton store104; //button for store 104
    private int[][] storeInventory; //reference address to the main method's store inventory
    
    /**
     * Constructor
     * @param inventoryCopy reference address to store inventory array
     */
    public Jackson_StoreFullInventory(int[][] inventoryCopy)
    {
        storeInventory = inventoryCopy;
        
        //set title
        setTitle("Store Menu");
        
        //set size of window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        //set default operation when close window is hit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //set the flow for the layout manager
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        //create the 4 store button objects
        store101 = new JButton("Store 101");
        store102 = new JButton("Store 102");
        store103 = new JButton("Store 103");
        store104 = new JButton("Store 104");
        
        //adds action listeners to buttons
        store101.addActionListener(new StoreInventoryListener());
        store102.addActionListener(new StoreInventoryListener());
        store103.addActionListener(new StoreInventoryListener());
        store104.addActionListener(new StoreInventoryListener());
        
        //add buttons to window
        add(store101);
        add(store102);
        add(store103);
        add(store104);
        
        //display the window
        setVisible(true);
        
    }//end constructor
    
    /**
     * private inner class StoreInventoryListener creates the action events for 
     * clicking on the buttons
     */
    private class StoreInventoryListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
          //String object to retrieve action event to button pushed
            String actionEvent = e.getActionCommand();
            
            //to copy proper inventory array over
            int[] inventoryCopy = new int[5];
            
            //index for the while loops
            int index = 0;
            
            //if statement to direct which action event is used based on button pushed
            
            //STORE 101 IS PUSHED
            if(actionEvent.equals("Store 101"))
            {
                //while loop to go through inventory array and copy inventory
                //from store 101 to inventoryCopy object
                while(index <= 4)
                {
                    inventoryCopy[index] = storeInventory[index][0];
                    index++;
                }//end while loop
                
                //display inventory information
                JOptionPane.showMessageDialog(null,"STORE 101:"+
                        "\nTennis Shoes: " + inventoryCopy[0] +
                        "\nSweaters:         " + inventoryCopy[1] +
                        "\nJeans:               " + inventoryCopy[2] +
                        "\nShorts:              " + inventoryCopy[3] +
                        "\nJackets:           " + inventoryCopy[4]);
                
            }//end store 101 button action event
            
            //STORE 102 IS PUSHED
            if(actionEvent.equals("Store 102"))
            {
                //while loop to go through inventory array and copy inventory
                //from store 102 to inventoryCopy object
                while(index <= 4)
                {
                    inventoryCopy[index] = storeInventory[index][1];
                    index++;
                }//end while loop
                
                //display inventory information
                JOptionPane.showMessageDialog(null,"STORE 102:"+
                        "\nTennis Shoes: " + inventoryCopy[0] +
                        "\nSweaters:         " + inventoryCopy[1] +
                        "\nJeans:               " + inventoryCopy[2] +
                        "\nShorts:              " + inventoryCopy[3] +
                        "\nJackets:           " + inventoryCopy[4]);
            }//end store 102 button action event
            
            //STORE 103 IS PUSHED
            if(actionEvent.equals("Store 103"))
            {
                //while loop to go through inventory array and copy inventory
                //from store 103 to inventoryCopy object
                while(index <= 4)
                {
                    inventoryCopy[index] = storeInventory[index][2];
                    index++;
                }//end while loop
                
                //display inventory information
                JOptionPane.showMessageDialog(null,"STORE 103:"+
                        "\nTennis Shoes: " + inventoryCopy[0] +
                        "\nSweaters:         " + inventoryCopy[1] +
                        "\nJeans:               " + inventoryCopy[2] +
                        "\nShorts:              " + inventoryCopy[3] +
                        "\nJackets:           " + inventoryCopy[4]);
            }//end store 103 button action event
            
            //STORE 104 IS PUSHED
            if(actionEvent.equals("Store 104"))
            {
                //while loop to go through inventory array and copy inventory
                //from store 104 to inventoryCopy object
                while(index <= 4)
                {
                    inventoryCopy[index] = storeInventory[index][3];
                    index++;
                }//end while loop
                
                //display inventory information
                JOptionPane.showMessageDialog(null,"STORE 104:"+
                        "\nTennis Shoes: " + inventoryCopy[0] +
                        "\nSweaters:         " + inventoryCopy[1] +
                        "\nJeans:               " + inventoryCopy[2] +
                        "\nShorts:              " + inventoryCopy[3] +
                        "\nJackets:           " + inventoryCopy[4]);
            }//end store 104 button action event
            
        }//end actionPerformed method
        
    }//end StoreInventoryListener class
    
}//end Jackson_StoreFullInventory class
/*References:
 * Gaddis, Tony; Starting out With Java, From Control Structures Through
 * Objects, 5th ed.; Pearson, Upper Saddle River, NJ; 2005; book */