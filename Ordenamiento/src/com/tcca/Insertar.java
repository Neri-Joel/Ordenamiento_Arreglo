package com.tcca;
public class Insertar {
	public static void main(String[] args) {
		int A[]= {7, 1, 9, 2, 8, 6, 0};
		mostrarArreglo(A);
		OrdenarIngreso(A);
		mostrarArreglo(A);
	}
	
	public static void OrdenarIngreso (int a []) {
		int clave, i, N=a.length;
		for (int j=1; j<N; j++) {
			clave = a[j];
			i = j - 1;	
			while (i>-1 && a[i] > clave) {
				a[i+1] = a[i];
				i = i-1;
			}			
			a[i+1] = clave;				
	}

}	
	public static void mostrarArreglo(int a[]) {
		for (int i=1; i<=a.length; i++ ) {
			System.out.print(a[i-1]+" ");
		}
		System.out.print("\n");
	}
}

