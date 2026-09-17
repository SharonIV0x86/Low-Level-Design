class InvoiceProcessor {
    public double calculateTotal(String region, double amount) {
        if (region.contains("India")) {
            return amount + amount * 0.18;
        } else if (region.contains("China")) {
            return amount + amount * 0.12;
        } else {
            return amount + amount * 0.05;
        }
    }
}