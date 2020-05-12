package com.yedam.classes.inherit;

public class DmbCellPhone extends CellPhone { //CellPhone을 상속받는 자식 클래스
	int channel;

	public DmbCellPhone(String model, String color) {
		super(model, color); //오른쪽 마우스 -소스-제너레이터 컨스트레이터 슈퍼 ,부모 생성자를 불러옴(super=>CellPhone(a,b)), 따로 정의를 안했지만 부모 클래스에 상속 되기 때문에 정의 하지 않아도 된다.
	}
	public DmbCellPhone(String model, String color, int channel) { // 부모클래스에 채널을 추가함.
		super(model, color); 
		this.channel = channel;
	}
	
	@Override //없어도 되지만 문법 체크를 하기 위해서 써줌, 부모클래스가 가지고 있는 메소를 자식클래스에서 재정의 하겠다는 뜻, DmbExample에서 출력 하니 오버라이딩(재정의)한 것으로 출력됨
	void powerOn() { // 재정의를 실행 시키고 타입을 다르게((int a)를 넣으면)하면 재정의가 아니라면서 오류가 뜬다.
		System.out.println("DMB 폰의 전원을 켭니다");
	}
	void powerOn(int a) {//이거는 재정의가 아니라 자식 클래스에서 새로 메소드 하나를 만든 것이다.
		System.out.println(a+"전원을 끕니다");
	}
	@Override
	void powerOff() {
		System.out.println("DMB 폰의 전원을 끕니다");
	}
	void turnOnDmb() {
		System.out.println("채널: "+ channel + "번 방송을 수신");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: "+channel+"번으로 변경");
	}
	void turnOffDmb() {
		System.out.println("DMB 수신을 종료");
	}
}
