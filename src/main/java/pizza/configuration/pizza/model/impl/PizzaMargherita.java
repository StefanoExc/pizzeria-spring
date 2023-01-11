package pizza.configuration.pizza.model.impl;

import pizza.configuration.pizza.model.Pizza;

public class PizzaMargherita implements Pizza {
    private int id;
    private int prezzo;
    private int calorie;
    private String ingredienteAggiunto;

    public PizzaMargherita() {
    }

    public PizzaMargherita(int id, int prezzo, int calorie, String ingredienteAggiunto) {
        this.id = id;
        this.prezzo = prezzo;
        this.calorie = calorie;
        this.ingredienteAggiunto = ingredienteAggiunto;
    }    

    @Override
    public String toString() {
        return "PizzaMargherita [id=" + id + ", prezzo=" + prezzo + ", calorie=" + calorie + ", ingredienteAggiunto="
                + ingredienteAggiunto + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public String getIngredienteAggiunto() {
        return ingredienteAggiunto;
    }

    public void setIngredienteAggiunto(String ingredienteAggiunto) {
        this.ingredienteAggiunto = ingredienteAggiunto;
    }

    @Override
    public void printPizzas() {
        System.out.println("PizzaMargherita [id=" + id + ", prezzo=" + prezzo + ", calorie=" + calorie + ", ingredienteAggiunto="
        + ingredienteAggiunto + "]");

    }
}
