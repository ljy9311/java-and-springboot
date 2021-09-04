package classpart;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();

		order.orderNumber = "201803120001";
		order.ordererID = "abc123";
		order.orderDate = "2018년 3월 12일";
		order.ordererName = "홍길순";
		order.orderProductName = "PD345-12";
		order.shippingAddress = "서울시 영등포구 여의도동 20번지";

		System.out.println("주문 번호 : " + order.orderNumber);
		System.out.println("주문자 아이디 : " + order.ordererID);
		System.out.println("주문 날짜 : " + order.orderDate);
		System.out.println("주문자 이름 : " + order.ordererName);
		System.out.println("주문 상품 번호 : " + order.orderProductName);
		System.out.println("배송 주소 : " + order.shippingAddress);
	}
}
