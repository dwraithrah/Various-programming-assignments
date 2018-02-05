/**
 *
 * @author Robert Jackson
 * This class creates a window that allows users to click a store and one of the
 * products in the store and it will display the inventory for that store and item.
 */
import javax.swing.*; //swing classes
import java.awt.*; //for border layout class
import java.awt.event.*; //for event listener interfaces

public class Jackson_OneStoreOneItem extends JFrame
{
    
    private JLabel title; //the title of the window
    private JRadioButton store101;  //store 101 radio button
    private JRadioButton store102; //store 102 radio button
    private JRadioButton store103; //store 103 radio button
    private JRadioButton store104; //store 104 radio button
    private JRadioButton tennisShoes; //tennis shoes radio button
    private JRadioButton sweaters; //sweaters radio button
    private JRadioButton jeans; //Jeans readio button
    private JRadioButton shorts; //shorts radio button
    private JRadioButton jackets; //jackest radio button
    private ButtonGroup storeGroup;  //groups store radio buttons together
    private ButtonGroup itemGroup;  //groups item radio buttons together
    private JTextField store; //to display the chosen store
    private JTextField item; //to displahy the chosen item
    private JTextField amount; //to display the inventory at chosen store and item
    private JPanel titlePanel; //the panel to hold the title
    private JPanel storePanel; //panel to hold the store radio buttons
    private JPanel itemPanel; //panel to hold the item radio buttons
    private JPanel showResultsPanel; //panel to house button command to display results
    private JPanel displayResultsPanel;//panel to house textfields to display results
    private int[][] storeInventory; //holds store inventory information
    private JButton displayResults;  //button to click to get information based off options selected
    
    /**
     * constructor
     * @param inventoryCopy reference variable for the main store inventory
     */
    public Jackson_OneStoreOneItem(int[][]inventoryCopy)
    {
        storeInventory = inventoryCopy;
        
        //set the title of the window
        setTitle("Store Inventory Display");
        
        //set default operation when the close button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //set layout
        setLayout(new BorderLayout());
        
        //call on the various methods to create the different panels
        createTitlePanel();
        createStorePanel();
        createItemPanel();
        createDisplayResultsPanel();
        createResultsPanel();
        
        //add the panels to the frame
        add(titlePanel, BorderLayout.NORTH);
        add(storePanel, BorderLayout.WEST);
        add(itemPanel, BorderLayout.CENTER);
        add(showResultsPanel, BorderLayout.SOUTH);
        add(displayResultsPanel, BorderLayout.EAST);
        
        //pack and display window
        pack();
        setVisible(true);          
    }//end constructor
    
    //NOTE ON ORGANIZATION: EACH PANEL METHOD WILL BE FOLLOWED BY ITS RESULTS METHOD
    //THAT THE RESULTSPANEL LISTENER WILL CALL UPON AS NEEDED.
    
    /**
     * the createTitlePanel method will create the panel that holds the instruction
     * for the entire window
     */
    public void createTitlePanel()
    {
        //sets the instructions for the window
        title = new JLabel ("Click on the store and the item whose inventory"
                + " you would like to display.");
        
        //creates the panel
        titlePanel = new JPanel();
        
        //adds the title label to the panel
        titlePanel.add(title);    
    }//end titlePanel method
    //There is no method tied to this panel as this panel requires no calculation
    
    /**
     * the createStorePanel will create the panel with the store radio buttons
     */
    public void createStorePanel()
    {
        //creates store panel object
        storePanel = new JPanel();
        
        //create new grid layout
        storePanel.setLayout(new GridLayout(4, 1));
        
        //creates the four store radio buttons
        store101 = new JRadioButton("Store 101", true);
        store102 = new JRadioButton("Store 102");
        store103 = new JRadioButton("Store 103");
        store104 = new JRadioButton("Store 104");
        
        //creates the store group object
        storeGroup = new ButtonGroup();
        
        //adds radio buttons to the store group
        storeGroup.add(store101);
        storeGroup.add(store102);
        storeGroup.add(store103);
        storeGroup.add(store104);
        
        //adds border around panel
        storePanel.setBorder(BorderFactory.createTitledBorder("Stores"));
        
        //adds the buttons to the panel
        storePanel.add(store101);
        storePanel.add(store102);
        storePanel.add(store103);
        storePanel.add(store104);    
    }//end createStorePanel method
    
    /**
     * the getStoreChosen method will return a string object based on radio button
     * chosen
     * @ return the store chosen
     */
    public String getStoreChosen()
    {
        //string object to store chosen selection
        String storeChosen = " ";
        //if statement to return proper value depending on which radio button is selected
        if(store101.isSelected())
            storeChosen = "Store 101";
        else if(store102.isSelected())
            storeChosen = "Store 102";
        else if(store103.isSelected())
            storeChosen = "Store 103";
        else if(store104.isSelected())
            storeChosen = "Store 104";
        
        return storeChosen;  
    }//end getStoreChosen method
    
