/**
 *
 * @author Robert Jackson
 * the one item all stores class will create a window that will allow user to select
 * an item and it will display the inventory across all stores for that item
 */
import javax.swing.*; //swing classes
import java.awt.*; //for border layout class
import java.awt.event.*; //for event listener interfaces

public class Jackson_OneItemAllStores extends JFrame
{
    private int[][] storeInventory; //array object to hold the store inventory from main method
    private JPanel itemPanel;  //name for pane to hold all the product buttons
    private JPanel resultsPanel; //name for pane that will hold the text fields displaying results
    private JPanel displayPanel; //name for pane that will hold the button to trigger to display results
    private JRadioButton tennisShoes; //radio button for tennis shoes
    private JRadioButton sweaters; //radio button for sweaters
    private JRadioButton jeans; //radio button for jeans
    private JRadioButton shorts; //radio button for shorts
    private JRadioButton jackets; //radio button for jackets
    private ButtonGroup itemGroup; //button group object to bind the product buttons together
    private JTextField store101;  //text field to display store 101 results
    private JTextField store102; //text field to display store 102 results
    private JTextField store103; //text field to display store 103 results
    private JTextField store104; //text field to display store 104 results
    private JLabel store101Label; //label for store 101 text field
    private JLabel store102Label; //label for store 102 text field
    private JLabel store103Label; //label for store 103 text field
    private JLabel store104Label; //label for store 104 text field
    private JButton display; //button to click on to display the results
    
    /**
     * constructor
     * @param inventoryCopy holds reference address for store inventory array
     */
    public Jackson_OneItemAllStores(int[][] inventoryCopy)
    {
       //stores address for store inventory into storeInventory
        storeInventory = inventoryCopy;
        
        //set the title
        setTitle("Item Inventory Display");
        
        //set close operation when clicking on close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //set border layout
        setLayout(new BorderLayout());
        
        //call on the methods to create the panels
        createItemPanel();
        createResultsPanel();
        createDisplayPanel();
        
        //add the panels to the frame
        add(itemPanel, BorderLayout.WEST);
        add(resultsPanel, BorderLayout.EAST);
        add(displayPanel, BorderLayout.SOUTH);
        
        //pack and display
        pack();
        setVisible(true);
        
    }//end constructor method
    
    /**
     * the createItemPanel method will create the panel that holds all the item
     * radio buttons
     */
    private void createItemPanel()
    {
       //create the panel
        itemPanel = new JPanel();
        
        //set new grid layout
        itemPanel.setLayout(new GridLayout(5, 1));
        
        //create the radio buttons
        tennisShoes = new JRadioButton("Tennis Shoes", true);
        sweaters = new JRadioButton("Sweaters");
        jeans = new JRadioButton("Jeans");
        shorts = new JRadioButton("Shorts");
        jackets = new JRadioButton("Jackets");
        
        //create radio button group
        itemGroup = new ButtonGroup();
        
        //adds radio buttons to group
        itemGroup.add(tennisShoes);
        itemGroup.add(sweaters);
        itemGroup.add(jeans);
        itemGroup.add(shorts);
        itemGroup.add(jackets);
        
        //add border around panel
        itemPanel.setBorder(BorderFactory.createTitledBorder("Products"));
        
        //add radio buttons to panel
        itemPanel.add(tennisShoes);
        itemPanel.add(sweaters);
        itemPanel.add(jeans);
        itemPanel.add(shorts);
        itemPanel.add(jackets);
        
    }//end createItemPanel method
    
    /**
     * getItemChosen method will return a string variable based on whichever
     * radio button is chosen
     * @return the name of the item chosen
     */
    public String getItemChosen()
    {
     //string variable to hold the item chosen
        String itemChosen = " ";
        
        //if statement to differentiate between chosen radio buttons
        if(tennisShoes.isSelected())
            itemChosen = "Tennis Shoes";
        if(sweaters.isSelected())
            itemChosen = "Sweaters";
        if(jeans.isSelected())
            itemChosen = "Jeans";
        if(shorts.isSelected())
            itemChosen = "Shorts";
        if(jackets.isSelected())
            itemChosen = "Jackets";
        
        return itemChosen;    
    }//end getItemChosen method
    
    /**
     * the createResultsPanel panel will create a panel that will hold uneditable text
     * fields that will display the results
     */
    public void createResultsPanel()
    {
        //create the results panel
        resultsPanel = new JPanel();
        
        //set new grid layout
        resultsPanel.setLayout(new GridLayout(4, 2));
        
        //create the labels for the text fields
        store101Label = new JLabel("Store 101");
        store102Label = new JLabel("Store 102");
        store103Label = new JLabel("Store 103");
        store104Label = new JLabel("Store 104");
        
        //create the text fields and make them uneditable
        store101 = new JTextField(5);
        store101.setEditable(false);
        
        store102 = new JTextField(5);
        store102.setEditable(false);
        
        store103 = new JTextField(5);
        store103.setEditable(false);
        
        store104 = new JTextField(5);
        store104.setEditable(false);
        
        //add border around panel
        resultsPanel.setBorder(BorderFactory.createTitledBorder("Inventory"));
        
        //add labels and text fields to the panel
        resultsPanel.add(store101Label);
        resultsPanel.add(store101);
        
        resultsPanel.add(store102Label);
        resultsPanel.add(store102);
        
        resultsPanel.add(store103Label);
        resultsPanel.add(store103);
        
        resultsPanel.add(store104Label);
        resultsPanel.add(store104);
    }//end createResultsPanel method
    
    /**
     * the createDisplayPanel will create a panel with a display button which will
     * then populate the results panel with all the information based on product
     * chosen
     */
    public void createDisplayPanel()
    {
        //create the panel
        displayPanel = new JPanel();
        
        //create the button
        display = new JButton("Display Results");
        
        //add event listener to button
        display.addActionListener(new DisplayActionListener());
        
        //add button to panel
        displayPanel.add(display);
        
    }//end createDisplayPanel
    
    /**
     * the DisplayActionListner is an inner private class that will detail
     * actions when the display button is pressed, namely, to populate the jtextfields
     * with appropriate inventory amounts
     */
    private class DisplayActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            //string value to store when button is pressed
            String actionEvent = e.getActionCommand();
            
            //String object to hold item chosen
            String itemChosen = " ";
            
            //int variable for the item inventory index
            int itemIndex = -1;
            
            //if statement to get ball rolling
            if (actionEvent.equals("Display Results"))
            {
                //call getItemChosen method to return which radio button is selected
                itemChosen = getItemChosen();
                
                //if statements to decide which index value to store based on getItemChosen results
                if (itemChosen.equals("Tennis Shoes"))
                    itemIndex = 0;
                if (itemChosen.equals("Sweaters"))
                    itemIndex = 1;
                if (itemChosen.equals("Jeans"))
                    itemIndex = 2;
                if (itemChosen.equals("Shorts"))
                    itemIndex = 3;
                if (itemChosen.equals("Jackets"))
                    itemIndex = 4;
                
                //displays results
                store101.setText(Integer.toString(storeInventory[itemIndex][0]));
                store102.setText(Integer.toString(storeInventory[itemIndex][1]));
                store103.setText(Integer.toString(storeInventory[itemIndex][2]));
                store104.setText(Integer.toString(storeInventory[itemIndex][3]));
                
            }//end display results if statement
            
        }//end actionPerformed method
    }//end DisplayActioListener private class
    
    
}//end Jackson_OneItemAllStores class
/*References:
 * Gaddis, Tony; Starting out With Java, From Control Structures Through
 * Objects, 5th ed.; Pearson, Upper Saddle River, NJ; 2005; book */
