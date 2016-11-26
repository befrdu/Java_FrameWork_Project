import java.time.LocalDate;

public class Application1 {

	
	public static void main(){
		LocalDate today = LocalDate.now(  );
		LocalDate firstOfThisMonth = today.withDayOfMonth( 1 );
		LocalDate firstOfLastMonth = firstOfThisMonth.minusMonths( 1 );
		LocalDate endOfLastMonth = firstOfThisMonth.minusDays( 1 );
		
		System.out.println(today);
		System.out.println(firstOfThisMonth);
		System.out.println(firstOfLastMonth);
		System.out.println(endOfLastMonth);
		
		System.out.println(LocalDate.now().minusMonths(1).getMonth());
		LocalDate lastyear = LocalDate.of(2017, 1, 1);
		System.out.println(lastyear.minusMonths(1));
	}
	
}
