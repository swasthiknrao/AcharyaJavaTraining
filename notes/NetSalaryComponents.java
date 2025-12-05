// declare a variable calculate  teh HRA Basix salery TA  Other allowance  TOtal salery  10% tax Deduct  ,  net saery after tax   deduction print net salery
public class NetSalaryComponents {
    public static void main(String[] args) {
        double s = 50000;
        double HRA = s * 0.20;
        double TA = s * 0.10;
        double OA = s * 0.15;

        double TS = s + HRA + TA + OA;
        double TD = TS * 0.10;
        double NS = TS - TD;
        System.out.println("Net Salery after tax deduction: " + NS);
    }
}