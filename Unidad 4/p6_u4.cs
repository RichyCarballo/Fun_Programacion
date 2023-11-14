using System;

class Program
{
    static void Main()
    {
        int[] numeros = { 4, 2, 9, 1, 8, 0, 3, 6 };

        int[] arregloOrdenado = OrdenarArreglo(numeros);

        Console.WriteLine("Arreglo Ordenado:");
        foreach (int num in arregloOrdenado)
        {
            Console.Write(num + " ");
        }
    }

    static int[] OrdenarArreglo(int[] arreglo)
    {
        int[] arregloOrdenado = new int[arreglo.Length];
        Array.Copy(arreglo, arregloOrdenado, arreglo.Length);

        for (int i = 0; i < arregloOrdenado.Length - 1; i++)
        {
            for (int j = 0; j < arregloOrdenado.Length - 1 - i; j++)
            {
                if (arregloOrdenado[j] > arregloOrdenado[j + 1])
                {
                    int temp = arregloOrdenado[j];
                    arregloOrdenado[j] = arregloOrdenado[j + 1];
                    arregloOrdenado[j + 1] = temp;
                }
            }
        }

        return arregloOrdenado;
    }
}