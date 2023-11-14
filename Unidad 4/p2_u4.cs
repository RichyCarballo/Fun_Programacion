using System;

namespace U4programa2 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double[] calf = new double[10] { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
            double promedio = 0, suma = 0;

            for (int i = 0; i < 10; i++)
            {
                suma = suma + calf[i];
                promedio = suma / 10;
            }
            Console.WriteLine("El promedio de tus califiaciones es: " + promedio);
        }
    }
}