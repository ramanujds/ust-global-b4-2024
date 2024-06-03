package structuralpatterns.adapter;

public class AdapterPatternDemo {

    public static void main(String[] args) {

        AndroidPhone androidPhone = new AndroidPhone();

        androidPhone.charge();

        IPhone iPhone14 = new IPhone();

        TypeCToLightningAdapter adapter = new TypeCToLightningAdapter(androidPhone);
        adapter.chargeWithLightning();

    }

}
