class Test{

   
    
    public static void main(String[] args) {
    
        String url = "jdbc:derby:demo";

        try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("select count(*) from users")) {
        
            System.out.println(rs.getInt(1));
        
        }
    }
    
    }