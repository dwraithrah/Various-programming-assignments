/**
 *
 * @author Robert Jackson
 * this class will create a window that will allow user to input a number and 
 * will then display all of the products across the stores whose inventory levels
 * are below the input number.
 */
import javax.swing.*; //swing classes
import java.awt.*; //for border layout class
import java.awt.event.*; //for event listener interfaces



public class Jackson_InputNumberShowInventory extends JFrame 
{
    private int[][] storeInventory; //array to hold store inventory data
    private JPanel inputPanel;  //the panel that will have the input field to enter inventory amount
    private JLabel inputLabel; //instructions for text field
    private JTextField inputField; //text field to input inventory amount
    private JButton searchButton; //button to initiate search after value is input to show inventory amount
    private final int WINDOW_WIDTH = 200; //width of window frame
    private final int WINDOW_HEIGHT = 200; //height of window frame
    
    /**
     * constructor
     * @param inventoryCopy reference address to the array holding the stores' inventory
     */
    public Jackson_InputNumberShowInventory(int[][] inventoryCopy)
    {
        
        //stores inventory address in storeInventory
        storeInventory = inventoryCopy;
        
        //sets title
        setTitle("Inventory Search");
        
        //sets size of window
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        //sets default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //calls on createInputPanel method to create the panel
        createInputPanel();
        
        //adds panel to frame
        add(inputPanel);
        
        //makes window visible
        setVisible(true);
        
    }//end constructor
    
