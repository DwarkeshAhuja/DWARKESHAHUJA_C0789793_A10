package com.DWARKESHAHUJA_C0789793_A10;

public abstract class SalesPerson {
    double sales;
    double advance;

    public SalesPerson(double sales, double advance) {
        this.sales = sales;
        this.advance = advance;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    abstract void display();
}
