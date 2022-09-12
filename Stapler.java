/*
 * Name: Brandon Kirch
 * Date: 9/12/2022
 * Description: Create a stapler class that will follow the basic principles of operating a stapler
 */

public class Stapler
{

    //********Instance Variables********
    public int staples;		//how many staples in stapler
    public int capacity;		//how many staples it can hold
    public boolean closed;	//is stapler closed?
    //********Constructors********

    //Default constructor.
    //Set to: zero staples, capacity 250, closed.
    //Hint:  Write the default constructor here
    public Stapler(){
        staples = 0;
        capacity = 250;
        closed = new Boolean(true);
    }

    //Regular constructor.  Initialize instance variables with
    //provided values.  Assume user will use valid values for all.
    public Stapler(int staples, int capacity, boolean closed){
        this.staples = staples;
        this.capacity = capacity;
        this.closed = new Boolean(closed);
    }

    //Copy constructor.  Initializes stapler with values provided
    //from another stapler.  Assume "temp" stapler has valid values.
    public Stapler(Stapler temp){
        this.staples = temp.staples;
        this.capacity = temp.capacity;
        this.closed = temp.closed;
    }

    //********Mutator Methods (change values) ********

    //Close the stapler
    public void closeStapler(){
        closed = new Boolean(true);
    }

    //Open the stapler
    public void openStapler(){
        closed = new Boolean(false);
    }

    //Subtract a single staple.  The stapler can
    //staple only when already closed AND when it HAS STAPLES.
    //**Both** conditions **must** be true to staple.
    //HINT:  Requires one or more IF statements.
    public void staple(){
        if (closed == true){
            if (staples > 0){
                staples--;
            }
        }
    }

    //Increase staples up to the maximum capacity.
    //The stapler must already be OPEN to add staples.
    //HINT: Requires IF statement(s) to make sure stapler is already open
    //and to make sure you fill it up to, BUT NOT BEYOND capacity.
    public void addStaples(int moreStaples){
        if (closed == false){
            for (int i = 0; i < moreStaples; i++) {
                if (staples < capacity){
                    staples ++;
                }
            }
        }
    }


    //********Accessor Methods (return values) ********

    //returns number of staples
    public int numStaples(){
        return staples;
    }

    //returns capacity of stapler
    public int getCapacity(){
        return capacity;
    }

    //returns open/closed status of stapler
    public boolean isClosed(){
        return closed;
    }

    //*********Other Methods*********************
    //returns a string representing this stapler -
    // The string says "This stapler has room for x staples"
    // where x is the capcity minus the current number of staples
    // Hint:  Override the toString() method here

    public String toString(){
        int room = capacity - staples;
        return ("This stapler has room for " + room + " staples");
    }

}