class Test{

    public void process() { System.out.print("A,"); }
    
    public static void main(String[] args) {
    
    try { new b().process(); }
    
    catch (Exception e) { System.out.println("Exception"); } }
    
    }
    
    class b extends Test {
    
    public void process() {
    
    System.out.print("B");
    
    }
    
    }