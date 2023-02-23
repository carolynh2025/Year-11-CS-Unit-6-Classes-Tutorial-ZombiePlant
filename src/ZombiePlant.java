public class ZombiePlant {

    private int maximumPotency;
    private int numTreatments;

    public ZombiePlant(int maximumPotency, int numTreatments){
        this.maximumPotency = maximumPotency;
        this.numTreatments = numTreatments;
    }

    public int treatmentsNeeded(){
        return numTreatments;
    }

    public int getPotencyRequired() {
        return maximumPotency;
    }

    public boolean isDangerous(){
        if (numTreatments > 0){
            return true;
        }
        else
            return false;
    }

    public void treat(int potency){
        if (potency <= maximumPotency && potency > 0){
            if (isDangerous()){
                numTreatments--;
            }
        }
        if (potency > maximumPotency){
            numTreatments++;
        }

    }

}