import javax.swing.*; 

class ScrollBarTest extends JFrame { 
    private static int offset = 50; 

    public ScrollBarTest(int horizPolicy, int vertPolicy, String title) { 
        // Dummy data for table. 
        String[][] tableData = { 
            {"data 1", "data 2", "data 3", "data 4"}, 
            {"data 1", "data 2", "data 3", "data 4"}, 
            {"data 1", "data 2", "data 3", "data 4"}, 
            {"data 1", "data 2", "data 3", "data 4"}, 
            {"data 1", "data 2", "data 3", "data 4"}, 
            {"data 1", "data 2", "data 3", "data 4"}}; 
        String[] headerData = {"Header 1", "Header 2", "Header 3", 
            "Header 4"}; 

        // Set the frame's title and position. 
        setTitle(title); 
        offset += 50; 
        setLocation(offset,offset); 
        setSize(300,150); 

        // Create the JTable using the dummy data. 
        JTable table = new JTable(tableData, headerData); 

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 

        // Create a scroll pane and insert the JTable into the scroll pane. 
        JScrollPane scroll = new JScrollPane(table); 

        // This is the important part of this example: Set the ScrollBar Policies 
        // of the JTable. 
        scroll.setHorizontalScrollBarPolicy(horizPolicy); 
        scroll.setVerticalScrollBarPolicy(vertPolicy); 

        getContentPane().add(scroll); 
    } 

    public static void main(String[] args) { 
        // Create 6 ScrollBarTest frames - each demonstrating a different 
        // value of the horizontalScrollBarPolicy and verticalScrollBarPolicy 
        // properties. 
       (new ScrollBarTest(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS,JScrollPane. 
VERTICAL_SCROLLBAR_NEVER,"HORIZONTAL_SCROLLBAR_ALWAYS")).setVisible(true); 
        (new ScrollBarTest(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED,JScrollPane. 
VERTICAL_SCROLLBAR_NEVER,"HORIZONTAL_SCROLLBAR_AS_NEEDED")).setVisible(true); 
        (new ScrollBarTest(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER,JScrollPane. 
VERTICAL_SCROLLBAR_NEVER,"HORIZONTAL_SCROLLBAR_NEVER")).setVisible(true); 
        (new ScrollBarTest(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER,JScrollPane. 
VERTICAL_SCROLLBAR_ALWAYS,"VERTICAL_SCROLLBAR_ALWAYS")).setVisible(true); 
        (new ScrollBarTest(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER,JScrollPane. 
VERTICAL_SCROLLBAR_AS_NEEDED,"VERTICAL_SCROLLBAR_AS_NEEDED")).setVisible(true); 
        (new ScrollBarTest(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER,JScrollPane. 
VERTICAL_SCROLLBAR_NEVER,"VERTICAL_SCROLLBAR_NEVER")).setVisible(true); 
    } 
} 