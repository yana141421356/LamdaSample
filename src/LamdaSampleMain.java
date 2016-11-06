import java.util.ArrayList;
import java.util.List;

public class LamdaSampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Runnable r1 = () -> new LamdaSample().Run1();
//		Runnable r2 = () -> new LamdaSample().Run2();

		Runnable r1 = () -> Run1();
		Runnable r2 = () -> Run2();
		
		List<Object> list = new ArrayList<Object>();
		list.add( r1 );
		list.add( r2 );
		
		for( Object o : list )
		{
			run1( (Runnable)o );
		}
		
	}

	public static void run1( Runnable r )
	{
		r.run();
	}
	
	public static void Run1()
	{
		System.out.println("Run1!");
	}

	public static void Run2()
	{
		System.out.println("Run2!");
	}
}
