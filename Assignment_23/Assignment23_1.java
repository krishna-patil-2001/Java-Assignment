// 1. write a program which displays ASCII table . Table contains symbol, Decimal, Hexadecimal and Octal representation of every member from 0 to 255.


class ASCIITable
{
    void DisplayASCII()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %-8s | %-8s | %-11s | %-7s |\n", "Symbol", "Decimal", "Hexadecimal", "Octal");
        System.out.println("-------------------------------------------------------------");

        for (int iCnt = 0; iCnt <= 255; iCnt++)
        {
            String symbol;

            if (iCnt < 32 || iCnt == 127) // Non-printable ASCII
            {
                switch (iCnt)
                {
                    case 0:  symbol = "NUL"; break;
                    case 1:  symbol = "SOH"; break;
                    case 2:  symbol = "STX"; break;
                    case 3:  symbol = "ETX"; break;
                    case 4:  symbol = "EOT"; break;
                    case 5:  symbol = "ENQ"; break;
                    case 6:  symbol = "ACK"; break;
                    case 7:  symbol = "BEL"; break;
                    case 8:  symbol = "BS"; break;
                    case 9:  symbol = "TAB"; break;
                    case 10: symbol = "LF"; break;
                    case 11: symbol = "VT"; break;
                    case 12: symbol = "FF"; break;
                    case 13: symbol = "CR"; break;
                    case 14: symbol = "SO"; break;
                    case 15: symbol = "SI"; break;
                    case 16: symbol = "DLE"; break;
                    case 17: symbol = "DC1"; break;
                    case 18: symbol = "DC2"; break;
                    case 19: symbol = "DC3"; break;
                    case 20: symbol = "DC4"; break;
                    case 21: symbol = "NAK"; break;
                    case 22: symbol = "SYN"; break;
                    case 23: symbol = "ETB"; break;
                    case 24: symbol = "CAN"; break;
                    case 25: symbol = "EM"; break;
                    case 26: symbol = "SUB"; break;
                    case 27: symbol = "ESC"; break;
                    case 28: symbol = "FS"; break;
                    case 29: symbol = "GS"; break;
                    case 30: symbol = "RS"; break;
                    case 31: symbol = "US"; break;
                    case 127:symbol = "DEL"; break;
                    default: symbol = ""; break;
                }
            }
            else
            {
                symbol = String.valueOf((char) iCnt); // Printable ASCII
            }

            System.out.printf("| %-8s | %-8d | %-11s | %-7s |\n",
                    symbol, iCnt, Integer.toHexString(iCnt).toUpperCase(), Integer.toOctalString(iCnt));
        }

        System.out.println("-------------------------------------------------------------");
    }
}

class Assignment23_1
{
    public static void main(String[] args)
    {
        ASCIITable obj = new ASCIITable();
        obj.DisplayASCII();
    }
}