    /**
     * the createItemPanel method creates the panel with the item radio buttons
     */
    public void createItemPanel()
    {
        //creates the item panel
        itemPanel = new JPanel();
        
        //set new grid layout
        itemPanel.setLayout(new GridLayout(5, 1));
        
        //creates the item radio buttons
        tennisShoes = new JRadioButton("Tennis Shoes", true);
        sweaters = new JRadioButton("Sweaters");
        jeans = new JRadioButton("Jeans");
        shorts = new JRadioButton("Shorts");
        jackets = new JRadioButton("Jackets");
        
        //creates item button group
        itemGroup = new ButtonGroup();
        
        //adds the item buttons to the itemGroup
        itemGroup.add(tennisShoes);
        itemGroup.add(sweaters);
        itemGroup.add(jeans);
        itemGroup.add(shorts);
        itemGroup.add(jackets);
        
        //adds border around panel
        itemPanel.setBorder(BorderFactory.createTitledBorder("Products"));
        
        //adds radio buttons to the panel
        itemPanel.add(tennisShoes);
        itemPanel.add(sweaters);
        itemPanel.add(jeans);
        itemPanel.add(shorts);
        itemPanel.add(jackets);    
    }//end createItemPanel method
    
    /**
     * the getItemChosen method will return a string object based on which radio button
     * is selected
     * @return the inventory item selected
     */
    public String getItemChosen()
    {
        //string object to hold item that is chosen
        String itemChosen = " ";
        //if statement to decide which string object to store based on radio button selected
        if(tennisShoes.isSelected())
            itemChosen = "Tennis Shoes";
        else if(sweaters.isSelected())
            itemChosen = "Sweaters";
        else if(jeans.isSelected())
            itemChosen = "Jeans";
        else if(shorts.isSelected())
            itemChosen = "Shorts";
        else if(jackets.isSelected())
            itemChosen = "Jackets";
        
        return itemChosen;  
    }//end getItemChosen method
    
    /**
     * createDisplayResults panel will create the panel housing the text fields
     * where the results of the inventory search will be shown
     */
    public void createDisplayResultsPanel()
    {
        //create the panel
        displayResultsPanel = new JPanel();
        
        //set new grid layout
        displayResultsPanel.setLayout(new GridLayout(3, 1));
        
        //create the text fields and set them to be uneditable
        store = new JTextField("Store: ");
        store.setEditable(false);
        
        item = new JTextField("Item: ");
        item.setEditable(false);
        
        amount = new JTextField("Current Inventory: ");
        item.setEditable(false);
        
        //adds border around panel
        displayResultsPanel.setBorder(BorderFactory.createTitledBorder("Inventory"));
        
        //adds the text fields to the panel
        displayResultsPanel.add(store);
        displayResultsPanel.add(item);
        displayResultsPanel.add(amount);
        
    }//end createDisplayResultsPanel
    
    /**
     * the createResultsPanel will create the panel for the results and display
     * them properly
     */
    public void createResultsPanel()
    {
        //String variables that will display store and item chosen
        String storeChosen;
        String itemChosen;
        
        //int variables to use as indexes to identify right inventory amount
        int storeIndex = -1;
        int itemIndex = -1;
        
        //creates the panel
        showResultsPanel = new JPanel();
        
        //sets button to display results
        displayResults = new JButton("Display Results");
        
        //attaches eventlistener to button
        displayResults.addActionListener(new DisplayResultsListener());
    
        //adds the button to the panel
        showResultsPanel.add(displayResults);
    }//ends createItemPanel method
    
    /**
     * inner private class DisplayResultsListener will get the results based on 
     * filled radio buttons and put them on the jtextfield as appropriate
     */
    private class DisplayResultsListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
            //String object to retrieve action event to button pushed
            String actionEvent = e.getActionCommand();
            
            //string objects to store results of the getStoreChosen and getItemChosen methods
            String storeChosen = " ";
            String itemChosen = " ";
            
            //int variables to store index values to pull up proper inventory
            int storeIndex = -1;
            int itemIndex = -1;
            
            //if statement to decide whether to perform action or no
            if(actionEvent.equals("Display Results"))
            {
                //calls getStoreChosen and getItemChosen method to figure out what to put in text fields
        storeChosen = getStoreChosen();
        itemChosen = getItemChosen();
        
        //if statements to set the store index
        if(storeChosen.equals("Store 101"))
            storeIndex = 0;
        if(storeChosen.equals("Store 102"))
            storeIndex = 1;
        if(storeChosen.equals("Store 103"))
            storeIndex = 2;
        if(storeChosen.equals("Store 104"))
            storeIndex = 3;
        
        //if statements to set the item index
        if(itemChosen.equals("Tennis Shoes"))
            itemIndex = 0;
        if(itemChosen.equals("Sweaters"))
            itemIndex = 1;
        if(itemChosen.equals("Jeans"))
            itemIndex = 2;
        if(itemChosen.equals("Shorts"))
            itemIndex = 3;
        if(itemChosen.equals("Jackets"))
            itemIndex = 4;
        
        //populate text fields
        store.setText(storeChosen);
        item.setText(itemChosen);
        amount.setText(Integer.toString(storeInventory[itemIndex][storeIndex]));
            }//end action event
        
        
        }//end actionPerformed method
        
        
    }//end DisplayResultsListener class
    
    
}//end Jackson_OneStoreOneItem class
/*References:
 * Gaddis, Tony; Starting out With Java, From Control Structures Through
 * Objects, 5th ed.; Pearson, Upper Saddle River, NJ; 2005; book */