
using System;
namespace P_2
{
    class Suma
    {
        static void Main()
        {
            /*int A = 16, B = 25, Suma;
            Suma = A + B;
            Console.WriteLine(Suma);*/
            Console.WriteLine("Bienvenido");
            Console.WriteLine("Ingresa el numero de operacion a realizar: \n 1 = Suma. \n 2 = Resta. \n 3 = Multiplicación. \n 4 = Divición.");
            int Op;
            Op = Int32.Parse(Console.ReadLine());
            Console.WriteLine("Ingresa el primer numero: ");
            if (Op == 1)
            {
                int Num1;
                Num1 = Int32.Parse(Console.ReadLine());
                Console.WriteLine("Ingresa el segundo numero: ");
                int Num2;
                Num2 = Int32.Parse(Console.ReadLine());
                int Suma;
                Suma = Num1 + Num2;
                Console.Write($"La suma es igual a: {Suma}");
            }
            else if (Op == 2)
            {
                int Num1;
                Num1 = Int32.Parse(Console.ReadLine());
                Console.WriteLine("Ingresa el segundo numero: ");
                int Num2;
                Num2 = Int32.Parse(Console.ReadLine());
                int Resta;
                Resta = Num1 - Num2;
                Console.Write($"La resta es igual a: {Resta}");
            }
            else if (Op == 3)
            {
                int Num1;
                Num1 = Int32.Parse(Console.ReadLine());
                Console.WriteLine("Ingresa el segundo numero: ");
                int Num2;
                Num2 = Int32.Parse(Console.ReadLine());
                int Multiplicacion;
                Multiplicacion = Num1 * Num2;
                Console.Write($"La multiplicación es igual a: {Multiplicacion}");
            }
            else if (Op == 4)
            {
                int Num1;
                Num1 = Int32.Parse(Console.ReadLine());
                Console.WriteLine("Ingresa el segundo numero: ");
                int Num2;
                Num2 = Int32.Parse(Console.ReadLine());
                int Divicion;
                Divicion = Num1 / Num2;
                Console.Write($"La divición es igual a: {Divicion}");
            }else
            {
                Console.WriteLine("Ingresa un numero de operación");
            }
        }
    }
}
