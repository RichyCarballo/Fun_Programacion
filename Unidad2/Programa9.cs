using System;

namespace p9 // Note: actual namespace depends on the project name.
{
    internal class Calculadora
    {
        static void Main(string[] args)
        {
            int a, b, c,d, e, f;
            Console.WriteLine("Introduce primer valor");
            a = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Introduce segundo valor");
            b = Convert.ToInt32(Console.ReadLine());

            c = a + b;
            Console.WriteLine("La suma es igual a :" + c);
            d = a - b;
            Console.WriteLine("La resta es igual a :" + d);
            e = a * b;
            Console.WriteLine("La multiplicación es igual a :" + e);
            f = a / b;
            Console.WriteLine("La división es igual a :" + f);
        }
    }
}