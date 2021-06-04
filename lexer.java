import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
/**
 * Write a description of class Lexer here.
 *
 * @author (Kelvin Likollari)
 * @version (04.06.2021)
 */
public class Lexer {
    public static final int err = 0, 
    num = 1, 
    id = 2, 
    plus = 3, 
    minus = 4, 
    times = 5, 
    div = 6, 
    mod = 7,
    lp = 8, 
    rp = 9, 
    semico = 10, 
    where = 11, 
    and = 12, 
    eq = 13;
    public int token;
    public char idval;
    public int numval;
    private String line = "";
    private BufferedReader buf;
    
    
     

          Lexer()
          { buf = new BufferedReader(new InputStreamReader(System.in));
          }
          
          Lexer (String s)
            {
                buf = new BufferedReader (new StringReader (s));
            }

          void init()
          {
                do
                    try
                    {
                        line = buf.readLine ().trim ();
                        if (! line.endsWith (";"))
                            line = String.format ("%s;", line);
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error in input");
                        System.exit (1);
                    }
                while (line.length () == 0);
            
          }

          String getLine()
          { init();
            return(line);
          }

          void getToken()
          { if (line.length() == 0)
            token = err;
          else switch (line.charAt(0))
            { case '+':
              token = plus;
              line = line.substring(1).trim();
              break;
              case '-':
                token = minus;
                line = line.substring(1).trim();
                break;
              case '*':
                token = times;
                line = line.substring(1).trim();
                break;
              case '/':
                token = div;
                line = line.substring(1).trim();
                break;
              case '%':
                token = mod;
                line = line.substring(1).trim();
                break;
              case '(':
                token = lp;
                line = line.substring(1).trim();
                break;
              case ')':
                token = rp;
                line = line.substring(1).trim();
                break;
              case '=':
                token = eq;
                line = line.substring(1).trim();
                break;
              default:
                if (Character.isDigit(line.charAt(0)))
                { token = num;
                  numval = line.charAt(0) - '0';
                  int i = 1;
                  while (i<line.length()&&Character.isDigit(line.charAt(i)))
                  { numval = numval*10+line.charAt(i)-'0';
                    i++;
                  }
                  line = line.substring(i).trim();
                }
                else if (Character.isLowerCase(line.charAt(0)))
                { char c = line.charAt(0);
                  if (c == 'w' && line.length() >= 5 && line.charAt(1) == 'h' && line.charAt(2) == 'e' && line.charAt(3) == 'r' &&
                          line.charAt(4) == 'e')
                  { token = where;
                    line = line.substring(5).trim();
                  }
                  else if (c== 'a' && line.length() >= 3 && line.charAt(1) == 'n' && line.charAt(2) == 'd')
                  { token = and;
                    line = line.substring(3).trim();
                  }
                  else if (line.length() > 1 && Character.isLetter(line.charAt(1)))
                  { token = err;
                  }
                  else
                  { token = id;
                    idval = c;
                    line = line.substring(1).trim();
                  }
                }
                else
                  token = err;
            }
          }


}
