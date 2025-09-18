package pedidosfarmaceuticosapp.model;
//deficiones 
public class Order {
    private String medicineName;
    private String medicineType;
    private int quantity;
    private String distributor;
    private boolean mainBranch;
    private boolean secondaryBranch;

    // Constructor, getters y setters
    public Order() {
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public boolean isMainBranch() {
        return mainBranch;
    }

    public void setMainBranch(boolean mainBranch) {
        this.mainBranch = mainBranch;
    }

    public boolean isSecondaryBranch() {
        return secondaryBranch;
    }

    public void setSecondaryBranch(boolean secondaryBranch) { //
        this.secondaryBranch = secondaryBranch;
    }
}
