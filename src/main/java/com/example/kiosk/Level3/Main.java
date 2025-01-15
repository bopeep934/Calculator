package com.example.kiosk.Level3;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        MenuItem m1=new MenuItem("ShackBurger" ,6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem m2=new MenuItem("SmokeShack" ,8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem m3=new MenuItem("Cheeseburger" ,6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem m4=new MenuItem("Hamburger" ,5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
//햄버거 메뉴 개발

        List<MenuItem> menuItems = new ArrayList<>();

        menuItems.add(m1);
        menuItems.add(m2);
        menuItems.add(m3);
        menuItems.add(m4);

        Kiosk kiosk=new Kiosk(menuItems);//메뉴 리스트를 키오스크에 추가

            kiosk.start();//키오스크 시작

    }
}
