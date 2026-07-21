abstract class ATM 
{
    abstract void withdraw();
    void message() 
    {
        System.out.println("Welcome to ATM");
    }
}
class SBIATM extends ATM 
{
	void withdraw()
	{
        System.out.println("Money Withdrawn");
    }
}
public class AbstractionExample 
{
    public static void main(String[] args)
    {
    	SBIATM a = new SBIATM();
    	a.message();
        a.withdraw();
    }
}