    /**
     * createInputPanel method will create the panel and add the label and text field 
     * and search button
     */
    public void createInputPanel()
    {
        
        //create the panel
        inputPanel = new JPanel();
        
        //create label field
        inputLabel = new JLabel("Enter Inventory Amount");
        
        //create text field
        inputField = new JTextField(10);
        
        //create search button
        searchButton = new JButton ("SEARCH");
        
        //attach action listener to search button
        searchButton.addActionListener(new SearchActionListener());
        
        //add everything to the panel
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);
        inputPanel.add(searchButton);
        
    }//end createInputPanel method
    
    /**
     * private inner class SearchActionListener will display inventory requested 
     * across all the stores when the search button is pressed
     */
    private class SearchActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
      
            //String object to hold what is entered into text field
            String input = inputField.getText();
            
            //int variable to hold the converted amount entered
            int inventory = Integer.parseInt(input);
            
            //calls displayInventory method to display inventory based on input
            displayInventory(inventory);
        }//end action Performed method
        
        /**
         * displayInventory
         * this method, part of the private class, is an extension of actionPerformed
         * and will actually create the window and display the inventory.
         * @param inv the input inventory to search at or under for
         */
        public void displayInventory(int inv)
        {
            //int variable inventory to hold the inventory entered
            int inventory = inv;
            
           
            //all the objects needed to create the display window
            
            //creates the panel
            JPanel displayPanel = new JPanel();
            
            //set layoot for panel
            displayPanel.setLayout(new GridLayout(5, 6));
            
            //creates the store labels
            JLabel store101 = new JLabel("Store 101");
            JLabel store102 = new JLabel("Store 102");
            JLabel store103 = new JLabel("Store 103");
            JLabel store104 = new JLabel("Store 104");
            
            //create blank lable to use as a separator
            JLabel blankLabel = new JLabel(" ");
            
            //creates product labels
            JLabel tennisShoes = new JLabel("Tennis Shoes");
            JLabel sweaters = new JLabel("Sweaters");
            JLabel jeans = new JLabel("Jeans");
            JLabel shorts = new JLabel("Shorts");
            JLabel jackets = new JLabel("Jackets");
            
            //create the various non-editable text fields to display inventory as needed
            //text fields for tennis shoes in all 4 stores
            JTextField ts101 = new JTextField(10);
            ts101.setEditable(false);
            JTextField ts102 = new JTextField(10);
            ts102.setEditable(false);
            JTextField ts103 = new JTextField(10);
            ts103.setEditable(false);
            JTextField ts104 = new JTextField(10);
            ts104.setEditable(false);
            
            //text fields for sweaters in all 4 stores
            JTextField sw101 = new JTextField(10);
            sw101.setEditable(false);
            JTextField sw102 = new JTextField(10);
            sw102.setEditable(false);
            JTextField sw103 = new JTextField(10);
            sw103.setEditable(false);
            JTextField sw104 = new JTextField(10);
            sw104.setEditable(false);
            
            //text fields for jeans in all 4 stores
            JTextField je101 = new JTextField(10);
            je101.setEditable(false);
            JTextField je102 = new JTextField(10);
            je102.setEditable(false);
            JTextField je103 = new JTextField(10);
            je103.setEditable(false);
            JTextField je104 = new JTextField(10);
            je104.setEditable(false);
            
            //text fields for shorts in all 4 stores
            JTextField sh101 = new JTextField(10);
            sh101.setEditable(false);
            JTextField sh102 = new JTextField(10);
            sh102.setEditable(false);
            JTextField sh103 = new JTextField(10);
            sh103.setEditable(false);
            JTextField sh104 = new JTextField(10);
            sh104.setEditable(false);
            
            //text fields for jackets in all 4 stores
            JTextField ja101 = new JTextField(10);
            ja101.setEditable(false);
            JTextField ja102 = new JTextField(10);
            ja102.setEditable(false);
            JTextField ja103 = new JTextField(10);
            ja103.setEditable(false);
            JTextField ja104 = new JTextField(10);
            ja104.setEditable(false);
            
            //add all the text fields to the panel in the order they need
            //to appear
            //first row
            displayPanel.add(blankLabel);
            displayPanel.add(tennisShoes);
            displayPanel.add(sweaters);
            displayPanel.add(jeans);
            displayPanel.add(shorts);
            displayPanel.add(jackets);
            //second row
            displayPanel.add(store101);
            displayPanel.add(ts101);
            displayPanel.add(sw101);
            displayPanel.add(je101);
            displayPanel.add(sh101);
            displayPanel.add(ja101);
            //third row
            displayPanel.add(store102);
            displayPanel.add(ts102);
            displayPanel.add(sw102);
            displayPanel.add(je102);
            displayPanel.add(sh102);
            displayPanel.add(ja102);
            //fourth row
            displayPanel.add(store103);
            displayPanel.add(ts103);
            displayPanel.add(sw103);
            displayPanel.add(je103);
            displayPanel.add(sh103);
            displayPanel.add(ja103);
            //fifth row
            displayPanel.add(store104);
            displayPanel.add(ts104);
            displayPanel.add(sw104);
            displayPanel.add(je104);
            displayPanel.add(sh104);
            displayPanel.add(ja104);
            
            //create the window frame this is all going in
            //window width and height
            final int DIS_WINDOW_WIDTH = 1150;
            final int DIS_WINDOW_HEIGHT = 900;
            
            //set size
            setSize(DIS_WINDOW_WIDTH, DIS_WINDOW_HEIGHT);
            
            //set title
            setTitle("Inventory Search Results");
            
            //set default close operation
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //add panel to window
            add(displayPanel);
            
            //series of if statements that will display in the appropriate text
            //field the inventory of whichever product is below the input amount
            if(storeInventory[0][0] < inventory)
                ts101.setText(Integer.toString(storeInventory[0][0]));
            if(storeInventory[0][1]< inventory)
                ts102.setText(Integer.toString(storeInventory[0][1]));
            if(storeInventory[0][2]< inventory)
                ts103.setText(Integer.toString(storeInventory[0][2]));
            if(storeInventory[0][3]< inventory)
                ts104.setText(Integer.toString(storeInventory[0][3]));
            if(storeInventory[1][0]< inventory)
                sw101.setText(Integer.toString(storeInventory[1][0]));
            if(storeInventory[1][1]< inventory)
                sw102.setText(Integer.toString(storeInventory[1][1]));
            if(storeInventory[1][2]< inventory)
                sw103.setText(Integer.toString(storeInventory[1][2]));
            if(storeInventory[1][3] < inventory)
                sw104.setText(Integer.toString(storeInventory[1][3]));
            if(storeInventory[2][0]< inventory)
                je101.setText(Integer.toString(storeInventory[2][0]));
            if(storeInventory[2][1]< inventory)
                je102.setText(Integer.toString(storeInventory[2][1]));
            if(storeInventory[2][2]< inventory)
                je103.setText(Integer.toString(storeInventory[2][2]));
            if(storeInventory[2][3]< inventory)
                je104.setText(Integer.toString(storeInventory[2][3]));
            if(storeInventory[3][0]< inventory)
                sh101.setText(Integer.toString(storeInventory[3][0]));
            if(storeInventory[3][1]< inventory)
                sh102.setText(Integer.toString(storeInventory[3][1]));
            if(storeInventory[3][2]< inventory)
                sh103.setText(Integer.toString(storeInventory[3][2]));
            if(storeInventory[3][3]< inventory)
                sh104.setText(Integer.toString(storeInventory[3][3]));
            if(storeInventory[4][0]< inventory)
                ja101.setText(Integer.toString(storeInventory[4][0]));
            if(storeInventory[4][1]< inventory)
                ja102.setText(Integer.toString(storeInventory[4][1]));
            if(storeInventory[4][2]< inventory)
                ja103.setText(Integer.toString(storeInventory[4][2]));
            if(storeInventory[4][3]< inventory)
                ja104.setText(Integer.toString(storeInventory[4][3]));
            
            //set visibility of window
            setVisible(true);
            
        }//end displayInventory method
        
    }//end SearchActionListener
    
}//end Jackson_InputNumberShowInventory class
/*References:
 * Gaddis, Tony; Starting out With Java, From Control Structures Through
 * Objects, 5th ed.; Pearson, Upper Saddle River, NJ; 2005; book */