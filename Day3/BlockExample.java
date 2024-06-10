class BlockExample 
{
	
    // Static block
    static {
        System.out.println("Static block is executed during class initialization.");
       
    }

    // Initializer block
    {
        System.out.println("Initializer block is executed before constructors.");
      
    }

    // Default constructor
    public BlockExample() {
        System.out.println("Default constructor called.");
    }

    
    public static void main(String[] args) {
        // Creating an object of BlockExample
       BlockExample example = new BlockExample();

      
    }
}
