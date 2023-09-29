// See https://aka.ms/new-console-template for more information
using System;

namespace P_3
{
    internal class Promedio
    {
        static void Main(String[] args)
        {
            int C1, C2, C3, C4, C5, C6;
            float promedio;
            string nombre;
            Console.Write("Escribe tu calificacion 1: ");
            C1 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe tu calificacion 2: ");
            C2 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe tu calificacion 3: ");
            C3 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe tu calificacion 4: ");
            C4 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe tu calificacion 5: ");
            C5 = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe tu calificacion 6: ");
            C6 = Convert.ToInt32(Console.ReadLine());
            // Paso - Calcula promedio
            promedio = ( C1 + C2 + C3 + C4 + C5 + C6 ) / 6;
            // Paso - Imprima el resultado
            Console.WriteLine("Tu promedio es: " + promedio);

        }
    }
}
