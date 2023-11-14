using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double f=0 , k = 0;
            int temperaturaT;
            Console.WriteLine("Ingrese las temperaturas: ");
            temperaturaT = Convert.ToInt32(Console.ReadLine());

            double[] temperaturaC = new double[temperaturaT];

            for (int i = 0; i < temperaturaT; i++)
            {
                Console.WriteLine("Ingrese la temperatura en Celsius" + i +":");
                temperaturaC[i] = Convert.ToDouble(Console.ReadLine());

                f = temperaturaC[i] * (9 / 5) + 32;
                Console.WriteLine("Temperatura en Farenheit: " + f);

                k = temperaturaC[i] + 273.15;
                Console.WriteLine("Temperatura en Kelvin: "+k);

            }
           

               
        }
    }
}
