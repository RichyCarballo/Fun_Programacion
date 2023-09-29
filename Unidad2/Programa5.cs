using System;

namespace MyApp // p5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int b, h; //b es la base y h es la altura;
            float area, perimetro;
            Console.Write("Esribe valor de b: ");
            b = Convert.ToInt32(Console.ReadLine());
            Console.Write("Esribe valor de h: ");
            h = Convert.ToInt32(Console.ReadLine());
            area = (b * h) / 2;
            Console.WriteLine("Area = " + area);
            perimetro = b + b + b;
            Console.WriteLine("Perimetro = " + perimetro);



        }
    }
}