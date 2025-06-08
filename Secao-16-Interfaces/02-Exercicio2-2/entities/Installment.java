package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    // Formatter para exibir a data no formato dd/MM/yyyy
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dueDate;
    private Double amount;

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Installment{" +
                "dueDate=" + dueDate.format(fmt) +
                ", amount=" + String.format("%.2f", amount) +
                '}';
    }
}
