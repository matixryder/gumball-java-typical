public class GumballMachine {

    private int num_gumballs;
    private boolean has_quarter;

    public GumballMachine(int size) {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertQuarter(int coin) {
        if (coin == 25)
            this.has_quarter = true;
        System.out.pringln("you have 25 cents avaiable.");
        else if (coin == 50)
            this.has_quarter = true;
        System.out.println(" you have 50 cents avaiable.");
        else
        this.has_quarter = false;
        System.out.println("Please install a quarter to continue!");
    }

    public void insertOther()
    {
        int currentValue = 0;
        int curretChange = 0;

        if (currentValue = 50) {
            System.out.println("Thank you for playing")
            this.has_quarter = true
        }
        else if (currentValue < 50) {
            System.out.println("Please insert more coins until you reach 50 cents")
            this.has_quarter = true
        }
        else if (currentValue > 50) {
            currentChange = currentValue - 50;
            System.out.println("Here is your change" + currentChange + "cent(s)");
            this.has_quarter = true
        }

        else {
            this.has_quarter = false;
        }
    }

    public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter =  false;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else
    	{
    		System.out.println( "Please insert a quarter." ) ;
    	}
    }
}
