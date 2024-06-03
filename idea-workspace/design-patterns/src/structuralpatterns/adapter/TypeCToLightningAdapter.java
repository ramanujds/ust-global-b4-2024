package structuralpatterns.adapter;

public class TypeCToLightningAdapter implements LightningCharger{

    private AndroidPhone androidPhone;

    public TypeCToLightningAdapter(AndroidPhone androidPhone){
        this.androidPhone=androidPhone;
    }



    public void chargeWithLightning() {
        System.out.println("TypeCToLightningAdapter converts Type-C to Lightning");
        androidPhone.charge();
    }
}
