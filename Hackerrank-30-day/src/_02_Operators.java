public class _02_Operators {
    public static void main(String[] args) {
        double meat_cost = 10.25;
        int tip_percent = 17;
        int tax_percent = 5;
        new _02_Operators().solve(meat_cost, tip_percent, tax_percent);
        new _02_Operators().solve(12, 20, 8);
    }
    void solve(double meal_cost, int tip_percent, int tax_percent) {
        // google what the Math.round() actually does
        System.out.println(Math.round(meal_cost + 0.01 * tip_percent * meal_cost + 0.01d * tax_percent * meal_cost));
    }
}
