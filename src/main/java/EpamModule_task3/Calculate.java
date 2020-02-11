package EpamModule_task3;

public class Calculate {

    operations opr;
    public Calculate()
    {
        opr = new operations();
    }
    public float operation(char operator,int x, int y )
    {
        switch (operator)
        {
            case '+':{
                return this.opr.Add(x,y);
            }
            case '-':{
                return this.opr.Subtract(x,y);
            }
            case '*':{
                return this.opr.Multiply(x,y);
            }
            case '/':{
                return this.opr.Divide(x,y);
            }
        }
        System.out.println("no operator found");
        return -1;
    }

}
