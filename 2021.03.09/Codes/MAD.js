public class TipCal{
    private float tip;
    private float bill;
    
    public tipCal(float newTip, float newBill){
        setTip(newTip);
        setBill(newBill);
    }


    public float getTip(){
        reurn tip;
    }
    
    public float getBill(){
        return bill;
    }
    
    public void setTip(float newTip){
        if(newTip > 0){
            tip = newTip;
        }
    }
    
    public void setBill(float newBill){
         if(newBill > 0){
            bill = newBill;
        }
    }
    
    
    
    public float tipAmount(){
    
         return bill*tip;
    }
    
    public float totalAmount(){
        return bill+tipAmount();
    }

}