public class Example01 {
    public static void main(String[] args) {
        Example01Rectangle r1 = new Example01Rectangle();
        r1.width = 2;
        r1.height = 4;
        System.out.println("r1 넓이 : " + r1.getArea() + ", 둘레 : " + r1.getPerimeter());

        r1.modify(1, 2);

        System.out.println("수정된 r1 넓이 : " + r1.getArea() + ", 둘레 : " + r1.getPerimeter());

        Example01Rectangle r2 = new Example01Rectangle();
        r2.width = 4;
        r2.height = 2;
        System.out.println("r2 넓이 : " + r2.getArea() + ", 둘레 : " + r2.getPerimeter());

        if (r1.equals(r2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        Example01Rectangle r3 = new Example01Rectangle();
        r3.width = 1;
        r3.height = 2;
        System.out.println("r3 넓이 : " + r3.getArea() + ", 둘레 : " + r3.getPerimeter());

        if (r1.equals(r3)) { // 여기 질문, 주소 값? 
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        if (r1.sameArea(r3)) {
            System.out.println("Same size");
        } else {
            System.out.println("Different size");
        }
    }
}
