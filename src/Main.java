public class Main {
    public static void main(String[] args){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        System.out.println("add 10: " + myLinkedList.add(10));
        System.out.println("add 11: " + myLinkedList.add(11));
        System.out.println("add 12: " + myLinkedList.add(12));
        System.out.println("add 15: " + myLinkedList.add(15));
        System.out.println("add 16: " + myLinkedList.add(16));

        System.out.println("contains 5: " + myLinkedList.contains(5));
        System.out.println("contains 11: " + myLinkedList.contains(11));
        System.out.println("remove 4: " + myLinkedList.remove(4));

        System.out.println("LinkedList before removing 1: ");
        for(int i = 0; i < myLinkedList.size(); i++){
            System.out.print(myLinkedList.get(i) + " ");
        }
        System.out.println();
        System.out.println("remove 1: " + myLinkedList.remove(1));
        System.out.println("LinkedList after removing 1: ");
        for(int i = 0; i < myLinkedList.size(); i++){
            System.out.print(myLinkedList.get(i) + " ");
        }
        System.out.println();
    }
}
