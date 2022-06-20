package hello.core;

import hello.core.discount.*;
import hello.core.member.*;

public class OrderApp {

    public static void main(String [] args){
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order = " + order.toString());
        System.out.println("order.c = " + order.calculatePrice());
    }
}
