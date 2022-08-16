
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition){
        int euros = this.euros + addition.euros();
        int cents = this.cents + addition.cents();
 
        if (cents > 99) {
            cents = cents - 100;
            euros = euros + 1;
        }

        Money newMoney=new Money(euros,cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros>compared.euros){
            return false;
        }else if((this.euros==compared.euros)&&this.cents>compared.cents){
            return false;
        }
        return true;
    }

    public Money minus(Money decreaser){
        
        if(this.lessThan(decreaser)){
            return new Money(0, 0);
        }

        double result=((double)this.euros+((double)this.cents/100))-((double)decreaser.euros+((double)decreaser.cents/100));
        int resultCents = (int)((Math.round((result % 1)*100.0)/100.0)*100);
        int resultEuros = (int)(result - (result % 1));

        Money diffMoney=new Money(resultEuros, resultCents);
        return diffMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }



}
