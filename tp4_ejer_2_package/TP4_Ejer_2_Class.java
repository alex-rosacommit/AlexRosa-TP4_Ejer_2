package tp4_ejer_2_package;
import java.io.*;

public class TP4_Ejer_2_Class {

	public static void main(String[] args) {
		//Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe contener números. 
		//El programa debe escribir por consola la suma de esos números.
		String url = "numeros.txt";
		
		SumaNumArchivo(url);
	}
	
	public static void SumaNumArchivo(String urlArchivo) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String numerosEnArchivo = "";
		int sumaDeNumeros = 0;
		
		try {
			archivo = new File(urlArchivo);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String linea = "";
			
			while((linea = br.readLine()) != null) {
				numerosEnArchivo = numerosEnArchivo + linea;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		String[] numerosArray  = numerosEnArchivo .split("_");
		
		for(int i = 0;  i < numerosArray.length; i++) {
			sumaDeNumeros = sumaDeNumeros + Integer.parseInt(numerosArray[i]); ;
		}
		
		System.out.println("Los numeros en el archivo son los siguentes: \n" + numerosEnArchivo);
		
		System.out.println("=====================================================");
		
		System.out.println("El archivo se encuentra en: " + urlArchivo);
		
		System.out.println("=====================================================");
		
		System.out.println("La suma de los numeros es:  " + sumaDeNumeros);
		
	}

}
