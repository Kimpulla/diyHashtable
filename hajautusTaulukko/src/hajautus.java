

import java.util.Arrays;
import java.util.Scanner;

public class hajautus {
	
	
	static String vapaa = "vapaa";
	static String poistettu = "poistettu";

	

	/**
	 * Metodilla <b> add </b> lisätään taulukon tyhjään kohtaan alkio.
	 * 
	 * @param array parametri taulukko, jota käsitellään.
	 * @param index on taulukon indeksi.
	 * @param value on taulukon aslkion arvo.
	 * @return palauttaa taulukon, johon lisätty uusi alkio.
	 */
	public static Object[] add(Object[] array, int index, Object value) {
				
		if (array[index].equals("null")  || array[index].equals(poistettu) ||  array[index].equals(vapaa) ) {
			
			array[index] = value;
		}	
		
		else {
			for ( int i = index; i < array.length; i++) {
				
				if ( (!array[i].equals("null") || !array[i].equals(poistettu) || !array[i].equals(vapaa)) && array[i] == array[array.length-1]) {
					i = -1;
				}
				else if ( (!array[i].equals("null") || !array[i].equals(poistettu) || !array[i].equals(vapaa)) && array[i] == array[0]) {/*do nothing*/}
				
				else if( array[i].equals(vapaa) || array[i].equals("null") || array[i].equals(poistettu)) {
					 array[i] = value;
					 break;
				 }
				 else {
					 System.err.println("Taulukossa ei ole tilaa!");
					 break;
				 }
			}
		}
		
		return array;
	}
		
	/**
	 * Metodilla <b> remove </b> poistetaan taulukosta alkio.
	 * 
	 * @param array parametri taulukko, jota käsitellään.
	 * @param index on taulukon indeksi.
	 * @param value on taulukon alkion arvo.
	 * @return palauttaa taulukon, josta on poistettu alkio ja merkitty "poistettu".
	 */
	public static Object[] remove(Object[] array, int index, Object value) {
		
		if ( array[index] == value) {
			
			array[index] = poistettu;
		}	
	 
		else {
			for ( int i = index; i < array.length; i++) {
				if (array[i] != value && array[i] == array[array.length-1]) {
					i = -1;
				}
				else if (array[i] != value) {/*do nothing*/}
				
				else if( array[i] == value) {	 
					 array[i] = poistettu;
					 break;
				 }
				else {
					 System.err.println("Taulukossa ei ole arvoa: " + value);
					 break;
					 }
			}
		}
	
	return array;	
	}
		
	/**
	 * <pre name="test">
	 * 
	 * #import java.util.Arrays;
	 * #import java.util.Scanner;
	 * 
	 *  Object[] testArray = {2, 5, 6, 4, 1};
	 *  Object[] testArray2 = {2, "vapaa", "null", "poistettu", 1};
	 * 
	 * // Testataan metodia add:
	 * 
	 *		Arrays.toString(hajautus.add(testArray2, 2, 333)) === "[2, vapaa, 333, poistettu, 1]"
	 *		Arrays.toString(hajautus.add(testArray2, 0, 12)) === "[2, 12, 333, poistettu, 1]"
	 *		Arrays.toString(hajautus.add(testArray2, 3, 222)) === "[2, 12, 333, 222, 1]"
	 *
	 *
	 * // Testataan metodia remove:
	 * 
	 * 		Arrays.toString(hajautus.remove(testArray, 2, 6)) === "[2, 5, poistettu, 4, 1]"
	 * 		Arrays.toString(hajautus.remove(testArray, 0, 4)) === "[2, 5, poistettu, poistettu, 1]"
	 * 		Arrays.toString(hajautus.remove(testArray, 1, 1)) === "[2, 5, poistettu, poistettu, poistettu]"
	 * 		
	 * 	
	 * 
	 * </pre>
	 * 
	 * @param args ei kaytossa.
	 */
	public static void main(String args[]) {
		
		int size;  	

		Scanner sc = new Scanner(System.in); 
		
			try {
				
			 

			System.out.print("Syötä taulukon koko: ");  

			size = sc.nextInt(); 
			
			Object[] array = new Object[size];  

			System.out.println("Syötä taulukolle alkioita: " + "väliltä [ " + "0 - " + size + " ], tyhjä arvo saadaan syöttämällä: " + null );  

					
			for (int i = 0; i < size; i++) {
				
				System.out.println("indeksi: "+ i);
				
				if (sc.hasNextInt()) {
					array[i] = sc.nextInt();
				}
				else if (sc.hasNext()) {
					array[i] = sc.next();
				}
			}
		
			while(true) {
	
			System.out.println("Valitse ja kirjoita toiminto, jonka haluat suorittaa taulukolle: add, remove tai exit ");
			
			String process = sc.next();
			
			if (process.equals("add")) {
				
				System.out.println("Anna lisättävän alkion indeksi: ");
				int index = sc.nextInt();
				System.out.println("Anna lisättävän alkion arvo: ");
				int value = sc.nextInt();
				
				System.out.println("Taulukkosi: " + Arrays.toString(add(array, index, value)));
			}
			
			else if (process.equals("remove")) {
				
				System.out.println("Anna poistettavan alkion indeksi: ");
				int index = sc.nextInt();
				System.out.println("Anna poistettavan alkion arvo: ");
				Object value = sc.nextInt();
				
				System.out.println("Taulukkosi: " + Arrays.toString(remove(array, index, value)));
			}
			else if (process.equals("exit")) {
				
				System.out.println("Suljetaan..: ");
				sc.close();
			}
			
			}
			
			}
			
			catch (Exception e) {}
			
		sc.close();
		}
	
}

