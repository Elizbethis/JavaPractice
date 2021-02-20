package Second.Demo02.CollectionPractice;

import java.util.ListResourceBundle;

public class LinkedListPractice {

    public static class LISTNode{
        int val;
        LISTNode next = null;
        public LISTNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        //创建头节点
        LISTNode head = new LISTNode(-9527);
        LISTNode node1 = new LISTNode(1);
        LISTNode node2 = new LISTNode(2);
        LISTNode node3 = new LISTNode(3);
        LISTNode node4 = new LISTNode(4);
        addNode(head,node1);
        addNode(head,node2);
        addNode(head,node3);
        addNode(head,node4);
        deleteNode(head,node1);
        showNode(head);
    }
    public static void addNode(LISTNode head,LISTNode node){
        //找到最后一个节点，将其插入到节点尾部
        while(head.next != null){
            head = head.next;
        }
        head.next = node;
    }
    //删除节点
    public static void deleteNode(LISTNode head,LISTNode delNode){
        //找到之前的节点
        LISTNode preNode = head;
        while(preNode != null){
            if (preNode.next.val == delNode.val){
                preNode.next = preNode.next.next;
                break;
            }
            preNode = preNode.next;
        }
    }
    public static void showNode(LISTNode head){
        //跳过头节点
        head = head.next;
        //对链表进行遍历
        while(head!= null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
