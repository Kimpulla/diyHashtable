

import java.util.Arrays;
import java.util.Scanner;

public class hajautus {
	
	
	static String vapaa = "vapaa";
	static String poistettu = "poistettu";

	

	/**
	 * Metodilla <b> add </b> lis‰t‰‰n "jonoon" eli taulukkoon yksi alkio.
	 * 
	 * @param array parametri taulukko, jota k‰sitell‰‰n.
	 * @param number lis‰tt‰v‰ alkio.
	 * @return palauttaa taulukon, johon lis‰tty uusi alkio.
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
				
				else if( array[i].equals(vapaa) || array[i].equals("null") || array[i].equals(poistettu)) {
					 array[i] = value;
					 break;
				 }
//				 else {
//					 System.err.println("Taulukossa ei ole tilaa!");
//					 break;
//				 }
			}
		}
		
		return array;
	}
	
	
	
	/**
	 * Metodilla <b> remove </b> poistetaan "jonosta" eli taulukosta vanhin alkio.
	 * 
	 * @param array parametri taulukko, jota k‰sitell‰‰n.
	 * @return palauttaa taulukon, josta on v‰hennetty vanhin alkio.
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
				else if( array[i] == value) {	 
					 array[i] = poistettu;
					 break;
				 }
//				 else {
//					 System.err.println("Taulukon kohdassa [" + i +"] ei ole arvoa [" + value +"]");
//				 }
			}
		}
	
	return array;	
	}
	
	
	

	
	
	
	
	public static void main(String args[]) {
		
		int size;  	


			try {
				
			Scanner sc = new Scanner(System.in);  

			System.out.print("Syˆt‰ taulukon koko: ");  

			size = sc.nextInt(); 
			
			Object[] array = new Object[size];  

			System.out.println("Syˆt‰ taulukolle alkioita: " + "v‰lilt‰ [ " + "0 - " + size + " ], tyhj‰ arvo saadaan syˆtt‰m‰ll‰: " + null );  

					
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
	
			System.out.println("Taulukkosi: "+ Arrays.toString(array));
			System.out.println("Valitse ja kirjoita toiminto, jonka haluat suorittaa taulukolle: add, remove tai exit ");
			
			String process = sc.next();
			
			if (process.equals("add")) {
				
				System.out.println("Anna lis‰tt‰v‰n alkion indeksi: ");
				int index = sc.nextInt();
				System.out.println("Anna lis‰tt‰v‰n alkion arvo: ");
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
		
		}


		}

