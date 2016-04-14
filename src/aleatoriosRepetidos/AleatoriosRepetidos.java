package aleatoriosRepetidos;

import java.util.Scanner;

public class AleatoriosRepetidos
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final int orden = 4;
		int[][] cuadrado = new int[orden][orden];
		boolean repetido = false;
		for(int i = 0; i < orden; i++) // Se cargan los números del array
		{
			for(int j = 0; j < orden; j++)
			{
				System.out.print("Introduce número: ");
				cuadrado[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for(int i = 0; i < orden; i++) // Se muestra el array
		{
			for(int j = 0; j < orden; j++)
			{
				System.out.print(cuadrado[i][j] + "\t");
			}
			System.out.println();
		}
		for(int i = 0; i < orden && !repetido; i++)
		{
			for(int j = 0; j < orden && !repetido; j++)
			{
				for(int fila = 0; fila < orden && !repetido; fila++)
				{
					for(int col = 0; col < orden && !repetido; col++)
					{
						if(cuadrado[i][j] == cuadrado[fila][col] && (i != fila || j != col))
						{
							repetido = true;
						}
					}
				}
			}
		}
		if(repetido)
		{
			System.out.println("Hay número/s repetido/s.");
		}
		else
		{
			System.out.println("No se ha repetido ningún número.");
		}
	}
}

