using System;
namespace p5_u5;
class Contador
{
    static void Main(string[] args)
    {
        string p = "";
        Console.Write("Ingrese una palabra: ");
        p = Console.ReadLine();
        Console.WriteLine(p + " tiene: " + palabra(p) + " letras");
    }
    public static int palabra(string x)
    {
        int s = x.Length;
        return s;
    }
}