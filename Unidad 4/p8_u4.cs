using System;

class Program
{
    static void Main()
    {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Console.WriteLine("Números Pares:");
        foreach (int num in numeros)
        {
            if (EsPar(num))
            {
                Console.Write(num + " ");
            }
        }

        Console.WriteLine("\nNúmeros Impares:");
        foreach (int num in numeros)
        {
            if (!EsPar(num))
            {
                Console.Write(num + " ");
            }
        }
    }

    static bool EsPar(int numero)
    {
        return numero % 2 == 0;
    }
}
