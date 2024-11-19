package poly3;

public class Polynomial {
    /* Field */
    private PolyNode firstNode;
    private PolyNode lastNode;

    /* Construct */
    Polynomial() {
        firstNode = null;
        lastNode = null;
    }

    /* Method */
    public boolean ispZero() {
        return (firstNode == null);
    }

    public void addTerm(int c, int e) {
        // 다항식에 cx^e를 추가
        if (c == 0) return; // 계수가 0인 항은 무시
        
        PolyNode newNode = new PolyNode(c, e);
        
        if (firstNode == null) { // 다항식이 비어 있을 때
            firstNode = newNode;
            lastNode = newNode;
        } else {
            PolyNode current = firstNode;
            PolyNode prev = null;
            
            // 지수가 더 큰 항이 나오기 전까지 이동
            while (current != null && current.exp > e) {
                prev = current;
                current = current.link;
            }
            
            if (current != null && current.exp == e) { // 같은 지수가 존재하면 계수만 합침
                current.coef += c;
                if (current.coef == 0) { // 계수가 0이 되면 삭제
                    delTerm(e);
                }
            } else {
                if (prev == null) { // 새 항이 첫 번째 노드로 들어올 때
                    newNode.link = firstNode;
                    firstNode = newNode;
                } else {
                    newNode.link = current;
                    prev.link = newNode;
                }
            }
        }
    }

    public void delTerm(int e) {
        // 지수 e를 가진 항 삭제
        PolyNode current = firstNode;
        PolyNode prev = null;

        while (current != null && current.exp != e) {
            prev = current;
            current = current.link;
        }

        if (current != null) { // 해당 지수를 찾은 경우
            if (prev == null) { // 첫 번째 노드일 때
                firstNode = current.link;
            } else {
                prev.link = current.link;
            }
            if (current == lastNode) { // 마지막 노드일 경우
                lastNode = prev;
            }
        }
    }

    public Polynomial sMult(int c, int e) {
        // 다항식에 cx^e를 곱해서 반환
        Polynomial ans = new Polynomial();
        PolyNode current = firstNode;

        while (current != null) {
            int newCoef = current.coef * c;
            int newExp = current.exp + e;
            ans.addTerm(newCoef, newExp);
            current = current.link;
        }

        return ans;
    }

    public Polynomial polyMult(Polynomial poly) {
        // 다항식에 다항식 poly를 곱해서 반환
        Polynomial ans = new Polynomial();
        PolyNode poly_a = this.firstNode;

        // poly1의 각 항에 대해 poly2의 모든 항과 곱셈
        while (poly_a != null) {
            PolyNode poly_b = poly.firstNode;
            while (poly_b != null) {
                int newCoef = poly_a.coef * poly_b.coef;
                int newExp = poly_a.exp + poly_b.exp;
                ans.addTerm(newCoef, newExp);
                poly_b = poly_b.link;
            }
            poly_a = poly_a.link;
        }

        return ans;
    }

    public Polynomial polyAdd(Polynomial poly) {
        // 다항식에 다항식 poly를 더해서 반환
        Polynomial ans = new Polynomial();
        PolyNode poly_a = this.firstNode;
        PolyNode poly_b = poly.firstNode;

        // 두 다항식을 동시에 탐색하면서 합산
        while (poly_a != null && poly_b != null) {
            if (poly_a.exp > poly_b.exp) {
                ans.addTerm(poly_a.coef, poly_a.exp);
                poly_a = poly_a.link;
            } else if (poly_a.exp < poly_b.exp) {
                ans.addTerm(poly_b.coef, poly_b.exp);
                poly_b = poly_b.link;
            } else { // 지수 같을때
                ans.addTerm(poly_a.coef + poly_b.coef, poly_a.exp);
                poly_a = poly_a.link;
                poly_b = poly_b.link;
            }
        }

        // 남은 항 추가
        while (poly_a != null) {
            ans.addTerm(poly_a.coef, poly_a.exp);
            poly_a = poly_a.link;
        }

        while (poly_b != null) {
            ans.addTerm(poly_b.coef, poly_b.exp);
            poly_b = poly_b.link;
        }

        return ans;
    }

    public void appendTerm(int c, int e) {
        // 다항식 맨뒤에 cx^e를 추가
        PolyNode node = new PolyNode(c, e);
        if (firstNode == null) {
            firstNode = node;
            lastNode = node;
        } else {
            lastNode.link = node;
            lastNode = node;
        }
    }

    public void print() {
        PolyNode p = firstNode;
        while (p != null) {
            System.out.print(p.coef + "x^" + p.exp);
            System.out.print(" + ");
            p = p.link;
        }
        System.out.println();
    }
}
