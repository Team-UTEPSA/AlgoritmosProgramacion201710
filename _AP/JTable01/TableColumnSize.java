import javax.swing.*; 

class TableColumnSize extends JFrame { 
    private static int offset = 50; 

    public TableColumnSize(int resizeMode, String title) { 
        // Dummy data for table. 
        String[][] tableData = { 
            {"data 1", "data 2", "data 3", "data 4"}, 
            {"data 1", "data 2", "data 3", "data 4"}, 
            {"data 1", "data 2", "data 3", "data 4"}, 
            {"data 1", "data 2", "data 3", "data 4"}, 
            {"data 1", "data 2", "data 3", "data 4"}, 
            {"data 1", "data 2", "data 3", "data 4"}}; 
        String[] headerData = {"Header 1", "Header 2", "Header 3", "Header 4"}; 

        // Set the frame's title and position. 
        setTitle(title); 
        offset += 50; 
        setLocation(offset,offset); 
        setSize(300,150); 

        // Create the JTable using the dummy data. 
        JTable table = new JTable(tableData, headerData); 

        // This is the important part of this example: Set the autoResizeMode 
        // of the JTable. 
        table.setAutoResizeMode(resizeMode); 

        // Create a scroll pane and insert the JTable into the scroll pane. 
        JScrollPane scroll = new JScrollPane(table); 

        getContentPane().add(scroll); 
    } 

    public static void main(String[] args) { 
        // Create 5 TableColumnSize frames - each demonstrating a 
        // different value of the autoResizeMode property. 
        (new TableColumnSize(JTable.AUTO_RESIZE_OFF,"AUTO_RESIZE_OFF")) 
.setVisible(true); 
        (new TableColumnSize(JTable.AUTO_RESIZE_ALL_COLUMNS, 
        "AUTO_RESIZE_ALL_COLUMNS")) 
.setVisible(true); 
        (new TableColumnSize(JTable.AUTO_RESIZE_LAST_COLUMN, 
        "AUTO_RESIZE_LAST_COLUMN")) 
.setVisible(true); 
        (new TableColumnSize(JTable.AUTO_RESIZE_NEXT_COLUMN, 
        "AUTO_RESIZE_NEXT_COLUMN")) 
.setVisible(true); 
        (new TableColumnSize(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS, 
        "AUTO_RESIZE_SUBSEQUENT_COLUMNS")) 
.setVisible(true); 
    } 
} 