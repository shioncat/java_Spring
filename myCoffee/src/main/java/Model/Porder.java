package Model;

public class Porder {
	private Integer id;//null
	private String desk;
	private Integer A; //A餐
	private Integer B; //B餐
	private Integer C; //C餐
	private Integer sum;
	public Porder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Porder(String desk, Integer a, Integer b, Integer c) {
		super();
		this.desk = desk;
		A = a;
		B = b;
		C = c;
		sum=A*150+B*180+C*80;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesk() {
		return desk;
	}
	public void setDesk(String desk) {
		this.desk = desk;
	}
	public Integer getA() {
		return A;
	}
	public void setA(Integer a) {
		A = a;
	}
	public Integer getB() {
		return B;
	}
	public void setB(Integer b) {
		B = b;
	}
	public Integer getC() {
		return C;
	}
	public void setC(Integer c) {
		C = c;
	}
	public Integer getSum() {
		sum=A*150+B*180+C*80;
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
	
	
	

}