
public class CalcularDni {
	
	char [] letraDNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	private char calculaLetraDni (int num_dni){
		char letra_dni;
		int n = num_dni % 23;
		letra_dni = letraDNI[n];
				
		return letra_dni;
	}
	
	/*
	private int calcularNumber(int num_dni){
		
		//int suma = num_dni.
		return 0;
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcularDni cd = new CalcularDni();
		char letra = cd.calculaLetraDni(76085243);
		System.out.println("Letra = " + letra);
	}

}
