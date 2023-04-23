package creatures;

public enum FoodType {
    MEAT(0.3), SUGAR(0.5), VEGETABLES(0.2), MIXED(0.25);

    final public Double nutritionRatio;

    FoodType(Double nutritionRatio) {
        this.nutritionRatio = nutritionRatio;
    }
}