package Convertor;

import java.util.ArrayList;
import java.util.HashMap;

import com.opensymphony.xwork2.ActionSupport;

public class Currencyconv extends ActionSupport {

	private int from;
	private int to;
	private double amount, result = 0;

	private ArrayList<String> Nation1 = new ArrayList();

	private double[][] factor = new double[][] {
			{ 1, 1.96269, 0.01563, 0.01017, 0.05743 },
			{ 0.520488, 1, 0.008113, 0.0052823, 0.02981 },
			{ 63.9323, 123.2595, 1, 0.6511, 6.6730 },
			{ 98.3019, 189.2791, 1.5362, 1, 5.6436 },
			{ 17.3807, 33.5397, 0.272262, 0.1772, 1 } };
	HashMap<Integer, String> Nation = new HashMap();

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public ArrayList<String> getNation1() {
		Nation1.add("INDIA Rs");
		Nation1.add("CHINA Yen");
		Nation1.add("US Dollar");
		Nation1.add("GB Pounds");
		Nation1.add("UAE Dirhams");
		return Nation1;
	}

	public String execute() {
		result = amount * factor[from][to];

		System.out.println("From: " + from);
		System.out.println("To: " + to);
		System.out.println("Amount: " + amount);
		System.out.println("Result: " + result);
		System.out.println("Factor: " + factor[from][to]);
		return "success";
	}

	public HashMap<Integer, String> getNation() {
		Nation.put(0, "INR");
		Nation.put(1, "YEN");
		Nation.put(2, "USD");
		Nation.put(3, "GBP");
		Nation.put(4, "UAE");
		return Nation;
	}

	public double getAmount() {
		System.out.println("GetAmount" + amount);
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getResult() {
		System.out.println("Get Result" + result);
		return result;
	}

	public String getMessage() {
		return " <span class='amount'>"
				+ amount
				+ "</span> <span class='unit'>"
				+ getNation().get(from)
				+ "</span> <span class='unit'> = </span>  <span class='amount'>"
				+ result + "</span> <span class='unit'>" + getNation().get(to)
				+ "</span>";
	}
}
