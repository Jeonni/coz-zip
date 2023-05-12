package section_02.자료구조.큐;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Warehouse {
    private Queue<Integer>[] shelves;

    public Warehouse() {
        shelves = new Queue[5];
        for (int i = 0; i < 5; i++) {
            shelves[i] = new LinkedList<>();
        }
    }

    public void store(int item) {
        boolean stored = false;
        for (Queue<Integer> shelf : shelves) {
            if (shelf.size() < 10) { // 선반이 비어 있으면
                shelf.add(item); // 물건 보관
                System.out.println(item + " 이가" + (Arrays.asList(shelves).indexOf(shelf) + 1) + " 번 선반에 보관됨");
                stored = true;
                break;
            }
        }
        if (!stored) System.out.println("보관 공간 없음");
    }

    public int retrieve() {
        int item = -1;
        for (Queue<Integer> shelf : shelves) {
                if (!shelf.isEmpty()) { // 물건이 있을 경우
                    item = shelf.poll(); // 선반에서 꺼냄
                    System.out.println(item + " 이가" + (Arrays.asList(shelves).indexOf(shelf) + 1) + " 번 선반에서 꺼내짐");
                break;
            }
        }
        if (item == -1) System.out.println("보관된 물건 없음");
        return item;
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 물건 보관하기");
            System.out.println("2. 물건 꺼내기");
            System.out.println("3. 종료하기");
            System.out.print("원하는 작업의 번호를 입력하세요: ");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("보관할 물건 번호 입력");
                int item = scanner.nextInt();
                warehouse.store(item);
            }
            else if(choice==2) warehouse.retrieve();
            else if(choice==3) {System.out.println("프로그램 종료"); break;}
            else System.out.println("잘못된 입력");
            System.out.println();
        }
    }
}
