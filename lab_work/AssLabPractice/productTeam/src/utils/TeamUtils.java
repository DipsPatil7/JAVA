package utils;

import java.time.LocalDate;
import java.util.HashMap;

import static java.time.LocalDate.parse;
import CustomException.customException;
import core.ProductItem;

public class TeamUtils {
	
	public static ProductItem parseAndValidateId(String id,HashMap<String,ProductItem> hmap ) throws customException {
		ProductItem p = new ProductItem(id);
		if(hmap.containsKey(p))
			throw new customException("Duplicate item code");
		return hmap.get(p);
		
		
	}
	
	public static void checkForDuplicateId(String pid, HashMap<String,ProductItem> hmap) throws customException{
		ProductItem p = new ProductItem(pid);
		if(hmap.containsKey(p))
			throw new customException("Duplicate item code");
		System.out.println("No dup");
		
		
	}
	

	
	public static LocalDate parseAndValidateShipmentDate(String date) throws customException {
		LocalDate d = parse(date);
		return d;
		
		
		
	}

	
	/*public static LocalDate parseAndValidateManufactureDate(String date) throws InvalidInputException {
		LocalDate d1 = parse(date);
		// => parsing successful , now do the validation
		if (d1.isAfter(of(2020, 1, 1)))
			return d1;// validation methos rets parsed n validated LocalDate to the tester
		// => old vehicle , throw custom exc
		throw new InvalidInputException("Manufacture date must be after 1st Jan 2020");
	}*/
}
