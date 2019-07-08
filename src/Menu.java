public class Menu {
    private int MenuNumber;   //count item menu
    private int NIterm = 0;   //Select item menu

/*
    //private ConsoleKeyInfo NN;  //информация о нажатой клавише

    //header и footer для главного меню
    private String Hearder = "Выберите номер задачи, для решения:";
    private String Footer = "Для выхода из программы нажмите 'Esc'";

    //array menu items
    String[] MenuItem = new String[]
            {
                    "1 - Search max numbers",
                    "2 - Triangle type definition",
                    "3 - Discounted pricing",
                    "4 - Calculation of factorial",
                    "5 - The remainder of the division",
                    "6 - Replacing the negative elements of the array",
                    "7 - Matrix rotation",
                    "8 - Determining the number of special elements of the array",
                    "9 - String calculation",
                    "10- Encryption text"
            };

    public void SwitchMenu()
    {
        MenuNumber = MenuItem.length;
        PrintMenu();
        NN = Console.ReadKey();
        switch (NN.Key)
        {
            case ConsoleKey.Escape:
                return;
            case ConsoleKey.UpArrow:
                if (NIterm > 0)
                    NIterm--;
                else
                    NIterm = MenuNumber - 1;
                SwitchMenu();
                break;
            case ConsoleKey.DownArrow:
                if (NIterm < MenuNumber - 1)
                    NIterm++;
                else
                    NIterm = 0;
                SwitchMenu();
                break;
            case ConsoleKey.Enter:
            default:
                SwitchMenu();
                break;
        }
    }

    private void PrintMenu()
    {
        Console.Clear();
        //печать зеленым цветом
        Console.ForegroundColor = ConsoleColor.Green;
        Console.WriteLine($"{Hearder}\n");
        Console.ForegroundColor = ConsoleColor.Gray;

        for (int i = 0; i < MenuNumber; i++)
        {
            if (i == NIterm)
                Console.ForegroundColor = ConsoleColor.White;
            Console.WriteLine($"{i++}. {MenuItem[i]}");
            Console.ForegroundColor = ConsoleColor.Gray;
        }
        Console.ForegroundColor = ConsoleColor.Green;
        Console.WriteLine($"{Footer}\n");
    }

*/
}
