package utils;

import java.util.HashMap;

import core.Category;
import core.Pet;
import customException.InvalidInputException;

public class PetsUtils {
	
	
	public static boolean checkAdmin(String id,String pass)throws InvalidInputException{
		if(id.equals("admin") && pass.equals("admin"))
			return true;
		return false;
		
	}
	
	public static boolean checkUser(String id1,String pass1)throws InvalidInputException{
		if(id1.equals("c1") && pass1.equals("c1"))
			return true;
		return false;
		
	}
	
	 public static void checkForDuplicatePid(int petId,HashMap<Integer, Pet> petsHmap) throws InvalidInputException{
		 
		
		 if(petsHmap.containsKey(petId)) {
			 throw new InvalidInputException("Duplicate PetId detected");
		 }
		 System.out.println("No duplicate petid found");
		 return;
	}
	 
	 
		public static void checkPetId(Integer id, HashMap<Integer, Pet> pets) throws InvalidInputException{
			if(pets.containsKey(id)) {
				System.out.println("Pet Id found");
				return;
			}
			throw new InvalidInputException("No pet Id found");
		}
		
	
		public static boolean checkPetStock(int petId, int quantity, HashMap<Integer, Pet> petsHmap) throws InvalidInputException{
			Pet p = petsHmap.get(petId);
			if(p.getStocks()<quantity)
				throw new InvalidInputException("Pet out of stock");
			System.out.println("Pet in stock");
			return true;
				
		}
	 
	 
	public static Category parseAndValidateCategory(String category) throws InvalidInputException{
		return Category.valueOf(category.toUpperCase());
	}
	
	
	 
	 
	 
}



