using System;

namespace MyApp // P4
{
    internal class Program 
    {
        static void Main(string[] args)
        {
           int y, a;
            float x;
            Console.Write("Escribe valor de y: ");
            y = Convert.ToInt32(Console.ReadLine());
            Console.Write("Escribe valor de a: ");
            a = Convert.ToInt32(Console.ReadLine());
            // PASO Calcular
            x = y + a + 3;
            Console.WriteLine("X = " + x);

           

        }
    }
}
